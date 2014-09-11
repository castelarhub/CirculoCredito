package com.maxcom.mpm.bi;

import com.maxcom.mpm.bi.service.AutenticacionService;
import com.maxcom.mpm.bi.service.BitacoraService;
import com.maxcom.mpm.bi.service.CargoRecurrenteService;
import com.maxcom.mpm.bi.service.impl.AutenticacionServiceImpl;
import com.maxcom.mpm.bi.service.impl.BitacoraServiceImpl;
import com.maxcom.mpm.dto.AutenticacionTO;
import com.maxcom.mpm.dto.CargoTO;
import com.maxcom.mpm.dto.DetalleErrorTO;
import com.maxcom.mpm.dto.RespuestaTO;
import com.maxcom.mpm.dto.TransaccionTO;
import static com.maxcom.mpm.util.Utilerias.isValidCustomerName;
import static com.maxcom.mpm.util.Utilerias.isValidList;
import static com.maxcom.mpm.util.Utilerias.isValidString;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import org.apache.log4j.Logger;

/**
 * La clase CargoRecurrenteFacade implementa las operaciones para trabajar 
 * con los cargos recurrentes en el MPM. <br>
 * 
 * @author Nelson Castelar
 * @version 1.0
 */
public class CargoRecurrenteFacade implements CargoRecurrenteI {
        
    BitacoraService bitacoraService = null;
    CargoRecurrenteService cargoRecurrenteService = null;
    AutenticacionService autenticacionService = null;
    List<CargoTO> listCargosAceptados = null;
    List<CargoTO> listCargosRechazados = null;
    List<DetalleErrorTO> listDetalleError = new ArrayList<DetalleErrorTO>();    
    HashMap<Long,Long> hmRelCargosIdDetalle = null;
    RespuestaTO respuesta = null;
    long idOrden = 0;
    static final Logger logger = Logger.getLogger(CargoRecurrenteFacade.class);
    
    /**
     * Procesa la transaccion especificada
     * @param transaccion Transaccion a procesar
     * @return Regresa la respuesta que resulto del procesamiento. Un objeto de tipo RespuestaTO.
     * @since 1.0
     */
    @Override
    public RespuestaTO procesar(TransaccionTO transaccion) {
        StringBuilder observaciones = null;
        try {
            logger.info("Procesar orden - Inicio");
            
            if (!this.isTransaccionValida(transaccion)) {
                this.respuesta = new RespuestaTO(0, "-","501", "Error - Transaccion nula", Calendar.getInstance().getTime(), null);
                return respuesta;
            }
            
            //Identificando a cada cargo enviado en la orden
            if(transaccion.getCargos()!=null){
                this.agregarIdUnico(transaccion.getCargos());
            }
            
            //Validando datos minimos requeridos
            if (!this.isTransaccionCompleta(transaccion)) {
                this.guardarBitacoraRespuesta(this.respuesta);
                return respuesta;
            }
            
            if(isTransaccionExistente(transaccion)){
                return this.respuesta;                
            }
            
            //Persistir la solicitud de entrada
            this.guardarBitacoraSolicitud(transaccion);

            //Validando credenciales de la solicitud
            if (!this.isAutenticacionValida(transaccion.getAutenticacion())) {
                
                this.respuesta = new RespuestaTO(transaccion.getIdOrden(), transaccion.getIdSAP(),
                                                "ESAP", "Error - Credenciales invalidas",
                                                Calendar.getInstance().getTime(), null);
                
                this.guardarBitacoraRespuesta(this.respuesta);
                return respuesta;
            }

            //Revisando los datos cargo por cargo
            this.revisarDetalleCargos(transaccion.getCargos());

            //Validando que exista al menos un cargo valido
            if (this.listCargosAceptados.isEmpty()) {
                this.respuesta = new RespuestaTO(transaccion.getIdOrden(), transaccion.getIdSAP(),
                        "ESAP", "Error - Todos los cargos enviados son invalidos",
                        Calendar.getInstance().getTime(), listDetalleError);
                
                this.guardarBitacoraRespuesta(this.respuesta);                
                
                return this.respuesta;
            }
            
            observaciones = new StringBuilder("");            
            observaciones.append("Orden aceptada. Cargos aceptados:");
            observaciones.append(this.listCargosAceptados.size());
            
            if (this.listCargosRechazados.size() > 0) {
                observaciones.append(" Cargos rechazados:" + this.listCargosRechazados.size() + ", ver detalleError para mas informacion.");
            }
            
            this.respuesta = new RespuestaTO(transaccion.getIdOrden(), transaccion.getIdSAP(),
                    "RSAP", observaciones.toString(),
                    Calendar.getInstance().getTime(), listDetalleError);
            
            this.guardarBitacoraRespuesta(this.respuesta);
            
            return this.respuesta;

        } catch (Exception e) {
            logger.error("Error en el aplicativo - " + e.toString());
            
            e.printStackTrace();
            
            StringBuilder detalleErrorApp = new StringBuilder("");
            
            detalleErrorApp.append("Error en el aplicativo - Servicio de CargoRecurrente - Favor de reportar.");
            //detalleErrorApp.append(e.toString());            
            //if(detalleErrorApp.length()>250){
            //    detalleErrorApp.substring(0, 200);
            //}
            
            //Agregar notificaciones de mail en caso de error
            
            this.respuesta = new RespuestaTO(transaccion.getIdOrden(), transaccion.getIdSAP(),
                                            "EAPP", detalleErrorApp.toString() ,
                                            Calendar.getInstance().getTime(), listDetalleError);
            
            try{
                this.guardarBitacoraRespuesta(this.respuesta);
            }catch(Exception err){
                logger.error("Error al intentar guardar el error- " + err.getMessage());
            }
            
            return this.respuesta;
        } finally {
            logger.info("Procesar orden - Fin");
        }

    }
    
    /**
     * Analiza cada uno de los cargos enviados en la transaccion, separando los cargos en dos grupos:<br>
     * - Lista de cargos aceptados<b>
     * - Lista de cargos rechazados
     * buscando 
     * @param lCargos Lista de cargos a analizar
     * @throws Exception Si algun error inesperado ocurre
     */
    private void revisarDetalleCargos(List<CargoTO> lCargos) throws Exception {

        try {

            this.listCargosAceptados = new ArrayList<CargoTO>();
            this.listCargosRechazados = new ArrayList<CargoTO>();

            StringBuilder sb = null;
            DetalleErrorTO detalle = null;
            listDetalleError = new ArrayList<DetalleErrorTO>();
            long idTemp = 0;
            for (CargoTO cargo : lCargos) {
                //Agregando la clave unica de persistencia
                idTemp = cargo.getUniqueIdDetail();
                cargo.setIdPersistence(hmRelCargosIdDetalle.get(new Long(idTemp)));
                
                sb = new StringBuilder();
                detalle = new DetalleErrorTO();
                
                sb = revisarDatosMinimosRequeridosCargo(cargo);

                if (sb.length() > 0) {
                    detalle.setObservaciones(sb.toString());
                    detalle.setCargo(cargo);
                    detalle.setIdCobranzaDetalle(cargo.getIdPersistence());
                    detalle.setIdEstatus("*01");
                    listDetalleError.add(detalle);

                    listCargosRechazados.add(cargo);
                    continue;
                }
                
                sb = revisarFormatoDatosCargo(cargo);

                if (sb.length() > 0) {
                    detalle.setObservaciones(sb.toString());
                    detalle.setCargo(cargo);
                    detalle.setIdCobranzaDetalle(cargo.getIdPersistence());
                    detalle.setIdEstatus("*02");
                    listDetalleError.add(detalle);

                    listCargosRechazados.add(cargo);
                    continue;

                }

                /**
                 * Validaciones adicionales*
                 */
                
                listCargosAceptados.add(cargo);
            }

        } catch (Exception e) {
            logger.error("Error en CargoRecurrenteFacade:revisarDetalleCargos" + e);
            throw e;
        }

    }
    
    /**
     * Agrega un identidicador unico a cada uno de los cargos enviados en la lista.
     * @param lCargos Lista de cargos a procesar.
     * @throws Exception Si algun error inesperado ocurre.
     */
    private void agregarIdUnico(List<CargoTO> lCargos) throws Exception {
        long count = 1;
        try {
            for (CargoTO cargo : lCargos) {
                //Agregando una clave unica a cada cargo recibido
                cargo.setUniqueIdDetail(++count);
            }
        } catch (Exception e) {
            logger.error("Error en CargoRecurrenteFacade:agregarIdUnico" + e);
            throw e;
        }

    }   
    
    /**
     * Valida si los datos del cargo tienen el formato requerido para su procesamiento.
     * @param cargo Cargo a validar
     * @return Regresa una cadena que indica los campos que no cumplen con el formato.
     * Si la cadena esta vacia el formato de todos los campos es correcto.
     */
    private StringBuilder revisarFormatoDatosCargo(CargoTO cargo){
            StringBuilder sb = new StringBuilder();
            
            if(!isValidCustomerName(cargo.getNombreCliente())){
                sb.append("Formato de dato incorrecto para el campo nombreCliente, solo se aceptan caracteres alfanumericos y espacios. ");
            }
            
            return sb;
            
    }
    
    /**
     * Valida si el cargo tiene los datos minimos requeridos para su procesamiento.
     * @param cargo Cargo a validar.
     * @return Regresa una cadena que indica los campos faltantes. 
     * Si la cadena esta vacia ningun campo falta.
     */
    private StringBuilder revisarDatosMinimosRequeridosCargo(CargoTO cargo){
        
            StringBuilder sb = new StringBuilder();
        
            if (!isValidString(cargo.getCuenta())) {
                sb.append("Se requiere el campo cuenta - ");
            }
            
            if (!isValidString(cargo.getNombreCliente())) {
                sb.append("Se requiere el campo nombreCliente - ");
            }
            
            if (!isValidString(cargo.getReferencia())) {
                sb.append("Se requiere el campo referencia - ");
            }
            
            if (cargo.getImporte()<= 0.0 ) {
                sb.append("Se requiere un importe mayor a 0.0 - ");
            }
            
            //2 | 3 | 4
            if (cargo.getMarcaTarjeta() <= 0) {
                sb.append("Numero de tarjeta invalido - ");
            }
            
            //2 | 3 | 4
            if (cargo.getTipoCuenta() <=0){
                sb.append("Numero de cuenta invalido - ");
            }
            
            //0 | 1
            //if (cargo.getEntidadFinanciera() <=0){
            //    sb.append("Entidad financiera invalida - ");
            //}
            
            return sb;
            
    }    
    
    /**
     * Valida que las credenciales de autenticacion sean validas.
     * @param autenticacion Credenciales a validar.
     * @return True - Si la autentucación es satisfactoria.
     * @throws Exception Si algun error inesperado ocurre
     */
    private boolean isAutenticacionValida(AutenticacionTO autenticacion) throws Exception {
        try {
            logger.info("   CargoRecurrenteFacade:isAutenticacionValida(E)");
            autenticacionService = new AutenticacionServiceImpl();
            
            if(autenticacionService.isAutenticacionValida(autenticacion)){
                return true;
            }            
            
        } catch (Exception e) {
            logger.error(" Error en CargoRecurrenteFacade:isAutenticacionValida - "+ e.getMessage());
            throw e;
        } finally {
            logger.info("   CargoRecurrenteFacade:isAutenticacionValida(S)");
        }
        return false;
    }
    
    /**
     * Valida si la transaccion es valida. Una transaccion es valida si no es nula.
     * @param transaccion Transaccion a validar
     * @return True - Si la transaccion es valida.
     */
    private boolean isTransaccionValida(TransaccionTO transaccion){
        if(transaccion == null){            
            return false;
        }
        
        return true;
    }
    
    /**
     * Valida si la transaccion tiene la informacion minima requerida para su procesamiento.
     * @param transaccion Transaccion a procesar.
     * @return True - Si la transaccion cuenta con la informacion minima para su procesamiento.
     */
    private boolean isTransaccionCompleta(TransaccionTO transaccion) {
        StringBuilder detalleError = new StringBuilder();
        if (!isValidString(transaccion.getIdSAP())) {
            detalleError.append("El campo idSAP es obligatorio - ");
        }

        if (transaccion.getAutenticacion() == null) {
            detalleError.append("El campo autenticacion es obligatorio - ");
        }else{            
            if (!isValidString(transaccion.getAutenticacion().getClaveServicio())) {
                detalleError.append("El campo claveServicio es obligatorio - ");
            }
            if (!isValidString(transaccion.getAutenticacion().getUsuario())) {
                detalleError.append("El campo usuario es obligatorio - ");
            }
            if (!isValidString(transaccion.getAutenticacion().getContrasenia())) {
                detalleError.append("El campo contrasenia es obligatorio - ");
            }
        }

        if (!isValidList(transaccion.getCargos())) {
            detalleError.append("El campo cargos es obligatorio, debe tener al menos un elemento");
        }
        
        if (detalleError.length() > 0) {
            this.respuesta = new RespuestaTO(transaccion.getIdOrden(), transaccion.getIdSAP(),
                    "ESAP", "Error - Transaccion incompleta ->"+detalleError.toString(),
                    Calendar.getInstance().getTime(), null);
            return false;
        }
        
        return true;
    } 
    
    /**
     * Guarda la transaccion en bitacora antes de ser procesada.
     * @param transaccion Transaccion a guardar.
     * @throws Exception Si algun error inesperado ocurre
     */
    private void guardarBitacoraSolicitud(TransaccionTO transaccion) throws Exception{
        bitacoraService = new BitacoraServiceImpl();
        hmRelCargosIdDetalle = bitacoraService.guardarSolicitud(transaccion);
    }
    
    /**
     * Guarda en bitacora el resultado de la transaccion tras haber sido procesada.
     * @param respuesta Respuesta de la transaccion
     * @throws Exception Si algun error inesperado ocurre
     */
    private void guardarBitacoraRespuesta(RespuestaTO respuesta) throws Exception{
        bitacoraService = new BitacoraServiceImpl();
        bitacoraService.guardarRespuesta(respuesta);
    }
    
    /**
     * Valida si la transaccion ya se habia enviado/procesado anteriormente.
     * @param transaccion Transaccion a validar
     * @return True - Si la transaccion ya se habia enviando anteriormente
     * @throws Exception Si algun error inesperado ocurre
     */
    private boolean isTransaccionExistente(TransaccionTO transaccion) throws Exception{
        respuesta = new RespuestaTO();
        bitacoraService = new BitacoraServiceImpl();
        long idSolicitud = bitacoraService.buscarTransaccion(transaccion,respuesta);
        
        return idSolicitud>0;
        
    }
    
}