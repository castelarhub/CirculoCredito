package com.maxcom.mpm.bi.service;

import com.maxcom.mpm.dto.RespuestaTO;
import com.maxcom.mpm.dto.TransaccionTO;
import java.util.HashMap;

/**
 *
 * @author operador
 */
public interface BitacoraService {
    public HashMap<Long,Long> guardarSolicitud(TransaccionTO transaccion) throws Exception;
    
    public long guardarRespuesta(RespuestaTO respuesta) throws Exception;
    
    public long buscarTransaccion(TransaccionTO transaccion, RespuestaTO respueta) throws Exception;
    
}
