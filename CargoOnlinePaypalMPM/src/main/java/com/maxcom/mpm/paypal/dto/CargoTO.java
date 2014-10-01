package com.maxcom.mpm.paypal.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Cargo")
public class CargoTO {   
    
    @XmlElement(required=true)
    private int cantidad;
    @XmlElement(required=true)
    private String descripcion;
    @XmlElement(required=true)
    private double precio;
    
    @XmlTransient
    private long idPersistence;
    
    @XmlTransient
    private long uniqueIdDetail;

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return the idPersistence
     */
    public long getIdPersistence() {
        return idPersistence;
    }

    /**
     * @param idPersistence the idPersistence to set
     */
    public void setIdPersistence(long idPersistence) {
        this.idPersistence = idPersistence;
    }

    /**
     * @return the uniqueIdDetail
     */
    public long getUniqueIdDetail() {
        return uniqueIdDetail;
    }

    /**
     * @param uniqueIdDetail the uniqueIdDetail to set
     */
    public void setUniqueIdDetail(long uniqueIdDetail) {
        this.uniqueIdDetail = uniqueIdDetail;
    }

}
