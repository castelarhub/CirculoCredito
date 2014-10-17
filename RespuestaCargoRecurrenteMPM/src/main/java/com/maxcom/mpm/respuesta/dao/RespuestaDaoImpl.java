package com.maxcom.mpm.respuesta.dao;

import com.maxcom.mpm.respuesta.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author Nelson C.
 */
public class RespuestaDaoImpl{

    
    public RespuestaDaoImpl(){
        //this.session = HibernateUtil.getSessionFactoryOracle().getCurrentSession();
    }
    
    public long guardarSolicitud(MpmDemoRespuestaSap cargo) throws Exception {
        org.hibernate.Transaction tx = null;
        Session session = null;
        try {
            
            session = HibernateUtil.getSessionFactoryOracle().openSession();
            
            tx = session.beginTransaction();
            session.save(cargo);
            session.flush();
            tx.commit();
        } catch (HibernateException e) {
            if (null != tx) {
                tx.rollback();
            }
            throw e;
        } finally {
            if(session!=null){
                session.close();
            }
        }
        return cargo.getIdCobranza();

    }    
    
    
}
