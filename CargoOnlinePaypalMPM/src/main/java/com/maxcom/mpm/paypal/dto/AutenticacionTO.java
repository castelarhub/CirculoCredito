package com.maxcom.mpm.paypal.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Nelson C.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Autenticacion")
public class AutenticacionTO {
    
    @XmlElement(required=true)
    private String usuario;
    @XmlElement(required=true)
    private String contrasenia;
    @XmlElement(required=true)
    private String claveServicio;    

    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the contrasenia
     */
    public String getContrasenia() {
        return contrasenia;
    }

    /**
     * @param contrasenia the contrasenia to set
     */
    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    /**
     * @return the claveServicio
     */
    public String getClaveServicio() {
        return claveServicio;
    }

    /**
     * @param claveServicio the claveServicio to set
     */
    public void setClaveServicio(String claveServicio) {
        this.claveServicio = claveServicio;
    }
    
}
