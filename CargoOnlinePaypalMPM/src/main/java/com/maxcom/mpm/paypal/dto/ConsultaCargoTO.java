/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.maxcom.mpm.paypal.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultaCargo")
public class ConsultaCargoTO {
    @XmlElement(required=true)
    private String referencia;
    @XmlElement(required=true)
    private String fechaCargo;    

    /**
     * @return the referencia
     */
    public String getReferencia() {
        return referencia;
    }

    /**
     * @param referencia the referencia to set
     */
    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    /**
     * @return the fechaCargo
     */
    public String getFechaCargo() {
        return fechaCargo;
    }

    /**
     * @param fechaCargo the fechaCargo to set
     */
    public void setFechaCargo(String fechaCargo) {
        this.fechaCargo = fechaCargo;
    }
    
}
