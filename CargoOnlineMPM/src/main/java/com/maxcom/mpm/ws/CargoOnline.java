package com.maxcom.mpm.ws;

import com.maxcom.mpm.bi.CargoOnlineFacade;
import com.maxcom.mpm.bi.CargoOnlineI;
import com.maxcom.mpm.dto.RespuestaTO;
import com.maxcom.mpm.dto.TransaccionTO;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;

/**
 * Clase que provee el servicio de cargos recurrentes en el MPM.
 * @author Nelson Castelar
 * @version 1.0
 */
@WebService(serviceName = "CargoOnlineService")
public class CargoOnline {
    
    RespuestaTO respuesta;
    
    CargoOnlineI cargoOnlineI = null;
    
    public CargoOnline(){
        //Agregar DI
        cargoOnlineI = new CargoOnlineFacade();
    }
    
    /**
     * Procesa la transaccion enviada
     * @param transaccion Transaccion a procesar
     * @return Regresa la respuesta que resulto del proesamiento. Un objeto de tipo RespuestaTO.
     */
    @WebMethod(operationName = "procesarCargo")
    @WebResult(name = "respuesta")
    public RespuestaTO procesarCargos(@WebParam(name = "transaccion") @XmlElement(required=true) TransaccionTO transaccion ){        
        
        respuesta = cargoOnlineI.procesar(transaccion);
        
        return respuesta;
    }
    
}
