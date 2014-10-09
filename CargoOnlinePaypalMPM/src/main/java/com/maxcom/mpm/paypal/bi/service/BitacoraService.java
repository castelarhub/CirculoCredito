package com.maxcom.mpm.paypal.bi.service;

import com.maxcom.mpm.paypal.dto.RespuestaConfirmacionPagoTO;
import com.maxcom.mpm.paypal.dto.RespuestaDetallePagoTO;
import com.maxcom.mpm.paypal.dto.RespuestaSolicitudTO;
import com.maxcom.mpm.paypal.dto.TransaccionConfirmacionPagoTO;
import com.maxcom.mpm.paypal.dto.TransaccionDetallePagoTO;
import com.maxcom.mpm.paypal.dto.TransaccionSolicitudTO;

/**
 *
 * @author operador
 */
public interface BitacoraService {
    /**/
    public void guardarSolicitud(TransaccionSolicitudTO transaccion) throws Exception;
    public long guardarRespuesta(RespuestaSolicitudTO respuesta) throws Exception;
    public long buscarTransaccion(TransaccionSolicitudTO transaccion, RespuestaSolicitudTO respueta) throws Exception;
    
    /**/
    public void guardarSolicitud(TransaccionDetallePagoTO transaccion) throws Exception;
    public long guardarRespuesta(RespuestaDetallePagoTO respuesta) throws Exception;
    public long buscarTransaccion(TransaccionDetallePagoTO transaccion, RespuestaDetallePagoTO respueta) throws Exception;    
    
    /**/
    public void guardarSolicitud(TransaccionConfirmacionPagoTO transaccion) throws Exception;
    public long guardarRespuesta(RespuestaConfirmacionPagoTO respuesta) throws Exception;
    public long buscarTransaccion(TransaccionConfirmacionPagoTO transaccion, RespuestaConfirmacionPagoTO respueta) throws Exception;        
    
}
