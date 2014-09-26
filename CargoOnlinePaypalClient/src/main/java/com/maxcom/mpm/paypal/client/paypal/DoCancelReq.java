
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
 *         &lt;element ref="{urn:ebay:api:PayPalAPI}DoCancelRequest"/>
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
    "doCancelRequest"
})
@XmlRootElement(name = "DoCancelReq", namespace = "urn:ebay:api:PayPalAPI")
public class DoCancelReq {

    @XmlElement(name = "DoCancelRequest", namespace = "urn:ebay:api:PayPalAPI", required = true)
    protected DoCancelRequestType doCancelRequest;

    /**
     * Gets the value of the doCancelRequest property.
     * 
     * @return
     *     possible object is
     *     {@link DoCancelRequestType }
     *     
     */
    public DoCancelRequestType getDoCancelRequest() {
        return doCancelRequest;
    }

    /**
     * Sets the value of the doCancelRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link DoCancelRequestType }
     *     
     */
    public void setDoCancelRequest(DoCancelRequestType value) {
        this.doCancelRequest = value;
    }

}
