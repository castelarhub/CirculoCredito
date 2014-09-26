package com.castelar.ejemplosMaven;

import com.maxcom.mpm.paypal.client.paypal.CustomSecurityHeaderType;
import com.maxcom.mpm.paypal.client.paypal.GetExpressCheckoutDetailsReq;
import com.maxcom.mpm.paypal.client.paypal.GetExpressCheckoutDetailsRequestType;
import com.maxcom.mpm.paypal.client.paypal.GetExpressCheckoutDetailsResponseDetailsType;
import com.maxcom.mpm.paypal.client.paypal.GetExpressCheckoutDetailsResponseType;
import com.maxcom.mpm.paypal.client.paypal.PayPalAPIAAInterface;
import com.maxcom.mpm.paypal.client.paypal.PayPalAPIInterfaceService;
import com.maxcom.mpm.paypal.client.paypal.UserIdPasswordType;
import javax.xml.ws.Holder;

public class ObtenerDetallePagoExpress {
    
    public static void main(String[] args) {
        
        /************Seguridad*****************/
        UserIdPasswordType user = new UserIdPasswordType();
        user.setUsername("mvazquez_api1.maxcom.com");
	user.setPassword("ND2Q7BNV5YYURGWV");
	user.setSignature("AFcWxV21C7fd0v3bYYYRCpSSRl31AtAGp84n-GLLmW3A1VeEGdMXZPXX");
        
        CustomSecurityHeaderType header = new CustomSecurityHeaderType();
        header.setCredentials(user);
        
        Holder<CustomSecurityHeaderType> securityHeader;
        
	securityHeader = new Holder<CustomSecurityHeaderType>(header);        
        /*************************************/
        PayPalAPIInterfaceService payPalAPIInterfaceService= new PayPalAPIInterfaceService();
        PayPalAPIAAInterface port = payPalAPIInterfaceService.getPayPalAPIAA();
        
        GetExpressCheckoutDetailsRequestType value = new GetExpressCheckoutDetailsRequestType();
        value.setToken("EC-9KC77066CF427724D");
        value.setVersion("117");
        
        GetExpressCheckoutDetailsReq detailsRequest = new GetExpressCheckoutDetailsReq();
                
        detailsRequest.setGetExpressCheckoutDetailsRequest(value);
        
        
        GetExpressCheckoutDetailsResponseType detailsResponseType = port.getExpressCheckoutDetails(detailsRequest, securityHeader);
        
        GetExpressCheckoutDetailsResponseDetailsType detalleRespuestaTipo= null;
        
        detalleRespuestaTipo = detailsResponseType.getGetExpressCheckoutDetailsResponseDetails();
        
        String payerID = detalleRespuestaTipo.getPayerInfo().getPayerID();
        
        String firstName = detalleRespuestaTipo.getPayerInfo().getPayerName().getFirstName();
        
        System.out.println("******************************");
        System.out.println("payerID:"+payerID);
        System.out.println("firstName:"+firstName);
        System.out.println("******************************");
        
/******************************/
    
        
    }
    
}
