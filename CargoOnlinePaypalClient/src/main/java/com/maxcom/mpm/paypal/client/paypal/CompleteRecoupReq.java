
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
 *         &lt;element ref="{urn:ebay:api:PayPalAPI}CompleteRecoupRequest"/>
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
    "completeRecoupRequest"
})
@XmlRootElement(name = "CompleteRecoupReq", namespace = "urn:ebay:api:PayPalAPI")
public class CompleteRecoupReq {

    @XmlElement(name = "CompleteRecoupRequest", namespace = "urn:ebay:api:PayPalAPI", required = true)
    protected CompleteRecoupRequestType completeRecoupRequest;

    /**
     * Gets the value of the completeRecoupRequest property.
     * 
     * @return
     *     possible object is
     *     {@link CompleteRecoupRequestType }
     *     
     */
    public CompleteRecoupRequestType getCompleteRecoupRequest() {
        return completeRecoupRequest;
    }

    /**
     * Sets the value of the completeRecoupRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompleteRecoupRequestType }
     *     
     */
    public void setCompleteRecoupRequest(CompleteRecoupRequestType value) {
        this.completeRecoupRequest = value;
    }

}
