package com.maxcom.mpm.paypal.bi.service;

import com.maxcom.mpm.paypal.dto.ConsultaRespuestaTO;
import com.maxcom.mpm.paypal.dto.ConsultaTransaccionTO;
import com.maxcom.mpm.paypal.dto.RespuestaSolicitudTO;
import com.maxcom.mpm.paypal.dto.RespuestaTO;
import com.maxcom.mpm.paypal.dto.TransaccionSolicitudTO;
import com.maxcom.mpm.paypal.dto.TransaccionTO;

/**
 *
 * @author operador
 */
public interface BitacoraService {
    public void guardarSolicitud(TransaccionSolicitudTO transaccion) throws Exception;
    
    public long guardarRespuesta(RespuestaSolicitudTO respuesta) throws Exception;    
    
    public long buscarTransaccion(TransaccionTO transaccion, RespuestaTO respueta) throws Exception;
    
    public void guardarSolicitud(ConsultaTransaccionTO transaccion) throws Exception;
    
    public long guardarRespuesta(ConsultaRespuestaTO respuesta) throws Exception;        
    
}
