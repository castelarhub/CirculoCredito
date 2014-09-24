package com.maxcom.mpm.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultaTransaccion")
public class ConsultaTransaccionTO {
    @XmlElement(required=true)
    private ConsultaCargoTO cargo;
    @XmlElement(required=true)
    private AutenticacionTO autenticacion;
    
    @XmlTransient
    private long idOrden;    

    /**
     * @return the cargo
     */
    public ConsultaCargoTO getCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(ConsultaCargoTO cargo) {
        this.cargo = cargo;
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
