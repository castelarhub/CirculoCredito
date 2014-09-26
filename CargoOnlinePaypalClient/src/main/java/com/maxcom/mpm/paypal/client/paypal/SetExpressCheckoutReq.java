
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
 *         &lt;element ref="{urn:ebay:api:PayPalAPI}SetExpressCheckoutRequest"/>
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
    "setExpressCheckoutRequest"
})
@XmlRootElement(name = "SetExpressCheckoutReq", namespace = "urn:ebay:api:PayPalAPI")
public class SetExpressCheckoutReq {

    @XmlElement(name = "SetExpressCheckoutRequest", namespace = "urn:ebay:api:PayPalAPI", required = true)
    protected SetExpressCheckoutRequestType setExpressCheckoutRequest;

    /**
     * Gets the value of the setExpressCheckoutRequest property.
     * 
     * @return
     *     possible object is
     *     {@link SetExpressCheckoutRequestType }
     *     
     */
    public SetExpressCheckoutRequestType getSetExpressCheckoutRequest() {
        return setExpressCheckoutRequest;
    }

    /**
     * Sets the value of the setExpressCheckoutRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetExpressCheckoutRequestType }
     *     
     */
    public void setSetExpressCheckoutRequest(SetExpressCheckoutRequestType value) {
        this.setExpressCheckoutRequest = value;
    }

}
