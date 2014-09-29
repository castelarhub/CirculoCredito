package com.maxcom.mpm.paypal.client.bi;

import com.maxcom.mpm.paypal.client.dto.RespuestaSolPagoExpressTO;
import com.maxcom.mpm.paypal.client.dto.TransaccionSolicitudPagoExpressTO;

public interface CargoOnlinePaypal {
    public RespuestaSolPagoExpressTO solicitarPagoExpress(TransaccionSolicitudPagoExpressTO trasaccion)throws Exception;
    //public void obtenerDetallePagoExpress();
    //public void confirmatPagoExpress();
}
