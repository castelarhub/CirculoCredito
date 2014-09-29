package com.maxcom.mpm.paypal.client.dto;

import java.util.List;

public class TransaccionSolicitudPagoExpressTO {
    private String referencia;
    private String descripcion;
    private List<ArticuloTO> listaArticulos;
    private String urlReturn;
    private String urlCancel;

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
     * @return the listaArticulos
     */
    public List<ArticuloTO> getListaArticulos() {
        return listaArticulos;
    }

    /**
     * @param listaArticulos the listaArticulos to set
     */
    public void setListaArticulos(List<ArticuloTO> listaArticulos) {
        this.listaArticulos = listaArticulos;
    }

    /**
     * @return the urlReturn
     */
    public String getUrlReturn() {
        return urlReturn;
    }

    /**
     * @param urlReturn the urlReturn to set
     */
    public void setUrlReturn(String urlReturn) {
        this.urlReturn = urlReturn;
    }

    /**
     * @return the urlCancel
     */
    public String getUrlCancel() {
        return urlCancel;
    }

    /**
     * @param urlCancel the urlCancel to set
     */
    public void setUrlCancel(String urlCancel) {
        this.urlCancel = urlCancel;
    }
    
}
