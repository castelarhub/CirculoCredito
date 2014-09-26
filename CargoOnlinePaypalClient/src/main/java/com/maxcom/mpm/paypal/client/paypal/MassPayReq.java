
package com.maxcom.mpm.paypal.client.paypal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ebay:api:PayPalAPI}MassPayRequest"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "massPayRequest"
})
@XmlRootElement(name = "MassPayReq", namespace = "urn:ebay:api:PayPalAPI")
public class MassPayReq {

    @XmlElement(name = "MassPayRequest", namespace = "urn:ebay:api:PayPalAPI", required = true)
    protected MassPayRequestType massPayRequest;

    /**
     * Gets the value of the massPayRequest property.
     * 
     * @return
     *     possible object is
     *     {@link MassPayRequestType }
     *     
     */
    public MassPayRequestType getMassPayRequest() {
        return massPayRequest;
    }

    /**
     * Sets the value of the massPayRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link MassPayRequestType }
     *     
     */
    public void setMassPayRequest(MassPayRequestType value) {
        this.massPayRequest = value;
    }

}
