package com.maxcom.mpm.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author operador
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Cargo")
public class CargoTO {
    @XmlElement(required=true)
    private String referencia;
    @XmlElement(required=true)
    private String nombreCliente;
    @XmlElement(required=true)
    private String numeroTarjeta;
    @XmlElement(required=true)
    private String tipoTarjeta;    
    @XmlElement(name="mesExpiracion",required=true)
    private String mesExpiracionTarjeta;
    @XmlElement(name="anioExpiracion",required=true)
    private String anioExpiracionTarjeta;
    @XmlElement(name="codigoseguridad",required=true)
    private String codigoSeguridadTarjeta;
    @XmlElement(required=true)
    private double monto;
    
    @XmlTransient
    private long idPersistence; 

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
     * @return the numeroTarjeta
     */
    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    /**
     * @param numeroTarjeta the numeroTarjeta to set
     */
    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    /**
     * @return the codigoSeguridadTarjeta
     */
    public String getCodigoSeguridadTarjeta() {
        return codigoSeguridadTarjeta;
    }

    /**
     * @param codigoSeguridadTarjeta the codigoSeguridadTarjeta to set
     */
    public void setCodigoSeguridadTarjeta(String codigoSeguridadTarjeta) {
        this.codigoSeguridadTarjeta = codigoSeguridadTarjeta;
    }

    /**
     * @return the monto
     */
    public double getMonto() {
        return monto;
    }

    /**
     * @param monto the monto to set
     */
    public void setMonto(double monto) {
        this.monto = monto;
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
     * @return the mesExpiracionTarjeta
     */
    public String getMesExpiracionTarjeta() {
        return mesExpiracionTarjeta;
    }

    /**
     * @param mesExpiracionTarjeta the mesExpiracionTarjeta to set
     */
    public void setMesExpiracionTarjeta(String mesExpiracionTarjeta) {
        this.mesExpiracionTarjeta = mesExpiracionTarjeta;
    }

    /**
     * @return the anioExpiracionTarjeta
     */
    public String getAnioExpiracionTarjeta() {
        return anioExpiracionTarjeta;
    }

    /**
     * @param anioExpiracionTarjeta the anioExpiracionTarjeta to set
     */
    public void setAnioExpiracionTarjeta(String anioExpiracionTarjeta) {
        this.anioExpiracionTarjeta = anioExpiracionTarjeta;
    }

    /**
     * @return the tipoTarjeta
     */
    public String getTipoTarjeta() {
        return tipoTarjeta;
    }

    /**
     * @param tipoTarjeta the tipoTarjeta to set
     */
    public void setTipoTarjeta(String tipoTarjeta) {
        this.tipoTarjeta = tipoTarjeta;
    }

}
