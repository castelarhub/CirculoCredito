package com.maxcom.mpm.dto;

public class CargoTO {
    private long idCobranzaDetalle;
    private String referencia;
    private String nombreCliente;
    private String cuenta;
    private String email;
    private double importe;
    private int tipoCuenta;
    private int marcaTarjeta;
    private boolean entidadFinanciera;
    private String idRespuestaCargo;
    private String descripcionRespuesta;

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
     * @return the idRespuestaCargo
     */
    public String getIdRespuestaCargo() {
        return idRespuestaCargo;
    }

    /**
     * @param idRespuestaCargo the idRespuestaCargo to set
     */
    public void setIdRespuestaCargo(String idRespuestaCargo) {
        this.idRespuestaCargo = idRespuestaCargo;
    }

    /**
     * @return the descripcionRespuesta
     */
    public String getDescripcionRespuesta() {
        return descripcionRespuesta;
    }

    /**
     * @param descripcionRespuesta the descripcionRespuesta to set
     */
    public void setDescripcionRespuesta(String descripcionRespuesta) {
        this.descripcionRespuesta = descripcionRespuesta;
    }
    
}
