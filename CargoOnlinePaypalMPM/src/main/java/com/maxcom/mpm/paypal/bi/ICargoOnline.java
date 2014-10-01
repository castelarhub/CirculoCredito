package com.maxcom.mpm.paypal.bi;

import com.maxcom.mpm.paypal.dto.RespuestaSolicitudTO;
import com.maxcom.mpm.paypal.dto.RespuestaTO;
import com.maxcom.mpm.paypal.dto.TransaccionSolicitudTO;

/**
 * La interfaz ICargoOnline define el punto de entrada para trabajar 
 con los cargos en linea para Paypal en el MPM.
 * 
 * @author Nelson Castelar
 * @version 1.0
 */
public interface ICargoOnline {
    
    /**
     * Solicita el pago de la transaccion especificada
     * @param transaccion Transaccion a procesar
     * @return Regresa la respuesta que resulto del procesamiento. Un objeto de tipo RespuestaTO.
     * @since 1.0
     */
    public RespuestaSolicitudTO solicitarPago(TransaccionSolicitudTO transaccion);
    
}
