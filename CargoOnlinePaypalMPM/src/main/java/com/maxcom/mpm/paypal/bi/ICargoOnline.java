package com.maxcom.mpm.paypal.bi;

import com.maxcom.mpm.paypal.dto.RespuestaConfirmacionPagoTO;
import com.maxcom.mpm.paypal.dto.RespuestaDetallePagoTO;
import com.maxcom.mpm.paypal.dto.RespuestaSolicitudTO;
import com.maxcom.mpm.paypal.dto.TransaccionConfirmacionPagoTO;
import com.maxcom.mpm.paypal.dto.TransaccionDetallePagoTO;
import com.maxcom.mpm.paypal.dto.TransaccionSolicitudTO;

/**
 * La interfaz ICargoOnline define el punto de entrada para trabajar 
 con los cargos en linea para Paypal en el MPM.
 * 
 * @author Nelson Castelar
 * @version 1.0
 */
public interface ICargoOnline {
    
    public RespuestaSolicitudTO solicitarPago(TransaccionSolicitudTO transaccion);
    
    public RespuestaDetallePagoTO recuperarDetallePago(TransaccionDetallePagoTO transaccion);
    
    public RespuestaConfirmacionPagoTO confirmarPago(TransaccionConfirmacionPagoTO transaccion);
    
}
