package com.maxcom.mpm.paypal.dto;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransaccionSolicitud")
public class TransaccionSolicitudTO extends TransaccionTO{
    @XmlElement(required=true)
    private String referencia;
    
    @XmlElement(required=true)
    private List<CargoTO> cargos;        
    @XmlElement(required=true)
    private String returnUrl;
    @XmlElement(required=true)
    private String cancelUrl;
    @XmlElement(required=true)
    private boolean referenciarPago;

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
     * @return the returnUrl
     */
    public String getReturnUrl() {
        return returnUrl;
    }

    /**
     * @param returnUrl the returnUrl to set
     */
    public void setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
    }

    /**
     * @return the cancelUrl
     */
    public String getCancelUrl() {
        return cancelUrl;
    }

    /**
     * @param cancelUrl the cancelUrl to set
     */
    public void setCancelUrl(String cancelUrl) {
        this.cancelUrl = cancelUrl;
    }

    /**
     * @return the referenciarPago
     */
    public boolean isReferenciarPago() {
        return referenciarPago;
    }

    /**
     * @param referenciarPago the referenciarPago to set
     */
    public void setReferenciarPago(boolean referenciarPago) {
        this.referenciarPago = referenciarPago;
    }
}
