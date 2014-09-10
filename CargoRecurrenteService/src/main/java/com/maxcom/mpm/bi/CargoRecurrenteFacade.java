package com.maxcom.mpm.bi;

import com.maxcom.mpm.bi.service.AutenticacionService;
import com.maxcom.mpm.bi.service.BitacoraService;
import com.maxcom.mpm.bi.service.CargoRecurrenteService;
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
 * 
 * @author Nelson C.
 */
public class CargoRecurrenteFacade implements CargoRecurrenteI {
        
    BitacoraService bitacoraService = null;
    CargoRecurrenteService cargoRecurrenteService = null;
    AutenticacionService autenticacionService = null;
    List<CargoTO> listCargosAceptados = null;
    List<CargoTO> listCargosRechazados = null;
    List<DetalleErrorTO> listDetalleError = null;
    HashMap<Long,Long> hmRelCargosIdDetalle = null;
    RespuestaTO respuesta = null;
    long idOrden = 0;
    static final Logger logger = Logger.getLogger(CargoRecurrenteFacade.class);
    
    @Override
    public RespuestaTO procesar(TransaccionTO transaccion) {
        StringBuilder observaciones = null;
        try {
            logger.info("Procesar orden - Inicio");

            if (!this.isTransaccionValida(transaccion)) {
                return respuesta;
            }

            //Persistir la solicitud de entrada
            this.guardarBitacoraSolicitud(transaccion);

            //Validando datos minimos requeridos
            if (!this.isTransaccionCompleta(transaccion)) {
                this.guardarBitacoraRespuesta(this.respuesta);
                return respuesta;
            }

            //Validando credenciales de la solicitud
            if (!this.isAutenticacionValida(transaccion)) {
                this.guardarBitacoraRespuesta(this.respuesta);
                return respuesta;
            }

            //Revisando los datos cargo por cargo
            this.revisarDetalleCargos(transaccion);

            //Revisando si hay cargos rechazados
            if (this.listCargosRechazados.size() > 0) {
                this.revisarErrorDetalleCargos(this.listCargosRechazados);
            }

            //Validando que exista al menos un cargo valido
            if (this.listCargosAceptados.isEmpty()) {
                this.respuesta = new RespuestaTO(transaccion.getIdOrden(), transaccion.getIdSAP(),
                        "504", "Error - Todos los cargos enviados son invalidos",
                        Calendar.getInstance(), listDetalleError);
                
                this.guardarBitacoraRespuesta(this.respuesta);                
                
                return this.respuesta;
            }

            observaciones = new StringBuilder("");
            observaciones.append("Orden aceptada.");
            observaciones.append(" Cargos aceptados:" + this.listCargosAceptados.size() + ".");
            if (this.listCargosRechazados.size() > 0) {
                observaciones.append(" Cargos rechazados:" + this.listCargosRechazados.size() + ", ver detalleError para mas informacion.");
            }

            this.respuesta = new RespuestaTO(transaccion.getIdOrden(), transaccion.getIdSAP(),
                    "200", observaciones.toString(),
                    Calendar.getInstance(), listDetalleError);
            
            this.guardarBitacoraRespuesta(this.respuesta);
            
            return this.respuesta;

        } catch (Exception e) {
            logger.error("Error - " + e.getMessage());
            
            //Agregar notificaciones de mail en caso de error
            
            this.respuesta = new RespuestaTO(transaccion.getIdOrden(), transaccion.getIdSAP(),
                                            "500", "Error en el aplicativo - Servicio de CargoRecurrente - Favor de reportar.",
                                            Calendar.getInstance(), listDetalleError);
            return this.respuesta;
        } finally {
            logger.info("Procesar orden - Fin");
        }

    }
        
    /**
     * Analiza cada uno de los cargos recibidos y los separa en dos grupos; 
     * los cargos aceptados y los rechazados.
     * @param transaccion 
     */
    private void revisarDetalleCargos(TransaccionTO transaccion) {
        this.listCargosAceptados = new ArrayList<CargoTO>();
        this.listCargosRechazados = new ArrayList<CargoTO>();        
        
        long count =0;        
        for (CargoTO cargo : transaccion.getCargos()) {
            
            //Agregando una clave unica a cada cargo recibido
            cargo.setUniqueIdDetail(++count);
            
            //Revisando campos minimos requeridos
            if (!isValidString(cargo.getCuenta())
                    || !isValidString(cargo.getNombreCliente())
                    || !isValidString(cargo.getReferencia())
                    || cargo.getImporte().doubleValue() <= 0.0
                    || cargo.getMarcaTarjeta() <= 0
                    || cargo.getTipoCuenta() <= 0
                    //|| cargo.getEntidadFinanciera() <= 0
                    ) {
                
                cargo.setIdPersistence(hmRelCargosIdDetalle.get(cargo.getUniqueIdDetail()));
                
                this.listCargosRechazados.add(cargo);
            }else{                
                //Revisando formato campos
                if(!isValidCustomerName(cargo.getNombreCliente())){
                    this.listCargosRechazados.add(cargo);
                }else{
                    this.listCargosAceptados.add(cargo);
                }                
            }            
        }

    }
    
    /**
     * Se detalla la razon de cada rechazo realizado.
     * @param lCargoRechazados 
     */
    private void revisarErrorDetalleCargos(List<CargoTO> lCargoRechazados) {
        StringBuilder sb = null;
        DetalleErrorTO detalle = null;
        listDetalleError = new ArrayList<DetalleErrorTO>();
        for (CargoTO cargo : lCargoRechazados) {
            sb = new StringBuilder();
            detalle = new DetalleErrorTO();
            if (!isValidString(cargo.getCuenta())) {
                sb.append("Se requiere el campo cuenta - ");
            }
            
            if (!isValidString(cargo.getNombreCliente())) {
                sb.append("Se requiere el campo nombreCliente - ");
            }else if(!isValidCustomerName(cargo.getNombreCliente())){
                sb.append("Formato de dato incorrecto para el campo nombreCliente, solo se aceptan caracteres alfanumericos y espacios. ");
            }
            
            if (!isValidString(cargo.getReferencia())) {
                sb.append("Se requiere el campo referencia - ");
            }
            
            if (cargo.getImporte().doubleValue()<= 0.0 ) {
                sb.append("Se requiere un importe mayor a 0.0 - ");
            }
            
            //2 ; 3 ; 4
            if (cargo.getMarcaTarjeta() <= 0) {
                sb.append("Numero de tarjeta invalido - ");
            }
            
            //2 ; 3 ; 4
            if (cargo.getTipoCuenta() <=0){
                sb.append("Numero de cuenta invalido - ");
            }
            
            //0 ; 1
            //if (cargo.getEntidadFinanciera() <=0){
            //    sb.append("Entidad financiera invalida - ");
            //}
            
            detalle.setObservaciones(sb.toString());
            detalle.setCargo(cargo);
            detalle.setIdCobranzaDetalle(cargo.getIdDetalle());
            detalle.setIdEstatus("*01");
            
            listDetalleError.add(detalle);
        }

    }    
    
    /**
     * Valida que los datos de autenticacion sean correctos.
     * @param transaccion
     * @return 
     */
    private boolean isAutenticacionValida(TransaccionTO transaccion) throws Exception {
        try {
            logger.info("   isAutenticacionValida(E)");
            AutenticacionTO autenticacion = transaccion.getAutenticacion();
            
            if (autenticacion.getClaveServicio().equals("RC")) {
                return true;
            }
            this.respuesta = new RespuestaTO(transaccion.getIdOrden(), transaccion.getIdSAP(),
                    "503", "Error - Credenciales invalidas",
                    Calendar.getInstance(), null);
            
        } catch (Exception e) {
            logger.error(" Error al validar credenciales - "+ e.getMessage());
            throw e;
        } finally {
            logger.info("   isAutenticacionValida(S)");
        }
        return false;
    }
    
    /**
     * Valida que si se recibio una transaccion.
     * @param transaccion
     * @return True - Si la transaccion no es nula.
     */
    private boolean isTransaccionValida(TransaccionTO transaccion){
        if(transaccion == null){
            this.respuesta = new RespuestaTO(0, "-","501", "Error - Transaccion nula", Calendar.getInstance(), null);
            return false;
        }
        
        return true;
    }
    
    /**
     * Valida que la transaccion contenga la informacion minima requerida.
     * @param transaccion
     * @return True - Si cumple con los campos minimos.
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
                    "502", "Error - Transaccion incompleta ->"+detalleError.toString(),
                    Calendar.getInstance(), null);
            return false;
        }
        
        return true;
    } 
    
    private void guardarBitacoraSolicitud(TransaccionTO transaccion) throws Exception{
        bitacoraService = new BitacoraServiceImpl();
        hmRelCargosIdDetalle = bitacoraService.guardarSolicitud(transaccion);
    }
    
    private long guardarBitacoraRespuesta(RespuestaTO respuesta) throws Exception{
        bitacoraService = new BitacoraServiceImpl();
        bitacoraService.guardarRespuesta(respuesta);        
        return 0;       
    }
    
}