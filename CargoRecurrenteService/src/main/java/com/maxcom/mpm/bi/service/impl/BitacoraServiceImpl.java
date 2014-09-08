package com.maxcom.mpm.bi.service.impl;

import com.maxcom.mpm.bi.service.BitacoraService;
import com.maxcom.mpm.dao.BitacoraDao;
import com.maxcom.mpm.dao.impl.BitacoraDaoImpl;
import com.maxcom.mpm.dto.CargoTO;
import com.maxcom.mpm.dto.TransaccionTO;
import com.maxcom.mpm.model.MpmCestados;
import com.maxcom.mpm.model.MpmTcobranzaSap;
import com.maxcom.mpm.model.MpmTcobranzaSapDeta;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author operador
 */
public class BitacoraServiceImpl implements BitacoraService {
    
    BitacoraDao bitacora = new BitacoraDaoImpl();
    
    private String obtenerEstadoOrden(){
        return "NEW";
    }

    @Override
    public void guardarSolicitud(TransaccionTO transaccion) {
        try{
            MpmTcobranzaSap orden = new MpmTcobranzaSap();
            List<CargoTO> lcargos = null;
            String idOrigen="";
            idOrigen = transaccion.getIdSAP();
            lcargos = transaccion.getCargos();
            
            orden.setIdsap(idOrigen);
            orden.setComponente("CompX");
            orden.setCreadoPor("NCM");
            orden.setFechaCreacion(new Date());
            
            orden.setObservaciones("test 01");
            orden.setPeriodo("09-2014");
            orden.setProducto("prodX");
            orden.setSistema("SisX");
            
            MpmCestados mpmCestadosOrden = new MpmCestados();
            mpmCestadosOrden.setIdEstado(obtenerEstadoOrden());
            
            orden.setMpmCestados(mpmCestadosOrden);

            MpmCestados mpmCestadosDetalle = new MpmCestados();
            mpmCestadosDetalle.setIdEstado("NEW");  

            Set<MpmTcobranzaSapDeta> mpmTcobranzaSapDetalles = new HashSet();
            MpmTcobranzaSapDeta detalle = new MpmTcobranzaSapDeta();
            detalle.setReferencia("Referencia0001");
            detalle.setNombreCliente("Nelson C.");
            detalle.setCuenta("1234567890123456");
            detalle.setImporte(new BigDecimal(1.01));
            detalle.setEmail("email");
            detalle.setEntidadFinanciera(true);        
            detalle.setCreadoPor("NCM");
            detalle.setFechaCreacion(new Date());
            detalle.setSistema("SIST");
            detalle.setMpmCestados(mpmCestadosDetalle);        
            detalle.setMpmTcobranzaSap(orden);

            mpmTcobranzaSapDetalles.add(detalle);

            detalle = new MpmTcobranzaSapDeta();
            detalle.setReferencia("Referencia0002");
            detalle.setNombreCliente("Nelson C.");
            detalle.setCuenta("2234567890123456");
            detalle.setImporte(new BigDecimal(1.02));
            detalle.setEmail("email2");
            detalle.setEntidadFinanciera(true);        
            detalle.setCreadoPor("NCM");
            detalle.setFechaCreacion(new Date());
            detalle.setSistema("SIST");
            detalle.setMpmCestados(mpmCestadosDetalle);
            detalle.setMpmTcobranzaSap(orden);

            mpmTcobranzaSapDetalles.add(detalle);

            orden.setMpmTcobranzaSapDetas(mpmTcobranzaSapDetalles);
            
            
            bitacora.guardarSolicitud(transaccion);
            
        }catch(Exception e){
            
        }finally{
            
        }
        
        
    }
    
}
