package com.maxcom.mpm.bi.service.impl;

import com.maxcom.mpm.bi.service.AutenticacionService;
import com.maxcom.mpm.dao.AutenticacionDao;
import com.maxcom.mpm.dao.impl.AutenticacionDaoImpl;
import com.maxcom.mpm.dto.AutenticacionTO;
import com.maxcom.mpm.model.MpmCusersWs;
import org.apache.log4j.Logger;

/**
 *
 * @author operador
 */
public class AutenticacionServiceImpl implements AutenticacionService{
    
    static final Logger logger = Logger.getLogger(AutenticacionServiceImpl.class);

    @Override
    public boolean isAutenticacionValida(AutenticacionTO autenticacion) throws Exception{
        logger.info("   AutenticacionServiceImpl:isAutenticacionValida(E)");
        boolean isValid = false;
        try{
            
            AutenticacionDao autenticacionDao = new AutenticacionDaoImpl();
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
