package com.maxcom.mpm.model;
// Generated 05-sep-2014 15:58:10 by Hibernate Tools 3.6.0

import java.math.BigDecimal;
import java.util.Date;

/**
 * MpmTcobranzaSapDeta generated by hbm2java
 */
public class MpmTcobranzaSapDeta implements java.io.Serializable {

    private long idCobranzadeta;
    private MpmCtiposCuentas mpmCtiposCuentas;
    private MpmCrespuestasCargos mpmCrespuestasCargos;
    private MpmTcobranzaSap mpmTcobranzaSap;
    private MpmCmarcasTarjetas mpmCmarcasTarjetas;
    private MpmCestados mpmCestados;
    private MpmTlotesCargoAutomatico mpmTlotesCargoAutomatico;
    private String referencia;
    private String nombreCliente;
    private String cuenta;
    private BigDecimal importe;
    private String email;
    private boolean entidadFinanciera;
    private String creadoPor;
    private Date fechaCreacion;
    private String sistema;
    private String modificadoPor;
    private Date fechaModificacion;
    private Date fechaRespuesta;
    private Date fechaNotificacion;
    private String acuseSap;
    //Auxiliar
    private long idUniqueDetalle;

    public MpmTcobranzaSapDeta() {
    }

    public MpmTcobranzaSapDeta(long idCobranzadeta, MpmTcobranzaSap mpmTcobranzaSap, MpmCestados mpmCestados, boolean entidadFinanciera, String creadoPor, Date fechaCreacion, String sistema) {
        this.idCobranzadeta = idCobranzadeta;
        this.mpmTcobranzaSap = mpmTcobranzaSap;
        this.mpmCestados = mpmCestados;
        this.entidadFinanciera = entidadFinanciera;
        this.creadoPor = creadoPor;
        this.fechaCreacion = fechaCreacion;
        this.sistema = sistema;
    }

    public MpmTcobranzaSapDeta(long idCobranzadeta, MpmCtiposCuentas mpmCtiposCuentas, MpmCrespuestasCargos mpmCrespuestasCargos, MpmTcobranzaSap mpmTcobranzaSap, MpmCmarcasTarjetas mpmCmarcasTarjetas, MpmCestados mpmCestados, MpmTlotesCargoAutomatico mpmTlotesCargoAutomatico, String referencia, String nombreCliente, String cuenta, BigDecimal importe, String email, boolean entidadFinanciera, String creadoPor, Date fechaCreacion, String sistema, String modificadoPor, Date fechaModificacion, Date fechaRespuesta, Date fechaNotificacion, String acuseSap) {
        this.idCobranzadeta = idCobranzadeta;
        this.mpmCtiposCuentas = mpmCtiposCuentas;
        this.mpmCrespuestasCargos = mpmCrespuestasCargos;
        this.mpmTcobranzaSap = mpmTcobranzaSap;
        this.mpmCmarcasTarjetas = mpmCmarcasTarjetas;
        this.mpmCestados = mpmCestados;
        this.mpmTlotesCargoAutomatico = mpmTlotesCargoAutomatico;
        this.referencia = referencia;
        this.nombreCliente = nombreCliente;
        this.cuenta = cuenta;
        this.importe = importe;
        this.email = email;
        this.entidadFinanciera = entidadFinanciera;
        this.creadoPor = creadoPor;
        this.fechaCreacion = fechaCreacion;
        this.sistema = sistema;
        this.modificadoPor = modificadoPor;
        this.fechaModificacion = fechaModificacion;
        this.fechaRespuesta = fechaRespuesta;
        this.fechaNotificacion = fechaNotificacion;
        this.acuseSap = acuseSap;
    }

    public long getIdCobranzadeta() {
        return this.idCobranzadeta;
    }

    public void setIdCobranzadeta(long idCobranzadeta) {
        this.idCobranzadeta = idCobranzadeta;
    }

    public MpmCtiposCuentas getMpmCtiposCuentas() {
        return this.mpmCtiposCuentas;
    }

    public void setMpmCtiposCuentas(MpmCtiposCuentas mpmCtiposCuentas) {
        this.mpmCtiposCuentas = mpmCtiposCuentas;
    }

    public MpmCrespuestasCargos getMpmCrespuestasCargos() {
        return this.mpmCrespuestasCargos;
    }

    public void setMpmCrespuestasCargos(MpmCrespuestasCargos mpmCrespuestasCargos) {
        this.mpmCrespuestasCargos = mpmCrespuestasCargos;
    }

    public MpmTcobranzaSap getMpmTcobranzaSap() {
        return this.mpmTcobranzaSap;
    }

    public void setMpmTcobranzaSap(MpmTcobranzaSap mpmTcobranzaSap) {
        this.mpmTcobranzaSap = mpmTcobranzaSap;
    }

    public MpmCmarcasTarjetas getMpmCmarcasTarjetas() {
        return this.mpmCmarcasTarjetas;
    }

    public void setMpmCmarcasTarjetas(MpmCmarcasTarjetas mpmCmarcasTarjetas) {
        this.mpmCmarcasTarjetas = mpmCmarcasTarjetas;
    }

    public MpmCestados getMpmCestados() {
        return this.mpmCestados;
    }

    public void setMpmCestados(MpmCestados mpmCestados) {
        this.mpmCestados = mpmCestados;
    }

    public MpmTlotesCargoAutomatico getMpmTlotesCargoAutomatico() {
        return this.mpmTlotesCargoAutomatico;
    }

    public void setMpmTlotesCargoAutomatico(MpmTlotesCargoAutomatico mpmTlotesCargoAutomatico) {
        this.mpmTlotesCargoAutomatico = mpmTlotesCargoAutomatico;
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

    public String getCuenta() {
        return this.cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public BigDecimal getImporte() {
        return this.importe;
    }

    public void setImporte(BigDecimal importe) {
        this.importe = importe;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isEntidadFinanciera() {
        return this.entidadFinanciera;
    }

    public void setEntidadFinanciera(boolean entidadFinanciera) {
        this.entidadFinanciera = entidadFinanciera;
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

    public Date getFechaRespuesta() {
        return this.fechaRespuesta;
    }

    public void setFechaRespuesta(Date fechaRespuesta) {
        this.fechaRespuesta = fechaRespuesta;
    }

    public Date getFechaNotificacion() {
        return this.fechaNotificacion;
    }

    public void setFechaNotificacion(Date fechaNotificacion) {
        this.fechaNotificacion = fechaNotificacion;
    }

    public String getAcuseSap() {
        return this.acuseSap;
    }

    public void setAcuseSap(String acuseSap) {
        this.acuseSap = acuseSap;
    }

    /**
     * @return the idUniqueDetalle
     */
    public long getIdUniqueDetalle() {
        return idUniqueDetalle;
    }

    /**
     * @param idUniqueDetalle the idUniqueDetalle to set
     */
    public void setIdUniqueDetalle(long idUniqueDetalle) {
        this.idUniqueDetalle = idUniqueDetalle;
    }

}