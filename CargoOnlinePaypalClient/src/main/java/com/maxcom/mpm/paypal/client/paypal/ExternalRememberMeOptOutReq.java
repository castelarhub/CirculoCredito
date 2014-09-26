
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
 *         &lt;element ref="{urn:ebay:api:PayPalAPI}ExternalRememberMeOptOutRequest"/>
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
    "externalRememberMeOptOutRequest"
})
@XmlRootElement(name = "ExternalRememberMeOptOutReq", namespace = "urn:ebay:api:PayPalAPI")
public class ExternalRememberMeOptOutReq {

    @XmlElement(name = "ExternalRememberMeOptOutRequest", namespace = "urn:ebay:api:PayPalAPI", required = true)
    protected ExternalRememberMeOptOutRequestType externalRememberMeOptOutRequest;

    /**
     * Gets the value of the externalRememberMeOptOutRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalRememberMeOptOutRequestType }
     *     
     */
    public ExternalRememberMeOptOutRequestType getExternalRememberMeOptOutRequest() {
        return externalRememberMeOptOutRequest;
    }

    /**
     * Sets the value of the externalRememberMeOptOutRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalRememberMeOptOutRequestType }
     *     
     */
    public void setExternalRememberMeOptOutRequest(ExternalRememberMeOptOutRequestType value) {
        this.externalRememberMeOptOutRequest = value;
    }

}
