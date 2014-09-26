
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
 *         &lt;element ref="{urn:ebay:api:PayPalAPI}ReverseTransactionRequest"/>
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
    "reverseTransactionRequest"
})
@XmlRootElement(name = "ReverseTransactionReq", namespace = "urn:ebay:api:PayPalAPI")
public class ReverseTransactionReq {

    @XmlElement(name = "ReverseTransactionRequest", namespace = "urn:ebay:api:PayPalAPI", required = true)
    protected ReverseTransactionRequestType reverseTransactionRequest;

    /**
     * Gets the value of the reverseTransactionRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ReverseTransactionRequestType }
     *     
     */
    public ReverseTransactionRequestType getReverseTransactionRequest() {
        return reverseTransactionRequest;
    }

    /**
     * Sets the value of the reverseTransactionRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReverseTransactionRequestType }
     *     
     */
    public void setReverseTransactionRequest(ReverseTransactionRequestType value) {
        this.reverseTransactionRequest = value;
    }

}
