package com.maxcom.mpm.client.dto;

public class TransaccionBancoTO {
    private String referencia;
    private String nombreCliente;
    private String numeroTarjeta;
    private String mesExpiracionTarjeta;
    private String anioExpiracionTarjeta;
    private String codigoSeguridadTarjeta;
    private double monto;

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
}
