/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maxcom.mpm.dto;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
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
    private String idSap;
    private String idEstatus;
    private String observaciones;
    private Date fecha;
    private List<DetalleErrorTO> detalleError;
    
    public RespuestaTO(){}

    public RespuestaTO(long idCobranza, String idSap, String idEstatus, 
                       String observaciones, Date fecha, 
                       List<DetalleErrorTO> detalleError) {
        this.idCobranza = idCobranza;
        this.idSap = idSap;
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
     * @return the idSap
     */
    public String getIdSap() {
        return idSap;
    }

    /**
     * @param idSap the idSap to set
     */
    public void setIdSap(String idSap) {
        this.idSap = idSap;
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
    public List<DetalleErrorTO> getDetalleError() {
        return detalleError;
    }

    /**
     * @param detalleError the detalleError to set
     */
    public void setDetalleError(List<DetalleErrorTO> detalleError) {
        this.detalleError = detalleError;
    }

}
