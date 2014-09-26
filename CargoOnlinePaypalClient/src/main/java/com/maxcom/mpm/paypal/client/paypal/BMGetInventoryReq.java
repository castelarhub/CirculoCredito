
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
 *         &lt;element ref="{urn:ebay:api:PayPalAPI}BMGetInventoryRequest"/>
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
    "bmGetInventoryRequest"
})
@XmlRootElement(name = "BMGetInventoryReq", namespace = "urn:ebay:api:PayPalAPI")
public class BMGetInventoryReq {

    @XmlElement(name = "BMGetInventoryRequest", namespace = "urn:ebay:api:PayPalAPI", required = true)
    protected BMGetInventoryRequestType bmGetInventoryRequest;

    /**
     * Gets the value of the bmGetInventoryRequest property.
     * 
     * @return
     *     possible object is
     *     {@link BMGetInventoryRequestType }
     *     
     */
    public BMGetInventoryRequestType getBMGetInventoryRequest() {
        return bmGetInventoryRequest;
    }

    /**
     * Sets the value of the bmGetInventoryRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link BMGetInventoryRequestType }
     *     
     */
    public void setBMGetInventoryRequest(BMGetInventoryRequestType value) {
        this.bmGetInventoryRequest = value;
    }

}
