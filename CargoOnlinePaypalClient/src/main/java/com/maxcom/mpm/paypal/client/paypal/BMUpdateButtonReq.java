
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
 *         &lt;element ref="{urn:ebay:api:PayPalAPI}BMUpdateButtonRequest"/>
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
    "bmUpdateButtonRequest"
})
@XmlRootElement(name = "BMUpdateButtonReq", namespace = "urn:ebay:api:PayPalAPI")
public class BMUpdateButtonReq {

    @XmlElement(name = "BMUpdateButtonRequest", namespace = "urn:ebay:api:PayPalAPI", required = true)
    protected BMUpdateButtonRequestType bmUpdateButtonRequest;

    /**
     * Gets the value of the bmUpdateButtonRequest property.
     * 
     * @return
     *     possible object is
     *     {@link BMUpdateButtonRequestType }
     *     
     */
    public BMUpdateButtonRequestType getBMUpdateButtonRequest() {
        return bmUpdateButtonRequest;
    }

    /**
     * Sets the value of the bmUpdateButtonRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link BMUpdateButtonRequestType }
     *     
     */
    public void setBMUpdateButtonRequest(BMUpdateButtonRequestType value) {
        this.bmUpdateButtonRequest = value;
    }

}
