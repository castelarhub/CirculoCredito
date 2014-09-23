package com.maxcom.mpm.consulta.client.mapping;

import java.util.Set;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Transacciones {
    @XmlElement(name="transaccion")
    private Set <Transaccion> transacciones;

    /**
     * @return the Transacciones
     */
    public Set <Transaccion> getTransacciones() {
        return transacciones;
    }

    /**
     * @param transacciones the Transacciones to set
     */
    public void setTransacciones(Set <Transaccion> transacciones) {
        this.transacciones = transacciones;
    }
}
