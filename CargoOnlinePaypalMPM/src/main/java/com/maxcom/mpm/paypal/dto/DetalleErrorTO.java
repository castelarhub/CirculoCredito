package com.maxcom.mpm.paypal.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author operador
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetalleError")
public class DetalleErrorTO {
    @XmlTransient
    private long idCobranzaOnlineDetalle;
    
    //private String idEstatus;
    
    @XmlTransient
    private String observaciones;
    
    private CargoTO cargo;

    /**
     * @return the idCobranzaOnlineDetalle
     */
    public long getIdCobranzaOnlineDetalle() {
        return idCobranzaOnlineDetalle;
    }

    /**
     * @param idCobranzaOnlineDetalle the idCobranzaOnlineDetalle to set
     */
    public void setIdCobranzaOnlineDetalle(long idCobranzaOnlineDetalle) {
        this.idCobranzaOnlineDetalle = idCobranzaOnlineDetalle;
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
     * @return the cargo
     */
    public CargoTO getCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(CargoTO cargo) {
        this.cargo = cargo;
    }
}
