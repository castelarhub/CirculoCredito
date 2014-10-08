package com.maxcom.mpm.paypal.bi.service.impl;

import com.maxcom.mpm.paypal.bi.service.BitacoraService;
import com.maxcom.mpm.paypal.dao.BitacoraDao;
import com.maxcom.mpm.paypal.dao.impl.BitacoraDaoImpl;
import com.maxcom.mpm.paypal.dto.CargoTO;
import com.maxcom.mpm.paypal.dto.ConsultaCargoTO;
import com.maxcom.mpm.paypal.dto.ConsultaRespuestaTO;
import com.maxcom.mpm.paypal.dto.ConsultaTransaccionTO;
import com.maxcom.mpm.paypal.dto.DetalleErrorTO;
import com.maxcom.mpm.paypal.dto.RespuestaSolicitudTO;
import com.maxcom.mpm.paypal.dto.TransaccionSolicitudTO;
import com.maxcom.mpm.paypal.model.MpmTbitacoraConsultaOnline;
import com.maxcom.mpm.paypal.model.MpmTbitacoraDetaSolPaypal;
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
        
        if(respuesta==null){
            respuesta = new RespuestaSolicitudTO();
        }
        
        if(null!=soliExistente){
            
            respuesta.setEstatus(soliExistente.getEstatus());
            respuesta.setEstatusPaypal(soliExistente.getEstatusPaypal());
            respuesta.setFecha(soliExistente.getFechaCreacion());
            respuesta.setFechaHoraOperacionPaypal(soliExistente.getFechaOperacionPaypal());
            respuesta.setIdTransaccion(soliExistente.getIdTransaccion());
            respuesta.setObservaciones(soliExistente.getObservaciones());
            respuesta.setRespuesta(soliExistente.getRespuesta());
            
            respuesta.setEstatus("EXISTENTE-"+soliExistente.getRespuesta());
            
            if(!soliExistente.getRespuesta().equalsIgnoreCase("RTRAN")){
                List<DetalleErrorTO> listDetalleError = new ArrayList<>();
                DetalleErrorTO detalleError = null;
                CargoTO cargoAux = null;
                
                for(MpmTbitacoraDetaSolPaypal solAux : soliExistente.getMpmTbitacoraDetaSolPaypals()){
                    cargoAux = new CargoTO();
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
                                        
            return soliExistente.getIdBitacoraSolPaypal();
        }
        
        return 0;
        
    }    

    @Override
    public void guardarSolicitud(ConsultaTransaccionTO transaccion) throws Exception {
        logger.info("   BitacoraServiceImpl:guardarSolicitud(E)");
        
        try {
            MpmTbitacoraConsultaOnline consulta = new MpmTbitacoraConsultaOnline();
            consulta.setFechaCreacion(new Date());
            consulta.setCreadoPor(Constantes.CREADO_POR_ORDEN);
            
            consulta.setIdEstado("NEW");
            ConsultaCargoTO cargo = transaccion.getCargo();
            //Si trae cargo se guardan en bitacora
            if (cargo!=null) {
                consulta.setReferencia(cargo.getReferencia());
                consulta.setFechaCargo(cargo.getFechaCargo());
            }
            
            bitacora.guardarSolicitud(consulta);
            
            transaccion.setIdOrden(consulta.getIdBitacoraConsulta());
            
        } catch (Exception e) {
            logger.error("   Error en BitacoraServiceImpl:guardarSolicitud - " + e.getMessage());
            throw e;
        } finally {
            logger.info("   BitacoraServiceImpl:guardarSolicitud(S)");
        }
    }

    @Override
    public long guardarRespuesta(ConsultaRespuestaTO respuesta) throws Exception {
        logger.info("   BitacoraServiceImpl:guardarRespuesta(E)");
        MpmTbitacoraConsultaOnline consulta = null;
        long id = 0;
        
        try {
            consulta = bitacora.getConsultaById(respuesta.getIdConsultaOnline());
            
            //si viene cero, entonces la consulta no existe
            if(respuesta.getIdConsultaOnline()==0){
                consulta = new MpmTbitacoraConsultaOnline();
                consulta.setFechaCreacion(new Date());
                consulta.setCreadoPor(Constantes.CREADO_POR_ORDEN);
            }
                        
            consulta.setIdEstado(respuesta.getIdEstatus());
            
            consulta.setBanCdRespuesta(respuesta.getBanCdRespuesta());
            consulta.setBanMonto(respuesta.getMonto());
            consulta.setBanNbRespuesta(respuesta.getBanNbRespuesta());
            consulta.setBanNumeroAutorizacion(respuesta.getAutorizacion());
            consulta.setBanNumeroOperacion(respuesta.getBanNumeroOperacion());
            consulta.setBanResultado(respuesta.getRespuesta());
            consulta.setModificadoPor(Constantes.MODIFICADO_POR_ORDEN);
            consulta.setFechaModificacion(new Date());
            consulta.setObservaciones(respuesta.getObservaciones());
            consulta.setRespuestaXml(respuesta.getRespuestaXml());
            
            if(respuesta.getDetalleError()!=null){
                consulta.setIdRespuestaCargo(respuesta.getDetalleError().getIdEstatus());
            }
            
            //Si no existe se crea, de lo contrario se actualiza
            if(respuesta.getIdConsultaOnline()==0){
                id = bitacora.guardarSolicitud(consulta);
            }else{
                id = bitacora.actualizarTransaccionConsulta(consulta);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("   Error en BitacoraServiceImpl:guardarRespuesta - " + e.toString());
            throw e;
        } finally {
            logger.info("   BitacoraServiceImpl:guardarRespuesta(S)");
        }

        return id;
    }

}
