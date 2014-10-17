package com.maxcom.mpm.respuesta.ws;

import com.maxcom.mpm.respuesta.bi.RespuestaCargoRecurrenteFacade;
import com.maxcom.mpm.respuesta.bi.RespuestaCargoRecurrenteI;
import com.maxcom.mpm.respuesta.dto.RespuestaTO;
import com.maxcom.mpm.respuesta.dto.TransaccionTO;
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
@WebService(serviceName = "RespuestaService")
public class RespuestaCargoRecurrente {
    
    RespuestaTO respuesta;
    
    RespuestaCargoRecurrenteI cargoRecurrenteI = null;
    
    public RespuestaCargoRecurrente(){
        //Agregar DI
        cargoRecurrenteI = new RespuestaCargoRecurrenteFacade();
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
