package com.maxcom.mpm.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author operador
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetalleError")
public class DetalleErrorTO {
    private long idCobranzaDetalle;
    private int idEstatus;
    private String observaciones;
    private CargoTO cargo;

    /**
     * @return the idCobranzaDetalle
     */
    public long getIdCobranzaDetalle() {
        return idCobranzaDetalle;
    }

    /**
     * @param idCobranzaDetalle the idCobranzaDetalle to set
     */
    public void setIdCobranzaDetalle(long idCobranzaDetalle) {
        this.idCobranzaDetalle = idCobranzaDetalle;
    }

    /**
     * @return the idEstatus
     */
    public int getIdEstatus() {
        return idEstatus;
    }

    /**
     * @param idEstatus the idEstatus to set
     */
    public void setIdEstatus(int idEstatus) {
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
