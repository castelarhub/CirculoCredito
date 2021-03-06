package com.maxcom.mpm.model;
// Generated 05-sep-2014 15:58:10 by Hibernate Tools 3.6.0


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * MpmTlotesCargoAutomatico generated by hbm2java
 */
public class MpmTlotesCargoAutomatico  implements java.io.Serializable {


     private long idLote;
     private MpmTprocesos mpmTprocesos;
     private MpmCestados mpmCestados;
     private String nombreArchivo;
     private int cantidadCargos;
     private Date fechaRespuesta;
     private String creadoPor;
     private Date fechaCreacion;
     private String sistema;
     private String modificadoPor;
     private Date fechaModificacion;
     private Set<MpmTcobranzaSapDeta> mpmTcobranzaSapDetas = new HashSet<MpmTcobranzaSapDeta>(0);

    public MpmTlotesCargoAutomatico() {
    }

	
    public MpmTlotesCargoAutomatico(long idLote, MpmTprocesos mpmTprocesos, MpmCestados mpmCestados, String nombreArchivo, int cantidadCargos, String creadoPor, Date fechaCreacion, String sistema) {
        this.idLote = idLote;
        this.mpmTprocesos = mpmTprocesos;
        this.mpmCestados = mpmCestados;
        this.nombreArchivo = nombreArchivo;
        this.cantidadCargos = cantidadCargos;
        this.creadoPor = creadoPor;
        this.fechaCreacion = fechaCreacion;
        this.sistema = sistema;
    }
    public MpmTlotesCargoAutomatico(long idLote, MpmTprocesos mpmTprocesos, MpmCestados mpmCestados, String nombreArchivo, int cantidadCargos, Date fechaRespuesta, String creadoPor, Date fechaCreacion, String sistema, String modificadoPor, Date fechaModificacion, Set<MpmTcobranzaSapDeta> mpmTcobranzaSapDetas) {
       this.idLote = idLote;
       this.mpmTprocesos = mpmTprocesos;
       this.mpmCestados = mpmCestados;
       this.nombreArchivo = nombreArchivo;
       this.cantidadCargos = cantidadCargos;
       this.fechaRespuesta = fechaRespuesta;
       this.creadoPor = creadoPor;
       this.fechaCreacion = fechaCreacion;
       this.sistema = sistema;
       this.modificadoPor = modificadoPor;
       this.fechaModificacion = fechaModificacion;
       this.mpmTcobranzaSapDetas = mpmTcobranzaSapDetas;
    }
   
    public long getIdLote() {
        return this.idLote;
    }
    
    public void setIdLote(long idLote) {
        this.idLote = idLote;
    }
    public MpmTprocesos getMpmTprocesos() {
        return this.mpmTprocesos;
    }
    
    public void setMpmTprocesos(MpmTprocesos mpmTprocesos) {
        this.mpmTprocesos = mpmTprocesos;
    }
    public MpmCestados getMpmCestados() {
        return this.mpmCestados;
    }
    
    public void setMpmCestados(MpmCestados mpmCestados) {
        this.mpmCestados = mpmCestados;
    }
    public String getNombreArchivo() {
        return this.nombreArchivo;
    }
    
    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }
    public int getCantidadCargos() {
        return this.cantidadCargos;
    }
    
    public void setCantidadCargos(int cantidadCargos) {
        this.cantidadCargos = cantidadCargos;
    }
    public Date getFechaRespuesta() {
        return this.fechaRespuesta;
    }
    
    public void setFechaRespuesta(Date fechaRespuesta) {
        this.fechaRespuesta = fechaRespuesta;
    }
    public String getCreadoPor() {
        return this.creadoPor;
    }
    
    public void setCreadoPor(String creadoPor) {
        this.creadoPor = creadoPor;
    }
    public Date getFechaCreacion() {
        return this.fechaCreacion;
    }
    
    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    public String getSistema() {
        return this.sistema;
    }
    
    public void setSistema(String sistema) {
        this.sistema = sistema;
    }
    public String getModificadoPor() {
        return this.modificadoPor;
    }
    
    public void setModificadoPor(String modificadoPor) {
        this.modificadoPor = modificadoPor;
    }
    public Date getFechaModificacion() {
        return this.fechaModificacion;
    }
    
    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }
    public Set<MpmTcobranzaSapDeta> getMpmTcobranzaSapDetas() {
        return this.mpmTcobranzaSapDetas;
    }
    
    public void setMpmTcobranzaSapDetas(Set<MpmTcobranzaSapDeta> mpmTcobranzaSapDetas) {
        this.mpmTcobranzaSapDetas = mpmTcobranzaSapDetas;
    }




}


