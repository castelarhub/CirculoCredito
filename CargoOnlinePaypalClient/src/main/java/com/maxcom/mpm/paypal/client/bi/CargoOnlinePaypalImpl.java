package com.maxcom.mpm.paypal.client.bi;

import com.maxcom.mpm.paypal.client.client.ConfirmacionPagoExpress;
import com.maxcom.mpm.paypal.client.client.DetallePagoExpress;
import com.maxcom.mpm.paypal.client.client.SolicitudPagoExpress;
import com.maxcom.mpm.paypal.client.dto.RespuestaConfirmalPagoExpressTO;
import com.maxcom.mpm.paypal.client.dto.RespuestaDetallePagoExpressTO;
import com.maxcom.mpm.paypal.client.dto.RespuestaSolPagoExpressTO;
import com.maxcom.mpm.paypal.client.dto.TransaccionConfirmaPagoExpressTO;
import com.maxcom.mpm.paypal.client.dto.TransaccionDetallePagoExpressTO;
import com.maxcom.mpm.paypal.client.dto.TransaccionPagoExpressTO;

public class CargoOnlinePaypalImpl implements CargoOnlinePaypal {

    @Override
    public RespuestaSolPagoExpressTO solicitarPagoExpress(TransaccionPagoExpressTO trasaccion) throws Exception{
        SolicitudPagoExpress solicitud = new SolicitudPagoExpress();
        
        RespuestaSolPagoExpressTO respuesta = solicitud.solicitar(trasaccion);
        
        return respuesta;
        
    }

    @Override
    public RespuestaDetallePagoExpressTO recuperaDetallePagoExpress(TransaccionDetallePagoExpressTO trasaccion) throws Exception {
        DetallePagoExpress solicitud = new DetallePagoExpress();
        
        RespuestaDetallePagoExpressTO respuesta = solicitud.recuperaDetallePagoExpress(trasaccion);
        
        return respuesta;
    }

    @Override
    public RespuestaConfirmalPagoExpressTO confirmarPagoExpress(TransaccionConfirmaPagoExpressTO trasaccion) throws Exception {
        ConfirmacionPagoExpress solicitud = new ConfirmacionPagoExpress();
        
        RespuestaConfirmalPagoExpressTO respuesta = solicitud.confirmarPagoExpress(trasaccion);
        
        return respuesta;
    }
    
}
