package com.maxcom.mpm.paypal.dto;

import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RespuestaSolicitud")
public class RespuestaSolicitudTO extends RespuestaTO{
    
    private String token;//Referencia del pago de Paypal.
    private List<DetalleErrorTO> detalleError;//En caso de error en los campos de entrada
    
    //private String estatus;//Estatus que se regresa al cliente
    @XmlTransient
    private String idOperacion;//Numero de operacion de Paypal.
    @XmlTransient
    private String fechaHora;//Fecha y hora de operacion Paypal.
    @XmlTransient
    private String montoTotal;//Importe de la transaccion que se cobrara.
    
    public RespuestaSolicitudTO(){
    }

    public RespuestaSolicitudTO(String token, String montoTotal, List<DetalleErrorTO> detalleError, String idEstatus, String idOperacion, String fechaHora, long idCargoOnline, String idTransaccion, String respuesta, String observaciones, Date fecha) {
        
        super(idCargoOnline, idTransaccion, respuesta, idEstatus, observaciones, fecha);
        this.token = token;
        this.montoTotal = montoTotal;
        this.detalleError = detalleError;
        this.idOperacion = idOperacion;
        this.fechaHora = fechaHora;
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
     * @return the montoTotal
     */
    public String getMontoTotal() {
        return montoTotal;
    }

    /**
     * @param montoTotal the montoTotal to set
     */
    public void setMontoTotal(String montoTotal) {
        this.montoTotal = montoTotal;
    }

    /**
     * @return the detalleError
     */
    public List<DetalleErrorTO> getDetalleError() {
        return detalleError;
    }

    /**
     * @param detalleError the detalleError to set
     */
    public void setDetalleError(List<DetalleErrorTO> detalleError) {
        this.detalleError = detalleError;
    }

    /**
     * @return the idOperacion
     */
    public String getIdOperacion() {
        return idOperacion;
    }

    /**
     * @param idOperacion the idOperacion to set
     */
    public void setIdOperacion(String idOperacion) {
        this.idOperacion = idOperacion;
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

}
