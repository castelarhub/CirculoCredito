package com.castelar.ejemplosMaven;

import com.maxcom.mpm.paypal.client.paypal.BasicAmountType;
import com.maxcom.mpm.paypal.client.paypal.CurrencyCodeType;
import com.maxcom.mpm.paypal.client.paypal.CustomSecurityHeaderType;
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
import java.math.BigInteger;
import java.text.NumberFormat;
import java.util.Locale;
import javax.xml.ws.Holder;

public class SolicitarPagoExpress {
    
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
        
        /*
		((BindingProvider) port).getRequestContext().put(
				BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
				paypalEndpointAddress);
        */

        //CurrencyCodeType currencyCodeType = CurrencyCodeType.EUR;
        CurrencyCodeType currencyCodeType = CurrencyCodeType.MXN;
        PaymentActionCodeType paymentAction = PaymentActionCodeType.SALE;

        //Creando solicitud
        SetExpressCheckoutReq setExpressCheckoutRequest = new SetExpressCheckoutReq();

        SetExpressCheckoutRequestType request = new SetExpressCheckoutRequestType();

        setExpressCheckoutRequest.setSetExpressCheckoutRequest(request);
        request.setVersion("117");

        // Detalles de la solicitud
        SetExpressCheckoutRequestDetailsType details = new SetExpressCheckoutRequestDetailsType();

        PaymentDetailsType paymentDetails = new PaymentDetailsType();
        paymentDetails.setOrderDescription("Simple test");
        //paymentDetails.setInvoiceID("invoice-#xxx");
        paymentDetails.setPaymentAction(paymentAction);        
        
        details.getPaymentDetails().add(paymentDetails);

        Double itemTotal = 0d;

        PaymentDetailsItemType item = new PaymentDetailsItemType();

        BasicAmountType amount = buildAmount(1.5d, currencyCodeType);
        item.setAmount(amount);

        item.setQuantity(new BigInteger("1"));
        item.setName("Paquete convenga Maxcom");
        
        itemTotal += 1 * 1.5;

        paymentDetails.getPaymentDetailsItem().add(item);

        Double orderTotal = itemTotal;

        paymentDetails.setOrderTotal(buildAmount(orderTotal, currencyCodeType));

        paymentDetails.setItemTotal(buildAmount(itemTotal, currencyCodeType));

        details.setReturnURL("http://returnPage.com");
        details.setCancelURL("http://cancelPage.com");
        details.setCustom("my-ref-xxx");
        
        details.setCppHeaderImage("http://www.tudecide.com/images/detalle_empresas/maxcom.png");

        request.setSetExpressCheckoutRequestDetails(details);        

        SetExpressCheckoutResponseType ppresponse = port.setExpressCheckout(
                        setExpressCheckoutRequest, securityHeader);
                
        String resp = ppresponse.getToken();
        
        System.out.println("******************************");
        System.out.println("resp:"+resp);
        System.out.println("******************************");
        
/******************************/
    
        
    }
    
    private static BasicAmountType buildAmount(Double amount,
			CurrencyCodeType currencyCodeType) {
		BasicAmountType orderTotal = new BasicAmountType();

		NumberFormat nf = NumberFormat.getNumberInstance(Locale.US);

		nf.setMaximumFractionDigits(2);
		nf.setMinimumFractionDigits(2);

		orderTotal.setValue(nf.format(amount));
		orderTotal.setCurrencyID(currencyCodeType);
		return orderTotal;
	}    
    
}
