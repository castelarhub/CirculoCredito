/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maxcom.mpm.respuesta.dto;

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
    private String acuseSap;
    private String idEstatus;
    private String observaciones;

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
     * @return the acuseSap
     */
    public String getAcuseSap() {
        return acuseSap;
    }

    /**
     * @param acuseSap the acuseSap to set
     */
    public void setAcuseSap(String acuseSap) {
        this.acuseSap = acuseSap;
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

}
