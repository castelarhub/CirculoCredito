package com.maxcom.mpm.paypal.client.client;

import com.maxcom.mpm.paypal.client.dto.PaymentInfoTO;
import com.maxcom.mpm.paypal.client.dto.RespuestaConfirmalPagoExpressTO;
import com.maxcom.mpm.paypal.client.dto.TipoErrorTO;
import com.maxcom.mpm.paypal.client.dto.TransaccionConfirmaPagoExpressTO;
import com.maxcom.mpm.paypal.client.paypal.CurrencyCodeType;
import com.maxcom.mpm.paypal.client.paypal.CustomSecurityHeaderType;
import com.maxcom.mpm.paypal.client.paypal.DoExpressCheckoutPaymentReq;
import com.maxcom.mpm.paypal.client.paypal.DoExpressCheckoutPaymentRequestDetailsType;
import com.maxcom.mpm.paypal.client.paypal.DoExpressCheckoutPaymentRequestType;
import com.maxcom.mpm.paypal.client.paypal.DoExpressCheckoutPaymentResponseDetailsType;
import com.maxcom.mpm.paypal.client.paypal.DoExpressCheckoutPaymentResponseType;
import com.maxcom.mpm.paypal.client.paypal.ErrorType;
import com.maxcom.mpm.paypal.client.paypal.PayPalAPIAAInterface;
import com.maxcom.mpm.paypal.client.paypal.PayPalAPIInterfaceService;
import com.maxcom.mpm.paypal.client.paypal.PaymentActionCodeType;
import com.maxcom.mpm.paypal.client.paypal.PaymentDetailsType;
import com.maxcom.mpm.paypal.client.paypal.PaymentInfoType;
import com.maxcom.mpm.paypal.client.paypal.UserIdPasswordType;
import com.maxcom.mpm.paypal.client.util.Constantes;
import static com.maxcom.mpm.paypal.client.util.Utilerias.buildAmount;
import java.util.ArrayList;
import java.util.List;
import javax.xml.ws.Holder;

public class ConfirmacionPagoExpress {
    
    private PaymentActionCodeType paymentAction = null;
    private Holder<CustomSecurityHeaderType> securityHeader;
    private PayPalAPIInterfaceService payPalAPIInterfaceService= null;   
    private PaymentDetailsType paymentDetails = null;
    private CurrencyCodeType currencyCodeType = null;
    
    public ConfirmacionPagoExpress(){
        currencyCodeType = CurrencyCodeType.MXN;
        paymentAction = PaymentActionCodeType.SALE;
        payPalAPIInterfaceService= new PayPalAPIInterfaceService();
        paymentDetails = new PaymentDetailsType();
    }
    
    public RespuestaConfirmalPagoExpressTO confirmarPagoExpress(TransaccionConfirmaPagoExpressTO transaccion)throws Exception{
        
        PayPalAPIAAInterface port = payPalAPIInterfaceService.getPayPalAPIAA();
        
        RespuestaConfirmalPagoExpressTO respuesta = null;
        
        this.setEncabezado();
        
        DoExpressCheckoutPaymentReq doExpressCheckoutPaymentRequest = new DoExpressCheckoutPaymentReq();
        DoExpressCheckoutPaymentRequestType value = new DoExpressCheckoutPaymentRequestType();
        DoExpressCheckoutPaymentRequestDetailsType valueDetails = new DoExpressCheckoutPaymentRequestDetailsType();
        
        valueDetails.setToken(transaccion.getToken());
        valueDetails.setPayerID(transaccion.getPayerId());
        valueDetails.setPaymentAction(paymentAction.SALE);
        //valueDetails.setOrderURL(null        
        
        this.setDetallePago(transaccion);
        
        //Detalle del pago
        valueDetails.getPaymentDetails().add(this.paymentDetails);        
        
        value.setVersion(Constantes.VERSION_PAYPAL);
        value.setDoExpressCheckoutPaymentRequestDetails(valueDetails);        
        
        doExpressCheckoutPaymentRequest.setDoExpressCheckoutPaymentRequest(value);
        
        DoExpressCheckoutPaymentResponseType respuestaPaypal =null;
        
        respuestaPaypal = port.doExpressCheckoutPayment(doExpressCheckoutPaymentRequest, securityHeader);
        
        respuesta = mapearRespuesta(respuestaPaypal);
        
        return respuesta;
        
    }
    
    private void setDetallePago(TransaccionConfirmaPagoExpressTO transaccion)throws Exception{
        
        //this.paymentDetails.setOrderDescription(transaccion.getDescripcion());
        this.paymentDetails.setPaymentAction(this.paymentAction);
        //paymentDetails.setInvoiceID("invoice-#xxx");
        
        Double orderTotal = transaccion.getOrderTotal();
        Double itemTotal = transaccion.getItemTotal();
        
        this.paymentDetails.setOrderTotal(buildAmount(orderTotal, this.currencyCodeType));
        this.paymentDetails.setItemTotal(buildAmount(itemTotal, this.currencyCodeType));
        
    }            
    
    private RespuestaConfirmalPagoExpressTO mapearRespuesta(DoExpressCheckoutPaymentResponseType respuestaPaypal) {

        RespuestaConfirmalPagoExpressTO respuesta = new RespuestaConfirmalPagoExpressTO();

        respuesta.setAck(respuestaPaypal.getAck().toString());
        respuesta.setCorrelationID(respuestaPaypal.getCorrelationID());
        respuesta.setFechaHora(respuestaPaypal.getTimestamp().toString());
        
        DoExpressCheckoutPaymentResponseDetailsType detalleRespuesta = respuestaPaypal.getDoExpressCheckoutPaymentResponseDetails();
        
        respuesta.setToken(detalleRespuesta.getToken());
        
        //Identificador para los cargos recurrentes
        respuesta.setBillingAgreementId(detalleRespuesta.getBillingAgreementID());
        
        List<PaymentInfoType> listInfoPago = detalleRespuesta.getPaymentInfo();
        
        //Detalle del pago cobrado
        if(listInfoPago!=null){
            PaymentInfoTO informacionPagoTO = null;
            for(PaymentInfoType infoPago:listInfoPago){
                informacionPagoTO = new PaymentInfoTO();
                informacionPagoTO.setFeeAmount(Double.parseDouble(infoPago.getFeeAmount().getValue()));
                informacionPagoTO.setGrossAmount(Double.parseDouble(infoPago.getGrossAmount().getValue()));
                informacionPagoTO.setPaymentDate(infoPago.getPaymentDate().toString());
                informacionPagoTO.setPaymentStatus(infoPago.getPaymentStatus().toString());
                informacionPagoTO.setPaymentType(infoPago.getPaymentType().toString());
                informacionPagoTO.setTransactionID(infoPago.getTransactionID());
                informacionPagoTO.setTransactionType(infoPago.getTransactionType().toString());
            }
            
            respuesta.setInformacionPago(informacionPagoTO);
        }        
        
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
