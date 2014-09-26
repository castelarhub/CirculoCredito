
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
 *         &lt;element ref="{urn:ebay:api:PayPalAPI}CreateMobilePaymentRequest"/>
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
    "createMobilePaymentRequest"
})
@XmlRootElement(name = "CreateMobilePaymentReq", namespace = "urn:ebay:api:PayPalAPI")
public class CreateMobilePaymentReq {

    @XmlElement(name = "CreateMobilePaymentRequest", namespace = "urn:ebay:api:PayPalAPI", required = true)
    protected CreateMobilePaymentRequestType createMobilePaymentRequest;

    /**
     * Gets the value of the createMobilePaymentRequest property.
     * 
     * @return
     *     possible object is
     *     {@link CreateMobilePaymentRequestType }
     *     
     */
    public CreateMobilePaymentRequestType getCreateMobilePaymentRequest() {
        return createMobilePaymentRequest;
    }

    /**
     * Sets the value of the createMobilePaymentRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateMobilePaymentRequestType }
     *     
     */
    public void setCreateMobilePaymentRequest(CreateMobilePaymentRequestType value) {
        this.createMobilePaymentRequest = value;
    }

}
