package com.maxcom.mpm.bi.service.impl;

import com.maxcom.mpm.bi.service.BitacoraService;
import com.maxcom.mpm.dao.BitacoraDao;
import com.maxcom.mpm.dao.impl.BitacoraDaoImpl;
import com.maxcom.mpm.dto.CargoTO;
import com.maxcom.mpm.dto.RespuestaTO;
import com.maxcom.mpm.dto.TransaccionTO;
import com.maxcom.mpm.model.MpmCestados;
import com.maxcom.mpm.model.MpmCrespuestasCargos;
import com.maxcom.mpm.model.MpmTbitacoraCargoOnline;
import com.maxcom.mpm.util.Constantes;
import static com.maxcom.mpm.util.Utilerias.isValidString;
import java.math.BigDecimal;
import java.util.Date;
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
    public void guardarSolicitud(TransaccionTO transaccion) throws Exception {
        logger.info("   BitacoraServiceImpl:guardarSolicitud(E)");
        MpmTbitacoraCargoOnline cargo = new MpmTbitacoraCargoOnline();
        try {
            
            if (!isValidString(transaccion.getIdTransaccion())) {
                cargo.setIdTransaccion("-");
            } else {
                cargo.setIdTransaccion(transaccion.getIdTransaccion());
            }
            
            cargo.setFechaCreacion(new Date());
            cargo.setCreadoPor(Constantes.CREADO_POR_ORDEN);
            
            //Estatus inicial de la orden
            MpmCestados mpmCestadosOrden = new MpmCestados();
            mpmCestadosOrden.setIdEstado("NEW");
            cargo.setMpmCestados(mpmCestadosOrden);
            
            CargoTO cargoAux = transaccion.getCargo();
            
            //Si trae cargo se guardan en bitacora
            if (cargoAux!=null) {
                cargo.setAnioExpiracion(cargoAux.getAnioExpiracionTarjeta());
                cargo.setCodigoSeguridad(cargoAux.getCodigoSeguridadTarjeta());
                cargo.setMesExpiracion(cargoAux.getMesExpiracionTarjeta());
                cargo.setMonto(new BigDecimal(cargoAux.getMonto()));
                cargo.setNombreCliente(cargoAux.getNombreCliente());
                cargo.setNumeroTarjeta(cargoAux.getNumeroTarjeta());
                cargo.setReferencia(cargoAux.getReferencia());
            }
            
            bitacora.guardarSolicitud(cargo);
            
            transaccion.setIdOrden(cargo.getIdBitacora());
            
        } catch (Exception e) {
            logger.error("   Error en BitacoraServiceImpl:guardarSolicitud - " + e.getMessage());
            throw e;
        } finally {
            logger.info("   BitacoraServiceImpl:guardarSolicitud(S)");
        }
    }
    
    @Override
    public long guardarRespuesta(RespuestaTO respuesta) throws Exception {
        logger.info("   BitacoraServiceImpl:guardarRespuesta(E)");
        MpmTbitacoraCargoOnline cargo = null;
        long id = 0;
        
        try {
            cargo = bitacora.getTransaccionById(respuesta.getIdCargoOnline());
            
            //si viene cero, entonces el cargo no existe.
            if(respuesta.getIdCargoOnline()==0){
                cargo = new MpmTbitacoraCargoOnline();
                cargo.setIdTransaccion("SIN idTransaccion-"+new Date().getTime());
                cargo.setFechaCreacion(new Date());
                cargo.setCreadoPor(Constantes.CREADO_POR_ORDEN);
            }
            
            //Estatus inicial de la orden
            MpmCestados mpmCestadosOrden = new MpmCestados();
            mpmCestadosOrden.setIdEstado(respuesta.getIdEstatus());
            cargo.setMpmCestados(mpmCestadosOrden);
            
            cargo.setBanCdError(null);
            cargo.setBanCdRespuesta(null);
            cargo.setBanError(null);
            cargo.setBanFolioCpagos(respuesta.getFolioCPagos());
            cargo.setBanNumeroAutorizacion(respuesta.getAutorizacion());
            cargo.setBanResultado(respuesta.getRespuesta());
            cargo.setFechaModificacion(new Date());
            cargo.setModificadoPor(Constantes.MODIFICADO_POR_ORDEN);            
            
            cargo.setRespuestaXml(respuesta.getRespuestaXml());
            cargo.setSolicitudXml(respuesta.getSolicitudXml());
            cargo.setObservaciones(respuesta.getObservaciones());
            
            if(respuesta.getDetalleError()!=null){
                MpmCrespuestasCargos respuestaCargoEstatus = new MpmCrespuestasCargos();
                respuestaCargoEstatus.setIdRespuestaCargo(null);
            }
            
            //Si no existe se crea, de lo contrario se actualiza
            if(respuesta.getIdCargoOnline()==0){
                id = bitacora.guardarSolicitud(cargo);
            }else{
                id = bitacora.actualizarTransaccion(cargo);
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
