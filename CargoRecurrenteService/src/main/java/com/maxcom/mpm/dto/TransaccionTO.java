/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.maxcom.mpm.dto;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author operador
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Transaccion")
public class TransaccionTO {
    
    @XmlElement(required=true)
    private String idSAP;
    @XmlElement(required=true)
    private List<CargoTO> cargos;
    @XmlElement(required=true)
    private AutenticacionTO autenticacion;
   
    @XmlTransient
    private long idOrden;    

    /**
     * @return the idSAP
     */
    public String getIdSAP() {
        return idSAP;
    }

    /**
     * @param idSAP the idSAP to set
     */
    public void setIdSAP(String idSAP) {
        this.idSAP = idSAP;
    }

    /**
     * @return the cargos
     */
    public List<CargoTO> getCargos() {
        return cargos;
    }

    /**
     * @param cargos the cargos to set
     */
    public void setCargos(List<CargoTO> cargos) {
        this.cargos = cargos;
    }

    /**
     * @return the autenticacion
     */
    public AutenticacionTO getAutenticacion() {
        return autenticacion;
    }

    /**
     * @param autenticacion the autenticacion to set
     */
    public void setAutenticacion(AutenticacionTO autenticacion) {
        this.autenticacion = autenticacion;
    }    

    /**
     * @return the idOrden
     */
    public long getIdOrden() {
        return idOrden;
    }

    /**
     * @param idOrden the idOrden to set
     */
    public void setIdOrden(long idOrden) {
        this.idOrden = idOrden;
    }
    
}
