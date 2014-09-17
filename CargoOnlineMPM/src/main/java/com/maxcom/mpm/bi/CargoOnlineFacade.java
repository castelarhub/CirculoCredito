package com.maxcom.mpm.bi;

import com.maxcom.mpm.bi.service.AutenticacionService;
import com.maxcom.mpm.bi.service.BitacoraService;
import com.maxcom.mpm.bi.service.CargoOnlineService;
import com.maxcom.mpm.bi.service.impl.AutenticacionServiceImpl;
import com.maxcom.mpm.bi.service.impl.BitacoraServiceImpl;
import com.maxcom.mpm.client.bi.CargoOnlineBanco;
import com.maxcom.mpm.client.bi.CargoOnlineMIT;
import com.maxcom.mpm.client.dto.RespuestaBancoTO;
import com.maxcom.mpm.client.dto.TransaccionBancoTO;
import com.maxcom.mpm.dto.AutenticacionTO;
import com.maxcom.mpm.dto.CargoTO;
import com.maxcom.mpm.dto.DetalleErrorTO;
import com.maxcom.mpm.dto.RespuestaTO;
import com.maxcom.mpm.dto.TransaccionTO;
import static com.maxcom.mpm.util.Utilerias.isValidCustomerName;
import static com.maxcom.mpm.util.Utilerias.isValidString;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import org.apache.log4j.Logger;

/**
 * La clase CargoOnlineFacade implementa las operaciones para trabajar 
 * con los cargos online en el MPM.
 * 
 * @author Nelson Castelar
 * @version 1.0
 */
public class CargoOnlineFacade implements ICargoOnline {
    
    BitacoraService bitacoraService;
    CargoOnlineService cargoOnlineService;
    AutenticacionService autenticacionService;
    
    List<CargoTO> listCargosAceptados;
    List<CargoTO> listCargosRechazados;
    List<DetalleErrorTO> listDetalleError;
    HashMap<Long,Long> hmRelCargosIdDetalle;
    RespuestaTO respuesta;
    long idOrden;
    
    static final Logger logger = Logger.getLogger(CargoOnlineFacade.class);
    
    /**
     * Constructor default de la clase
     */
    public CargoOnlineFacade(){
        //Agregar DI
        this.bitacoraService = new BitacoraServiceImpl();
        this.cargoOnlineService = null;
        this.autenticacionService = new AutenticacionServiceImpl();        
        this.listDetalleError = new ArrayList<DetalleErrorTO>();
        this.listCargosAceptados = new ArrayList<CargoTO>();
        this.listCargosRechazados = new ArrayList<CargoTO>();        
    }
    
    
    /**
     * Procesa la transaccion especificada
     * @param transaccion Transaccion a procesar
     * @return Regresa la respuesta que resulto del procesamiento. Un objeto de tipo RespuestaTO.
     * @since 1.0
     */
    @Override
    public RespuestaTO procesar(TransaccionTO transaccion) {
        StringBuilder observaciones;
        try {
            logger.info("CargoOnlineFacade:procesar(E)");
            
            if (!this.isTransaccionValida(transaccion)) {
                this.respuesta = new RespuestaTO(0, "-","501", "Error - Transaccion nula", Calendar.getInstance().getTime(), null);
                return respuesta;
            }
            
            //Identificando a cada cargo enviado en la orden
            if(transaccion.getCargo()!=null){
                this.agregarIdUnico(transaccion.getCargo());
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
            /*
            if (!this.isAutenticacionValida(transaccion.getAutenticacion())) {
                
                this.respuesta = new RespuestaTO(transaccion.getIdOrden(), transaccion.getIdTransaccion(),
                                                "502", "Error - Credenciales invalidas",
                                                Calendar.getInstance().getTime(), null);
                
                this.guardarBitacoraRespuesta(this.respuesta);
                return respuesta;
            }
            */
            
            //Revisando los datos cargo por cargo
            this.revisarDetalleCargo(transaccion.getCargo());
            
            //Validando que exista al menos un cargo valido
            if (this.listCargosAceptados.isEmpty()) {
                this.respuesta = new RespuestaTO(transaccion.getIdOrden(), transaccion.getIdTransaccion(),
                        "ESAP", "Error - El cargo enviado es invalido, ver detalleError para mas informacion.",
                        Calendar.getInstance().getTime(), listDetalleError.get(0));
                this.guardarBitacoraRespuesta(this.respuesta);                
                return this.respuesta;
            }
            
            CargoTO cargo = transaccion.getCargo();
            
            CargoOnlineBanco cargoOnline = new CargoOnlineMIT();
            TransaccionBancoTO pagoSolicitado = new TransaccionBancoTO();
            
            pagoSolicitado.setAnioExpiracionTarjeta(cargo.getAnioExpiracionTarjeta());
            pagoSolicitado.setCodigoSeguridadTarjeta(cargo.getCodigoSeguridadTarjeta());
            pagoSolicitado.setMesExpiracionTarjeta(cargo.getMesExpiracionTarjeta());
            pagoSolicitado.setMonto(cargo.getMonto());
            pagoSolicitado.setNombreCliente(cargo.getNombreCliente());
            pagoSolicitado.setNumeroTarjeta(cargo.getNumeroTarjeta());
            pagoSolicitado.setReferencia(cargo.getReferencia());
            
            RespuestaBancoTO respuestaBanco = cargoOnline.realizarCargo(pagoSolicitado);
            
            observaciones = new StringBuilder("");
            observaciones.append("Transaccion procesada, ver respuesta.");
            
            this.respuesta = new RespuestaTO(transaccion.getIdOrden(), transaccion.getIdTransaccion(),
                    "RPOR", observaciones.toString(),
                    Calendar.getInstance().getTime(), null);            
            
            this.respuesta.setReferencia(respuestaBanco.getReference());
            this.respuesta.setAutorizacion(respuestaBanco.getAuth());
            this.respuesta.setMonto(respuestaBanco.getAmount());
            this.respuesta.setRespuesta(respuestaBanco.getResponse());
            this.respuesta.setFolioCPagos(respuestaBanco.getFoliocpagos());
            
            this.guardarBitacoraRespuesta(this.respuesta);
            
            return this.respuesta;

        } catch (Exception e) {
            logger.error("Error en CargoOnlineFacade:procesar - " + e.toString());
            
            e.printStackTrace();
            
            StringBuilder detalleErrorApp = new StringBuilder("");
            
            detalleErrorApp.append("Error en el aplicativo - Servicio de CargoOnline - Favor de reportar.");
            
            //Agregar notificaciones de mail en caso de error
            
            this.respuesta = new RespuestaTO(transaccion.getIdOrden(), transaccion.getIdTransaccion(),
                                            "EAPP", detalleErrorApp.toString() ,
                                            Calendar.getInstance().getTime(), null);
            //(listDetalleError!=null)?listDetalleError.get(0):null
            
            try{
                this.guardarBitacoraRespuesta(this.respuesta);
            }catch(Exception err){
                logger.error("Error al intentar guardar el error- " + err.getMessage());
            }
            
            return this.respuesta;
        } finally {
            logger.info("CargoOnlineFacade:procesar(S)");
        }

    }
    
    /**
     * Analiza que el cargo enviado en la transaccion
     * - Lista de cargos aceptados
     * - Lista de cargos rechazados
     * @param lCargos Lista de cargos a analizar
     * @throws Exception Si algun error inesperado ocurre
     */
    private void revisarDetalleCargo(CargoTO cargo) throws Exception {
        try {            
            
            StringBuilder sb;
            DetalleErrorTO detalle;            
            long idTemp;
            //Agregando la clave unica de persistencia
            idTemp = cargo.getUniqueIdDetail();
            //cargo.setIdPersistence(hmRelCargosIdDetalle.get(idTemp));
            
            detalle = new DetalleErrorTO();
            
            sb = revisarDatosMinimosRequeridosCargo(cargo);
            
            if (sb.length() > 0) {
                detalle.setObservaciones(sb.toString());
                detalle.setCargo(cargo);
                detalle.setIdCobranzaDetalle(cargo.getIdPersistence());
                detalle.setIdEstatus("*01");
                listDetalleError.add(detalle);
                listCargosRechazados.add(cargo);
                return;
            }

            sb = revisarFormatoDatosCargo(cargo);

            if (sb.length() > 0) {
                detalle.setObservaciones(sb.toString());
                detalle.setCargo(cargo);
                detalle.setIdCobranzaDetalle(cargo.getIdPersistence());
                detalle.setIdEstatus("*02");
                listDetalleError.add(detalle);
                listCargosRechazados.add(cargo);
                return;
            }

            /*Validaciones adicionales...*/
            listCargosAceptados.add(cargo);

        } catch (Exception e) {
            logger.error("Error en CargoOnlineFacade:revisarDetalleCargos" + e);
            throw e;
        }

    }
    
    /**
     * Agrega un identidicador unico al cargo enviado.
     * @param cargo Cargo a actualizar
     * @throws Exception si ocurre un error inesperado
     */
    private void agregarIdUnico(CargoTO cargo) throws Exception {
        long count = 1;
        try {
            if(cargo!=null){
                cargo.setUniqueIdDetail(++count);
            }
        } catch (Exception e) {
            logger.error("Error en CargoOnlineFacade:agregarIdUnico" + e);
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
        
            if (!isValidString(cargo.getReferencia())) {
                sb.append("Se requiere el campo referencia - ");
            }
            
            if (!isValidString(cargo.getNombreCliente())) {
                sb.append("Se requiere el campo nombreCliente - ");
            }
            
            /*
            if (!isValidString(cargo.getTipoTarjeta())) {
                sb.append("Se requiere el campo tipoTarjeta - ");
            } */           
            
            if (!isValidString(cargo.getNumeroTarjeta())) {
                sb.append("Se requiere el campo numeroTarjeta - ");
            }
            
            /*
            if (!isValidString(cargo.getMesExpiracionTarjeta())) {
                sb.append("Se requiere el campo mesExpiracion - ");
            }*/
            
            
            
            if (cargo.getMonto()<= 0.0 ) {
                sb.append("Se requiere un monto mayor a 0.0 - ");
            }
            
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
    private boolean isTransaccionCompleta(TransaccionTO transaccion) {
        StringBuilder detalleError = new StringBuilder();
        if (!isValidString(transaccion.getIdTransaccion())) {
            detalleError.append("El campo idTransaccion es obligatorio - ");
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
        
        if (transaccion.getCargo()==null) {
            detalleError.append("El campo cargo es obligatorio.");
        }
        
        if (detalleError.length() > 0) {
            this.respuesta = new RespuestaTO(transaccion.getIdOrden(), transaccion.getIdTransaccion(),
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
        return;
        //hmRelCargosIdDetalle = bitacoraService.guardarSolicitud(transaccion);
    }
    
    /**
     * Guarda en bitacora el resultado de la transaccion tras haber sido procesada.
     * @param respuesta Respuesta de la transaccion
     * @throws Exception Si algun error inesperado ocurre
     */
    private void guardarBitacoraRespuesta(RespuestaTO respuesta) throws Exception{
        return;
        //Pendiente de BD bitacoraService.guardarRespuesta(respuesta);
    }
    
    /**
     * Valida si la transaccion ya se habia enviado/procesado anteriormente.
     * @param transaccion Transaccion a validar
     * @return True - Si la transaccion ya se habia enviando anteriormente
     * @throws Exception Si algun error inesperado ocurre
     */
    private boolean isTransaccionExistente(TransaccionTO transaccion) throws Exception{
        /*respuesta = new RespuestaTO();
        long idSolicitud = bitacoraService.buscarTransaccion(transaccion,respuesta);
        
        return idSolicitud>0;*/
        return false;
        
    }
    
}