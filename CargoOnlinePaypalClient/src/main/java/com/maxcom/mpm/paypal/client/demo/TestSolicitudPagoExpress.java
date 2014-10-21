package com.maxcom.mpm.paypal.client.demo;

import com.maxcom.mpm.paypal.client.bi.CargoOnlinePaypal;
import com.maxcom.mpm.paypal.client.bi.CargoOnlinePaypalImpl;
import com.maxcom.mpm.paypal.client.dto.ArticuloTO;
import com.maxcom.mpm.paypal.client.dto.RespuestaSolPagoExpressTO;
import com.maxcom.mpm.paypal.client.dto.TransaccionPagoExpressTO;
import java.util.ArrayList;
import java.util.List;

public class TestSolicitudPagoExpress {
    
    public static void main(String args[]) {
        CargoOnlinePaypal cargo = new CargoOnlinePaypalImpl();
        RespuestaSolPagoExpressTO respuesta = null;
        TransaccionPagoExpressTO trasaccion = new TransaccionPagoExpressTO();

        try {
            
            trasaccion.setDescripcion("Descripcion orden xyz fsdsfds");
            trasaccion.setReferencia("REF-1234356-01");
            trasaccion.setUrlCancel("http://canceloBaruch.com/?uno=123");
            trasaccion.setUrlReturn("http://aceptoBaruch.com/?uno=234");
            
            List <ArticuloTO> lista = new ArrayList<ArticuloTO>();
            ArticuloTO articulo = null;
            
            articulo = new ArticuloTO();
            articulo.setCantidad(2);
            articulo.setDescripcion("Patito de hule con goma");
            articulo.setPrecio(35000.20d);
            lista.add(articulo);
            
            articulo = new ArticuloTO();
            articulo.setCantidad(1);
            articulo.setDescripcion("Paquete convenga");
            articulo.setPrecio(1.05d);
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
