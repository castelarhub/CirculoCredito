package com.maxcom.mpm.paypal.bi.service.impl;

import com.maxcom.mpm.paypal.bi.service.CargoOnlineService;
import com.maxcom.mpm.paypal.client.bi.CargoOnlinePaypal;
import com.maxcom.mpm.paypal.client.bi.CargoOnlinePaypalImpl;
import com.maxcom.mpm.paypal.client.dto.ArticuloTO;
import com.maxcom.mpm.paypal.client.dto.RespuestaSolPagoExpressTO;
import com.maxcom.mpm.paypal.client.dto.TransaccionPagoExpressTO;
import com.maxcom.mpm.paypal.dto.CargoTO;
import com.maxcom.mpm.paypal.dto.RespuestaSolicitudTO;
import com.maxcom.mpm.paypal.dto.TransaccionSolicitudTO;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class CargoOnlineServiceImpl implements CargoOnlineService {
    
    public CargoOnlineServiceImpl(){
        
    }
    
    @Override
    public RespuestaSolicitudTO solicitarPago(TransaccionSolicitudTO transaccion) throws Exception{
        
        CargoOnlinePaypal cargo = new CargoOnlinePaypalImpl();
        RespuestaSolPagoExpressTO respuestaSol;
        TransaccionPagoExpressTO transaccionPago = new TransaccionPagoExpressTO();
        RespuestaSolicitudTO respuesta = new RespuestaSolicitudTO();
        
        try {
            
            //transaccionPago.setDescripcion("Descipcion general de la orden");
            transaccionPago.setReferencia(transaccion.getReferencia());
            transaccionPago.setUrlCancel(transaccion.getCancelUrl());
            transaccionPago.setUrlReturn(transaccion.getReturnUrl());
            transaccionPago.setReferenciarPago(transaccion.isReferenciarPago());
            
            List <ArticuloTO> lista = new ArrayList<>();
            ArticuloTO articulo;
            
            //Detalle
            for(CargoTO cargoAux : transaccion.getCargos()){
                articulo = new ArticuloTO();
                articulo.setCantidad(cargoAux.getCantidad());
                articulo.setDescripcion(cargoAux.getDescripcion());
                articulo.setPrecio(cargoAux.getPrecio());
                
                lista.add(articulo);
            }
            
            transaccionPago.setListaArticulos(lista);
            
            respuestaSol = cargo.solicitarPagoExpress(transaccionPago);
            
            /*(String token, String montoTotal, List<DetalleErrorTO> detalleError, String idEstatus, 
               String idOperacion, Date fechaHora, long idCargoOnline, String idTransaccion, 
               String respuesta, String observaciones, Date fecha)*/
            
            respuesta.setDetalleError(null);
            respuesta.setFecha(Calendar.getInstance().getTime());
            respuesta.setFechaHora(respuestaSol.getFechaHora());
            respuesta.setIdCargoOnline(transaccion.getIdOrden());
            respuesta.setIdEstatus(respuestaSol.getAck());
            respuesta.setIdOperacion(respuestaSol.getCorrelationID());
            respuesta.setIdTransaccion(transaccion.getIdTransaccion());
            respuesta.setMontoTotal("0.0");
            respuesta.setObservaciones("Transaccion procesada.");
            respuesta.setRespuesta("RTRAN");
            respuesta.setToken(respuestaSol.getToken());
            
            
            //Pendiente si respuestaSol.getListaErrores() trae errores

        } catch (Exception e) {
            //e.printStackTrace();
            throw e;
        }
        
        return respuesta;
    }
    
}
