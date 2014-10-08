package com.maxcom.mpm.paypal.bi.service.impl;

import com.maxcom.mpm.paypal.bi.service.BitacoraService; 
import com.maxcom.mpm.paypal.dao.BitacoraDao;
import com.maxcom.mpm.paypal.dao.impl.BitacoraDaoImpl;
import com.maxcom.mpm.paypal.dto.CargoTO;
import com.maxcom.mpm.paypal.dto.DetalleErrorTO;
import com.maxcom.mpm.paypal.dto.PayerInfoTO;
import com.maxcom.mpm.paypal.dto.RespuestaDetallePagoTO;
import com.maxcom.mpm.paypal.dto.RespuestaSolicitudTO;
import com.maxcom.mpm.paypal.dto.TransaccionDetallePagoTO;
import com.maxcom.mpm.paypal.dto.TransaccionSolicitudTO;
import com.maxcom.mpm.paypal.model.MpmTbitacoraDetaSolPaypal;
import com.maxcom.mpm.paypal.model.MpmTbitacoraRecPayerPaypal;
import com.maxcom.mpm.paypal.model.MpmTbitacoraRecPaypal;
import com.maxcom.mpm.paypal.model.MpmTbitacoraSolPaypal;
import com.maxcom.mpm.paypal.util.Constantes;
import static com.maxcom.mpm.paypal.util.Utilerias.isValidString;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author operador
 */
public class BitacoraServiceImpl implements BitacoraService {

    BitacoraDao bitacora;
    static final Logger logger = LogManager.getLogger(BitacoraServiceImpl.class);
    
    public BitacoraServiceImpl(){
        //Agregar DI
        bitacora = new BitacoraDaoImpl();
    }

    @Override
    public void guardarSolicitud(TransaccionSolicitudTO transaccion) throws Exception {
        logger.info("   BitacoraServiceImpl:guardarSolicitud(E)");
        MpmTbitacoraSolPaypal solicitud = new MpmTbitacoraSolPaypal();
        try {
            
            if (!isValidString(transaccion.getIdTransaccion())) {
                solicitud.setIdTransaccion("-");
            } else {
                solicitud.setIdTransaccion(transaccion.getIdTransaccion());
            }
            
            solicitud.setFechaCreacion(new Date());
            solicitud.setCreadoPor(Constantes.CREADO_POR_ORDEN);
            
            solicitud.setReferencia(transaccion.getReferencia());
            solicitud.setUrlReturn(transaccion.getReturnUrl());
            solicitud.setUrlCancel(transaccion.getCancelUrl());
            
            //Estatus unicial
            solicitud.setEstatus("NEW");
            
            solicitud.setReferenciarPago(transaccion.isReferenciarPago());
            
            //Si trae cargos se guardan en bitacora
            List<CargoTO> cargos = transaccion.getCargos();            
            if (cargos!=null) {
                Set<MpmTbitacoraDetaSolPaypal> hsDetalle = new HashSet<>();
                MpmTbitacoraDetaSolPaypal detalle = null;
                for(CargoTO cargoAux: cargos){
                    detalle = new MpmTbitacoraDetaSolPaypal();
                    detalle.setCantidad(cargoAux.getCantidad());
                    detalle.setDescripcion(cargoAux.getDescripcion());
                    detalle.setPrecio(new BigDecimal(cargoAux.getPrecio()));
                    detalle.setCreadoPor(Constantes.CREADO_POR_ORDEN);
                    detalle.setFechaCreacion(new Date());
                    
                    detalle.setMpmTbitacoraSolPaypal(solicitud);
                    
                    hsDetalle.add(detalle);
                }
                solicitud.setMpmTbitacoraDetaSolPaypals(hsDetalle);
            }
            
            bitacora.guardarSolicitud(solicitud);
            
            transaccion.setIdOrden(solicitud.getIdBitacoraSolPaypal());
            
        } catch (Exception e) {
            logger.error("   Error en BitacoraServiceImpl:guardarSolicitud - " + e.getMessage());
            throw e;
        } finally {
            logger.info("   BitacoraServiceImpl:guardarSolicitud(S)");
        }
    }
    
    @Override
    public long guardarRespuesta(RespuestaSolicitudTO respuesta) throws Exception {
        logger.info("   BitacoraServiceImpl:guardarRespuesta(E)");       
        MpmTbitacoraSolPaypal solicitud = null;
        
        long id = 0;
        
        try {
            solicitud = bitacora.getTransaccionById(respuesta.getIdOperacionMPM());
            
            //si viene cero, entonces el cargo no existe.
            if(respuesta.getIdOperacionMPM()==0){
                solicitud = new MpmTbitacoraSolPaypal();
                if(respuesta.getIdTransaccion()==null){
                    solicitud.setIdTransaccion("SIN idTransaccion-"+new Date().getTime());
                }else{
                    solicitud.setIdTransaccion(respuesta.getIdTransaccion());
                }
                solicitud.setFechaCreacion(new Date());
                solicitud.setCreadoPor(Constantes.CREADO_POR_ORDEN);
                solicitud.setReferenciarPago(false);
            }
            
            solicitud.setEstatus(respuesta.getEstatus());
            solicitud.setEstatusPaypal(respuesta.getEstatusPaypal());
            solicitud.setTokenPaypal(respuesta.getToken());
            solicitud.setFechaModificacion(new Date());
            solicitud.setFechaOperacionPaypal(respuesta.getFechaHoraOperacionPaypal());
            solicitud.setIdOperacionPaypal(respuesta.getIdOperacionPaypal());
            solicitud.setModificadoPor(Constantes.MODIFICADO_POR_ORDEN);
            solicitud.setObservaciones(respuesta.getObservaciones());
            solicitud.setRespuesta(respuesta.getRespuesta());
            
            //Si no existe se crea, de lo contrario se actualiza
            if(respuesta.getIdOperacionMPM()==0){
                id = bitacora.guardarSolicitud(solicitud);
            }else{
                id = bitacora.actualizarTransaccion(solicitud);
            }
            
            
        } catch (Exception e) {
            logger.error("   Error en BitacoraServiceImpl:guardarRespuesta - " + e.toString());
            throw e;
        } finally {
            logger.info("   BitacoraServiceImpl:guardarRespuesta(S)");
        }

        return id;
    }
    
    @Override
    public long buscarTransaccion(TransaccionSolicitudTO transaccion, RespuestaSolicitudTO respuesta) throws Exception {
        MpmTbitacoraSolPaypal soliExistente = bitacora.getTransaccionByIdTransaccion(transaccion.getIdTransaccion());
        
        if(null!=soliExistente){
            
            respuesta.setIdOperacionMPM(soliExistente.getIdBitacoraSolPaypal());
            
            respuesta.setEstatus(soliExistente.getEstatus());
            respuesta.setEstatusPaypal(soliExistente.getEstatusPaypal());
            respuesta.setFecha(soliExistente.getFechaCreacion());
            respuesta.setFechaHoraOperacionPaypal(soliExistente.getFechaOperacionPaypal());
            respuesta.setIdTransaccion(soliExistente.getIdTransaccion());
            respuesta.setObservaciones(soliExistente.getObservaciones());
            //respuesta.setRespuesta(soliExistente.getRespuesta());
            
            respuesta.setRespuesta("EXISTENTE-"+soliExistente.getRespuesta());
            
            if(soliExistente.getRespuesta()!=null){
                if(!soliExistente.getRespuesta().equalsIgnoreCase("RTRAN")){
                    List<DetalleErrorTO> listDetalleError = new ArrayList<>();
                    DetalleErrorTO detalleError = null;
                    CargoTO cargoAux = null;

                    for(MpmTbitacoraDetaSolPaypal solAux : soliExistente.getMpmTbitacoraDetaSolPaypals()){
                        cargoAux = new CargoTO();
                        detalleError = new DetalleErrorTO();
                        cargoAux.setCantidad(solAux.getCantidad());
                        cargoAux.setDescripcion(solAux.getDescripcion());
                        cargoAux.setPrecio( solAux.getPrecio().doubleValue());

                        detalleError.setCargo(cargoAux);

                        listDetalleError.add(detalleError);
                    }

                    respuesta.setDetalleError(listDetalleError);

                }else{
                    respuesta.setIdOperacionMPM(soliExistente.getIdBitacoraSolPaypal());
                    respuesta.setIdOperacionPaypal(soliExistente.getIdOperacionPaypal());
                    respuesta.setToken(soliExistente.getTokenPaypal());
                }
            }
                                        
            return soliExistente.getIdBitacoraSolPaypal();
        }
        
        return 0;
        
    }
        
    @Override
    public void guardarSolicitud(TransaccionDetallePagoTO transaccion) throws Exception {
        logger.info("   BitacoraServiceImpl:guardarSolicitud(E)");
        MpmTbitacoraRecPaypal detalle = new MpmTbitacoraRecPaypal();
        try {
            
            if (!isValidString(transaccion.getIdTransaccion())) {
                detalle.setIdTransaccion("-");
            } else {
                detalle.setIdTransaccion(transaccion.getIdTransaccion());
            }
            
            detalle.setFechaCreacion(new Date());
            detalle.setCreadoPor(Constantes.CREADO_POR_ORDEN);
            
            detalle.setReferencia(transaccion.getReferencia());
            detalle.setToken(transaccion.getToken());
            
            //En este punto aun no se sabe
            detalle.setTienePagoReferenciado(false);
            
            //Estatus unicial antes de ser procesado
            detalle.setEstatus("NEW");
            
            bitacora.guardarSolicitud(detalle);
            
            transaccion.setIdOrden(detalle.getIdBitacoraRecPaypal());
            
        } catch (Exception e) {
            logger.error("   Error en BitacoraServiceImpl:guardarSolicitud - " + e.getMessage());
            throw e;
        } finally {
            logger.info("   BitacoraServiceImpl:guardarSolicitud(S)");
        }
    }

    @Override
    public long guardarRespuesta(RespuestaDetallePagoTO respuesta) throws Exception {
        logger.info("   BitacoraServiceImpl:guardarRespuesta(E)");
        MpmTbitacoraRecPaypal detalle = null;
        
        long id = 0;
        
        try {
            detalle = bitacora.getTransaccionRecById(respuesta.getIdOperacionMPM());
            
            //si viene cero, entonces el cargo no existe.
            if(respuesta.getIdOperacionMPM()==0){
                detalle = new MpmTbitacoraRecPaypal();
                if(respuesta.getIdTransaccion()==null){
                    detalle.setIdTransaccion("SIN idTransaccion-"+new Date().getTime());
                }else{
                    detalle.setIdTransaccion(respuesta.getIdTransaccion());
                }
                detalle.setFechaCreacion(new Date());
                detalle.setCreadoPor(Constantes.CREADO_POR_ORDEN);
                
            }
            
            detalle.setEstatus(respuesta.getEstatus());
            detalle.setEstatusPaypal(respuesta.getEstatusPaypal());
            detalle.setTokenPaypal(respuesta.getToken());
            detalle.setFechaModificacion(new Date());
            detalle.setFechaOperacionPaypal(respuesta.getFechaHoraOperacionPaypal());
            detalle.setIdOperacionPaypal(respuesta.getIdOperacionPaypal());
            detalle.setModificadoPor(Constantes.MODIFICADO_POR_ORDEN);
            detalle.setObservaciones(respuesta.getObservaciones());
            detalle.setRespuesta(respuesta.getRespuesta());
            detalle.setOrderTotal(BigDecimal.valueOf(respuesta.getOrderTotal()));
            detalle.setTienePagoReferenciado(respuesta.isTieneAcuerdoPagoReferenciado());
            
            PayerInfoTO payerInfo = respuesta.getInfoCliente();
            
            if(payerInfo!=null){
                Set<MpmTbitacoraRecPayerPaypal> hsDetalle = new HashSet<>();
                MpmTbitacoraRecPayerPaypal detalleRecAux = new MpmTbitacoraRecPayerPaypal();
                
                detalleRecAux.setCalle(payerInfo.getCalle());
                detalleRecAux.setCp(payerInfo.getCodigoPostal());
                detalleRecAux.setCreadoPor(Constantes.CREADO_POR_DETALLE);
                detalleRecAux.setCuenta(payerInfo.getCuenta());
                detalleRecAux.setEntidadFederativa(payerInfo.getEntidadFederativa());
                detalleRecAux.setEstatus(payerInfo.getEstatus());
                detalleRecAux.setFechaCreacion(new Date());
                detalleRecAux.setNombre(payerInfo.getNombre());
                detalleRecAux.setPais(payerInfo.getPais());
                detalleRecAux.setPayerId(payerInfo.getPayerID());
                detalleRecAux.setTelefono(payerInfo.getTelefono());
                
                detalleRecAux.setMpmTbitacoraRecPaypal(detalle);
                
                hsDetalle.add(detalleRecAux);
                
                detalle.setMpmTbitacoraRecPayerPaypals(hsDetalle);
            }
            
            
            //Si no existe se crea, de lo contrario se actualiza
            if(respuesta.getIdOperacionMPM()==0){
                id = bitacora.guardarSolicitud(detalle);
            }else{
                id = bitacora.actualizarTransaccion(detalle);
            }
            
            
        } catch (Exception e) {
            logger.error("   Error en BitacoraServiceImpl:guardarRespuesta - " + e.toString());
            throw e;
        } finally {
            logger.info("   BitacoraServiceImpl:guardarRespuesta(S)");
        }

        return id;
    }

    @Override
    public long buscarTransaccion(TransaccionDetallePagoTO transaccion, RespuestaDetallePagoTO respuesta) throws Exception {
        MpmTbitacoraRecPaypal detalleExistente = bitacora.getTransaccionRecByIdTransaccion(transaccion.getIdTransaccion());
        
        if(null!=detalleExistente){
            
            respuesta.setIdOperacionMPM(detalleExistente.getIdBitacoraRecPaypal());
            
            respuesta.setEstatus(detalleExistente.getEstatus());            
            respuesta.setFecha(detalleExistente.getFechaCreacion());
            respuesta.setIdTransaccion(detalleExistente.getIdTransaccion());
            respuesta.setObservaciones(detalleExistente.getObservaciones());
            //respuesta.setRespuesta(soliExistente.getRespuesta());
            
            respuesta.setRespuesta("EXISTENTE-"+detalleExistente.getRespuesta());
            
            if(detalleExistente.getRespuesta()!=null){
                if(detalleExistente.getRespuesta().equalsIgnoreCase("RTRAN")){
                    
                    Set<MpmTbitacoraRecPayerPaypal> hsDetalle = detalleExistente.getMpmTbitacoraRecPayerPaypals();
                    
                    if(hsDetalle!=null){
                        PayerInfoTO payerInfoAux = new PayerInfoTO();
                        
                        for(MpmTbitacoraRecPayerPaypal detalleAux: hsDetalle){
                            payerInfoAux.setCalle(detalleAux.getCalle());
                            //payerInfoAux.setCiudad("-");
                            payerInfoAux.setCodigoPostal(detalleAux.getCp());
                            payerInfoAux.setCuenta(detalleAux.getCuenta());
                            payerInfoAux.setEntidadFederativa(detalleAux.getEntidadFederativa());
                            payerInfoAux.setEstatus(detalleAux.getEstatus());
                            payerInfoAux.setNombre(detalleAux.getNombre());
                            payerInfoAux.setPais(detalleAux.getPais());
                            payerInfoAux.setPayerID(detalleAux.getPayerId());
                            payerInfoAux.setTelefono(detalleAux.getTelefono());
                        }
                        respuesta.setInfoCliente(payerInfoAux);
                    }
                    
                    respuesta.setIdOperacionMPM(detalleExistente.getIdBitacoraRecPaypal());
                    respuesta.setIdOperacionPaypal(detalleExistente.getIdOperacionPaypal());
                    respuesta.setToken(detalleExistente.getTokenPaypal());
                    respuesta.setOrderTotal(detalleExistente.getOrderTotal().doubleValue());
                    respuesta.setTieneAcuerdoPagoReferenciado(detalleExistente.getTienePagoReferenciado());
                    respuesta.setEstatusPaypal(detalleExistente.getEstatusPaypal());
                    respuesta.setFechaHoraOperacionPaypal(detalleExistente.getFechaOperacionPaypal());                    
                    
                }
            }
                                        
            return detalleExistente.getIdBitacoraRecPaypal();
        }
        
        return 0;
    }

}
