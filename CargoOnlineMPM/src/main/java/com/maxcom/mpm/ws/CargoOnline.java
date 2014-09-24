package com.maxcom.mpm.ws;

import com.maxcom.mpm.bi.CargoOnlineFacade;
import com.maxcom.mpm.bi.ConsultaOnlineFacade;
import com.maxcom.mpm.bi.ICargoOnline;
import com.maxcom.mpm.bi.IConsultaOnline;
import com.maxcom.mpm.dto.ConsultaRespuestaTO;
import com.maxcom.mpm.dto.ConsultaTransaccionTO;
import com.maxcom.mpm.dto.RespuestaTO;
import com.maxcom.mpm.dto.TransaccionTO;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;

/**
 * Clase que provee el servicio de cargo y consulta online en el MPM.
 * @author Nelson Castelar
 * @version 1.0
 */
@WebService(serviceName = "CargoOnlineService")
public class CargoOnline {
    
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
        ICargoOnline icargoOnline = new CargoOnlineFacade();
        
        RespuestaTO  respuesta = icargoOnline.procesar(transaccion);
        
        icargoOnline = null;
        
        return respuesta;
    }
    
    @WebMethod(operationName = "consultarCargo")
    @WebResult(name = "consultaRespuesta")
    public ConsultaRespuestaTO consultarCargo(@WebParam(name = "consultaTransaccion") @XmlElement(required=true) ConsultaTransaccionTO transaccion ){
        //Agregar DI
        IConsultaOnline iconsultaOnline = new ConsultaOnlineFacade();
        
        ConsultaRespuestaTO  respuesta = iconsultaOnline.consultar(transaccion);
        iconsultaOnline = null;
        
        return respuesta;
    }    
    
}
