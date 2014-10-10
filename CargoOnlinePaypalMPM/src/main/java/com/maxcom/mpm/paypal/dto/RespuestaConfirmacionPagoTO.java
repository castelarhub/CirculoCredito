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
    private InformacionPagoTO informacionPago;
    @XmlTransient
    private String billingAgreementId;    
    //private String estatus;
    @XmlTransient
    private String idOperacionPaypal;//Numero de operacion de Paypal.
    @XmlTransient
    private String fechaHoraOperacionPaypal;//Fecha y hora de operacion Paypal.    
    
    public RespuestaConfirmacionPagoTO(){        
    }
    
    public RespuestaConfirmacionPagoTO(String token, String billingAgreementId, InformacionPagoTO informacionPago, String idEstatus, String idOperacion, String fechaHora, long idCargoOnline, String idTransaccion, String respuesta, String observaciones, Date fecha) {
        super(idCargoOnline, idTransaccion, respuesta,idEstatus, observaciones, fecha);
        this.token = token;
        this.billingAgreementId = billingAgreementId;
        this.informacionPago = informacionPago;
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
