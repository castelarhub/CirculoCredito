package com.maxcom.mpm.paypal.dto;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultaRespuesta")
public class ConsultaRespuestaTO {
    private long idConsultaOnline;//identificador unico del MPM para los pagos en linea. Se regresa como acuse.
    
    private String idEstatus;//Estatus interno del MPM.
    private String observaciones;//Descripcion general de la respuesta.
    private Date fecha;//Fecha y hora en que se realizo la operacion.
    private ConsultaDetalleErrorTO detalleError;    
    private String respuesta;//Resultado de la transaccion del banco que envia el banco. Esta puede ser: aprobada, rechazada o error.
    private String referencia;//Numero de referencia de la transaccion. Debe corresponder al enviado.
    private String autorizacion;//Numero de autorizacion del banco.
    private String monto;//Importe de la transaccion que cobro el banco.    
    
    @XmlTransient
    private String banNumeroOperacion;
    @XmlTransient
    private String banCdRespuesta;
    @XmlTransient
    private String banNbRespuesta;
    
    @XmlTransient
    private String respuestaXml;//Respuesta completa del banco

    public ConsultaRespuestaTO(long idConsultaOnline, String idEstatus, String observaciones, Date fecha, ConsultaDetalleErrorTO detalleError, String respuesta, String referencia, String autorizacion, String monto) {
        this.idConsultaOnline = idConsultaOnline;
        this.idEstatus = idEstatus;
        this.observaciones = observaciones;
        this.fecha = fecha;
        this.detalleError = detalleError;
        this.respuesta = respuesta;
        this.referencia = referencia;
        this.autorizacion = autorizacion;
        this.monto = monto;
    }
    
    

    /**
     * @return the idConsultaOnline
     */
    public long getIdConsultaOnline() {
        return idConsultaOnline;
    }

    /**
     * @param idConsultaOnline the idConsultaOnline to set
     */
    public void setIdConsultaOnline(long idConsultaOnline) {
        this.idConsultaOnline = idConsultaOnline;
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
    public ConsultaDetalleErrorTO getDetalleError() {
        return detalleError;
    }

    /**
     * @param detalleError the detalleError to set
     */
    public void setDetalleError(ConsultaDetalleErrorTO detalleError) {
        this.detalleError = detalleError;
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
     * @return the banNumeroOperacion
     */
    public String getBanNumeroOperacion() {
        return banNumeroOperacion;
    }

    /**
     * @param banNumeroOperacion the banNumeroOperacion to set
     */
    public void setBanNumeroOperacion(String banNumeroOperacion) {
        this.banNumeroOperacion = banNumeroOperacion;
    }

    /**
     * @return the banCdRespuesta
     */
    public String getBanCdRespuesta() {
        return banCdRespuesta;
    }

    /**
     * @param banCdRespuesta the banCdRespuesta to set
     */
    public void setBanCdRespuesta(String banCdRespuesta) {
        this.banCdRespuesta = banCdRespuesta;
    }

    /**
     * @return the banNbRespuesta
     */
    public String getBanNbRespuesta() {
        return banNbRespuesta;
    }

    /**
     * @param banNbRespuesta the banNbRespuesta to set
     */
    public void setBanNbRespuesta(String banNbRespuesta) {
        this.banNbRespuesta = banNbRespuesta;
    }
    
}
