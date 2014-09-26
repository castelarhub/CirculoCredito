
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
 *         &lt;element ref="{urn:ebay:api:PayPalAPI}CancelRecoupRequest"/>
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
    "cancelRecoupRequest"
})
@XmlRootElement(name = "CancelRecoupReq", namespace = "urn:ebay:api:PayPalAPI")
public class CancelRecoupReq {

    @XmlElement(name = "CancelRecoupRequest", namespace = "urn:ebay:api:PayPalAPI", required = true)
    protected CancelRecoupRequestType cancelRecoupRequest;

    /**
     * Gets the value of the cancelRecoupRequest property.
     * 
     * @return
     *     possible object is
     *     {@link CancelRecoupRequestType }
     *     
     */
    public CancelRecoupRequestType getCancelRecoupRequest() {
        return cancelRecoupRequest;
    }

    /**
     * Sets the value of the cancelRecoupRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelRecoupRequestType }
     *     
     */
    public void setCancelRecoupRequest(CancelRecoupRequestType value) {
        this.cancelRecoupRequest = value;
    }

}
