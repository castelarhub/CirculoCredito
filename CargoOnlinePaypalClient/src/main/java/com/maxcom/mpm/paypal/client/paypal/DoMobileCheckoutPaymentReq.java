
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
 *         &lt;element ref="{urn:ebay:api:PayPalAPI}DoMobileCheckoutPaymentRequest"/>
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
    "doMobileCheckoutPaymentRequest"
})
@XmlRootElement(name = "DoMobileCheckoutPaymentReq", namespace = "urn:ebay:api:PayPalAPI")
public class DoMobileCheckoutPaymentReq {

    @XmlElement(name = "DoMobileCheckoutPaymentRequest", namespace = "urn:ebay:api:PayPalAPI", required = true)
    protected DoMobileCheckoutPaymentRequestType doMobileCheckoutPaymentRequest;

    /**
     * Gets the value of the doMobileCheckoutPaymentRequest property.
     * 
     * @return
     *     possible object is
     *     {@link DoMobileCheckoutPaymentRequestType }
     *     
     */
    public DoMobileCheckoutPaymentRequestType getDoMobileCheckoutPaymentRequest() {
        return doMobileCheckoutPaymentRequest;
    }

    /**
     * Sets the value of the doMobileCheckoutPaymentRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link DoMobileCheckoutPaymentRequestType }
     *     
     */
    public void setDoMobileCheckoutPaymentRequest(DoMobileCheckoutPaymentRequestType value) {
        this.doMobileCheckoutPaymentRequest = value;
    }

}
