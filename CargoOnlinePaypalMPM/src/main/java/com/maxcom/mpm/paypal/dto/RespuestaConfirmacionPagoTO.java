package com.maxcom.mpm.paypal.dto;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RespuestaConfirmacionPago")
public class RespuestaConfirmacionPagoTO extends RespuestaTO{
    
    private String token;
    private String billingAgreementId;
    private InformacionPagoTO informacionPago;
    //private String estatus;
    @XmlTransient
    private String idOperacion;//Numero de operacion de Paypal.
    @XmlTransient
    private String fechaHora;//Fecha y hora de operacion Paypal.    
    
    public RespuestaConfirmacionPagoTO(){        
    }
    
    public RespuestaConfirmacionPagoTO(String token, String billingAgreementId, InformacionPagoTO informacionPago, String idEstatus, String idOperacion, String fechaHora, long idCargoOnline, String idTransaccion, String respuesta, String observaciones, Date fecha) {
        super(idCargoOnline, idTransaccion, respuesta,idEstatus, observaciones, fecha);
        this.token = token;
        this.billingAgreementId = billingAgreementId;
        this.informacionPago = informacionPago;
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
     * @return the billingAgreementId
     */
    public String getBillingAgreementId() {
        return billingAgreementId;
    }

    /**
     * @param billingAgreementId the billingAgreementId to set
     */
    public void setBillingAgreementId(String billingAgreementId) {
        this.billingAgreementId = billingAgreementId;
    }

    /**
     * @return the informacionPago
     */
    public InformacionPagoTO getInformacionPago() {
        return informacionPago;
    }

    /**
     * @param informacionPago the informacionPago to set
     */
    public void setInformacionPago(InformacionPagoTO informacionPago) {
        this.informacionPago = informacionPago;
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
