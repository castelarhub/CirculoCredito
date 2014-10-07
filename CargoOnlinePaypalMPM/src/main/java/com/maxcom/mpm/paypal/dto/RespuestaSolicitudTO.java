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
    
    @XmlTransient
    private String idOperacionPaypal;//Numero de operacion de Paypal.
    @XmlTransient
    private String fechaHoraOperacionPaypal;//Fecha y hora de operacion Paypal.
    @XmlTransient
    private String montoTotal;//Importe de la transaccion que se cobrara.
    
    public RespuestaSolicitudTO(){
    }

    public RespuestaSolicitudTO(String token, String montoTotal, List<DetalleErrorTO> detalleError, String idEstatus, String idOperacion, String fechaHora, long idCargoOnline, String idTransaccion, String respuesta, String observaciones, Date fecha) {
        
        super(idCargoOnline, idTransaccion, respuesta, idEstatus, observaciones, fecha);
        this.token = token;
        this.montoTotal = montoTotal;
        this.detalleError = detalleError;
        this.idOperacionPaypal = idOperacion;
        this.fechaHoraOperacionPaypal = fechaHora;
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
     * @return the idOperacionPaypal
     */
    public String getIdOperacionPaypal() {
        return idOperacionPaypal;
    }

    /**
     * @param idOperacionPaypal the idOperacionPaypal to set
     */
    public void setIdOperacionPaypal(String idOperacionPaypal) {
        this.idOperacionPaypal = idOperacionPaypal;
    }

    /**
     * @return the fechaHoraOperacionPaypal
     */
    public String getFechaHoraOperacionPaypal() {
        return fechaHoraOperacionPaypal;
    }

    /**
     * @param fechaHoraOperacionPaypal the fechaHoraOperacionPaypal to set
     */
    public void setFechaHoraOperacionPaypal(String fechaHoraOperacionPaypal) {
        this.fechaHoraOperacionPaypal = fechaHoraOperacionPaypal;
    }

}
