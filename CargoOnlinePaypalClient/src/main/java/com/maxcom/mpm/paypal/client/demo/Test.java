package com.maxcom.mpm.paypal.client.demo;

import com.maxcom.mpm.paypal.client.bi.CargoOnlinePaypal;
import com.maxcom.mpm.paypal.client.bi.CargoOnlinePaypalImpl;
import com.maxcom.mpm.paypal.client.dto.ArticuloTO;
import com.maxcom.mpm.paypal.client.dto.RespuestaSolPagoExpressTO;
import com.maxcom.mpm.paypal.client.dto.TransaccionSolicitudPagoExpressTO;
import java.util.ArrayList;
import java.util.List;

public class Test {
    
    public static void main(String args[]) {
        CargoOnlinePaypal cargo = new CargoOnlinePaypalImpl();
        RespuestaSolPagoExpressTO respuesta = null;
        TransaccionSolicitudPagoExpressTO trasaccion = new TransaccionSolicitudPagoExpressTO();

        try {
            
            trasaccion.setDescripcion("Descripcion orden xyz");
            trasaccion.setReferencia("REF-123");
            trasaccion.setUrlCancel("http://cancelo.com");
            trasaccion.setUrlReturn("http://acepto.com");
            
            List <ArticuloTO> lista = new ArrayList<ArticuloTO>();
            ArticuloTO articulo = new ArticuloTO();
            
            articulo.setCantidad(2);
            articulo.setDescripcion("Patito de hule");
            articulo.setPrecio(1.20d);
            lista.add(articulo);
            
            
            trasaccion.setListaArticulos(lista);
            
            respuesta = cargo.solicitarPagoExpress(trasaccion);

            System.out.println("getAck:" + respuesta.getAck());
            System.out.println("getToken:" + respuesta.getToken());
            System.out.println("getFechaHora:" + respuesta.getFechaHora());
            System.out.println("getCorrelationID:" + respuesta.getCorrelationID());
            System.out.println("getListaErrores:" + respuesta.getListaErrores());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }    
    
}
