package com.maxcom.mpm.consulta.client.mapping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="respuestaMIT")
@XmlAccessorType(XmlAccessType.FIELD)
public class RespuestaMIT {
    
    @XmlElement(name="transacciones")
    private Transacciones transacciones;
    @XmlElement(name="transaccionesCautM")
    private TransaccionesCargoAutomaticoViejo transaccionesCargoAutomaticoViejo;
    
    public RespuestaMIT(){        
    }    

    /**
     * @return the transacciones
     */
    public Transacciones getTransacciones() {
        return transacciones;
    }

    /**
     * @param transacciones the transacciones to set
     */
    public void setTransacciones(Transacciones transacciones) {
        this.transacciones = transacciones;
    }

    /**
     * @return the transaccionesCargoAutomaticoViejo
     */
    public TransaccionesCargoAutomaticoViejo getTransaccionesCargoAutomaticoViejo() {
        return transaccionesCargoAutomaticoViejo;
    }

    /**
     * @param transaccionesCargoAutomaticoViejo the transaccionesCargoAutomaticoViejo to set
     */
    public void setTransaccionesCargoAutomaticoViejo(TransaccionesCargoAutomaticoViejo transaccionesCargoAutomaticoViejo) {
        this.transaccionesCargoAutomaticoViejo = transaccionesCargoAutomaticoViejo;
    }
    

}
