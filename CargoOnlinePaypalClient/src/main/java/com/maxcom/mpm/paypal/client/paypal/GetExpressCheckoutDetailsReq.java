
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
 *         &lt;element ref="{urn:ebay:api:PayPalAPI}GetExpressCheckoutDetailsRequest"/>
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
    "getExpressCheckoutDetailsRequest"
})
@XmlRootElement(name = "GetExpressCheckoutDetailsReq", namespace = "urn:ebay:api:PayPalAPI")
public class GetExpressCheckoutDetailsReq {

    @XmlElement(name = "GetExpressCheckoutDetailsRequest", namespace = "urn:ebay:api:PayPalAPI", required = true)
    protected GetExpressCheckoutDetailsRequestType getExpressCheckoutDetailsRequest;

    /**
     * Gets the value of the getExpressCheckoutDetailsRequest property.
     * 
     * @return
     *     possible object is
     *     {@link GetExpressCheckoutDetailsRequestType }
     *     
     */
    public GetExpressCheckoutDetailsRequestType getGetExpressCheckoutDetailsRequest() {
        return getExpressCheckoutDetailsRequest;
    }

    /**
     * Sets the value of the getExpressCheckoutDetailsRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetExpressCheckoutDetailsRequestType }
     *     
     */
    public void setGetExpressCheckoutDetailsRequest(GetExpressCheckoutDetailsRequestType value) {
        this.getExpressCheckoutDetailsRequest = value;
    }

}
