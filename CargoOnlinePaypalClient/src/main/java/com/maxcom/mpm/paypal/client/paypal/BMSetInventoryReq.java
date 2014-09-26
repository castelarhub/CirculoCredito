
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
 *         &lt;element ref="{urn:ebay:api:PayPalAPI}BMSetInventoryRequest"/>
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
    "bmSetInventoryRequest"
})
@XmlRootElement(name = "BMSetInventoryReq", namespace = "urn:ebay:api:PayPalAPI")
public class BMSetInventoryReq {

    @XmlElement(name = "BMSetInventoryRequest", namespace = "urn:ebay:api:PayPalAPI", required = true)
    protected BMSetInventoryRequestType bmSetInventoryRequest;

    /**
     * Gets the value of the bmSetInventoryRequest property.
     * 
     * @return
     *     possible object is
     *     {@link BMSetInventoryRequestType }
     *     
     */
    public BMSetInventoryRequestType getBMSetInventoryRequest() {
        return bmSetInventoryRequest;
    }

    /**
     * Sets the value of the bmSetInventoryRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link BMSetInventoryRequestType }
     *     
     */
    public void setBMSetInventoryRequest(BMSetInventoryRequestType value) {
        this.bmSetInventoryRequest = value;
    }

}
