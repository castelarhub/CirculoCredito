package com.maxcom.mpm.ws;

import com.maxcom.mpm.bi.CargoRecurrenteFacade;
import com.maxcom.mpm.dto.RespuestaTO;
import com.maxcom.mpm.dto.TransaccionTO;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;

/**
 * Clase que provee el servicio de cargos recurrentes.
 * @author Nelson C.
 */
@WebService(serviceName = "CargoRecurrente")
public class CargoRecurrente {
    
    RespuestaTO respuesta;
    
    /**
     * 
     * @param transaccion 
     * @return
     */
    @WebMethod(operationName = "procesarCargos")
    @WebResult(name = "respuesta")
    public RespuestaTO procesarCargos(@WebParam(name = "transaccion") @XmlElement(required=true) TransaccionTO transaccion ){        
        
        CargoRecurrenteFacade cargoRecurrenteFacade = new CargoRecurrenteFacade();
        
        respuesta = cargoRecurrenteFacade.procesar(transaccion);
        
        return respuesta;
    }
    
}
