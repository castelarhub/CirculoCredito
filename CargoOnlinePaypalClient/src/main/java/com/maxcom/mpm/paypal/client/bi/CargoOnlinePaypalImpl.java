package com.maxcom.mpm.paypal.client.bi;

import com.maxcom.mpm.paypal.client.client.SolicitudPagoExpress;
import com.maxcom.mpm.paypal.client.dto.RespuestaSolPagoExpressTO;
import com.maxcom.mpm.paypal.client.dto.TransaccionSolicitudPagoExpressTO;

public class CargoOnlinePaypalImpl implements CargoOnlinePaypal {

    @Override
    public RespuestaSolPagoExpressTO solicitarPagoExpress(TransaccionSolicitudPagoExpressTO trasaccion) throws Exception{
        SolicitudPagoExpress solicitud = new SolicitudPagoExpress();
        
        RespuestaSolPagoExpressTO respuesta = solicitud.solicitar(trasaccion);
        
        return respuesta;
        
    }
    
}
