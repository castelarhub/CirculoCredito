package com.maxcom.mpm.dao;

import com.maxcom.mpm.model.MpmTbitacoraCargoOnline;
import com.maxcom.mpm.model.MpmTbitacoraConsultaOnline;

/**
 *
 * @author Nelson C.
 */
public interface BitacoraDao {
    public long guardarSolicitud(MpmTbitacoraCargoOnline cargo) throws Exception;
    
    public MpmTbitacoraCargoOnline getTransaccionById(long idBitacora) throws Exception;
    
    public long actualizarTransaccion(MpmTbitacoraCargoOnline cargo) throws Exception;    
    
    public MpmTbitacoraCargoOnline getTransaccionByIdTransaccion(String idTransaccion) throws Exception;
    
    public long guardarSolicitud(MpmTbitacoraConsultaOnline consulta) throws Exception;
    
    public MpmTbitacoraConsultaOnline getConsultaById(long idBitacoraConsulta) throws Exception;
    
    public long actualizarTransaccionConsulta(MpmTbitacoraConsultaOnline consulta) throws Exception;    
    
}
