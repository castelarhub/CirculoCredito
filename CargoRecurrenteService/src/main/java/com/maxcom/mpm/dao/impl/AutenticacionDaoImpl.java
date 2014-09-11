package com.maxcom.mpm.dao.impl;

import com.maxcom.mpm.dao.AutenticacionDao;
import com.maxcom.mpm.model.MpmCusersWs;
import com.maxcom.mpm.util.HibernateUtil;
import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author operador
 */
public class AutenticacionDaoImpl implements AutenticacionDao{

    static final Logger logger = Logger.getLogger(AutenticacionDaoImpl.class);    
    
    @Override
    public boolean isAutenticacionValida(MpmCusersWs usuario) throws Exception {
        logger.info("   AutenticacionDaoImpl:isAutenticacionValida(E)");
        Session session = null;
        try{
            session = HibernateUtil.getSessionFactoryOracle().openSession();
            
            Criteria cr = session.createCriteria(MpmCusersWs.class);
            cr.add(Restrictions.eq("userLogin", usuario.getUserLogin()));
            cr.add(Restrictions.eq("userPass", usuario.getUserPass()));
            cr.add(Restrictions.eq("servicio", usuario.getServicio()));
            MpmCusersWs mpmCusersWs = (MpmCusersWs) cr.uniqueResult();            
            
            if(mpmCusersWs != null){
                return true;
            }
            
            //Si la solicitud/transaccion no existe
        }catch(Exception e){
            logger.error("   Error en AutenticacionDaoImpl:isAutenticacionValida - "+e.getMessage());
            throw e;
        }finally{
            if(session!=null){
                session.flush();
                session.close();
            }
            logger.info("   AutenticacionDaoImpl:isAutenticacionValida(S)");
        }
        //Si no existe se regresa nulo
        return false;
    }
    
}
