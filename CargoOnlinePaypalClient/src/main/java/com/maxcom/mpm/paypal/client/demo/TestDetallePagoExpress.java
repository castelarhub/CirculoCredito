package com.maxcom.mpm.paypal.client.demo;

import com.maxcom.mpm.paypal.client.bi.CargoOnlinePaypal;
import com.maxcom.mpm.paypal.client.bi.CargoOnlinePaypalImpl;
import com.maxcom.mpm.paypal.client.dto.ArticuloTO;
import com.maxcom.mpm.paypal.client.dto.RespuestaDetallePagoExpressTO;
import com.maxcom.mpm.paypal.client.dto.TransaccionDetallePagoExpressTO;

/**
 *
 * @author operador
 */
public class TestDetallePagoExpress {
    public static void main(String args[]) {
        CargoOnlinePaypal cargo = new CargoOnlinePaypalImpl();
        RespuestaDetallePagoExpressTO respuesta = null;
        TransaccionDetallePagoExpressTO trasaccion = new TransaccionDetallePagoExpressTO();
        
        try {
            trasaccion.setReferencia("XX-XXXXX");
            trasaccion.setToken("EC-399331809R441821P");
            
            respuesta = cargo.recuperaDetallePagoExpress(trasaccion);
            
            System.out.println("getAck:" + respuesta.getAck());
            System.out.println("getToken:" + respuesta.getToken());
            System.out.println("getFechaHora:" + respuesta.getFechaHora());
            System.out.println("getCorrelationID:" + respuesta.getCorrelationID());
            System.out.println("getListaErrores:" + respuesta.getListaErrores());            
            
            System.out.println("***************************");
            if(respuesta.getPayerInfo()!=null){
                System.out.println("getPayerID:" + respuesta.getPayerInfo().getPayerID());
                System.out.println("getPayerName:" + respuesta.getPayerInfo().getPayerName());
                System.out.println("getPayerStatus:" + respuesta.getPayerInfo().getPayerStatus());
                System.out.println("getCalle:" + respuesta.getPayerInfo().getCalle());
                System.out.println("getCiudad:" + respuesta.getPayerInfo().getCiudad());
                System.out.println("getEstado:" + respuesta.getPayerInfo().getEstado());
            }
            
            if(respuesta.getListItem()!=null){
                System.out.println("XXXXXXXXXXXXXXXXXXXXXXX");
                for(ArticuloTO articulo:respuesta.getListItem()){
                    System.out.println(">>>>>>>>");
                    System.out.println("getCantidad:" + articulo.getCantidad());
                    System.out.println("getDescripcion:" + articulo.getDescripcion());
                    System.out.println("getPrecio:" + articulo.getPrecio());
                }
                System.out.println("XXXXXXXXXXXXXXXXXXXXXXX");
                System.out.println("getItemTotal:"+respuesta.getItemTotal());
                System.out.println("getOrderTotal():"+respuesta.getOrderTotal());
            }
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }

    }        
}
