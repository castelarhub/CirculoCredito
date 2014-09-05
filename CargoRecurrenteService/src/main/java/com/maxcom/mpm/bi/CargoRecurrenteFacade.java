package com.maxcom.mpm.bi;

import com.maxcom.mpm.bi.service.BitacoraService;
import com.maxcom.mpm.bi.service.impl.BitacoraServiceImpl;
import com.maxcom.mpm.dto.AutenticacionTO;
import com.maxcom.mpm.dto.CargoTO;
import com.maxcom.mpm.dto.RespuestaTO;
import com.maxcom.mpm.dto.TransaccionTO;
import java.util.Calendar;
import java.util.List;

/**
 * 
 * @author Nelson C.
 */
public class CargoRecurrenteFacade implements CargoRecurrenteI {
    
    
    BitacoraService bitacora = null;
    List<CargoTO> cargosAceptados = null;
    List<CargoTO> cargosRechazados = null;
    RespuestaTO respuesta = null;
    
    public RespuestaTO procesar(TransaccionTO transaccion) {
        
        bitacora = new BitacoraServiceImpl();
        
        //guardarBitacoraSolicitud(transaccion);        
        if(this.isTransaccionValida(transaccion)){
            return respuesta;
        }
        
        //bitacora.
        
        
        return respuesta;
        
    }
    
    private boolean isAutenticacionValida(AutenticacionTO aut){
        return true;
    }
    
    private boolean isTransaccionValida(TransaccionTO transaccion){
        //Validando transaccion
        if(transaccion == null){
            this.respuesta = new RespuestaTO(1, "-","E-01", "Transaccion nula", Calendar.getInstance(), null);
            return false;
        }else{
            this.respuesta = new RespuestaTO();
        }
        
        return true;
    }    
    
    private void guardarBitacoraSolicitud(TransaccionTO transaccion){
        
    }
    
    private void guardarBitacoraRespuesta(TransaccionTO transaccion){
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
