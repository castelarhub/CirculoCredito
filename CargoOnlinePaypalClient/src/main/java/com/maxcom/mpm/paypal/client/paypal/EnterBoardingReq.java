
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
 *         &lt;element ref="{urn:ebay:api:PayPalAPI}EnterBoardingRequest"/>
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
    "enterBoardingRequest"
})
@XmlRootElement(name = "EnterBoardingReq", namespace = "urn:ebay:api:PayPalAPI")
public class EnterBoardingReq {

    @XmlElement(name = "EnterBoardingRequest", namespace = "urn:ebay:api:PayPalAPI", required = true)
    protected EnterBoardingRequestType enterBoardingRequest;

    /**
     * Gets the value of the enterBoardingRequest property.
     * 
     * @return
     *     possible object is
     *     {@link EnterBoardingRequestType }
     *     
     */
    public EnterBoardingRequestType getEnterBoardingRequest() {
        return enterBoardingRequest;
    }

    /**
     * Sets the value of the enterBoardingRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnterBoardingRequestType }
     *     
     */
    public void setEnterBoardingRequest(EnterBoardingRequestType value) {
        this.enterBoardingRequest = value;
    }

}
