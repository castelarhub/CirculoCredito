package com.maxcom.mpm.respuesta.bi;

import com.maxcom.mpm.respuesta.dto.RespuestaTO;
import com.maxcom.mpm.respuesta.dto.TransaccionTO;

/**
 * La interfaz RespuestaCargoRecurrenteI define el punto de entrada para trabajar 
 con los cargos recurrentes en el MPM. <br>
 * 
 * @author Nelson Castelar
 * @version 1.0
 */
public interface RespuestaCargoRecurrenteI {
    
    /**
     * Procesa la transaccion especificada
     * @param transaccion Transaccion a procesar
     * @return Regresa la respuesta que resulto del procesamiento. Un objeto de tipo RespuestaTO.
     * @since 1.0
     */
    public RespuestaTO procesar(TransaccionTO transaccion);
    
}
