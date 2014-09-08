package com.maxcom.mpm.dao.impl;

import com.maxcom.mpm.dao.BitacoraDao;
import com.maxcom.mpm.dto.TransaccionTO;
import com.maxcom.mpm.model.MpmCestados;
import com.maxcom.mpm.model.MpmTcobranzaSap;
import com.maxcom.mpm.model.MpmTcobranzaSapDeta;
import com.maxcom.mpm.util.HibernateUtil;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import org.apache.log4j.Logger;
import org.hibernate.Session;

/**
 *
 * @author Nelson C.
 */
public class BitacoraDaoImpl implements BitacoraDao{

    Session session = null;
    static final Logger logger = Logger.getLogger(BitacoraDaoImpl.class);
    
    public BitacoraDaoImpl(){
        this.session = HibernateUtil.getSessionFactoryOracle().getCurrentSession();
    }
    
    @Override
    public long guardarSolicitud(TransaccionTO transaccion) {

        
        org.hibernate.Transaction tx = session.beginTransaction();                
        
        //this.session.save(orden);        
        tx.commit();        
        logger.info("Registro Agregado");
        
        //transaccion.getIdSAP();        
        return 0;
        
    }
    
    public static void main(String []args){
        new BitacoraDaoImpl().guardarSolicitud(null);
    }

    @Override
    public long buscarSolicitud(TransaccionTO transaccion) {
        try{
        //List<MpmTcobranzaSap> lista = null;
        //org.hibernate.Transaction tx = session.beginTransaction();
        //Query q = session.createQuery ("from MpmTcobranzaSap");
        //lista = (List<MpmTcobranzaSap>) q.list();                    
        }catch(Exception e){
            
        }finally{
            
        }
        return 0;
    }
    
}
