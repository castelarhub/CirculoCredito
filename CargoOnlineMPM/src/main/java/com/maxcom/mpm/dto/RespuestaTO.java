package com.maxcom.mpm.dto;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Nelson Castelar
 * @author 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Respuesta")
public class RespuestaTO {
    
    private long idCobranzaOnline;
    private String idTransaccion;
    private String idEstatus;
    private String observaciones;
    private Date fecha;
    private DetalleErrorTO detalleError;
    
    public RespuestaTO(){}

    public RespuestaTO(long idCobranza, String idSap, String idEstatus, 
                       String observaciones, Date fecha, 
                       DetalleErrorTO detalleError) {
        this.idCobranzaOnline = idCobranza;
        this.idTransaccion = idSap;
        this.idEstatus = idEstatus;
        this.observaciones = observaciones;
        this.fecha = fecha;
        this.detalleError = detalleError;
    }

    /**
     * @return the idCobranzaOnline
     */
    public long getIdCobranzaOnline() {
        return idCobranzaOnline;
    }

    /**
     * @param idCobranzaOnline the idCobranzaOnline to set
     */
    public void setIdCobranzaOnline(long idCobranzaOnline) {
        this.idCobranzaOnline = idCobranzaOnline;
    }

    /**
     * @return the idEstatus
     */
    public String getIdEstatus() {
        return idEstatus;
    }

    /**
     * @param idEstatus the idEstatus to set
     */
    public void setIdEstatus(String idEstatus) {
        this.idEstatus = idEstatus;
    }

    /**
     * @return the observaciones
     */
    public String getObservaciones() {
        return observaciones;
    }

    /**
     * @param observaciones the observaciones to set
     */
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the detalleError
     */
    public DetalleErrorTO getDetalleError() {
        return detalleError;
    }

    /**
     * @param detalleError the detalleError to set
     */
    public void setDetalleError(DetalleErrorTO detalleError) {
        this.detalleError = detalleError;
    }

    /**
     * @return the idTransaccion
     */
    public String getIdTransaccion() {
        return idTransaccion;
    }

    /**
     * @param idTransaccion the idTransaccion to set
     */
    public void setIdTransaccion(String idTransaccion) {
        this.idTransaccion = idTransaccion;
    }


}
