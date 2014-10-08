package com.maxcom.mpm.paypal.dto;

import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RespuestaDetallePago")
public class RespuestaDetallePagoTO extends RespuestaTO{
    private String token;
    private PayerInfoTO infoCliente;
    private List<CargoTO> cargos;
    private double orderTotal;
    private boolean tieneAcuerdoPagoReferenciado;
    
    //private String estatus;//Estatus SUCCESS
    
    @XmlTransient
    private String idOperacionPaypal;//Numero de operacion de Paypal.
    @XmlTransient
    private String fechaHoraOperacionPaypal;//Fecha y hora de operacion Paypal.    
    
    public RespuestaDetallePagoTO(){        
    }

    public RespuestaDetallePagoTO(String token, PayerInfoTO infoCliente, List<CargoTO> cargos, double orderTotal, String idEstatus, String idOperacion, String fechaHora, long idCargoOnline, String idTransaccion, String respuesta, String observaciones, Date fecha) {
        super(idCargoOnline, idTransaccion, respuesta, idEstatus, observaciones, fecha);
        this.token = token;
        this.infoCliente = infoCliente;
        this.cargos = cargos;
        this.orderTotal = orderTotal;
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
     * @return the infoCliente
     */
    public PayerInfoTO getInfoCliente() {
        return infoCliente;
    }

    /**
     * @param infoCliente the infoCliente to set
     */
    public void setInfoCliente(PayerInfoTO infoCliente) {
        this.infoCliente = infoCliente;
    }

    /**
     * @return the cargos
     */
    public List<CargoTO> getCargos() {
        return cargos;
    }

    /**
     * @param cargos the cargos to set
     */
    public void setCargos(List<CargoTO> cargos) {
        this.cargos = cargos;
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

    /**
     * @return the tieneAcuerdoPagoReferenciado
     */
    public boolean isTieneAcuerdoPagoReferenciado() {
        return tieneAcuerdoPagoReferenciado;
    }

    /**
     * @param tieneAcuerdoPagoReferenciado the tieneAcuerdoPagoReferenciado to set
     */
    public void setTieneAcuerdoPagoReferenciado(boolean tieneAcuerdoPagoReferenciado) {
        this.tieneAcuerdoPagoReferenciado = tieneAcuerdoPagoReferenciado;
    }
    

}
