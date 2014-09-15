package com.maxcom.mpm.client.mapping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="VMCAMEXM")
@XmlAccessorType(XmlAccessType.FIELD)
public class Payment {
    
    @XmlElement(name="business")
    private Business negocio;
    
    @XmlElement(name="transacction")
    private Transacction transaccion;

    /**
     * @return the negocio
     */
    public Business getNegocio() {
        return negocio;
    }

    /**
     * @param negocio the negocio to set
     */
    public void setNegocio(Business negocio) {
        this.negocio = negocio;
    }

    /**
     * @return the transaccion
     */
    public Transacction getTransaccion() {
        return transaccion;
    }

    /**
     * @param transaccion the transaccion to set
     */
    public void setTransaccion(Transacction transaccion) {
        this.transaccion = transaccion;
    }

    
}
