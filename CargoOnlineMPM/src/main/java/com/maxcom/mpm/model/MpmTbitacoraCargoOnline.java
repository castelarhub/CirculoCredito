package com.maxcom.mpm.model;
// Generated 18-sep-2014 9:04:00 by Hibernate Tools 3.6.0


import java.math.BigDecimal;
import java.util.Date;

/**
 * MpmTbitacoraCargoOnline generated by hbm2java
 */
public class MpmTbitacoraCargoOnline  implements java.io.Serializable {


     private long idBitacora;
     private MpmCrespuestasCargos mpmCrespuestasCargos;
     private MpmCestados mpmCestados;
     private String idTransaccion;
     private String referencia;
     private String nombreCliente;
     private String numeroTarjeta;
     private String mesExpiracion;
     private String anioExpiracion;
     private String codigoSeguridad;
     private BigDecimal monto;
     private String banResultado;
     private String banNumeroAutorizacion;
     private String banFolioCpagos;
     private String banCdError;
     private String banError;
     private String banCdRespuesta;
     private String creadoPor;
     private Date fechaCreacion;
     private String modificadoPor;
     private Date fechaModificacion;
     private String solicitudXml;
     private String respuestaXml;
     private String observaciones;

    public MpmTbitacoraCargoOnline() {
    }

	
    public MpmTbitacoraCargoOnline(long idBitacora, MpmCestados mpmCestados, String idTransaccion, String creadoPor, Date fechaCreacion) {
        this.idBitacora = idBitacora;
        this.mpmCestados = mpmCestados;
        this.idTransaccion = idTransaccion;
        this.creadoPor = creadoPor;
        this.fechaCreacion = fechaCreacion;
    }
    public MpmTbitacoraCargoOnline(long idBitacora, MpmCrespuestasCargos mpmCrespuestasCargos, MpmCestados mpmCestados, String idTransaccion, String referencia, String nombreCliente, String numeroTarjeta, String mesExpiracion, String anioExpiracion, String codigoSeguridad, BigDecimal monto, String banResultado, String banNumeroAutorizacion, String banFolioCpagos, String banCdError, String banError, String banCdRespuesta, String creadoPor, Date fechaCreacion, String modificadoPor, Date fechaModificacion, String solicitudXml, String respuestaXml) {
       this.idBitacora = idBitacora;
       this.mpmCrespuestasCargos = mpmCrespuestasCargos;
       this.mpmCestados = mpmCestados;
       this.idTransaccion = idTransaccion;
       this.referencia = referencia;
       this.nombreCliente = nombreCliente;
       this.numeroTarjeta = numeroTarjeta;
       this.mesExpiracion = mesExpiracion;
       this.anioExpiracion = anioExpiracion;
       this.codigoSeguridad = codigoSeguridad;
       this.monto = monto;
       this.banResultado = banResultado;
       this.banNumeroAutorizacion = banNumeroAutorizacion;
       this.banFolioCpagos = banFolioCpagos;
       this.banCdError = banCdError;
       this.banError = banError;
       this.banCdRespuesta = banCdRespuesta;
       this.creadoPor = creadoPor;
       this.fechaCreacion = fechaCreacion;
       this.modificadoPor = modificadoPor;
       this.fechaModificacion = fechaModificacion;
       this.solicitudXml = solicitudXml;
       this.respuestaXml = respuestaXml;
    }
   
    public long getIdBitacora() {
        return this.idBitacora;
    }
    
    public void setIdBitacora(long idBitacora) {
        this.idBitacora = idBitacora;
    }
    public MpmCrespuestasCargos getMpmCrespuestasCargos() {
        return this.mpmCrespuestasCargos;
    }
    
    public void setMpmCrespuestasCargos(MpmCrespuestasCargos mpmCrespuestasCargos) {
        this.mpmCrespuestasCargos = mpmCrespuestasCargos;
    }
    public MpmCestados getMpmCestados() {
        return this.mpmCestados;
    }
    
    public void setMpmCestados(MpmCestados mpmCestados) {
        this.mpmCestados = mpmCestados;
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
    public String getNombreCliente() {
        return this.nombreCliente;
    }
    
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
    public String getNumeroTarjeta() {
        return this.numeroTarjeta;
    }
    
    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }
    public String getMesExpiracion() {
        return this.mesExpiracion;
    }
    
    public void setMesExpiracion(String mesExpiracion) {
        this.mesExpiracion = mesExpiracion;
    }
    public String getAnioExpiracion() {
        return this.anioExpiracion;
    }
    
    public void setAnioExpiracion(String anioExpiracion) {
        this.anioExpiracion = anioExpiracion;
    }
    public String getCodigoSeguridad() {
        return this.codigoSeguridad;
    }
    
    public void setCodigoSeguridad(String codigoSeguridad) {
        this.codigoSeguridad = codigoSeguridad;
    }
    public BigDecimal getMonto() {
        return this.monto;
    }
    
    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }
    public String getBanResultado() {
        return this.banResultado;
    }
    
    public void setBanResultado(String banResultado) {
        this.banResultado = banResultado;
    }
    public String getBanNumeroAutorizacion() {
        return this.banNumeroAutorizacion;
    }
    
    public void setBanNumeroAutorizacion(String banNumeroAutorizacion) {
        this.banNumeroAutorizacion = banNumeroAutorizacion;
    }
    public String getBanFolioCpagos() {
        return this.banFolioCpagos;
    }
    
    public void setBanFolioCpagos(String banFolioCpagos) {
        this.banFolioCpagos = banFolioCpagos;
    }
    public String getBanCdError() {
        return this.banCdError;
    }
    
    public void setBanCdError(String banCdError) {
        this.banCdError = banCdError;
    }
    public String getBanError() {
        return this.banError;
    }
    
    public void setBanError(String banError) {
        this.banError = banError;
    }
    public String getBanCdRespuesta() {
        return this.banCdRespuesta;
    }
    
    public void setBanCdRespuesta(String banCdRespuesta) {
        this.banCdRespuesta = banCdRespuesta;
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
     * @return the solicitudXml
     */
    public String getSolicitudXml() {
        return solicitudXml;
    }

    /**
     * @param solicitudXml the solicitudXml to set
     */
    public void setSolicitudXml(String solicitudXml) {
        this.solicitudXml = solicitudXml;
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




}


