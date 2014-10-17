package com.maxcom.mpm.paypal.model;
// Generated 09-oct-2014 10:04:04 by Hibernate Tools 3.6.0


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * MpmTbitacoraConfPaypal generated by hbm2java
 */
public class MpmTbitacoraConfPaypal  implements java.io.Serializable {


     private long idBitacoraConfPaypal;
     private String idTransaccion;
     private String referencia;
     private String token;
     private String payerId;
     private BigDecimal ordenTotal;
     private String respuesta;
     private String estatus;
     private String observaciones;
     private String tokenPaypal;
     private String estatusPaypal;
     private String idOperacionPaypal;
     private String fechaOperacionPaypal;
     private String billingAgreementId;
     private String creadoPor;
     private String modificadoPor;
     private Date fechaCreacion;
     private Date fechaModificacion;
     private Set<MpmTbitacoraConfPagoPaypal> mpmTbitacoraConfPagoPaypals = new HashSet<MpmTbitacoraConfPagoPaypal>(0);

    public MpmTbitacoraConfPaypal() {
    }

	
    public MpmTbitacoraConfPaypal(long idBitacoraConfPaypal, String creadoPor, Date fechaCreacion) {
        this.idBitacoraConfPaypal = idBitacoraConfPaypal;
        this.creadoPor = creadoPor;
        this.fechaCreacion = fechaCreacion;
    }
    public MpmTbitacoraConfPaypal(long idBitacoraConfPaypal, String idTransaccion, String referencia, String token, String payerId, BigDecimal ordenTotal, String respuesta, String estatus, String observaciones, String tokenPaypal, String estatusPaypal, String idOperacionPaypal, String fechaOperacionPaypal, String billingAgreementId, String creadoPor, String modificadoPor, Date fechaCreacion, Date fechaModificacion, Set<MpmTbitacoraConfPagoPaypal> mpmTbitacoraConfPagoPaypals) {
       this.idBitacoraConfPaypal = idBitacoraConfPaypal;
       this.idTransaccion = idTransaccion;
       this.referencia = referencia;
       this.token = token;
       this.payerId = payerId;
       this.ordenTotal = ordenTotal;
       this.respuesta = respuesta;
       this.estatus = estatus;
       this.observaciones = observaciones;
       this.tokenPaypal = tokenPaypal;
       this.estatusPaypal = estatusPaypal;
       this.idOperacionPaypal = idOperacionPaypal;
       this.fechaOperacionPaypal = fechaOperacionPaypal;
       this.billingAgreementId = billingAgreementId;
       this.creadoPor = creadoPor;
       this.modificadoPor = modificadoPor;
       this.fechaCreacion = fechaCreacion;
       this.fechaModificacion = fechaModificacion;
       this.mpmTbitacoraConfPagoPaypals = mpmTbitacoraConfPagoPaypals;
    }
   
    public long getIdBitacoraConfPaypal() {
        return this.idBitacoraConfPaypal;
    }
    
    public void setIdBitacoraConfPaypal(long idBitacoraConfPaypal) {
        this.idBitacoraConfPaypal = idBitacoraConfPaypal;
    }
    public String getIdTransaccion() {
        return this.idTransaccion;
    }
    
    public void setIdTransaccion(String idTransaccion) {
        this.idTransaccion = idTransaccion;
    }
    public String getReferencia() {
        return this.referencia;
    }
    
    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }
    public String getToken() {
        return this.token;
    }
    
    public void setToken(String token) {
        this.token = token;
    }
    public String getPayerId() {
        return this.payerId;
    }
    
    public void setPayerId(String payerId) {
        this.payerId = payerId;
    }
    public BigDecimal getOrdenTotal() {
        return this.ordenTotal;
    }
    
    public void setOrdenTotal(BigDecimal ordenTotal) {
        this.ordenTotal = ordenTotal;
    }
    public String getRespuesta() {
        return this.respuesta;
    }
    
    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }
    public String getEstatus() {
        return this.estatus;
    }
    
    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }
    public String getObservaciones() {
        return this.observaciones;
    }
    
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    public String getTokenPaypal() {
        return this.tokenPaypal;
    }
    
    public void setTokenPaypal(String tokenPaypal) {
        this.tokenPaypal = tokenPaypal;
    }
    public String getEstatusPaypal() {
        return this.estatusPaypal;
    }
    
    public void setEstatusPaypal(String estatusPaypal) {
        this.estatusPaypal = estatusPaypal;
    }
    public String getIdOperacionPaypal() {
        return this.idOperacionPaypal;
    }
    
    public void setIdOperacionPaypal(String idOperacionPaypal) {
        this.idOperacionPaypal = idOperacionPaypal;
    }
    public String getFechaOperacionPaypal() {
        return this.fechaOperacionPaypal;
    }
    
    public void setFechaOperacionPaypal(String fechaOperacionPaypal) {
        this.fechaOperacionPaypal = fechaOperacionPaypal;
    }
    public String getBillingAgreementId() {
        return this.billingAgreementId;
    }
    
    public void setBillingAgreementId(String billingAgreementId) {
        this.billingAgreementId = billingAgreementId;
    }
    public String getCreadoPor() {
        return this.creadoPor;
    }
    
    public void setCreadoPor(String creadoPor) {
        this.creadoPor = creadoPor;
    }
    public String getModificadoPor() {
        return this.modificadoPor;
    }
    
    public void setModificadoPor(String modificadoPor) {
        this.modificadoPor = modificadoPor;
    }
    public Date getFechaCreacion() {
        return this.fechaCreacion;
    }
    
    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    public Date getFechaModificacion() {
        return this.fechaModificacion;
    }
    
    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }
    public Set<MpmTbitacoraConfPagoPaypal> getMpmTbitacoraConfPagoPaypals() {
        return this.mpmTbitacoraConfPagoPaypals;
    }
    
    public void setMpmTbitacoraConfPagoPaypals(Set<MpmTbitacoraConfPagoPaypal> mpmTbitacoraConfPagoPaypals) {
        this.mpmTbitacoraConfPagoPaypals = mpmTbitacoraConfPagoPaypals;
    }




}

