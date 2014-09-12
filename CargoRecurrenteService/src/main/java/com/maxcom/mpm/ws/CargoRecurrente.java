package com.maxcom.mpm.ws;

import com.maxcom.mpm.bi.CargoRecurrenteFacade;
import com.maxcom.mpm.bi.CargoRecurrenteI;
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
@WebService(serviceName = "CargoRecurrenteService")
public class CargoRecurrente {
    
    RespuestaTO respuesta;
    
    CargoRecurrenteI cargoRecurrenteI = null;
    
    public CargoRecurrente(){
        //Agregar DI
        cargoRecurrenteI = new CargoRecurrenteFacade();
    }
    
    /**
     * Procesa la transaccion enviada
     * @param transaccion Transaccion a procesar
     * @return Regresa la respuesta que resulto del procesamiento. Un objeto de tipo RespuestaTO.
     */
    @WebMethod(operationName = "procesarCargos")
    @WebResult(name = "respuesta")
    public RespuestaTO procesarCargos(@WebParam(name = "transaccion") @XmlElement(required=true) TransaccionTO transaccion ){        
        
        respuesta = cargoRecurrenteI.procesar(transaccion);
        
        return respuesta;
    }
    
}
