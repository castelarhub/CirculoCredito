package com.maxcom.mpm.paypal.client.dto;

import java.util.List;

public class RespuestaDetallePagoExpressTO {

    private String fechaHora;
    private String ack;
    private String correlationID;
    
    private List<TipoErrorTO> listaErrores;    
    
    private String token;
    
    private PayerInfoTO payerInfo;
    
    private List<ArticuloTO> listItem;
    
    private double itemTotal;
    
    private double orderTotal;
    
    private boolean tieneAcuerdoReferenciado;
    

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
     * @return the payerInfo
     */
    public PayerInfoTO getPayerInfo() {
        return payerInfo;
    }

    /**
     * @param payerInfo the payerInfo to set
     */
    public void setPayerInfo(PayerInfoTO payerInfo) {
        this.payerInfo = payerInfo;
    }

    /**
     * @return the listItem
     */
    public List<ArticuloTO> getListItem() {
        return listItem;
    }

    /**
     * @param listItem the listItem to set
     */
    public void setListItem(List<ArticuloTO> listItem) {
        this.listItem = listItem;
    }

    /**
     * @return the itemTotal
     */
    public double getItemTotal() {
        return itemTotal;
    }

    /**
     * @param itemTotal the itemTotal to set
     */
    public void setItemTotal(double itemTotal) {
        this.itemTotal = itemTotal;
    }

    /**
     * @return the orderTotal
     */
    public double getOrderTotal() {
        return orderTotal;
    }

    /**
     * @param orderTotal the orderTotal to set
     */
    public void setOrderTotal(double orderTotal) {
        this.orderTotal = orderTotal;
    }

    /**
     * @return the tieneAcuerdoReferenciado
     */
    public boolean isTieneAcuerdoReferenciado() {
        return tieneAcuerdoReferenciado;
    }

    /**
     * @param tieneAcuerdoReferenciado the tieneAcuerdoReferenciado to set
     */
    public void setTieneAcuerdoReferenciado(boolean tieneAcuerdoReferenciado) {
        this.tieneAcuerdoReferenciado = tieneAcuerdoReferenciado;
    }
    
    
    
}
