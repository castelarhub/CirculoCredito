package com.maxcom.mpm.dao.impl;

import com.maxcom.mpm.dao.BitacoraDao;
import com.maxcom.mpm.dto.TransaccionTO;
import com.maxcom.mpm.model.MpmCestados;
import com.maxcom.mpm.model.MpmTcobranzaSap;
import com.maxcom.mpm.model.MpmTcobranzaSapDeta;
import com.maxcom.mpm.util.HibernateUtil;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Nelson C.
 */
public class BitacoraDaoImpl implements BitacoraDao{

    Session session = null;
    static final Logger logger = Logger.getLogger(BitacoraDaoImpl.class);
    
    public BitacoraDaoImpl(){
        this.session = HibernateUtil.getSessionFactoryOracle().getCurrentSession();
    }
    
    @Override
    public void guardarSolicitud(TransaccionTO transaccion) {
        //List<MpmTcobranzaSap> lista = null;
        MpmTcobranzaSap orden = null;
        //org.hibernate.Transaction tx = session.beginTransaction();
        //Query q = session.createQuery ("from MpmTcobranzaSap");
        //lista = (List<MpmTcobranzaSap>) q.list();
        
        //orden = new MpmTcobranzaSap(1, MpmCestados mpmCestados, String producto, String componente, String periodo, String creadoPor, Date fechaCreacion, String sistema, String idsap) {
        //this.idCobranza = idCobranza;
        //this.mpmCestados = mpmCestados;
        //this.producto = producto;
        //this.componente = componente;
        //this.periodo = periodo;
        //this.creadoPor = creadoPor;
        //this.fechaCreacion = fechaCreacion;
        //this.sistema = sistema;
        //this.idsap = idsap;
        
        MpmCestados mpmCestados = new MpmCestados();
        mpmCestados.setIdEstado("NEW");
        Set<MpmTcobranzaSapDeta> mpmTcobranzaSapDetas = new HashSet();
        
        MpmTcobranzaSapDeta detalle = new MpmTcobranzaSapDeta();
        
        detalle.setAcuseSap("-");
        detalle.setCreadoPor("NCM");
        detalle.setCuenta("cuenta");
        detalle.setEmail("email");
        detalle.setEntidadFinanciera(true);
        detalle.setFechaCreacion(new Date());
        //detalle.setIdCobranzadeta(idCobranzadeta);
        detalle.setImporte(new BigDecimal(1.05));
        detalle.setMpmCestados(mpmCestados);
        //detalle.set
        
        
        mpmTcobranzaSapDetas.add(detalle);
        
        orden = new MpmTcobranzaSap();
        
        orden.setMpmTcobranzaSapDetas(mpmTcobranzaSapDetas);
        
        orden.setComponente("CompX");
        orden.setCreadoPor("NCM");
        orden.setFechaCreacion(new Date());
        //orden.setIdCobranza(2);
        orden.setIdsap("SAP06");
        orden.setObservaciones("test 02");
        orden.setPeriodo("09-2014");
        orden.setProducto("prodX");
        orden.setSistema("SisX");
        
        orden.setMpmCestados(mpmCestados);
        
        org.hibernate.Transaction tx = session.beginTransaction();
                
        //this.session.persist(orden);        
        
        this.session.save(orden);
        
        tx.commit();
        
        logger.info("Registro Agregado");
        
        
        
        //transaccion.getIdSAP();        
        
    }
    
    public static void main(String []args){
        new BitacoraDaoImpl().guardarSolicitud(null);
    }
    
}
