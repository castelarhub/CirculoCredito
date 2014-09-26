
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
 *         &lt;element ref="{urn:ebay:api:PayPalAPI}GetTransactionDetailsRequest"/>
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
    "getTransactionDetailsRequest"
})
@XmlRootElement(name = "GetTransactionDetailsReq", namespace = "urn:ebay:api:PayPalAPI")
public class GetTransactionDetailsReq {

    @XmlElement(name = "GetTransactionDetailsRequest", namespace = "urn:ebay:api:PayPalAPI", required = true)
    protected GetTransactionDetailsRequestType getTransactionDetailsRequest;

    /**
     * Gets the value of the getTransactionDetailsRequest property.
     * 
     * @return
     *     possible object is
     *     {@link GetTransactionDetailsRequestType }
     *     
     */
    public GetTransactionDetailsRequestType getGetTransactionDetailsRequest() {
        return getTransactionDetailsRequest;
    }

    /**
     * Sets the value of the getTransactionDetailsRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetTransactionDetailsRequestType }
     *     
     */
    public void setGetTransactionDetailsRequest(GetTransactionDetailsRequestType value) {
        this.getTransactionDetailsRequest = value;
    }

}
