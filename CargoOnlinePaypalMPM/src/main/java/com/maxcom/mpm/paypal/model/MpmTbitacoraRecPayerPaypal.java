package com.maxcom.mpm.paypal.model;
// Generated 08-oct-2014 10:22:56 by Hibernate Tools 3.6.0


import java.util.Date;

/**
 * MpmTbitacoraRecPayerPaypal generated by hbm2java
 */
public class MpmTbitacoraRecPayerPaypal  implements java.io.Serializable {


     private long idBitacoraRecPayerPaypal;
     private MpmTbitacoraRecPaypal mpmTbitacoraRecPaypal;
     private String payerId;
     private String cuenta;
     private String nombre;
     private String calle;
     private String entidadFederativa;
     private String pais;
     private String cp;
     private String telefono;
     private String estatus;
     private String creadoPor;
     private String modificadoPor;
     private Date fechaCreacion;
     private Date fechaModificacion;

    public MpmTbitacoraRecPayerPaypal() {
    }

	
    public MpmTbitacoraRecPayerPaypal(long idBitacoraRecPayerPaypal, String creadoPor, Date fechaCreacion) {
        this.idBitacoraRecPayerPaypal = idBitacoraRecPayerPaypal;
        this.creadoPor = creadoPor;
        this.fechaCreacion = fechaCreacion;
    }
    public MpmTbitacoraRecPayerPaypal(long idBitacoraRecPayerPaypal, MpmTbitacoraRecPaypal mpmTbitacoraRecPaypal, String payerId, String cuenta, String nombre, String calle, String entidadFederativa, String pais, String cp, String telefono, String estatus, String creadoPor, String modificadoPor, Date fechaCreacion, Date fechaModificacion) {
       this.idBitacoraRecPayerPaypal = idBitacoraRecPayerPaypal;
       this.mpmTbitacoraRecPaypal = mpmTbitacoraRecPaypal;
       this.payerId = payerId;
       this.cuenta = cuenta;
       this.nombre = nombre;
       this.calle = calle;
       this.entidadFederativa = entidadFederativa;
       this.pais = pais;
       this.cp = cp;
       this.telefono = telefono;
       this.estatus = estatus;
       this.creadoPor = creadoPor;
       this.modificadoPor = modificadoPor;
       this.fechaCreacion = fechaCreacion;
       this.fechaModificacion = fechaModificacion;
    }
   
    public long getIdBitacoraRecPayerPaypal() {
        return this.idBitacoraRecPayerPaypal;
    }
    
    public void setIdBitacoraRecPayerPaypal(long idBitacoraRecPayerPaypal) {
        this.idBitacoraRecPayerPaypal = idBitacoraRecPayerPaypal;
    }
    public MpmTbitacoraRecPaypal getMpmTbitacoraRecPaypal() {
        return this.mpmTbitacoraRecPaypal;
    }
    
    public void setMpmTbitacoraRecPaypal(MpmTbitacoraRecPaypal mpmTbitacoraRecPaypal) {
        this.mpmTbitacoraRecPaypal = mpmTbitacoraRecPaypal;
    }
    public String getPayerId() {
        return this.payerId;
    }
    
    public void setPayerId(String payerId) {
        this.payerId = payerId;
    }
    public String getCuenta() {
        return this.cuenta;
    }
    
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCalle() {
        return this.calle;
    }
    
    public void setCalle(String calle) {
        this.calle = calle;
    }
    public String getEntidadFederativa() {
        return this.entidadFederativa;
    }
    
    public void setEntidadFederativa(String entidadFederativa) {
        this.entidadFederativa = entidadFederativa;
    }
    public String getPais() {
        return this.pais;
    }
    
    public void setPais(String pais) {
        this.pais = pais;
    }
    public String getCp() {
        return this.cp;
    }
    
    public void setCp(String cp) {
        this.cp = cp;
    }
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getEstatus() {
        return this.estatus;
    }
    
    public void setEstatus(String estatus) {
        this.estatus = estatus;
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




}


