package com.maxcom.mpm.consulta.client.mapping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="transaccion")
@XmlAccessorType(XmlAccessType.FIELD)
public class TransaccionCargoAutomaticoViejo {
    private String nu_operaion;
    private String cd_usuario;
    private String cd_empresa;
    private String nu_sucursal;
    private String nu_afiliacion;
    private String nb_referencia;
    private String cc_nombre;
    private String cc_num;
    private String cc_tp;
    private String nu_importe;
    private String cd_tipopago;
    private String cd_tipocobro;
    private String cd_instrumento;
    private String nb_response;
    private String nu_auth;
    private String fh_registro;
    private String fh_bank;
    private String cd_usrtransaccion;
    private String tp_operacion;
    private String nb_currency;
    private String cd_resp;
    private String nb_resp;

    public TransaccionCargoAutomaticoViejo(){
    }
    
    public TransaccionCargoAutomaticoViejo(String nu_operaion, String cd_usuario, String cd_empresa, String nu_sucursal, String nu_afiliacion, String nb_referencia, String cc_nombre, String cc_num, String cc_tp, String nu_importe, String cd_tipopago, String cd_tipocobro, String cd_instrumento, String nb_response, String nu_auth, String fh_registro, String fh_bank, String cd_usrtransaccion, String tp_operacion, String nb_currency, String cd_resp, String nb_resp) {
        this.nu_operaion = nu_operaion;
        this.cd_usuario = cd_usuario;
        this.cd_empresa = cd_empresa;
        this.nu_sucursal = nu_sucursal;
        this.nu_afiliacion = nu_afiliacion;
        this.nb_referencia = nb_referencia;
        this.cc_nombre = cc_nombre;
        this.cc_num = cc_num;
        this.cc_tp = cc_tp;
        this.nu_importe = nu_importe;
        this.cd_tipopago = cd_tipopago;
        this.cd_tipocobro = cd_tipocobro;
        this.cd_instrumento = cd_instrumento;
        this.nb_response = nb_response;
        this.nu_auth = nu_auth;
        this.fh_registro = fh_registro;
        this.fh_bank = fh_bank;
        this.cd_usrtransaccion = cd_usrtransaccion;
        this.tp_operacion = tp_operacion;
        this.nb_currency = nb_currency;
        this.cd_resp = cd_resp;
        this.nb_resp = nb_resp;
    }

    
    
    /**
     * @return the nu_operaion
     */
    public String getNu_operaion() {
        return nu_operaion;
    }

    /**
     * @param nu_operaion the nu_operaion to set
     */
    public void setNu_operaion(String nu_operaion) {
        this.nu_operaion = nu_operaion;
    }

    /**
     * @return the cd_usuario
     */
    public String getCd_usuario() {
        return cd_usuario;
    }

    /**
     * @param cd_usuario the cd_usuario to set
     */
    public void setCd_usuario(String cd_usuario) {
        this.cd_usuario = cd_usuario;
    }

    /**
     * @return the cd_empresa
     */
    public String getCd_empresa() {
        return cd_empresa;
    }

    /**
     * @param cd_empresa the cd_empresa to set
     */
    public void setCd_empresa(String cd_empresa) {
        this.cd_empresa = cd_empresa;
    }

    /**
     * @return the nu_sucursal
     */
    public String getNu_sucursal() {
        return nu_sucursal;
    }

    /**
     * @param nu_sucursal the nu_sucursal to set
     */
    public void setNu_sucursal(String nu_sucursal) {
        this.nu_sucursal = nu_sucursal;
    }

    /**
     * @return the nu_afiliacion
     */
    public String getNu_afiliacion() {
        return nu_afiliacion;
    }

    /**
     * @param nu_afiliacion the nu_afiliacion to set
     */
    public void setNu_afiliacion(String nu_afiliacion) {
        this.nu_afiliacion = nu_afiliacion;
    }

    /**
     * @return the nb_referencia
     */
    public String getNb_referencia() {
        return nb_referencia;
    }

    /**
     * @param nb_referencia the nb_referencia to set
     */
    public void setNb_referencia(String nb_referencia) {
        this.nb_referencia = nb_referencia;
    }

    /**
     * @return the cc_nombre
     */
    public String getCc_nombre() {
        return cc_nombre;
    }

    /**
     * @param cc_nombre the cc_nombre to set
     */
    public void setCc_nombre(String cc_nombre) {
        this.cc_nombre = cc_nombre;
    }

    /**
     * @return the cc_num
     */
    public String getCc_num() {
        return cc_num;
    }

    /**
     * @param cc_num the cc_num to set
     */
    public void setCc_num(String cc_num) {
        this.cc_num = cc_num;
    }

    /**
     * @return the cc_tp
     */
    public String getCc_tp() {
        return cc_tp;
    }

    /**
     * @param cc_tp the cc_tp to set
     */
    public void setCc_tp(String cc_tp) {
        this.cc_tp = cc_tp;
    }

    /**
     * @return the nu_importe
     */
    public String getNu_importe() {
        return nu_importe;
    }

    /**
     * @param nu_importe the nu_importe to set
     */
    public void setNu_importe(String nu_importe) {
        this.nu_importe = nu_importe;
    }

    /**
     * @return the cd_tipopago
     */
    public String getCd_tipopago() {
        return cd_tipopago;
    }

    /**
     * @param cd_tipopago the cd_tipopago to set
     */
    public void setCd_tipopago(String cd_tipopago) {
        this.cd_tipopago = cd_tipopago;
    }

    /**
     * @return the cd_tipocobro
     */
    public String getCd_tipocobro() {
        return cd_tipocobro;
    }

    /**
     * @param cd_tipocobro the cd_tipocobro to set
     */
    public void setCd_tipocobro(String cd_tipocobro) {
        this.cd_tipocobro = cd_tipocobro;
    }

    /**
     * @return the cd_instrumento
     */
    public String getCd_instrumento() {
        return cd_instrumento;
    }

    /**
     * @param cd_instrumento the cd_instrumento to set
     */
    public void setCd_instrumento(String cd_instrumento) {
        this.cd_instrumento = cd_instrumento;
    }

    /**
     * @return the nb_response
     */
    public String getNb_response() {
        return nb_response;
    }

    /**
     * @param nb_response the nb_response to set
     */
    public void setNb_response(String nb_response) {
        this.nb_response = nb_response;
    }

    /**
     * @return the nu_auth
     */
    public String getNu_auth() {
        return nu_auth;
    }

    /**
     * @param nu_auth the nu_auth to set
     */
    public void setNu_auth(String nu_auth) {
        this.nu_auth = nu_auth;
    }

    /**
     * @return the fh_registro
     */
    public String getFh_registro() {
        return fh_registro;
    }

    /**
     * @param fh_registro the fh_registro to set
     */
    public void setFh_registro(String fh_registro) {
        this.fh_registro = fh_registro;
    }

    /**
     * @return the fh_bank
     */
    public String getFh_bank() {
        return fh_bank;
    }

    /**
     * @param fh_bank the fh_bank to set
     */
    public void setFh_bank(String fh_bank) {
        this.fh_bank = fh_bank;
    }

    /**
     * @return the cd_usrtransaccion
     */
    public String getCd_usrtransaccion() {
        return cd_usrtransaccion;
    }

    /**
     * @param cd_usrtransaccion the cd_usrtransaccion to set
     */
    public void setCd_usrtransaccion(String cd_usrtransaccion) {
        this.cd_usrtransaccion = cd_usrtransaccion;
    }

    /**
     * @return the tp_operacion
     */
    public String getTp_operacion() {
        return tp_operacion;
    }

    /**
     * @param tp_operacion the tp_operacion to set
     */
    public void setTp_operacion(String tp_operacion) {
        this.tp_operacion = tp_operacion;
    }

    /**
     * @return the nb_currency
     */
    public String getNb_currency() {
        return nb_currency;
    }

    /**
     * @param nb_currency the nb_currency to set
     */
    public void setNb_currency(String nb_currency) {
        this.nb_currency = nb_currency;
    }

    /**
     * @return the cd_resp
     */
    public String getCd_resp() {
        return cd_resp;
    }

    /**
     * @param cd_resp the cd_resp to set
     */
    public void setCd_resp(String cd_resp) {
        this.cd_resp = cd_resp;
    }

    /**
     * @return the nb_resp
     */
    public String getNb_resp() {
        return nb_resp;
    }

    /**
     * @param nb_resp the nb_resp to set
     */
    public void setNb_resp(String nb_resp) {
        this.nb_resp = nb_resp;
    }    
}
