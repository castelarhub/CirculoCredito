package com.maxcom.mpm.paypal.bi;

import com.maxcom.mpm.paypal.bi.service.AutenticacionService;
import com.maxcom.mpm.paypal.bi.service.BitacoraService;
import com.maxcom.mpm.paypal.bi.service.CargoOnlineService;
import com.maxcom.mpm.paypal.bi.service.impl.AutenticacionServiceImpl;
import com.maxcom.mpm.paypal.bi.service.impl.BitacoraServiceImpl;
import com.maxcom.mpm.paypal.bi.service.impl.CargoOnlineServiceImpl;
import com.maxcom.mpm.paypal.dto.AutenticacionTO;
import com.maxcom.mpm.paypal.dto.DetalleErrorTO;
import com.maxcom.mpm.paypal.dto.RespuestaConfirmacionPagoTO;
import com.maxcom.mpm.paypal.dto.RespuestaDetallePagoTO;
import com.maxcom.mpm.paypal.dto.RespuestaSolicitudTO;
import com.maxcom.mpm.paypal.dto.TransaccionConfirmacionPagoTO;
import com.maxcom.mpm.paypal.dto.TransaccionDetallePagoTO;
import com.maxcom.mpm.paypal.dto.TransaccionSolicitudTO;
import com.maxcom.mpm.paypal.dto.TransaccionTO;
import static com.maxcom.mpm.paypal.util.Utilerias.isValidString;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class ConfirmacionCargoOnlineFacade implements ICargoOnline {
    
    private BitacoraService bitacoraService;
    private CargoOnlineService cargoOnlineService;
    private AutenticacionService autenticacionService;
    
    private List<DetalleErrorTO> listDetalleError;
    private RespuestaConfirmacionPagoTO respuesta;
        
    static final Logger logger = LogManager.getLogger(DetalleCargoOnlineFacade.class);
    
    /**
     * Constructor default de la clase
     */
    public ConfirmacionCargoOnlineFacade(){
        //Agregar DI
        this.bitacoraService = new BitacoraServiceImpl();
        this.cargoOnlineService = new CargoOnlineServiceImpl();
        this.autenticacionService = new AutenticacionServiceImpl();
        this.listDetalleError = new ArrayList<>();
    }
        
    /**
     * Solicita el pago de la transaccion especificada
     * @param transaccion Transaccion a procesar
     * @return Regresa la respuesta que resulto del procesamiento.
     * @since 1.0
     */
    @Override
    public RespuestaConfirmacionPagoTO confirmarPago(TransaccionConfirmacionPagoTO transaccion) {
        try {
            logger.info("CargoOnlineFacade:confirmarPago(E)");
            
            if (!this.isTransaccionValida(transaccion)) {
                this.respuesta = new RespuestaConfirmacionPagoTO("-", "-", null, "-", 
                                                            "-", "-", 0, "-", 
                                                            "ETRAN","Error - Transaccion nula",Calendar.getInstance().getTime());
                return respuesta;
            }
            
            if(isTransaccionExistente(transaccion)){
                return this.respuesta;
            }            
            
            //Validando datos minimos requeridos
            if (!this.isTransaccionCompleta(transaccion)) {
                this.guardarBitacoraSolicitud(transaccion);
                this.respuesta.setIdOperacionMPM(transaccion.getIdOrden());
                this.guardarBitacoraRespuesta(this.respuesta);
                return respuesta;
            }
            
            this.guardarBitacoraSolicitud(transaccion);
            
            //Validando credenciales de la solicitud
            if (!this.isAutenticacionValida(transaccion.getAutenticacion())) {
                this.respuesta = new RespuestaConfirmacionPagoTO("-", "-", null, "-", 
                                                            "-", "-", transaccion.getIdOrden(), transaccion.getIdTransaccion(), 
                                                            "ETRAN","Error - Credenciales invalidas",Calendar.getInstance().getTime());
                
                this.guardarBitacoraRespuesta(this.respuesta);
                return respuesta;
            }
            
            this.respuesta = this.cargoOnlineService.confirmarPago(transaccion);
            
            this.guardarBitacoraRespuesta(this.respuesta);
            
            return this.respuesta;            
        } catch (Exception e) {
            logger.error("Error en CargoOnlineFacade:confirmarPago - " + e.toString());            
            e.printStackTrace();            
            StringBuilder detalleErrorApp = new StringBuilder("");            
            detalleErrorApp.append("Error en el aplicativo - Servicio de CargoOnline Paypal - confirmarPago.");
            //Agregar notificaciones de mail en caso de error
            
            this.respuesta = new RespuestaConfirmacionPagoTO("-", "-", null, "-", 
                                                        "-", "-", transaccion.getIdOrden(), transaccion.getIdTransaccion(), 
                                                        "EAPP",detalleErrorApp.toString(),Calendar.getInstance().getTime());
            
            try{
                this.guardarBitacoraRespuesta(this.respuesta);
            }catch(Exception err){
                logger.error("Error al intentar guardar el error- " + err.getMessage());
            }
            
            return this.respuesta;
        } finally {
            logger.info("CargoOnlineFacade:confirmarPago(S)");
        }
    }
    
    /**
     * Valida que las credenciales de autenticacion sean validas.
     * @param autenticacion Credenciales a validar.
     * @return True - Si la autentucación es satisfactoria.
     * @throws Exception Si algun error inesperado ocurre
     */
    private boolean isAutenticacionValida(AutenticacionTO autenticacion) throws Exception {
        try {
            logger.info("   CargoOnlineFacade:isAutenticacionValida(E)");            
            
            if(autenticacionService.isAutenticacionValida(autenticacion)){
                return true;
            }            
            
        } catch (Exception e) {
            logger.error(" Error en CargoOnlineFacade:isAutenticacionValida - "+ e.getMessage());
            throw e;
        } finally {
            logger.info("   CargoOnlineFacade:isAutenticacionValida(S)");
        }
        return false;
    }
    
    /**
     * Valida si la transaccion es valida. Una transaccion es valida si no es nula.
     * @param transaccion Transaccion a validar
     * @return True - Si la transaccion es valida.
     */
    private boolean isTransaccionValida(TransaccionTO transaccion){
        return transaccion != null;
    }
    
    /**
     * Valida si la transaccion tiene la informacion minima requerida para su procesamiento.
     * @param transaccion Transaccion a procesar.
     * @return True - Si la transaccion cuenta con la informacion minima para su procesamiento.
     */
    private boolean isTransaccionCompleta(TransaccionConfirmacionPagoTO transaccion) {
        StringBuilder error = new StringBuilder();
        
        if (!isValidString(transaccion.getIdTransaccion())) {
            error.append("El campo idTransaccion es obligatorio - ");
        }
        
        if (!isValidString(transaccion.getReferencia())) {
            error.append("El campo referencia es obligatorio.");
        }
        
        if (transaccion.getAutenticacion() == null) {
            error.append("El campo autenticacion es obligatorio - ");
        }else{
            if (!isValidString(transaccion.getAutenticacion().getUsuario())) {
                error.append("El campo usuario es obligatorio - ");
            }
            if (!isValidString(transaccion.getAutenticacion().getContrasenia())) {
                error.append("El campo contrasenia es obligatorio - ");
            }
        }
                
        if (!isValidString(transaccion.getReferencia())) {
            error.append("El campo referencia es obligatorio - ");
        }
        
        if (!isValidString(transaccion.getToken())) {
            error.append("El campo token es obligatorio - ");
        }
        
        if (!isValidString(transaccion.getPayerId())) {
            error.append("El campo payerId es obligatorio - ");
        }
        
        if (transaccion.getOrderTotal()<=0.0) {
            error.append("El campo orderTotal deber ser mayor a 0.0 - ");
        }
        
        if (error.length() > 0) {
                this.respuesta = new RespuestaConfirmacionPagoTO("-", "-", null, "-", 
                                                            "-", "-", transaccion.getIdOrden(), transaccion.getIdTransaccion(), 
                                                            "ETRAN","Error - Transaccion incompleta ->"+error.toString(),Calendar.getInstance().getTime());
            return false;
        }
        
        return true;
    } 
    
    
    private void guardarBitacoraSolicitud(TransaccionConfirmacionPagoTO transaccion) throws Exception{        
        bitacoraService.guardarSolicitud(transaccion);
        
    }
    
    private void guardarBitacoraRespuesta(RespuestaConfirmacionPagoTO respuesta) throws Exception{
        bitacoraService.guardarRespuesta(respuesta);
    }
    
    private boolean isTransaccionExistente(TransaccionConfirmacionPagoTO transaccion) throws Exception{
        
        if(transaccion.getIdTransaccion()== null){
            return false;
        }
        
        this.respuesta = new RespuestaConfirmacionPagoTO();
        long idSolicitud = bitacoraService.buscarTransaccion(transaccion,respuesta);
        
        return idSolicitud>0;        
    }

    @Override
    public RespuestaSolicitudTO solicitarPago(TransaccionSolicitudTO transaccion) {    
        throw new UnsupportedOperationException("Not supported.");
    }

    @Override
    public RespuestaDetallePagoTO recuperarDetallePago(TransaccionDetallePagoTO transaccion) {
        throw new UnsupportedOperationException("Not supported.");
    }
    
}