package com.maxcom.mpm.paypal.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Transaccion")
public class TransaccionTO {
    
    @XmlElement(required=true)
    private AutenticacionTO autenticacion;
    
    @XmlElement(required=true)
    private String idTransaccion;
   
    @XmlTransient
    private long idOrden;
    
    /**
     * @return the idTransaccion
     */
    public String getIdTransaccion() {
        return idTransaccion;
    }

    /**
     * @param idTransaccion the idTransaccion to set
     */
    public void setIdTransaccion(String idTransaccion) {
        this.idTransaccion = idTransaccion;
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
