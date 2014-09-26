
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
 *         &lt;element ref="{urn:ebay:api:PayPalAPI}InitiateRecoupRequest"/>
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
    "initiateRecoupRequest"
})
@XmlRootElement(name = "InitiateRecoupReq", namespace = "urn:ebay:api:PayPalAPI")
public class InitiateRecoupReq {

    @XmlElement(name = "InitiateRecoupRequest", namespace = "urn:ebay:api:PayPalAPI", required = true)
    protected InitiateRecoupRequestType initiateRecoupRequest;

    /**
     * Gets the value of the initiateRecoupRequest property.
     * 
     * @return
     *     possible object is
     *     {@link InitiateRecoupRequestType }
     *     
     */
    public InitiateRecoupRequestType getInitiateRecoupRequest() {
        return initiateRecoupRequest;
    }

    /**
     * Sets the value of the initiateRecoupRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link InitiateRecoupRequestType }
     *     
     */
    public void setInitiateRecoupRequest(InitiateRecoupRequestType value) {
        this.initiateRecoupRequest = value;
    }

}
