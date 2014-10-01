package com.maxcom.mpm.paypal.ws;

import com.maxcom.mpm.paypal.bi.CargoOnlineFacade;
import com.maxcom.mpm.paypal.bi.ICargoOnline;
import com.maxcom.mpm.paypal.dto.RespuestaSolicitudTO;
import com.maxcom.mpm.paypal.dto.TransaccionDetallePagoTO;
import com.maxcom.mpm.paypal.dto.TransaccionSolicitudTO;
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
@WebService(serviceName = "CargoOnlinePaypalService")
public class CargoOnlinePaypal {
    
    public CargoOnlinePaypal(){        
    }
    
    /**
     * Procesa la transaccion enviada
     * @param transaccion Transaccion a procesar
     * @return Regresa la respuesta que resulto del proesamiento. Un objeto de tipo RespuestaTO.
     */
    @WebMethod(operationName = "solicitarPago")
    @WebResult(name = "respuestaSolicitud")
    public RespuestaSolicitudTO solicitarPago(@WebParam(name = "transaccionSolicitud") @XmlElement(required=true) TransaccionSolicitudTO transaccion ){
        //Agregar DI
        ICargoOnline icargoOnline = new CargoOnlineFacade();
        
        RespuestaSolicitudTO  respuesta = icargoOnline.solicitarPago(transaccion);
        
        icargoOnline = null;
        
        return respuesta;
    }
    
    /**
     * Procesa la transaccion enviada
     * @param transaccion Transaccion a procesar
     * @return Regresa la respuesta que resulto del proesamiento. Un objeto de tipo RespuestaTO.
     */
    @WebMethod(operationName = "recuperarDetallePago")
    @WebResult(name = "respuestaDetallePago")
    public RespuestaSolicitudTO recuperarDetallePago(@WebParam(name = "transaccionDetallePago") @XmlElement(required=true) TransaccionDetallePagoTO transaccion ){
        //Agregar DI
        ICargoOnline icargoOnline = new CargoOnlineFacade();
        
        //RespuestaSolicitudTO  respuesta = icargoOnline.solicitarPago(transaccion);
        
        icargoOnline = null;
        
        return null;
    }    
    
}
