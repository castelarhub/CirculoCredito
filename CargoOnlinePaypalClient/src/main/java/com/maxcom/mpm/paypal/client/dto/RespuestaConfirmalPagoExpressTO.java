package com.maxcom.mpm.paypal.client.dto;

import java.util.List;

public class RespuestaConfirmalPagoExpressTO {
    private String token;
    private String ack;
    private String correlationID;
    private String fechaHora;
    private List<TipoErrorTO> listaErrores;
    
    private PaymentInfoTO informacionPago;
    
    private String billingAgreementId;

    /**
     * @return the token
     */
    public String getToken() {
        return token;
    }

    /**
     * @param token the token to set
     */
    public void setToken(String token) {
        this.token = token;
    }

    /**
     * @return the ack
     */
    public String getAck() {
        return ack;
    }

    /**
     * @param ack the ack to set
     */
    public void setAck(String ack) {
        this.ack = ack;
    }

    /**
     * @return the correlationID
     */
    public String getCorrelationID() {
        return correlationID;
    }

    /**
     * @param correlationID the correlationID to set
     */
    public void setCorrelationID(String correlationID) {
        this.correlationID = correlationID;
    }

    /**
     * @return the fechaHora
     */
    public String getFechaHora() {
        return fechaHora;
    }

    /**
     * @param fechaHora the fechaHora to set
     */
    public void setFechaHora(String fechaHora) {
        this.fechaHora = fechaHora;
    }

    /**
     * @return the listaErrores
     */
    public List<TipoErrorTO> getListaErrores() {
        return listaErrores;
    }

    /**
     * @param listaErrores the listaErrores to set
     */
    public void setListaErrores(List<TipoErrorTO> listaErrores) {
        this.listaErrores = listaErrores;
    }

    /**
     * @return the informacionPago
     */
    public PaymentInfoTO getInformacionPago() {
        return informacionPago;
    }

    /**
     * @param informacionPago the informacionPago to set
     */
    public void setInformacionPago(PaymentInfoTO informacionPago) {
        this.informacionPago = informacionPago;
    }

    /**
     * @return the billingAgreementId
     */
    public String getBillingAgreementId() {
        return billingAgreementId;
    }

    /**
     * @param billingAgreementId the billingAgreementId to set
     */
    public void setBillingAgreementId(String billingAgreementId) {
        this.billingAgreementId = billingAgreementId;
    }
}
