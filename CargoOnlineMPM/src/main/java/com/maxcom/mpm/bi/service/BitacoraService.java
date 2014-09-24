package com.maxcom.mpm.bi.service;

import com.maxcom.mpm.dto.ConsultaRespuestaTO;
import com.maxcom.mpm.dto.ConsultaTransaccionTO;
import com.maxcom.mpm.dto.RespuestaTO;
import com.maxcom.mpm.dto.TransaccionTO;

/**
 *
 * @author operador
 */
public interface BitacoraService {
    public void guardarSolicitud(TransaccionTO transaccion) throws Exception;
    
    public long guardarRespuesta(RespuestaTO respuesta) throws Exception;    
    
    public long buscarTransaccion(TransaccionTO transaccion, RespuestaTO respueta) throws Exception;
    
    public void guardarSolicitud(ConsultaTransaccionTO transaccion) throws Exception;
    
    public long guardarRespuesta(ConsultaRespuestaTO respuesta) throws Exception;        
    
}
