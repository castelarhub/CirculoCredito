
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
 *         &lt;element ref="{urn:ebay:api:PayPalAPI}GetRecurringPaymentsProfileDetailsRequest"/>
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
    "getRecurringPaymentsProfileDetailsRequest"
})
@XmlRootElement(name = "GetRecurringPaymentsProfileDetailsReq", namespace = "urn:ebay:api:PayPalAPI")
public class GetRecurringPaymentsProfileDetailsReq {

    @XmlElement(name = "GetRecurringPaymentsProfileDetailsRequest", namespace = "urn:ebay:api:PayPalAPI", required = true)
    protected GetRecurringPaymentsProfileDetailsRequestType getRecurringPaymentsProfileDetailsRequest;

    /**
     * Gets the value of the getRecurringPaymentsProfileDetailsRequest property.
     * 
     * @return
     *     possible object is
     *     {@link GetRecurringPaymentsProfileDetailsRequestType }
     *     
     */
    public GetRecurringPaymentsProfileDetailsRequestType getGetRecurringPaymentsProfileDetailsRequest() {
        return getRecurringPaymentsProfileDetailsRequest;
    }

    /**
     * Sets the value of the getRecurringPaymentsProfileDetailsRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetRecurringPaymentsProfileDetailsRequestType }
     *     
     */
    public void setGetRecurringPaymentsProfileDetailsRequest(GetRecurringPaymentsProfileDetailsRequestType value) {
        this.getRecurringPaymentsProfileDetailsRequest = value;
    }

}
