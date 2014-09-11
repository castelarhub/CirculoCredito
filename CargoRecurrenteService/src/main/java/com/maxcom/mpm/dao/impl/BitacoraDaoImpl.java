package com.maxcom.mpm.dao.impl;

import com.maxcom.mpm.dao.BitacoraDao;
import com.maxcom.mpm.dto.TransaccionTO;
import com.maxcom.mpm.model.MpmTcobranzaSap;
import com.maxcom.mpm.util.HibernateUtil;
import java.util.List;
import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

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
            
            
            
            session.flush();
        }catch(Exception e){
            logger.error("   Error en BitacoraDaoImpl:getTransaccionById - "+e.getMessage());
            throw e;
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

    @Override
    public MpmTcobranzaSap getTransaccionByIdSAP(String idSAP) throws Exception {        
        logger.info("   BitacoraDaoImpl:getTransaccionByIdSAP(E)");
        MpmTcobranzaSap orden = null;
        Session session = null;
        try{
            session = HibernateUtil.getSessionFactoryOracle().openSession();
            
            Criteria cr = session.createCriteria(MpmTcobranzaSap.class);
            cr.add(Restrictions.eq("idsap", idSAP));
            List<MpmTcobranzaSap> list = cr.list();
            
            logger.info("BitacoraDaoImpl:getTransaccionByIdSAP  idSAP lista -> "+list.size());
            
            if(list.size()>1){
                logger.error("Error - Error - Hay solicitudes repetidas con el mismo idSAP");
                throw new Exception("Error - Hay solicitudes repetidas con el mismo idSAP");
            }else if(list.size()==1){
                orden = (MpmTcobranzaSap) list.get(0);
                return orden;
            }     
            
            //Si la solicitud/transaccion no existe
        }catch(Exception e){
            logger.error("   Error en BitacoraDaoImpl:getTransaccionByIdSAP - "+e.getMessage());
            throw e;
        }finally{
            if(session!=null){
                session.flush();
                session.close();
            }
            logger.info("   BitacoraDaoImpl:getTransaccionByIdSAP(S)");
        }
        //Si no existe se regresa nulo
        return null;        
    }
    
}
