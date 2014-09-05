package com.maxcom.mpm.bi.service.impl;

import com.maxcom.mpm.bi.service.BitacoraService;
import com.maxcom.mpm.dao.BitacoraDao;
import com.maxcom.mpm.dao.impl.BitacoraDaoImpl;
import com.maxcom.mpm.dto.TransaccionTO;

/**
 *
 * @author operador
 */
public class BitacoraServiceImpl implements BitacoraService {
    
    BitacoraDao bitacora = new BitacoraDaoImpl();

    @Override
    public void guardarSolicitud(TransaccionTO transaccion) {
        bitacora.guardarSolicitud(transaccion);
    }
    
}
