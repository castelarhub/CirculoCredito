package com.maxcom.mpm.paypal.client.client;

import com.maxcom.mpm.paypal.client.dto.ArticuloTO;
import com.maxcom.mpm.paypal.client.dto.RespuestaSolPagoExpressTO;
import com.maxcom.mpm.paypal.client.dto.TipoErrorTO;
import com.maxcom.mpm.paypal.client.dto.TransaccionPagoExpressTO;
import com.maxcom.mpm.paypal.client.paypal.BasicAmountType;
import com.maxcom.mpm.paypal.client.paypal.BillingAgreementDetailsType;
import com.maxcom.mpm.paypal.client.paypal.BillingCodeType;
import com.maxcom.mpm.paypal.client.paypal.CurrencyCodeType;
import com.maxcom.mpm.paypal.client.paypal.CustomSecurityHeaderType;
import com.maxcom.mpm.paypal.client.paypal.ErrorType;
import com.maxcom.mpm.paypal.client.paypal.MerchantPullPaymentCodeType;
import com.maxcom.mpm.paypal.client.paypal.PayPalAPIAAInterface;
import com.maxcom.mpm.paypal.client.paypal.PayPalAPIInterfaceService;
import com.maxcom.mpm.paypal.client.paypal.PaymentActionCodeType;
import com.maxcom.mpm.paypal.client.paypal.PaymentDetailsItemType;
import com.maxcom.mpm.paypal.client.paypal.PaymentDetailsType;
import com.maxcom.mpm.paypal.client.paypal.SetExpressCheckoutReq;
import com.maxcom.mpm.paypal.client.paypal.SetExpressCheckoutRequestDetailsType;
import com.maxcom.mpm.paypal.client.paypal.SetExpressCheckoutRequestType;
import com.maxcom.mpm.paypal.client.paypal.SetExpressCheckoutResponseType;
import com.maxcom.mpm.paypal.client.paypal.UserIdPasswordType;
import com.maxcom.mpm.paypal.client.util.Constantes;
import static com.maxcom.mpm.paypal.client.util.Utilerias.buildAmount;
import java.math.BigInteger;
import java.util.ArrayList;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;

public class SolicitudPagoExpress {
    
    private CurrencyCodeType currencyCodeType = null;
    private PaymentDetailsType paymentDetails = null;
    private PaymentActionCodeType paymentAction = null;
    private Holder<CustomSecurityHeaderType> securityHeader;
    private SetExpressCheckoutRequestDetailsType detalleSolicitud = null;
    private SetExpressCheckoutReq solicitudExpres = null;
    private SetExpressCheckoutRequestType tipoSolicitudExpres = null;
    private PayPalAPIInterfaceService payPalAPIInterfaceService= null;    
    
    public SolicitudPagoExpress(){
        currencyCodeType = CurrencyCodeType.MXN;
        paymentDetails = new PaymentDetailsType();
        paymentAction = PaymentActionCodeType.AUTHORIZATION;
        detalleSolicitud = new SetExpressCheckoutRequestDetailsType();
        solicitudExpres = new SetExpressCheckoutReq();
        tipoSolicitudExpres = new SetExpressCheckoutRequestType();
        payPalAPIInterfaceService= new PayPalAPIInterfaceService();
    }
    
    public RespuestaSolPagoExpressTO solicitar(TransaccionPagoExpressTO transaccion) throws Exception{
        
        PayPalAPIAAInterface port = payPalAPIInterfaceService.getPayPalAPIAA();
        SetExpressCheckoutResponseType respuestaSolPaypal=null;
        RespuestaSolPagoExpressTO respuesta = null;
        
        ((BindingProvider) port).getRequestContext().put(
        BindingProvider.ENDPOINT_ADDRESS_PROPERTY,Constantes.URL_ENDPOINT);
        
        this.solicitudExpres.setSetExpressCheckoutRequest(tipoSolicitudExpres);
        this.tipoSolicitudExpres.setVersion(Constantes.VERSION_PAYPAL);
        
        this.setEncabezado();
        
        //Detalle de lo que se va a cobrar
        this.setDetallePago(transaccion);
        
        this.detalleSolicitud.getPaymentDetails().add(this.paymentDetails);
        //Url en caso de que se acepte el pago        
        this.detalleSolicitud.setReturnURL(transaccion.getUrlReturn());
        //Url en caso de que se cancele el pago
        this.detalleSolicitud.setCancelURL(transaccion.getUrlCancel());
        //Referencia
        this.detalleSolicitud.setCustom(transaccion.getReferencia());
        
        //Preparando para refenciar cargos en caso de que sea solicitado
        this.referenciarPago(transaccion);
        
        //Para personalizar la pagina en paypal
        this.setExtraDetalleSolicitudAdicional();
        
        this.tipoSolicitudExpres.setSetExpressCheckoutRequestDetails(this.detalleSolicitud);

        respuestaSolPaypal = port.setExpressCheckout(this.solicitudExpres, this.securityHeader);
        
        respuesta = mapearRespuesta(respuestaSolPaypal);
        
        return respuesta;
    }
    
    private RespuestaSolPagoExpressTO mapearRespuesta(SetExpressCheckoutResponseType respuestaPaypal) {

        RespuestaSolPagoExpressTO respuesta = new RespuestaSolPagoExpressTO();

        respuesta.setAck(respuestaPaypal.getAck().toString());
        respuesta.setCorrelationID(respuestaPaypal.getCorrelationID());
        respuesta.setFechaHora(respuestaPaypal.getTimestamp().toString());
        respuesta.setToken(respuestaPaypal.getToken());

        //Su hay errores
        if (respuestaPaypal.getErrors() != null &&
            respuestaPaypal.getErrors().size()>0) {
            TipoErrorTO tipoErrorTO = null;
            respuesta.setListaErrores(new ArrayList<TipoErrorTO>());
            for (ErrorType error : respuestaPaypal.getErrors()) {
                tipoErrorTO = new TipoErrorTO();
                tipoErrorTO.setCodigoError(error.getErrorCode());
                tipoErrorTO.setMensajeCorto(error.getShortMessage());
                tipoErrorTO.setMensajeLargo(error.getLongMessage());
                respuesta.getListaErrores().add(tipoErrorTO);
            }
        }

        return respuesta;
    }
    
    private void referenciarPago(TransaccionPagoExpressTO transaccion){
        /**************Para los pagos referenciados***********/
        if(transaccion.isReferenciarPago()){
            BillingAgreementDetailsType acuerdo = new BillingAgreementDetailsType();
            acuerdo.setBillingAgreementDescription("Nota para el acuerdo de pago mensual");
            acuerdo.setBillingType(BillingCodeType.MERCHANT_INITIATED_BILLING);
            acuerdo.setPaymentType(MerchantPullPaymentCodeType.ANY);
            this.detalleSolicitud.getBillingAgreementDetails().add(acuerdo);
        }
        /*****************************************************/
        
    }        
    
    private void setExtraDetalleSolicitudAdicional(){
        this.detalleSolicitud.setCppHeaderImage(Constantes.LOGO_MAXCOM);
        this.detalleSolicitud.setCppPayflowColor(Constantes.COLOR_FONDO);
        this.detalleSolicitud.setCppHeaderBorderColor("000000");
        this.detalleSolicitud.setNoteToBuyer("Nota adicional a mostrar al cliente");
        //this.detalleSolicitud.setCppLogoImage(Constantes.LOGO_MAXCOM);
    }
    
    private void setDetallePago(TransaccionPagoExpressTO transaccion)throws Exception{
        Double orderTotal = 0d;
        Double itemTotal = 0d;
        
        //Transaccion recurrente
        //this.paymentDetails.setRecurring("Y");        
        
        this.paymentDetails.setOrderDescription(transaccion.getDescripcion());
        this.paymentDetails.setPaymentAction(this.paymentAction);
        //paymentDetails.setInvoiceID("invoice-#xxx");
        
        PaymentDetailsItemType item = null;
        BasicAmountType amount = null;
        
        for (ArticuloTO articulo : transaccion.getListaArticulos()) {
            item = new PaymentDetailsItemType();
            amount = buildAmount(articulo.getPrecio(), this.currencyCodeType);
            
            item.setAmount(amount);
            item.setQuantity(new BigInteger(String.valueOf(articulo.getCantidad())));
            item.setName(articulo.getDescripcion());
            
            itemTotal += articulo.getCantidad() * Double.parseDouble(amount.getValue());
            this.paymentDetails.getPaymentDetailsItem().add(item);
            orderTotal = itemTotal;
        }
        
        this.paymentDetails.setOrderTotal(buildAmount(orderTotal, this.currencyCodeType));
        this.paymentDetails.setItemTotal(buildAmount(itemTotal, this.currencyCodeType));        
        
    }        
    
    private void setEncabezado(){
        UserIdPasswordType user = new UserIdPasswordType();
        user.setUsername(Constantes.USERNAME_PAYPAL);
	user.setPassword(Constantes.PASSWORD_PAYPAL);
	user.setSignature(Constantes.SIGNATURE_PAYPAL);
        
        CustomSecurityHeaderType header = new CustomSecurityHeaderType();
        header.setCredentials(user);
        
	this.securityHeader = new Holder<CustomSecurityHeaderType>(header);        
        
    }
    
}