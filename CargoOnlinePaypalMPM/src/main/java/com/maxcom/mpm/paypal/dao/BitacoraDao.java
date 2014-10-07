package com.maxcom.mpm.paypal.dao;

import com.maxcom.mpm.paypal.model.MpmTbitacoraCargoOnline;
import com.maxcom.mpm.paypal.model.MpmTbitacoraConsultaOnline;
import com.maxcom.mpm.paypal.model.MpmTbitacoraSolPaypal;

/**
 *
 * @author Nelson C.
 */
public interface BitacoraDao {
    public long guardarSolicitud(MpmTbitacoraSolPaypal solicitud) throws Exception;
    
    public MpmTbitacoraSolPaypal getTransaccionById(long idBitacora) throws Exception;
    
    public long actualizarTransaccion(MpmTbitacoraSolPaypal solicitud) throws Exception;    
    
    public MpmTbitacoraCargoOnline getTransaccionByIdTransaccion(String idTransaccion) throws Exception;
    
    public long guardarSolicitud(MpmTbitacoraConsultaOnline consulta) throws Exception;
    
    public MpmTbitacoraConsultaOnline getConsultaById(long idBitacoraConsulta) throws Exception;
    
    public long actualizarTransaccionConsulta(MpmTbitacoraConsultaOnline consulta) throws Exception;    
    
}
