package com.maxcom.mpm.paypal.bi.service;

import com.maxcom.mpm.paypal.dto.RespuestaConfirmacionPagoTO;
import com.maxcom.mpm.paypal.dto.RespuestaDetallePagoTO;
import com.maxcom.mpm.paypal.dto.RespuestaSolicitudTO;
import com.maxcom.mpm.paypal.dto.TransaccionConfirmacionPagoTO;
import com.maxcom.mpm.paypal.dto.TransaccionDetallePagoTO;
import com.maxcom.mpm.paypal.dto.TransaccionSolicitudTO;

public interface CargoOnlineService {
    public RespuestaSolicitudTO solicitarPago(TransaccionSolicitudTO transaccion) throws Exception;
    public RespuestaDetallePagoTO recuperarDetallePago(TransaccionDetallePagoTO transaccion) throws Exception;
    public RespuestaConfirmacionPagoTO confirmarPago(TransaccionConfirmacionPagoTO transaccion) throws Exception;
}
