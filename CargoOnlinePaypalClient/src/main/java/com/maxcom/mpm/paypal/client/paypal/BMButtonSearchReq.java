
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
 *         &lt;element ref="{urn:ebay:api:PayPalAPI}BMButtonSearchRequest"/>
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
    "bmButtonSearchRequest"
})
@XmlRootElement(name = "BMButtonSearchReq", namespace = "urn:ebay:api:PayPalAPI")
public class BMButtonSearchReq {

    @XmlElement(name = "BMButtonSearchRequest", namespace = "urn:ebay:api:PayPalAPI", required = true)
    protected BMButtonSearchRequestType bmButtonSearchRequest;

    /**
     * Gets the value of the bmButtonSearchRequest property.
     * 
     * @return
     *     possible object is
     *     {@link BMButtonSearchRequestType }
     *     
     */
    public BMButtonSearchRequestType getBMButtonSearchRequest() {
        return bmButtonSearchRequest;
    }

    /**
     * Sets the value of the bmButtonSearchRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link BMButtonSearchRequestType }
     *     
     */
    public void setBMButtonSearchRequest(BMButtonSearchRequestType value) {
        this.bmButtonSearchRequest = value;
    }

}
