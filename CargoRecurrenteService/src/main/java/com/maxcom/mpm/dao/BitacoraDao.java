package com.maxcom.mpm.dao;

import com.maxcom.mpm.dto.TransaccionTO;

/**
 *
 * @author Nelson C.
 */
public interface BitacoraDao {
    public void guardarSolicitud(TransaccionTO transaccion);
    
}
