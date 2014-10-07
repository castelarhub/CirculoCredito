package com.maxcom.mpm.paypal.client.client;

import com.maxcom.mpm.paypal.client.dto.ArticuloTO;
import com.maxcom.mpm.paypal.client.dto.PayerInfoTO;
import com.maxcom.mpm.paypal.client.dto.RespuestaDetallePagoExpressTO;
import com.maxcom.mpm.paypal.client.dto.TipoErrorTO;
import com.maxcom.mpm.paypal.client.dto.TransaccionDetallePagoExpressTO;
import com.maxcom.mpm.paypal.client.paypal.CustomSecurityHeaderType;
import com.maxcom.mpm.paypal.client.paypal.ErrorType;
import com.maxcom.mpm.paypal.client.paypal.GetExpressCheckoutDetailsReq;
import com.maxcom.mpm.paypal.client.paypal.GetExpressCheckoutDetailsRequestType;
import com.maxcom.mpm.paypal.client.paypal.GetExpressCheckoutDetailsResponseDetailsType;
import com.maxcom.mpm.paypal.client.paypal.GetExpressCheckoutDetailsResponseType;
import com.maxcom.mpm.paypal.client.paypal.PayPalAPIAAInterface;
import com.maxcom.mpm.paypal.client.paypal.PayPalAPIInterfaceService;
import com.maxcom.mpm.paypal.client.paypal.PayerInfoType;
import com.maxcom.mpm.paypal.client.paypal.PaymentDetailsItemType;
import com.maxcom.mpm.paypal.client.paypal.PaymentDetailsType;
import com.maxcom.mpm.paypal.client.paypal.UserIdPasswordType;
import com.maxcom.mpm.paypal.client.util.Constantes;
import java.util.ArrayList;
import java.util.List;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;

public class DetallePagoExpress {
    
    Holder<CustomSecurityHeaderType> securityHeader;
    PayPalAPIInterfaceService payPalAPIInterfaceService= null;
    GetExpressCheckoutDetailsRequestType value = null;
    GetExpressCheckoutDetailsReq detalleSolicitud = null;
    GetExpressCheckoutDetailsResponseType detallePagoExpress = null;
    
    public DetallePagoExpress(){
        payPalAPIInterfaceService= new PayPalAPIInterfaceService();
        value = new GetExpressCheckoutDetailsRequestType();
        detalleSolicitud = new GetExpressCheckoutDetailsReq();
    }
    
    public RespuestaDetallePagoExpressTO recuperaDetallePagoExpress(TransaccionDetallePagoExpressTO transaccion){
                
        PayPalAPIAAInterface port = payPalAPIInterfaceService.getPayPalAPIAA();
        RespuestaDetallePagoExpressTO respuesta= null;
        
        ((BindingProvider) port).getRequestContext().put(
        BindingProvider.ENDPOINT_ADDRESS_PROPERTY,Constantes.URL_ENDPOINT);        
        
        this.setEncabezado();
        
        this.value = new GetExpressCheckoutDetailsRequestType();
        this.value.setToken(transaccion.getToken());
        this.value.setVersion(Constantes.VERSION_PAYPAL);
        
        this.detalleSolicitud.setGetExpressCheckoutDetailsRequest(value);
        
        this.detallePagoExpress = port.getExpressCheckoutDetails(detalleSolicitud, securityHeader);
        
        respuesta = mapearRespuesta(this.detallePagoExpress);
        
        return respuesta;
        
    }
    
    private RespuestaDetallePagoExpressTO mapearRespuesta(GetExpressCheckoutDetailsResponseType respuestaPaypal) {
        
        RespuestaDetallePagoExpressTO respuesta = new RespuestaDetallePagoExpressTO();
        GetExpressCheckoutDetailsResponseDetailsType detalle = null;
        List<ArticuloTO> listArticulos = null;
        
        //Respuesta general
        respuesta.setAck(respuestaPaypal.getAck().toString());
        respuesta.setCorrelationID(respuestaPaypal.getCorrelationID());
        respuesta.setFechaHora(respuestaPaypal.getTimestamp().toString());
        
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
            
            return respuesta;
        }
        
        //Recuperando detalle del pago
        detalle = respuestaPaypal.getGetExpressCheckoutDetailsResponseDetails();
        
        if(detalle!=null){
            PayerInfoTO payerInfoTO = new PayerInfoTO();
            respuesta.setToken(detalle.getToken());
            StringBuilder nombre = new StringBuilder();            
            
            //Informacion de la cuenta que acepto el pago
            PayerInfoType payerInfoPaypal = detalle.getPayerInfo();            
            
            payerInfoTO.setPayer(payerInfoPaypal.getPayer());
            payerInfoTO.setPayerID(payerInfoPaypal.getPayerID());
            nombre.append(payerInfoPaypal.getPayerName().getFirstName());
            nombre.append(" ");
            nombre.append(payerInfoPaypal.getPayerName().getLastName());            
            payerInfoTO.setPayerName(nombre.toString());
            payerInfoTO.setPayerStatus(payerInfoPaypal.getPayerStatus().toString());
            
            //Direccion de la cuenta que acepto el pago
            if(payerInfoPaypal.getAddress()!=null){
                payerInfoTO.setCalle(payerInfoPaypal.getAddress().getStreet1());
                payerInfoTO.setCiudad(payerInfoPaypal.getAddress().getCityName());
                payerInfoTO.setEstado(payerInfoPaypal.getAddress().getStateOrProvince());
                payerInfoTO.setPais(payerInfoPaypal.getAddress().getCountryName());
                payerInfoTO.setCodigoPostal(payerInfoPaypal.getAddress().getPostalCode());
                payerInfoTO.setTelefono(payerInfoPaypal.getAddress().getPhone());
            }
           
           //Informacion de los articulos que componen el pago aceptado
           listArticulos = new ArrayList<ArticuloTO>();
           for(PaymentDetailsType deta:detalle.getPaymentDetails()){
               //deta.getRecurring();
               ArticuloTO articuloTO = null;
               for(PaymentDetailsItemType item:deta.getPaymentDetailsItem()){
                   articuloTO = new ArticuloTO();
                   articuloTO.setCantidad(item.getQuantity().intValue());
                   articuloTO.setDescripcion(item.getName());
                   articuloTO.setPrecio(Double.parseDouble(item.getAmount().getValue()));
                   listArticulos.add(articuloTO);
               }
               
               //Totales
               respuesta.setItemTotal(Double.parseDouble(deta.getItemTotal().getValue()));
               respuesta.setOrderTotal(Double.parseDouble(deta.getOrderTotal().getValue()));
               
           }
           
           respuesta.setTieneAcuerdoReferenciado(detalle.isBillingAgreementAcceptedStatus());
           
           respuesta.setListItem(listArticulos);
           
           respuesta.setPayerInfo(payerInfoTO);
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
