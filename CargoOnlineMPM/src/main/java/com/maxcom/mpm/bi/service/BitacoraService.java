package com.maxcom.mpm.bi.service;

import com.maxcom.mpm.dto.RespuestaTO;
import com.maxcom.mpm.dto.TransaccionTO;
import java.util.HashMap;

/**
 *
 * @author operador
 */
public interface BitacoraService {
    public void guardarSolicitud(TransaccionTO transaccion) throws Exception;
    
    public long guardarRespuesta(RespuestaTO respuesta) throws Exception;    
    
}
