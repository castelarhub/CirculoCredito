package com.maxcom.mpm.bi.service.impl;

import com.maxcom.mpm.bi.service.BitacoraService;
import com.maxcom.mpm.dao.BitacoraDao;
import com.maxcom.mpm.dao.impl.BitacoraDaoImpl;
import com.maxcom.mpm.dto.CargoTO;
import com.maxcom.mpm.dto.RespuestaTO;
import com.maxcom.mpm.dto.TransaccionTO;
import com.maxcom.mpm.model.MpmCestados;
import com.maxcom.mpm.model.MpmCmarcasTarjetas;
import com.maxcom.mpm.model.MpmCtiposCuentas;
import com.maxcom.mpm.model.MpmTcobranzaSap;
import com.maxcom.mpm.model.MpmTcobranzaSapDeta;
import com.maxcom.mpm.util.Constantes;
import static com.maxcom.mpm.util.Utilerias.getCurrentPeriodo;
import static com.maxcom.mpm.util.Utilerias.isValidList;
import static com.maxcom.mpm.util.Utilerias.isValidString;
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

    BitacoraDao bitacora = new BitacoraDaoImpl();
    static final Logger logger = Logger.getLogger(BitacoraServiceImpl.class);

    @Override
    public HashMap<Long, Long> guardarSolicitud(TransaccionTO transaccion) throws Exception {
        logger.info("   BitacoraServiceImpl:guardarSolicitud(E)");
        HashMap<Long, Long> hmRelDetalle = new HashMap<Long, Long>();            
        MpmTcobranzaSap orden = new MpmTcobranzaSap();        
        try {            
            
            if (!isValidString(transaccion.getIdSAP())) {
                orden.setIdsap("-");
            } else {
                orden.setIdsap(transaccion.getIdSAP());
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

            List<CargoTO> listCargos = transaccion.getCargos();
            
            //Si trae cargos se guardan en bitacora
            if (isValidList(listCargos)) {
                
                Set<MpmTcobranzaSapDeta> listMpmTcobranzaSapDeta = new HashSet();
                MpmCestados mpmCestadosDetalle = new MpmCestados();
                MpmTcobranzaSapDeta detalle = null;
                
                //Definiendo el estado del detalle
                mpmCestadosDetalle.setIdEstado("NEW");
                
                for (CargoTO cargoAux : listCargos) {
                    detalle = new MpmTcobranzaSapDeta();
                    
                    detalle.setIdUniqueDetalle(cargoAux.getUniqueIdDetail());
                    detalle.setReferencia(cargoAux.getReferencia());
                    detalle.setNombreCliente(cargoAux.getNombreCliente());
                    detalle.setCuenta(cargoAux.getCuenta());
                    detalle.setImporte(cargoAux.getImporte());
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
                }
                
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
            mpmCestadosOrden.setIdEstado("RSAP");
            orden.setMpmCestados(mpmCestadosOrden);

            orden.setObservaciones(respuesta.getObservaciones());
            orden.setFechaModificacion(new Date());
            orden.setModificadoPor(Constantes.MODIFICADO_POR_ORDEN);
            
            //Actualizando detalle
            for(MpmTcobranzaSapDeta detalle : orden.getMpmTcobranzaSapDetas()){
                //detalle.getIdCobranzadeta()
                detalle.setModificadoPor(Constantes.MODIFICADO_POR_DETALLE);
                detalle.setFechaModificacion(new Date());
            }

            id = bitacora.actualizarTransaccion(orden);
        } catch (Exception e) {
            logger.error("   Error en BitacoraServiceImpl:guardarRespuesta - " + e.getMessage());
            e.printStackTrace();
            throw e;
        } finally {
            logger.info("   BitacoraServiceImpl:guardarRespuesta(S)");
        }

        return id;
    }

}
