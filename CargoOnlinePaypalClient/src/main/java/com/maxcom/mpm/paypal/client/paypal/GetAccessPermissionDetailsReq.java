
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
 *         &lt;element ref="{urn:ebay:api:PayPalAPI}GetAccessPermissionDetailsRequest"/>
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
    "getAccessPermissionDetailsRequest"
})
@XmlRootElement(name = "GetAccessPermissionDetailsReq", namespace = "urn:ebay:api:PayPalAPI")
public class GetAccessPermissionDetailsReq {

    @XmlElement(name = "GetAccessPermissionDetailsRequest", namespace = "urn:ebay:api:PayPalAPI", required = true)
    protected GetAccessPermissionDetailsRequestType getAccessPermissionDetailsRequest;

    /**
     * Gets the value of the getAccessPermissionDetailsRequest property.
     * 
     * @return
     *     possible object is
     *     {@link GetAccessPermissionDetailsRequestType }
     *     
     */
    public GetAccessPermissionDetailsRequestType getGetAccessPermissionDetailsRequest() {
        return getAccessPermissionDetailsRequest;
    }

    /**
     * Sets the value of the getAccessPermissionDetailsRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetAccessPermissionDetailsRequestType }
     *     
     */
    public void setGetAccessPermissionDetailsRequest(GetAccessPermissionDetailsRequestType value) {
        this.getAccessPermissionDetailsRequest = value;
    }

}
