package com.maxcom.mpm.paypal.client.demo;

import com.maxcom.mpm.paypal.client.bi.CargoOnlinePaypal;
import com.maxcom.mpm.paypal.client.bi.CargoOnlinePaypalImpl;
import com.maxcom.mpm.paypal.client.dto.RespuestaConfirmalPagoExpressTO;
import com.maxcom.mpm.paypal.client.dto.TransaccionConfirmaPagoExpressTO;

public class TestConfirmaPagoExpress {
    public static void main(String args[]) {
        
        CargoOnlinePaypal cargo = new CargoOnlinePaypalImpl();
        
        RespuestaConfirmalPagoExpressTO respuesta = null;
        TransaccionConfirmaPagoExpressTO trasaccion = new TransaccionConfirmaPagoExpressTO();
        
        try {
            
            trasaccion.setPayerId("SMAEDNCBXGV3Q");
            trasaccion.setToken("EC-399331809R441821P");
            trasaccion.setReferencia("REF-1234");
            trasaccion.setItemTotal(5.0);
            trasaccion.setOrderTotal(5.0);
            
            respuesta = cargo.confirmarPagoExpress(trasaccion);
            
            System.out.println("getAck:" + respuesta.getAck());
            System.out.println("getToken:" + respuesta.getToken());
            System.out.println("getBillingAgreementId:" + respuesta.getBillingAgreementId());
            System.out.println("getFechaHora:" + respuesta.getFechaHora());
            System.out.println("getCorrelationID:" + respuesta.getCorrelationID());
            System.out.println("getListaErrores:" + respuesta.getListaErrores());
            
            
            System.out.println("***************************");
            if(respuesta.getInformacionPago()!=null){
                System.out.println("getPaymentDate:" + respuesta.getInformacionPago().getPaymentDate());
                System.out.println("getPaymentStatus:" + respuesta.getInformacionPago().getPaymentStatus());
                System.out.println("getPaymentType:" + respuesta.getInformacionPago().getPaymentType());
                System.out.println("getTransactionID:" + respuesta.getInformacionPago().getTransactionID());
                System.out.println("getTransactionType:" + respuesta.getInformacionPago().getTransactionType());
                System.out.println("getFeeAmount:" + respuesta.getInformacionPago().getFeeAmount());
                System.out.println("getGrossAmount:" + respuesta.getInformacionPago().getGrossAmount());
            }
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }

    }        
}
