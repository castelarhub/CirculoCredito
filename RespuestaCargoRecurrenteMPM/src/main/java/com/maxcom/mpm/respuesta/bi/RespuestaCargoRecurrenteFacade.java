package com.maxcom.mpm.respuesta.bi;

import com.maxcom.mpm.respuesta.dao.MpmDemoRespuestaSap;
import com.maxcom.mpm.respuesta.dao.RespuestaDaoImpl;
import com.maxcom.mpm.respuesta.dto.CargoTO;
import com.maxcom.mpm.respuesta.dto.RespuestaTO;
import com.maxcom.mpm.respuesta.dto.TransaccionTO;
import com.maxcom.mpm.respuesta.util.Constantes;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import org.apache.log4j.Logger;

/**
 * La clase RespuestaCargoRecurrenteFacade implementa las operaciones para trabajar 
 con los cargos recurrentes en el MPM.
 * 
 * @author Nelson Castelar
 * @version 1.0
 */
public class RespuestaCargoRecurrenteFacade implements RespuestaCargoRecurrenteI {
    
    List<CargoTO> listCargosAceptados;
    List<CargoTO> listCargosRechazados;
    HashMap<Long,Long> hmRelCargosIdDetalle;
    RespuestaTO respuesta;
    long idOrden;
    static final Logger logger = Logger.getLogger(RespuestaCargoRecurrenteFacade.class);
    
    /**
     * Constructor default de la clase
     */
    public RespuestaCargoRecurrenteFacade(){
    }
    
    
    /**ºº122
     * Procesa la transaccion especificada
     * @param transaccion Transaccion a procesar
     * @return Regresa la respuesta que resulto del procesamiento. Un objeto de tipo RespuestaTO.
     * @since 1.0
     */
    @Override
    public RespuestaTO procesar(TransaccionTO transaccion) {
        try {
            logger.info("RespuestaCargoRecurrenteFacade:procesar(E)");
            
            RespuestaDaoImpl respuestaDao = new RespuestaDaoImpl();
            MpmDemoRespuestaSap model = null;
            
            if(transaccion!=null){
                if(transaccion.getListaCargosAceptados()!=null){
                    
                    for(CargoTO cargo: transaccion.getListaCargosAceptados()){
                        
                        model = new MpmDemoRespuestaSap();
                        
                        model.setCreadoPor(Constantes.CREADO_POR_ORDEN);
                        model.setFechaCreacion(new Date());
                        model.setCuenta(cargo.getCuenta());
                        model.setEmail(cargo.getEmail());
                        model.setEntidadFinanciera(true);
                        model.setIdCobranza(cargo.getIdCobranzaDetalle());
                        model.setIdMarcaTarjeta((long) cargo.getMarcaTarjeta());
                        model.setIdRespuestaCargo("APROBADO");
                        //model.setIdSap(cargo.get);
                        model.setIdTipoCuenta((long) cargo.getTipoCuenta());
                        model.setImporte( BigDecimal.valueOf(cargo.getImporte()));
                        model.setNombreCliente(cargo.getNombreCliente());
                        model.setObservaciones(cargo.getDescripcionRespuesta());
                        model.setReferencia(cargo.getReferencia());
                        
                        respuestaDao.guardarSolicitud(model);
                    }
                }
                
                if(transaccion.getListaCargosRechazados()!=null){
                    
                    for(CargoTO cargo: transaccion.getListaCargosRechazados()){
                        
                        model = new MpmDemoRespuestaSap();
                        
                        model.setCreadoPor(Constantes.CREADO_POR_ORDEN);
                        model.setFechaCreacion(new Date());
                        model.setCuenta(cargo.getCuenta());
                        model.setEmail(cargo.getEmail());
                        model.setEntidadFinanciera(true);
                        model.setIdCobranza(cargo.getIdCobranzaDetalle());
                        model.setIdMarcaTarjeta((long) cargo.getMarcaTarjeta());
                        model.setIdRespuestaCargo("RECHAZADO");
                        //model.setIdSap(cargo.get);
                        model.setIdTipoCuenta((long) cargo.getTipoCuenta());
                        model.setImporte( BigDecimal.valueOf(cargo.getImporte()));
                        model.setNombreCliente(cargo.getNombreCliente());
                        model.setObservaciones(cargo.getDescripcionRespuesta());
                        model.setReferencia(cargo.getReferencia());
                        
                        respuestaDao.guardarSolicitud(model);
                    }
                }                
            }
            
            this.respuesta = new RespuestaTO();
            this.respuesta.setAcuseSap(String.valueOf(new Date().getTime()));
            this.respuesta.setIdCobranza(transaccion.getIdCobranza());
            this.respuesta.setIdEstatus("SUCCESS");
            this.respuesta.setObservaciones("Respuesta procesada correctamente.");
            
            return this.respuesta;

        } catch (Exception e) {
            logger.error("Error en RespuestaCargoRecurrenteFacade:procesar - " + e.toString());
            
            e.printStackTrace();
            
            this.respuesta = new RespuestaTO();
            this.respuesta.setAcuseSap(String.valueOf(new Date().getTime()));
            if(transaccion!=null){
                this.respuesta.setIdCobranza(transaccion.getIdCobranza());
            }
            this.respuesta.setIdEstatus("ERROR");
            this.respuesta.setObservaciones("Error al procesar la respuesta.");
            
            return this.respuesta;
        } finally {
            logger.info("RespuestaCargoRecurrenteFacade:procesar(S)");
        }

    }
    
}