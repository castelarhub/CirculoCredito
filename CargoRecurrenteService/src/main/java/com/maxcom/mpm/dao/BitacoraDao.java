package com.maxcom.mpm.dao;

import com.maxcom.mpm.model.MpmTcobranzaSap;

/**
 *
 * @author Nelson C.
 */
public interface BitacoraDao {
    public long guardarSolicitud(MpmTcobranzaSap orden) throws Exception;
    
    public MpmTcobranzaSap getTransaccionById(long idCobranza) throws Exception;
    
    public long actualizarTransaccion(MpmTcobranzaSap orden) throws Exception;
    
}
