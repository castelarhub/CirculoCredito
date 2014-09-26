
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
 *         &lt;element ref="{urn:ebay:api:PayPalAPI}DoReauthorizationRequest"/>
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
    "doReauthorizationRequest"
})
@XmlRootElement(name = "DoReauthorizationReq", namespace = "urn:ebay:api:PayPalAPI")
public class DoReauthorizationReq {

    @XmlElement(name = "DoReauthorizationRequest", namespace = "urn:ebay:api:PayPalAPI", required = true)
    protected DoReauthorizationRequestType doReauthorizationRequest;

    /**
     * Gets the value of the doReauthorizationRequest property.
     * 
     * @return
     *     possible object is
     *     {@link DoReauthorizationRequestType }
     *     
     */
    public DoReauthorizationRequestType getDoReauthorizationRequest() {
        return doReauthorizationRequest;
    }

    /**
     * Sets the value of the doReauthorizationRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link DoReauthorizationRequestType }
     *     
     */
    public void setDoReauthorizationRequest(DoReauthorizationRequestType value) {
        this.doReauthorizationRequest = value;
    }

}
