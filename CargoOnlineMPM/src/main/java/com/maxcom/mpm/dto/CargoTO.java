package com.maxcom.mpm.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author operador
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Cargo")
public class CargoTO {
    private String referencia;
    private String nombreCliente;
    private String cuenta;
    private String email;
    private double importe;
    private int tipoCuenta;
    private int marcaTarjeta;
    private boolean entidadFinanciera;
    
    @XmlTransient
    private long idPersistence; 
    @XmlTransient
    private long uniqueIdDetail; 

    /**
     * @return the referencia
     */
    public String getReferencia() {
        return referencia;
    }

    /**
     * @param referencia the referencia to set
     */
    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    /**
     * @return the nombreCliente
     */
    public String getNombreCliente() {
        return nombreCliente;
    }

    /**
     * @param nombreCliente the nombreCliente to set
     */
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    /**
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the importe
     */
    public double getImporte() {
        return importe;
    }

    /**
     * @param importe the importe to set
     */
    public void setImporte(double importe) {
        this.importe = importe;
    }

    /**
     * @return the tipoCuenta
     */
    public int getTipoCuenta() {
        return tipoCuenta;
    }

    /**
     * @param tipoCuenta the tipoCuenta to set
     */
    public void setTipoCuenta(int tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    /**
     * @return the marcaTarjeta
     */
    public int getMarcaTarjeta() {
        return marcaTarjeta;
    }

    /**
     * @param marcaTarjeta the marcaTarjeta to set
     */
    public void setMarcaTarjeta(int marcaTarjeta) {
        this.marcaTarjeta = marcaTarjeta;
    }

    /**
     * @return the entidadFinanciera
     */
    public boolean isEntidadFinanciera() {
        return entidadFinanciera;
    }

    /**
     * @param entidadFinanciera the entidadFinanciera to set
     */
    public void setEntidadFinanciera(boolean entidadFinanciera) {
        this.entidadFinanciera = entidadFinanciera;
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

}
