package com.maxcom.mpm.bi.service.impl;

import com.maxcom.mpm.bi.service.BitacoraService;
import com.maxcom.mpm.dao.BitacoraDao;
import com.maxcom.mpm.dao.impl.BitacoraDaoImpl;
import com.maxcom.mpm.dto.CargoTO;
import com.maxcom.mpm.dto.DetalleErrorTO;
import com.maxcom.mpm.dto.RespuestaTO;
import com.maxcom.mpm.dto.TransaccionTO;
import com.maxcom.mpm.model.MpmCestados;
import com.maxcom.mpm.model.MpmCmarcasTarjetas;
import com.maxcom.mpm.model.MpmCrespuestasCargos;
import com.maxcom.mpm.model.MpmCtiposCuentas;
import com.maxcom.mpm.model.MpmTcobranzaSap;
import com.maxcom.mpm.model.MpmTcobranzaSapDeta;
import com.maxcom.mpm.util.Constantes;
import static com.maxcom.mpm.util.Utilerias.getCurrentPeriodo;
import static com.maxcom.mpm.util.Utilerias.isValidString;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.apache.log4j.Logger;

/**
 *
 * @author operador
 */
public class BitacoraServiceImpl implements BitacoraService {

    BitacoraDao bitacora;
    static final Logger logger = Logger.getLogger(BitacoraServiceImpl.class);
    
    public BitacoraServiceImpl(){
        //Agregar DI
        bitacora = new BitacoraDaoImpl();
    }

    @Override
    public HashMap<Long, Long> guardarSolicitud(TransaccionTO transaccion) throws Exception {
        logger.info("   BitacoraServiceImpl:guardarSolicitud(E)");
        HashMap<Long, Long> hmRelDetalle = new HashMap<Long, Long>();            
        MpmTcobranzaSap orden = new MpmTcobranzaSap();        
        try {            
            
            if (!isValidString(transaccion.getIdOrigen())) {
                orden.setIdsap("-");
            } else {
                orden.setIdsap(transaccion.getIdOrigen());
            }
            
            orden.setComponente(Constantes.COMPONENTE_ORDEN);
            orden.setCreadoPor(Constantes.CREADO_POR_ORDEN);
            orden.setProducto(Constantes.PRODUCTO_ORDEN);
            orden.setSistema(Constantes.SYSTEMA_ORDEN);
            
            orden.setFechaCreacion(new Date());
            orden.setPeriodo(getCurrentPeriodo());
            
            //Estatus inicial de la orden
            MpmCestados mpmCestadosOrden = new MpmCestados();
            mpmCestadosOrden.setIdEstado("NEW");            

            orden.setMpmCestados(mpmCestadosOrden);

            CargoTO cargoAux = transaccion.getCargo();
            
            //Si trae cargo se guardan en bitacora
            if (cargoAux!=null) {
                
                Set<MpmTcobranzaSapDeta> listMpmTcobranzaSapDeta = new HashSet();
                MpmCestados mpmCestadosDetalle = new MpmCestados();
                MpmTcobranzaSapDeta detalle = null;
                
                //Definiendo el estado del detalle
                mpmCestadosDetalle.setIdEstado("NEW");
                
                    detalle = new MpmTcobranzaSapDeta();
                    
                    detalle.setIdUniqueDetalle(cargoAux.getUniqueIdDetail());
                    detalle.setReferencia(cargoAux.getReferencia());
                    detalle.setNombreCliente(cargoAux.getNombreCliente());
                    detalle.setCuenta(cargoAux.getCuenta());
                    detalle.setImporte(new BigDecimal(cargoAux.getImporte()));
                    detalle.setEmail(cargoAux.getEmail());
                    detalle.setEntidadFinanciera(cargoAux.isEntidadFinanciera());
                    detalle.setCreadoPor(Constantes.CREADO_POR_DETALLE);
                    detalle.setFechaCreacion(new Date());
                    detalle.setSistema(Constantes.SISTEMA_DETALLE);
                    
                    //Estatus inicial del detalle
                    detalle.setMpmCestados(mpmCestadosDetalle);
                    
                    //Tipo de cuenta
                    MpmCtiposCuentas mpmCtiposCuentas = new MpmCtiposCuentas();
                    mpmCtiposCuentas.setIdTipoCuenta(cargoAux.getTipoCuenta());
                    detalle.setMpmCtiposCuentas(mpmCtiposCuentas);
                    
                    //Marca tarjeta
                    MpmCmarcasTarjetas mpmCmarcasTarjetas = new MpmCmarcasTarjetas();
                    mpmCmarcasTarjetas.setIdMarcaTarjeta(cargoAux.getMarcaTarjeta());
                    detalle.setMpmCmarcasTarjetas(mpmCmarcasTarjetas);
                    
                    //Detalle
                    detalle.setMpmTcobranzaSap(orden);

                    listMpmTcobranzaSapDeta.add(detalle);
                
                orden.setMpmTcobranzaSapDetas(listMpmTcobranzaSapDeta);
            }

            bitacora.guardarSolicitud(orden);
            
            transaccion.setIdOrden(orden.getIdCobranza());
            
            for(MpmTcobranzaSapDeta detalle: orden.getMpmTcobranzaSapDetas()){
                hmRelDetalle.put(detalle.getIdUniqueDetalle(), detalle.getIdCobranzadeta());
            }

        } catch (Exception e) {
            logger.error("   Error en BitacoraServiceImpl:guardarSolicitud - " + e.getMessage());
            throw e;
        } finally {
            logger.info("   BitacoraServiceImpl:guardarSolicitud(S)");
        }
        return hmRelDetalle;

    }

    @Override
    public long guardarRespuesta(RespuestaTO respuesta) throws Exception {
        logger.info("   BitacoraServiceImpl:guardarRespuesta(E)");
        MpmTcobranzaSap orden = null;
        long id = 0;
        
        try {
            orden = bitacora.getTransaccionById(respuesta.getIdCobranza());
            
            //Estatus inicial de la orden
            MpmCestados mpmCestadosOrden = new MpmCestados();
            mpmCestadosOrden.setIdEstado(respuesta.getIdEstatus());
            orden.setMpmCestados(mpmCestadosOrden);
            
            orden.setObservaciones(respuesta.getObservaciones());
            orden.setFechaModificacion(new Date());
            orden.setModificadoPor(Constantes.MODIFICADO_POR_ORDEN);
                        
            //Mapa de los cargos con error
            HashMap<Long,DetalleErrorTO> hmDetalleErrorTO = new HashMap<Long,DetalleErrorTO>();
            
            if (respuesta.getDetalleError() != null) {
                //for (DetalleErrorTO error : respuesta.getDetalleError()) {
                //    hmDetalleErrorTO.put(error.getIdCobranzaDetalle(), error);
                //}
            }
            
            MpmCrespuestasCargos mpmCrespuestasCargos = null;
            MpmCestados mpmCestadosDetalle = null;
            
            long idCobranzaDetalle = 0;
            //Actualizando detalle
            for(MpmTcobranzaSapDeta detalle : orden.getMpmTcobranzaSapDetas()){
                //detalle.getIdCobranzadeta()
                detalle.setModificadoPor(Constantes.MODIFICADO_POR_DETALLE);
                detalle.setFechaModificacion(new Date());
                
                idCobranzaDetalle = detalle.getIdCobranzadeta();
                
                //Estatus de la respuesta de los cargos con error
                if(hmDetalleErrorTO.containsKey(idCobranzaDetalle)){                    
                    //
                    mpmCrespuestasCargos = new MpmCrespuestasCargos();
                    mpmCrespuestasCargos.setIdRespuestaCargo(hmDetalleErrorTO.get(idCobranzaDetalle).getIdEstatus());
                    detalle.setMpmCrespuestasCargos(mpmCrespuestasCargos);
                    
                    //Colocando estatus de rechazado
                    mpmCestadosDetalle = new MpmCestados();
                    mpmCestadosDetalle.setIdEstado("REJ");
                    detalle.setMpmCestados(mpmCestadosDetalle);
                    
                }                
            }

            id = bitacora.actualizarTransaccion(orden);
            
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("   Error en BitacoraServiceImpl:guardarRespuesta - " + e.toString());
            throw e;
        } finally {
            logger.info("   BitacoraServiceImpl:guardarRespuesta(S)");
        }

        return id;
    }
    
    @Override
    public long buscarTransaccion(TransaccionTO transaccion, RespuestaTO respuesta) throws Exception {
        MpmTcobranzaSap orden = bitacora.getTransaccionByIdSAP(transaccion.getIdOrigen());
        
        if(null!=orden){
            respuesta.setObservaciones(orden.getObservaciones());
            respuesta.setIdCobranza(orden.getIdCobranza());
            respuesta.setFecha(orden.getFechaCreacion());
            respuesta.setIdOrigen(orden.getIdsap());
            respuesta.setIdEstatus("DUPLICATED-"+orden.getMpmCestados().getIdEstado());
            //Pendiente el detalle de los errores
            
            if(orden.getMpmTcobranzaSapDetas()!=null){
                //List<DetalleErrorTO> listdetalleError = new ArrayList<DetalleErrorTO>();
                DetalleErrorTO detalleError= null;
                CargoTO cargo = null;
                for(MpmTcobranzaSapDeta detalle: orden.getMpmTcobranzaSapDetas()){
                    
                    if(detalle.getMpmCestados().getIdEstado().equalsIgnoreCase("NEW")){
                        continue;
                    }
                    
                    detalleError= new DetalleErrorTO();
                    cargo = new CargoTO();
                    
                    detalleError.setIdCobranzaDetalle(detalle.getIdCobranzadeta());
                    detalleError.setIdEstatus(detalle.getMpmCrespuestasCargos().getIdRespuestaCargo());
                    detalleError.setObservaciones(detalle.getMpmCrespuestasCargos().getDescripcion());
                    
                    cargo.setCuenta(detalle.getCuenta());
                    cargo.setEmail(detalle.getEmail());
                    cargo.setEntidadFinanciera(detalle.isEntidadFinanciera());
                    cargo.setImporte(detalle.getImporte().doubleValue());
                    cargo.setMarcaTarjeta((int)detalle.getMpmCmarcasTarjetas().getIdMarcaTarjeta());
                    cargo.setNombreCliente(detalle.getNombreCliente());
                    cargo.setReferencia(detalle.getReferencia());
                    cargo.setTipoCuenta((int)detalle.getMpmCtiposCuentas().getIdTipoCuenta());
                    
                    detalleError.setCargo(cargo);
                    
                    //listdetalleError.add(detalleError);
                }
                respuesta.setDetalleError(detalleError);
            }
            
            return orden.getIdCobranza();
        }
        
        return 0;
        
    }

}
