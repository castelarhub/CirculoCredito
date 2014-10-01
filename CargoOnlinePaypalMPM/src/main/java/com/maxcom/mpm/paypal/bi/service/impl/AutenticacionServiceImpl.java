package com.maxcom.mpm.paypal.bi.service.impl;

import com.maxcom.mpm.paypal.bi.service.AutenticacionService;
import com.maxcom.mpm.paypal.dao.AutenticacionDao;
import com.maxcom.mpm.paypal.dao.impl.AutenticacionDaoImpl;
import com.maxcom.mpm.paypal.dto.AutenticacionTO;
import com.maxcom.mpm.paypal.model.MpmCusersWs;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author operador
 */
public class AutenticacionServiceImpl implements AutenticacionService{
    
    static final Logger logger = LogManager.getLogger(AutenticacionServiceImpl.class);
    AutenticacionDao autenticacionDao;
    
    public AutenticacionServiceImpl(){
        //Agregar DI
        autenticacionDao = new AutenticacionDaoImpl();
    }

    @Override
    public boolean isAutenticacionValida(AutenticacionTO autenticacion) throws Exception{
        logger.info("   AutenticacionServiceImpl:isAutenticacionValida(E)");
        boolean isValid = false;
        try{
            
            MpmCusersWs usuario = new MpmCusersWs();
            
            usuario.setServicio(autenticacion.getClaveServicio());
            usuario.setUserLogin(autenticacion.getUsuario());
            usuario.setUserPass(autenticacion.getContrasenia());
            
            isValid = autenticacionDao.isAutenticacionValida(usuario);
            
        }catch(Exception e){
            logger.error("   Error en AutenticacionServiceImpl:isAutenticacionValida - "+ e);
            throw e;
        }finally{
            logger.info("   AutenticacionServiceImpl:isAutenticacionValida(S)");
        }
        return isValid;
    }
    
}
