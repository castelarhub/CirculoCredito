package com.maxcom.mpm.consulta.client.mapping;

import java.util.Set;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class TransaccionesCargoAutomaticoViejo {
    @XmlElement(name="transaccion")
    private Set <TransaccionCargoAutomaticoViejo> transacciones;    

    /**
     * @return the transacciones
     */
    public Set <TransaccionCargoAutomaticoViejo> getTransacciones() {
        return transacciones;
    }

    /**
     * @param transacciones the transacciones to set
     */
    public void setTransacciones(Set <TransaccionCargoAutomaticoViejo> transacciones) {
        this.transacciones = transacciones;
    }
    
}
