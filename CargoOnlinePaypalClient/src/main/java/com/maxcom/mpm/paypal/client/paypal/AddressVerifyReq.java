
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
 *         &lt;element ref="{urn:ebay:api:PayPalAPI}AddressVerifyRequest"/>
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
    "addressVerifyRequest"
})
@XmlRootElement(name = "AddressVerifyReq", namespace = "urn:ebay:api:PayPalAPI")
public class AddressVerifyReq {

    @XmlElement(name = "AddressVerifyRequest", namespace = "urn:ebay:api:PayPalAPI", required = true)
    protected AddressVerifyRequestType addressVerifyRequest;

    /**
     * Gets the value of the addressVerifyRequest property.
     * 
     * @return
     *     possible object is
     *     {@link AddressVerifyRequestType }
     *     
     */
    public AddressVerifyRequestType getAddressVerifyRequest() {
        return addressVerifyRequest;
    }

    /**
     * Sets the value of the addressVerifyRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressVerifyRequestType }
     *     
     */
    public void setAddressVerifyRequest(AddressVerifyRequestType value) {
        this.addressVerifyRequest = value;
    }

}
