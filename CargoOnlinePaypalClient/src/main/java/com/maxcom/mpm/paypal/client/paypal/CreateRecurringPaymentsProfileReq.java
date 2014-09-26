
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
 *         &lt;element ref="{urn:ebay:api:PayPalAPI}CreateRecurringPaymentsProfileRequest"/>
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
    "createRecurringPaymentsProfileRequest"
})
@XmlRootElement(name = "CreateRecurringPaymentsProfileReq", namespace = "urn:ebay:api:PayPalAPI")
public class CreateRecurringPaymentsProfileReq {

    @XmlElement(name = "CreateRecurringPaymentsProfileRequest", namespace = "urn:ebay:api:PayPalAPI", required = true)
    protected CreateRecurringPaymentsProfileRequestType createRecurringPaymentsProfileRequest;

    /**
     * Gets the value of the createRecurringPaymentsProfileRequest property.
     * 
     * @return
     *     possible object is
     *     {@link CreateRecurringPaymentsProfileRequestType }
     *     
     */
    public CreateRecurringPaymentsProfileRequestType getCreateRecurringPaymentsProfileRequest() {
        return createRecurringPaymentsProfileRequest;
    }

    /**
     * Sets the value of the createRecurringPaymentsProfileRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateRecurringPaymentsProfileRequestType }
     *     
     */
    public void setCreateRecurringPaymentsProfileRequest(CreateRecurringPaymentsProfileRequestType value) {
        this.createRecurringPaymentsProfileRequest = value;
    }

}
