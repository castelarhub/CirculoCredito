package com.maxcom.mpm.paypal.dto;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Nelson Castelar
 * @author 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Respuesta")
public class RespuestaTO {
    
    private long idOperacionMPM;//identificador unico del MPM para los pagos en linea paypal. Se regresa como acuse.
    private String idTransaccion;//identificador unico.
    private String respuesta;//Resultado de la transaccion. Esta puede ser: SUCCESS,...
    private String estatus;//Estatus que se regresa al cliente
    private String observaciones;//Descripcion general de la respuesta.        
    private Date fecha;//Fecha y hora en que se realizo la operacion.    
    
    public RespuestaTO(){}

    public RespuestaTO(long idCargoOnline, String idTransaccion, String respuesta, String estatus, String observaciones, Date fecha) {
        this.idOperacionMPM = idCargoOnline;
        this.idTransaccion = idTransaccion;
        this.respuesta = respuesta;
        this.estatus = estatus;
        this.observaciones = observaciones;
        this.fecha = fecha;
    }
    

    /**
     * @return the idOperacionMPM
     */
    public long getIdOperacionMPM() {
        return idOperacionMPM;
    }

    /**
     * @param idOperacionMPM the idOperacionMPM to set
     */
    public void setIdOperacionMPM(long idOperacionMPM) {
        this.idOperacionMPM = idOperacionMPM;
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
     * @return the estatus
     */
    public String getEstatus() {
        return estatus;
    }

    /**
     * @param estatus the estatus to set
     */
    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }


}
