
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
 *         &lt;element ref="{urn:ebay:api:PayPalAPI}SetCustomerBillingAgreementRequest"/>
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
    "setCustomerBillingAgreementRequest"
})
@XmlRootElement(name = "SetCustomerBillingAgreementReq", namespace = "urn:ebay:api:PayPalAPI")
public class SetCustomerBillingAgreementReq {

    @XmlElement(name = "SetCustomerBillingAgreementRequest", namespace = "urn:ebay:api:PayPalAPI", required = true)
    protected SetCustomerBillingAgreementRequestType setCustomerBillingAgreementRequest;

    /**
     * Gets the value of the setCustomerBillingAgreementRequest property.
     * 
     * @return
     *     possible object is
     *     {@link SetCustomerBillingAgreementRequestType }
     *     
     */
    public SetCustomerBillingAgreementRequestType getSetCustomerBillingAgreementRequest() {
        return setCustomerBillingAgreementRequest;
    }

    /**
     * Sets the value of the setCustomerBillingAgreementRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetCustomerBillingAgreementRequestType }
     *     
     */
    public void setSetCustomerBillingAgreementRequest(SetCustomerBillingAgreementRequestType value) {
        this.setCustomerBillingAgreementRequest = value;
    }

}
