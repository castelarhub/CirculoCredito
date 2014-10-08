package com.maxcom.mpm.paypal.dao;

import com.maxcom.mpm.paypal.model.MpmTbitacoraCargoOnline;
import com.maxcom.mpm.paypal.model.MpmTbitacoraConsultaOnline;
import com.maxcom.mpm.paypal.model.MpmTbitacoraRecPaypal;
import com.maxcom.mpm.paypal.model.MpmTbitacoraSolPaypal;

/**
 *
 * @author Nelson C.
 */
public interface BitacoraDao {
    /**/
    public long guardarSolicitud(MpmTbitacoraSolPaypal solicitud) throws Exception;
    public MpmTbitacoraSolPaypal getTransaccionById(long idBitacora) throws Exception;    
    public long actualizarTransaccion(MpmTbitacoraSolPaypal solicitud) throws Exception;        
    public MpmTbitacoraSolPaypal getTransaccionByIdTransaccion(String idTransaccion) throws Exception;
    
    /**/
    public long guardarSolicitud(MpmTbitacoraRecPaypal solicitud) throws Exception;
    public MpmTbitacoraRecPaypal getTransaccionRecById(long idBitacora) throws Exception;    
    public long actualizarTransaccion(MpmTbitacoraRecPaypal solicitud) throws Exception;        
    public MpmTbitacoraRecPaypal getTransaccionRecByIdTransaccion(String idTransaccion) throws Exception;    
    
    
}
