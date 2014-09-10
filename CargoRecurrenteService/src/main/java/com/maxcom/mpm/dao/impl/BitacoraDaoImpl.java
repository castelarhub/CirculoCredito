package com.maxcom.mpm.dao.impl;

import com.maxcom.mpm.dao.BitacoraDao;
import com.maxcom.mpm.dto.TransaccionTO;
import com.maxcom.mpm.model.MpmTcobranzaSap;
import com.maxcom.mpm.util.HibernateUtil;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author Nelson C.
 */
public class BitacoraDaoImpl implements BitacoraDao{

    //Session session = null;
    static final Logger logger = Logger.getLogger(BitacoraDaoImpl.class);
    
    public BitacoraDaoImpl(){
        //this.session = HibernateUtil.getSessionFactoryOracle().getCurrentSession();
    }
    
    @Override
    public long guardarSolicitud(MpmTcobranzaSap orden) throws Exception {
        logger.info("   BitacoraDaoImpl:guardarSolicitud(E)");
        org.hibernate.Transaction tx = null;
        Session session = null;
        try {
            
            session = HibernateUtil.getSessionFactoryOracle().openSession();
            
            tx = session.beginTransaction();
            session.save(orden);
            session.flush();
            tx.commit();
            logger.info("       Orden insetada -> " + orden.getIdCobranza());
        } catch (HibernateException e) {
            logger.error("      Error al guardar la solicitud(orden) en la bitacora - " + e.getMessage());
            if (null != tx) {
                tx.rollback();
            }
            throw e;
        } finally {
            if(session!=null){
                session.close();
            }
            
            logger.info("   BitacoraDaoImpl:guardarSolicitud(S)");
        }
        return orden.getIdCobranza();

    }
    
    public long buscarSolicitud(TransaccionTO transaccion) throws Exception{
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
    
    @Override
    public MpmTcobranzaSap getTransaccionById(long idCobranza) throws Exception {
        logger.info("   BitacoraDaoImpl:getTransaccionById(E)");
        MpmTcobranzaSap orden = null;
        Session session = null;
        try{
            session = HibernateUtil.getSessionFactoryOracle().openSession();
            
            orden = (MpmTcobranzaSap) session.get(MpmTcobranzaSap.class, idCobranza);           
        }catch(Exception e){
            logger.info("   Error en BitacoraDaoImpl:getTransaccionById - "+e.getMessage());
        }finally{
            if(session!=null){
                session.close();
            }
            logger.info("   BitacoraDaoImpl:getTransaccionById(E)");            
        }
        return orden;
    }

    @Override
    public long actualizarTransaccion(MpmTcobranzaSap orden) throws Exception {
        logger.info("   BitacoraDaoImpl:actualizarTransaccion(E)");
        org.hibernate.Transaction tx = null;
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactoryOracle().openSession();
            tx = session.beginTransaction();
            session.update(orden);
            session.flush();
            tx.commit();
            logger.info("       Orden actualizada -> " + orden.getIdCobranza());
        } catch (HibernateException e) {
            logger.error("      Error al actualizar la solicitud(orden) en la bitacora - " + e.getMessage());
            if (null != tx) {
                tx.rollback();
            }
            throw e;
        } finally {
            if(session!=null){
                session.close();
            }            
            logger.info("   BitacoraDaoImpl:actualizarTransaccion(S)");
        }
        return orden.getIdCobranza();
    }
    
}
