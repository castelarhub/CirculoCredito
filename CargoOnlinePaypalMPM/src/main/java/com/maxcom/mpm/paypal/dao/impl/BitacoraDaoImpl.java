package com.maxcom.mpm.paypal.dao.impl;

import com.maxcom.mpm.paypal.dao.BitacoraDao;
import com.maxcom.mpm.paypal.model.MpmTbitacoraRecPaypal;
import com.maxcom.mpm.paypal.model.MpmTbitacoraSolPaypal;
import com.maxcom.mpm.paypal.util.HibernateUtil;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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
    static final Logger logger = LogManager.getLogger(BitacoraDaoImpl.class);
    
    public BitacoraDaoImpl(){
        //this.session = HibernateUtil.getSessionFactoryOracle().getCurrentSession();
    }
    
    @Override
    public long guardarSolicitud(MpmTbitacoraSolPaypal solicitud) throws Exception {
        logger.info("   BitacoraDaoImpl:guardarSolicitud(E)");
        org.hibernate.Transaction tx = null;
        Session session = null;
        try {
            
            session = HibernateUtil.getSessionFactoryOracle().openSession();
            
            tx = session.beginTransaction();
            session.save(solicitud);
            session.flush();
            tx.commit();
            logger.info("       Orden insetada -> " + solicitud.getIdBitacoraSolPaypal());
        } catch (HibernateException e) {
            logger.error("      Error al guardar la solicitud Paypal en la bitacora - " + e.getMessage());
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
        return solicitud.getIdBitacoraSolPaypal();

    }    
    
    @Override
    public MpmTbitacoraSolPaypal getTransaccionById(long idBitacora) throws Exception {
        logger.info("   BitacoraDaoImpl:getTransaccionById(E)");
        MpmTbitacoraSolPaypal solicitud = null;
        Session session = null;
        try{
            session = HibernateUtil.getSessionFactoryOracle().openSession();
            
            solicitud = (MpmTbitacoraSolPaypal) session.get(MpmTbitacoraSolPaypal.class, idBitacora);
            
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
        return solicitud;
    }

    @Override
    public long actualizarTransaccion(MpmTbitacoraSolPaypal solicitud) throws Exception {
        logger.info("   BitacoraDaoImpl:actualizarTransaccion(E)");
        org.hibernate.Transaction tx = null;
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactoryOracle().openSession();
            tx = session.beginTransaction();
            session.update(solicitud);
            session.flush();
            tx.commit();
            logger.info("       Se actualiza -> " + solicitud.getIdBitacoraSolPaypal());
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
        return solicitud.getIdBitacoraSolPaypal();
    }
    
    @Override
    public MpmTbitacoraSolPaypal getTransaccionByIdTransaccion(String idTransaccion) throws Exception {
        logger.info("   BitacoraDaoImpl:getTransaccionByIdTransaccion(E)");
        MpmTbitacoraSolPaypal solicitud = null;
        Session session = null;
        try{
            session = HibernateUtil.getSessionFactoryOracle().openSession();
            
            Criteria cr = session.createCriteria(MpmTbitacoraSolPaypal.class);
            cr.add(Restrictions.eq("idTransaccion", idTransaccion));
            List<MpmTbitacoraSolPaypal> list = cr.list();
            
            logger.info("BitacoraDaoImpl:getTransaccionByIdTransaccion  idTransaccion lista -> "+list.size());
            
            if(list.size()>0){
                solicitud = (MpmTbitacoraSolPaypal) list.get(0);
                return solicitud;                
            }
            
        }catch(Exception e){
            e.printStackTrace();
            logger.error("   Error en BitacoraDaoImpl:getTransaccionByIdTransaccion - "+e.getMessage());
            throw e;
        }finally{
            if(session!=null){
                session.flush();
                session.close();
            }
            logger.info("   BitacoraDaoImpl:getTransaccionByIdTransaccion(S)");
        }
        //Si no existe se regresa nulo
        return null;        
    }

    @Override
    public long guardarSolicitud(MpmTbitacoraRecPaypal solicitud) throws Exception {
        logger.info("   BitacoraDaoImpl:guardarSolicitud(E)");
        org.hibernate.Transaction tx = null;
        Session session = null;
        try {
            
            session = HibernateUtil.getSessionFactoryOracle().openSession();
            
            tx = session.beginTransaction();
            session.save(solicitud);
            session.flush();
            tx.commit();
            logger.info("       Orden insetada -> " + solicitud.getIdBitacoraRecPaypal());
        } catch (HibernateException e) {
            logger.error("      Error en guardarSolicitud - " + e.getMessage());
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
        return solicitud.getIdBitacoraRecPaypal();
    }

    @Override
    public MpmTbitacoraRecPaypal getTransaccionRecById(long idBitacoraRecPaypal) throws Exception {
        logger.info("   BitacoraDaoImpl:getTransaccionById(E)");
        MpmTbitacoraRecPaypal solicitud = null;
        Session session = null;
        try{
            session = HibernateUtil.getSessionFactoryOracle().openSession();
            
            solicitud = (MpmTbitacoraRecPaypal) session.get(MpmTbitacoraRecPaypal.class, idBitacoraRecPaypal);
            
            session.flush();
        }catch(Exception e){
            logger.error("   Error en BitacoraDaoImpl:getTransaccionRecById - "+e.getMessage());
            throw e;
        }finally{
            if(session!=null){
                session.close();
            }
            logger.info("   BitacoraDaoImpl:getTransaccionById(E)");            
        }
        return solicitud;
    }

    @Override
    public long actualizarTransaccion(MpmTbitacoraRecPaypal solicitud) throws Exception {
        logger.info("   BitacoraDaoImpl:actualizarTransaccion(E)");
        org.hibernate.Transaction tx = null;
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactoryOracle().openSession();
            tx = session.beginTransaction();
            session.update(solicitud);
            session.flush();
            tx.commit();
            logger.info("       Se actualiza -> " + solicitud.getIdBitacoraRecPaypal());
        } catch (HibernateException e) {
            logger.error("      Error en actualizarTransaccion - " + e.getMessage());
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
        return solicitud.getIdBitacoraRecPaypal();
    }

    @Override
    public MpmTbitacoraRecPaypal getTransaccionRecByIdTransaccion(String idTransaccion) throws Exception {
        logger.info("   BitacoraDaoImpl:getTransaccionByIdTransaccion(E)");
        MpmTbitacoraRecPaypal solicitud = null;
        Session session = null;
        try{
            session = HibernateUtil.getSessionFactoryOracle().openSession();
            
            Criteria cr = session.createCriteria(MpmTbitacoraRecPaypal.class);
            cr.add(Restrictions.eq("idTransaccion", idTransaccion));
            List<MpmTbitacoraRecPaypal> list = cr.list();
            
            logger.info("BitacoraDaoImpl:getTransaccionRecByIdTransaccion  idTransaccion lista -> "+list.size());
            
            if(list.size()>0){
                solicitud = (MpmTbitacoraRecPaypal) list.get(0);
                return solicitud;                
            }
            
        }catch(Exception e){
            e.printStackTrace();
            logger.error("   Error en BitacoraDaoImpl:getTransaccionRecByIdTransaccion - "+e.getMessage());
            throw e;
        }finally{
            if(session!=null){
                session.flush();
                session.close();
            }
            logger.info("   BitacoraDaoImpl:getTransaccionRecByIdTransaccion(S)");
        }
        //Si no existe se regresa nulo
        return null;        
    }
    
}
