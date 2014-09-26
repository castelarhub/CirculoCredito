
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
 *         &lt;element ref="{urn:ebay:api:PayPalAPI}GetBalanceRequest"/>
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
    "getBalanceRequest"
})
@XmlRootElement(name = "GetBalanceReq", namespace = "urn:ebay:api:PayPalAPI")
public class GetBalanceReq {

    @XmlElement(name = "GetBalanceRequest", namespace = "urn:ebay:api:PayPalAPI", required = true)
    protected GetBalanceRequestType getBalanceRequest;

    /**
     * Gets the value of the getBalanceRequest property.
     * 
     * @return
     *     possible object is
     *     {@link GetBalanceRequestType }
     *     
     */
    public GetBalanceRequestType getGetBalanceRequest() {
        return getBalanceRequest;
    }

    /**
     * Sets the value of the getBalanceRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetBalanceRequestType }
     *     
     */
    public void setGetBalanceRequest(GetBalanceRequestType value) {
        this.getBalanceRequest = value;
    }

}
