package com.maxcom.mpm.dto;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

/**
 * Nelson Castelar
 * @author 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Respuesta")
public class RespuestaTO {
    
    private long idCargoOnline;//identificador unico del MPM para los pagos en linea. Se regresa como acuse.
    private String idTransaccion;//identificador unico recibido.    
    
    private String idEstatus;//Estatus interno del MPM.
    private String observaciones;//Descripcion general de la respuesta.
    private Date fecha;//Fecha y hora en que se realizo la operacion.    
    private DetalleErrorTO detalleError;//
    
    private String respuesta;//Resultado de la transaccion del banco que envia el banco. Esta puede ser: aprobada, rechazada o error.
    private String referencia;//Numero de referencia de la transaccion. Debe corresponder al enviado.
    private String autorizacion;//Numero de autorizacion del banco.
    private String monto;//Importe de la transaccion que cobro el banco.
    @XmlTransient
    private String folioCPagos;//Numero asignado de la operacion del banco. 
    @XmlTransient
    private String solicitudXml;//Solicitud enviada al banco
    @XmlTransient
    private String respuestaXml;//Respuesta completa del banco
    @XmlTransient
    private String banCdError;//
    @XmlTransient
    private String banCdResponse;//
    @XmlTransient
    private String banNbError;//
    
    public RespuestaTO(){}

    public RespuestaTO(long idCargoOnline, String idTransaccion, String idEstatus, 
                       String observaciones, Date fecha, 
                       DetalleErrorTO detalleError) {
        this.idCargoOnline = idCargoOnline;
        this.idTransaccion = idTransaccion;
        this.idEstatus = idEstatus;
        this.observaciones = observaciones;
        this.fecha = fecha;
        this.detalleError = detalleError;
    }

    /**
     * @return the idCargoOnline
     */
    public long getIdCargoOnline() {
        return idCargoOnline;
    }

    /**
     * @param idCargoOnline the idCargoOnline to set
     */
    public void setIdCargoOnline(long idCargoOnline) {
        this.idCargoOnline = idCargoOnline;
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

    /**
     * @return the solicitudXml
     */
    public String getSolicitudXml() {
        return solicitudXml;
    }

    /**
     * @param solicitudXml the solicitudXml to set
     */
    public void setSolicitudXml(String solicitudXml) {
        this.solicitudXml = solicitudXml;
    }

    /**
     * @return the respuestaXml
     */
    public String getRespuestaXml() {
        return respuestaXml;
    }

    /**
     * @param respuestaXml the respuestaXml to set
     */
    public void setRespuestaXml(String respuestaXml) {
        this.respuestaXml = respuestaXml;
    }

    /**
     * @return the banCdError
     */
    public String getBanCdError() {
        return banCdError;
    }

    /**
     * @param banCdError the banCdError to set
     */
    public void setBanCdError(String banCdError) {
        this.banCdError = banCdError;
    }

    /**
     * @return the banCdResponse
     */
    public String getBanCdResponse() {
        return banCdResponse;
    }

    /**
     * @param banCdResponse the banCdResponse to set
     */
    public void setBanCdResponse(String banCdResponse) {
        this.banCdResponse = banCdResponse;
    }

    /**
     * @return the banNbError
     */
    public String getBanNbError() {
        return banNbError;
    }

    /**
     * @param banNbError the banNbError to set
     */
    public void setBanNbError(String banNbError) {
        this.banNbError = banNbError;
    }


}
