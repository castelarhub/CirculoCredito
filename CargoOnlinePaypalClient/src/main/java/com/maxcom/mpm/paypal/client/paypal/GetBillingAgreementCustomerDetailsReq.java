
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
 *         &lt;element ref="{urn:ebay:api:PayPalAPI}GetBillingAgreementCustomerDetailsRequest"/>
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
    "getBillingAgreementCustomerDetailsRequest"
})
@XmlRootElement(name = "GetBillingAgreementCustomerDetailsReq", namespace = "urn:ebay:api:PayPalAPI")
public class GetBillingAgreementCustomerDetailsReq {

    @XmlElement(name = "GetBillingAgreementCustomerDetailsRequest", namespace = "urn:ebay:api:PayPalAPI", required = true)
    protected GetBillingAgreementCustomerDetailsRequestType getBillingAgreementCustomerDetailsRequest;

    /**
     * Gets the value of the getBillingAgreementCustomerDetailsRequest property.
     * 
     * @return
     *     possible object is
     *     {@link GetBillingAgreementCustomerDetailsRequestType }
     *     
     */
    public GetBillingAgreementCustomerDetailsRequestType getGetBillingAgreementCustomerDetailsRequest() {
        return getBillingAgreementCustomerDetailsRequest;
    }

    /**
     * Sets the value of the getBillingAgreementCustomerDetailsRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetBillingAgreementCustomerDetailsRequestType }
     *     
     */
    public void setGetBillingAgreementCustomerDetailsRequest(GetBillingAgreementCustomerDetailsRequestType value) {
        this.getBillingAgreementCustomerDetailsRequest = value;
    }

}
