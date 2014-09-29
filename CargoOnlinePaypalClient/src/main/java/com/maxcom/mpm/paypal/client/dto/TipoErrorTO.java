package com.maxcom.mpm.paypal.client.dto;

public class TipoErrorTO {
    private String codigoError;
    private String mensajeCorto;
    private String mensajeLargo;

    /**
     * @return the codigoError
     */
    public String getCodigoError() {
        return codigoError;
    }

    /**
     * @param codigoError the codigoError to set
     */
    public void setCodigoError(String codigoError) {
        this.codigoError = codigoError;
    }

    /**
     * @return the mensajeCorto
     */
    public String getMensajeCorto() {
        return mensajeCorto;
    }

    /**
     * @param mensajeCorto the mensajeCorto to set
     */
    public void setMensajeCorto(String mensajeCorto) {
        this.mensajeCorto = mensajeCorto;
    }

    /**
     * @return the mensajeLargo
     */
    public String getMensajeLargo() {
        return mensajeLargo;
    }

    /**
     * @param mensajeLargo the mensajeLargo to set
     */
    public void setMensajeLargo(String mensajeLargo) {
        this.mensajeLargo = mensajeLargo;
    }
    
}
