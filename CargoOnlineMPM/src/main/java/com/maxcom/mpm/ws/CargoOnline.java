package com.maxcom.mpm.ws;

import com.maxcom.mpm.bi.CargoOnlineFacade;
import com.maxcom.mpm.bi.ICargoOnline;
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
    
    ICargoOnline IcargoOnline = null;
    
    public CargoOnline(){        
    }
    
    /**
     * Procesa la transaccion enviada
     * @param transaccion Transaccion a procesar
     * @return Regresa la respuesta que resulto del proesamiento. Un objeto de tipo RespuestaTO.
     */
    @WebMethod(operationName = "procesarCargo")
    @WebResult(name = "respuesta")
    public RespuestaTO procesarCargos(@WebParam(name = "transaccion") @XmlElement(required=true) TransaccionTO transaccion ){        
        //Agregar DI
        IcargoOnline = new CargoOnlineFacade();
                
        respuesta = IcargoOnline.procesar(transaccion);
        
        IcargoOnline = null;
        
        return respuesta;
    }
    
}
