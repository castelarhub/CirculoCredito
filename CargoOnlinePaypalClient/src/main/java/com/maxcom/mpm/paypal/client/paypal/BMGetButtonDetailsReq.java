
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
 *         &lt;element ref="{urn:ebay:api:PayPalAPI}BMGetButtonDetailsRequest"/>
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
    "bmGetButtonDetailsRequest"
})
@XmlRootElement(name = "BMGetButtonDetailsReq", namespace = "urn:ebay:api:PayPalAPI")
public class BMGetButtonDetailsReq {

    @XmlElement(name = "BMGetButtonDetailsRequest", namespace = "urn:ebay:api:PayPalAPI", required = true)
    protected BMGetButtonDetailsRequestType bmGetButtonDetailsRequest;

    /**
     * Gets the value of the bmGetButtonDetailsRequest property.
     * 
     * @return
     *     possible object is
     *     {@link BMGetButtonDetailsRequestType }
     *     
     */
    public BMGetButtonDetailsRequestType getBMGetButtonDetailsRequest() {
        return bmGetButtonDetailsRequest;
    }

    /**
     * Sets the value of the bmGetButtonDetailsRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link BMGetButtonDetailsRequestType }
     *     
     */
    public void setBMGetButtonDetailsRequest(BMGetButtonDetailsRequestType value) {
        this.bmGetButtonDetailsRequest = value;
    }

}
