package com.maxcom.mpm.dto;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Nelson Castelar
 * @author 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Respuesta")
public class RespuestaTO {
    
    private long idCobranzaOnline;//identificador unico del MPM para los pagos en linea. Se regresa como acuse.
    private String idTransaccion;//identificador unico recibido.    
    
    private String idEstatus;//Estatus interno del MPM.
    private String observaciones;//Descripcion general de la respuesta.
    private Date fecha;//Fecha y hora en que se realizo la operacion.    
    private DetalleErrorTO detalleError;//
    
    private String respuesta;//Resultado de la transaccion del banco que envia el banco. Esta puede ser: aprobada, rechazada o error.
    private String referencia;//Numero de referencia de la transaccion. Debe corresponder al enviado.
    private String autorizacion;//Numero de autorizacion del banco.
    private String monto;//Importe de la transaccion que cobro el banco.
    private String folioCPagos;//Numero asignado de la operacion del banco.    
    
    public RespuestaTO(){}

    public RespuestaTO(long idCobranza, String idTransaccion, String idEstatus, 
                       String observaciones, Date fecha, 
                       DetalleErrorTO detalleError) {
        this.idCobranzaOnline = idCobranza;
        this.idTransaccion = idTransaccion;
        this.idEstatus = idEstatus;
        this.observaciones = observaciones;
        this.fecha = fecha;
        this.detalleError = detalleError;
    }

    /**
     * @return the idCobranzaOnline
     */
    public long getIdCobranzaOnline() {
        return idCobranzaOnline;
    }

    /**
     * @param idCobranzaOnline the idCobranzaOnline to set
     */
    public void setIdCobranzaOnline(long idCobranzaOnline) {
        this.idCobranzaOnline = idCobranzaOnline;
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

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the detalleError
     */
    public DetalleErrorTO getDetalleError() {
        return detalleError;
    }

    /**
     * @param detalleError the detalleError to set
     */
    public void setDetalleError(DetalleErrorTO detalleError) {
        this.detalleError = detalleError;
    }

    /**
     * @return the idTransaccion
     */
    public String getIdTransaccion() {
        return idTransaccion;
    }

    /**
     * @param idTransaccion the idTransaccion to set
     */
    public void setIdTransaccion(String idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    /**
     * @return the respuesta
     */
    public String getRespuesta() {
        return respuesta;
    }

    /**
     * @param respuesta the respuesta to set
     */
    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
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
     * @return the autorizacion
     */
    public String getAutorizacion() {
        return autorizacion;
    }

    /**
     * @param autorizacion the autorizacion to set
     */
    public void setAutorizacion(String autorizacion) {
        this.autorizacion = autorizacion;
    }

    /**
     * @return the monto
     */
    public String getMonto() {
        return monto;
    }

    /**
     * @param monto the monto to set
     */
    public void setMonto(String monto) {
        this.monto = monto;
    }

    /**
     * @return the folioCPagos
     */
    public String getFolioCPagos() {
        return folioCPagos;
    }

    /**
     * @param folioCPagos the folioCPagos to set
     */
    public void setFolioCPagos(String folioCPagos) {
        this.folioCPagos = folioCPagos;
    }


}
