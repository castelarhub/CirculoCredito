package com.maxcom.mpm.dto;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author operador
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Respuesta")
public class RespuestaTO {
    
    private long idCobranza;
    private String idOrigen;
    private String idEstatus;
    private String observaciones;
    private Date fecha;
    private DetalleErrorTO detalleError;
    
    public RespuestaTO(){}

    public RespuestaTO(long idCobranza, String idSap, String idEstatus, 
                       String observaciones, Date fecha, 
                       DetalleErrorTO detalleError) {
        this.idCobranza = idCobranza;
        this.idOrigen = idSap;
        this.idEstatus = idEstatus;
        this.observaciones = observaciones;
        this.fecha = fecha;
        this.detalleError = detalleError;
    }

    /**
     * @return the idCobranza
     */
    public long getIdCobranza() {
        return idCobranza;
    }

    /**
     * @param idCobranza the idCobranza to set
     */
    public void setIdCobranza(long idCobranza) {
        this.idCobranza = idCobranza;
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
     * @return the idOrigen
     */
    public String getIdOrigen() {
        return idOrigen;
    }

    /**
     * @param idOrigen the idOrigen to set
     */
    public void setIdOrigen(String idOrigen) {
        this.idOrigen = idOrigen;
    }


}
