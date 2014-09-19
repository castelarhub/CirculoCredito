package com.maxcom.mpm.dao;

import com.maxcom.mpm.model.MpmTbitacoraCargoOnline;

/**
 *
 * @author Nelson C.
 */
public interface BitacoraDao {
    public long guardarSolicitud(MpmTbitacoraCargoOnline cargo) throws Exception;
    
    public MpmTbitacoraCargoOnline getTransaccionById(long idBitacora) throws Exception;
    
    public long actualizarTransaccion(MpmTbitacoraCargoOnline cargo) throws Exception;    
    
    public MpmTbitacoraCargoOnline getTransaccionByIdTransaccion(String idTransaccion) throws Exception;
    
}
