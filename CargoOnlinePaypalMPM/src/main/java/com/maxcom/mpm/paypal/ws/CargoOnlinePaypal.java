package com.maxcom.mpm.paypal.ws;

import com.maxcom.mpm.paypal.bi.CargoOnlineFacade;
import com.maxcom.mpm.paypal.bi.DetalleCargoOnlineFacade;
import com.maxcom.mpm.paypal.bi.ConfirmacionCargoOnlineFacade;
import com.maxcom.mpm.paypal.bi.ICargoOnline;
import com.maxcom.mpm.paypal.dto.RespuestaConfirmacionPagoTO;
import com.maxcom.mpm.paypal.dto.RespuestaDetallePagoTO;
import com.maxcom.mpm.paypal.dto.RespuestaSolicitudTO;
import com.maxcom.mpm.paypal.dto.TransaccionConfirmacionPagoTO;
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
    public RespuestaSolicitudTO solicitarPago(@WebParam(name = "transaccionSolicitud") @XmlElement(required=true) TransaccionSolicitudTO transaccionSolicitud ){
        //Agregar DI
        ICargoOnline icargoOnline = new CargoOnlineFacade();
        
        RespuestaSolicitudTO  respuesta = icargoOnline.solicitarPago(transaccionSolicitud);
        
        icargoOnline = null;
        
        return respuesta;
    }
    
    
    @WebMethod(operationName = "recuperarDetallePago")
    @WebResult(name = "respuestaDetallePago")
    public RespuestaDetallePagoTO recuperarDetallePago(@WebParam(name = "transaccionDetallePago") 
                                                       @XmlElement(required=true) 
                                                       TransaccionDetallePagoTO transaccionDetaPago ){
        //Agregar DI
        ICargoOnline icargoOnline = new DetalleCargoOnlineFacade();
        
        RespuestaDetallePagoTO  respuesta = icargoOnline.recuperarDetallePago(transaccionDetaPago);
        
        icargoOnline = null;
        
        return respuesta;
    }
    
    @WebMethod(operationName = "confirmarPago")
    @WebResult(name = "respuestaConfirmacionPago")
    public RespuestaConfirmacionPagoTO confirmarPago(@WebParam(name = "transaccionConfirmacionPago") 
                                                            @XmlElement(required=true) 
                                                            TransaccionConfirmacionPagoTO transaccionConfirmacionPago ){
        //Agregar DI
        ICargoOnline icargoOnline = new ConfirmacionCargoOnlineFacade();
        
        RespuestaConfirmacionPagoTO  respuesta = icargoOnline.confirmarPago(transaccionConfirmacionPago);
        
        icargoOnline = null;
        
        return respuesta;
    }
    
}
