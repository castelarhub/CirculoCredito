package com.maxcom.mpm.bi;

import com.maxcom.mpm.bi.service.AutenticacionService;
import com.maxcom.mpm.bi.service.BitacoraService;
import com.maxcom.mpm.bi.service.ConsultaOnlineService;
import com.maxcom.mpm.bi.service.impl.AutenticacionServiceImpl;
import com.maxcom.mpm.bi.service.impl.BitacoraServiceImpl;
import com.maxcom.mpm.bi.service.impl.ConsultaOnlineServiceImpl;
import com.maxcom.mpm.dto.AutenticacionTO;
import com.maxcom.mpm.dto.ConsultaCargoTO;
import com.maxcom.mpm.dto.ConsultaDetalleErrorTO;
import com.maxcom.mpm.dto.ConsultaRespuestaTO;
import com.maxcom.mpm.dto.ConsultaTransaccionTO;
import static com.maxcom.mpm.util.Utilerias.isValidDate;
import static com.maxcom.mpm.util.Utilerias.isValidString;
import java.util.Calendar;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ConsultaOnlineFacade implements IConsultaOnline {
    
    private BitacoraService bitacoraService;
    private ConsultaOnlineService consultaOnlineService;
    private AutenticacionService autenticacionService;    
    private ConsultaRespuestaTO respuesta;
    
    static final Logger logger = LogManager.getLogger(ConsultaOnlineFacade.class);
    
    public ConsultaOnlineFacade(){
        //Agregar DI
        this.bitacoraService = new BitacoraServiceImpl();
        this.autenticacionService = new AutenticacionServiceImpl();
        this.consultaOnlineService = new ConsultaOnlineServiceImpl();
    }    

    @Override
    public ConsultaRespuestaTO consultar(ConsultaTransaccionTO transaccion) {
        try {
            logger.info("ConsultaOnlineFacade:consultar(E)");
            
            if (!this.isTransaccionValida(transaccion)) {
                
                this.respuesta = new ConsultaRespuestaTO(0, 
                                                        "ETRAN", 
                                                        "Error - Transaccion nula", 
                                                        Calendar.getInstance().getTime(), 
                                                        null, null, null, null, null);
            }
            
            //Validando datos minimos requeridos
            if (!this.isTransaccionCompleta(transaccion)) {
                //PENDIENTE this.guardarBitacoraRespuesta(this.respuesta);
                return respuesta;
            }            
            
            //Persistir la solicitud de entrada
            //PENDIENTE this.guardarBitacoraSolicitud(transaccion);
            
            //Validando credenciales de la solicitud
            if (!this.isAutenticacionValida(transaccion.getAutenticacion())) {
                
                this.respuesta = new ConsultaRespuestaTO(transaccion.getIdOrden(), 
                                                        "ETRAN", 
                                                        "Error - Credenciales invalidas", 
                                                        Calendar.getInstance().getTime(), 
                                                        null, null, null, null, null);                                
                
                //PENDIENTE this.guardarBitacoraRespuesta(this.respuesta);
                return respuesta;
            }
            
            //Revisando los datos de la consulta
            ConsultaDetalleErrorTO detalleError = this.revisarDetalleCargo(transaccion.getCargo());
            
            //Validando que exista al menos un cargo valido
            if (null != detalleError) {
                this.respuesta = new ConsultaRespuestaTO(transaccion.getIdOrden(), 
                                                        "ETRAN", 
                                                        "Error - Consulta invalida."+ detalleError.getObservaciones(), 
                                                    Calendar.getInstance().getTime(), 
                                                    detalleError, null, null, null, null);                
                
                //PENDIENTE this.guardarBitacoraRespuesta(this.respuesta);
                return this.respuesta;
            }
            
            
            this.respuesta = this.consultaOnlineService.consultarCargo(transaccion);
            
            //PENDIENTE this.guardarBitacoraRespuesta(this.respuesta);
            
            return this.respuesta;
            
        } catch (Exception e) {
            logger.error("Error en ConsultaOnlineFacade:consultar - " + e.toString());
            e.printStackTrace();
            
            StringBuilder detalleErrorApp = new StringBuilder("");
            
            detalleErrorApp.append("Error en el aplicativo - Servicio de ConsultaOnline.");
            
            //Agregar notificaciones de mail en caso de error
            this.respuesta = new ConsultaRespuestaTO(transaccion.getIdOrden(), 
                                                    "EAPP", 
                                                    detalleErrorApp.toString(), 
                                                Calendar.getInstance().getTime(), 
                                                null, null, null, null, null);
            
            try{
                //PENDIENTE this.guardarBitacoraRespuesta(this.respuesta);
            }catch(Exception err){
                logger.error("Error al intentar guardar el error- " + err.getMessage());
            }
            
            return this.respuesta;
        } finally {
            logger.info("ConsultaOnlineFacade:consultar(S)");
        }
    }
    
    /**
     * Valida si la transaccion es valida. Una transaccion es valida si no es nula.
     * @param transaccion Transaccion a validar
     * @return True - Si la transaccion es valida.
     */
    private boolean isTransaccionValida(ConsultaTransaccionTO transaccion){
        return transaccion != null;
    }    
    
    /**
     * Valida si la transaccion tiene la informacion minima requerida para su procesamiento.
     * @param transaccion Transaccion a procesar.
     * @return True - Si la transaccion cuenta con la informacion minima para su procesamiento.
     */
    private boolean isTransaccionCompleta(ConsultaTransaccionTO transaccion) {
        StringBuilder error = new StringBuilder();
                
        if (transaccion.getAutenticacion() == null) {
            error.append("El campo autenticacion es obligatorio - ");
        }else{
            if (!isValidString(transaccion.getAutenticacion().getClaveServicio())) {
                error.append("El campo claveServicio es obligatorio - ");
            }
            if (!isValidString(transaccion.getAutenticacion().getUsuario())) {
                error.append("El campo usuario es obligatorio - ");
            }
            if (!isValidString(transaccion.getAutenticacion().getContrasenia())) {
                error.append("El campo contrasenia es obligatorio - ");
            }
        }
        
        if (transaccion.getCargo()==null) {
            error.append("El campo cargo es obligatorio.");
        }
        
        if (error.length() > 0) {
            this.respuesta = new ConsultaRespuestaTO(transaccion.getIdOrden(), 
                                                    "ETRAN", 
                                                    "Error - Transaccion incompleta ->"+error.toString(), 
                                                    Calendar.getInstance().getTime(), 
                                                    null, null, null, null, null);
            
            return false;
        }
        
        return true;
    }     
    
    /**
     * Valida que las credenciales de autenticacion sean validas.
     * @param autenticacion Credenciales a validar.
     * @return True - Si la autentucación es satisfactoria.
     * @throws Exception Si algun error inesperado ocurre
     */
    private boolean isAutenticacionValida(AutenticacionTO autenticacion) throws Exception {
        try {
            logger.info("   ConsultaOnlineFacade:isAutenticacionValida(E)");            
            
            if(autenticacionService.isAutenticacionValida(autenticacion)){
                return true;
            }            
            
        } catch (Exception e) {
            logger.error(" Error en ConsultaOnlineFacade:isAutenticacionValida - "+ e.getMessage());
            throw e;
        } finally {
            logger.info("   ConsultaOnlineFacade:isAutenticacionValida(S)");
        }
        return false;
    }   
    
    private ConsultaDetalleErrorTO revisarDetalleCargo(ConsultaCargoTO cargo) throws Exception {
        try {
            StringBuilder sb;
            ConsultaDetalleErrorTO detalle = new ConsultaDetalleErrorTO();
            
            sb = revisarDatosMinimosRequeridosCargo(cargo);
            
            if (null != sb && sb.length() > 0) {
                detalle.setObservaciones(sb.toString());
                detalle.setIdEstatus("*01");
                detalle.setCargo(cargo);
                return detalle;
            }

            sb = revisarFormatoDatosCargo(cargo);

            if (null != sb && sb.length() > 0) {
                detalle.setObservaciones(sb.toString());
                detalle.setIdEstatus("*02");
                detalle.setCargo(cargo);
                return detalle;
            }

            /*Validaciones adicionales...*/
            
            return null;

        } catch (Exception e) {
            logger.error("Error en ConsultaOnlineFacade:revisarDetalleCargos" + e);
            throw e;
        }

    }    
    
    private StringBuilder revisarDatosMinimosRequeridosCargo(ConsultaCargoTO cargo){
            StringBuilder sb = new StringBuilder();
            if (!isValidString(cargo.getReferencia())) {
                sb.append("Se requiere el campo referencia - ");
            }
            
            if (!isValidString(cargo.getFechaCargo())) {
                sb.append("Se requiere el campo fechaCargo - ");
            }
            
            return sb;
    }    
    
    private StringBuilder revisarFormatoDatosCargo(ConsultaCargoTO cargo){
            StringBuilder sb = new StringBuilder();
            
            if(!isValidDate(cargo.getFechaCargo())){
                sb.append("Formato de dato incorrecto para el campo fechaCargo. El formato esperado es dd/mm/aaaa, ejem. 19/09/2014 ");
            }
            
            return sb;
            
    }    
    
}
