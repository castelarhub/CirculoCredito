package com.maxcom.mpm.dto;

public class RespuestaTO {
    
    private long idCobranza;
    private String acuseSap;
    private String idEstatus;
    private String observaciones;

    /**
     * @return the idCobranza
     */
    public long getIdCobranza() {
        return idCobranza;
    }

    /**
     * @param idCobranza the idCobranza to set
     */
    public void setIdCobranza(long idCobranza) {
        this.idCobranza = idCobranza;
    }

    /**
     * @return the acuseSap
     */
    public String getAcuseSap() {
        return acuseSap;
    }

    /**
     * @param acuseSap the acuseSap to set
     */
    public void setAcuseSap(String acuseSap) {
        this.acuseSap = acuseSap;
    }

    /**
     * @return the idEstatus
     */
    public String getIdEstatus() {
        return idEstatus;
    }

    /**
     * @param idEstatus the idEstatus to set
     */
    public void setIdEstatus(String idEstatus) {
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
    
}
