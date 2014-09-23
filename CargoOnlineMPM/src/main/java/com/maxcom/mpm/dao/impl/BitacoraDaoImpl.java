package com.maxcom.mpm.dao.impl;

import com.maxcom.mpm.dao.BitacoraDao;
import com.maxcom.mpm.model.MpmTbitacoraCargoOnline;
import com.maxcom.mpm.util.HibernateUtil;
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
    public long guardarSolicitud(MpmTbitacoraCargoOnline cargo) throws Exception {
        logger.info("   BitacoraDaoImpl:guardarSolicitud(E)");
        org.hibernate.Transaction tx = null;
        Session session = null;
        try {
            
            session = HibernateUtil.getSessionFactoryOracle().openSession();
            
            tx = session.beginTransaction();
            session.save(cargo);
            session.flush();
            tx.commit();
            logger.info("       Orden insetada -> " + cargo.getIdBitacora());
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
        return cargo.getIdBitacora();

    }    
    
    @Override
    public MpmTbitacoraCargoOnline getTransaccionById(long idBitacora) throws Exception {
        logger.info("   BitacoraDaoImpl:getTransaccionById(E)");
        MpmTbitacoraCargoOnline orden = null;
        Session session = null;
        try{
            session = HibernateUtil.getSessionFactoryOracle().openSession();
            
            orden = (MpmTbitacoraCargoOnline) session.get(MpmTbitacoraCargoOnline.class, idBitacora);
            
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
    public long actualizarTransaccion(MpmTbitacoraCargoOnline cargo) throws Exception {
        logger.info("   BitacoraDaoImpl:actualizarTransaccion(E)");
        org.hibernate.Transaction tx = null;
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactoryOracle().openSession();
            tx = session.beginTransaction();
            session.update(cargo);
            session.flush();
            tx.commit();
            logger.info("       Orden actualizada -> " + cargo.getIdBitacora());
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
        return cargo.getIdBitacora();
    }
    
    @Override
    public MpmTbitacoraCargoOnline getTransaccionByIdTransaccion(String idTransaccion) throws Exception {
        logger.info("   BitacoraDaoImpl:getTransaccionByIdTransaccion(E)");
        MpmTbitacoraCargoOnline cargo = null;
        Session session = null;
        try{
            session = HibernateUtil.getSessionFactoryOracle().openSession();
            
            Criteria cr = session.createCriteria(MpmTbitacoraCargoOnline.class);
            cr.add(Restrictions.eq("idTransaccion", idTransaccion));
            List<MpmTbitacoraCargoOnline> list = cr.list();
            
            logger.info("BitacoraDaoImpl:getTransaccionByIdTransaccion  idTransaccion lista -> "+list.size());
            
            if(list.size()>1){
                logger.error("Error - Error - Hay solicitudes repetidas con el mismo idTransaccion");
                throw new Exception("Error - Hay solicitudes repetidas con el mismo idTransaccion");
            }else if(list.size()==1){
                cargo = (MpmTbitacoraCargoOnline) list.get(0);
                return cargo;
            }     
            
            //Si la solicitud/transaccion no existe
        }catch(Exception e){
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
    
}
