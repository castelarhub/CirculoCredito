
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
 *         &lt;element ref="{urn:ebay:api:PayPalAPI}DoUATPAuthorizationRequest"/>
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
    "doUATPAuthorizationRequest"
})
@XmlRootElement(name = "DoUATPAuthorizationReq", namespace = "urn:ebay:api:PayPalAPI")
public class DoUATPAuthorizationReq {

    @XmlElement(name = "DoUATPAuthorizationRequest", namespace = "urn:ebay:api:PayPalAPI", required = true)
    protected DoUATPAuthorizationRequestType doUATPAuthorizationRequest;

    /**
     * Gets the value of the doUATPAuthorizationRequest property.
     * 
     * @return
     *     possible object is
     *     {@link DoUATPAuthorizationRequestType }
     *     
     */
    public DoUATPAuthorizationRequestType getDoUATPAuthorizationRequest() {
        return doUATPAuthorizationRequest;
    }

    /**
     * Sets the value of the doUATPAuthorizationRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link DoUATPAuthorizationRequestType }
     *     
     */
    public void setDoUATPAuthorizationRequest(DoUATPAuthorizationRequestType value) {
        this.doUATPAuthorizationRequest = value;
    }

}
