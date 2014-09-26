
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
 *         &lt;element ref="{urn:ebay:api:PayPalAPI}SetAccessPermissionsRequest"/>
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
    "setAccessPermissionsRequest"
})
@XmlRootElement(name = "SetAccessPermissionsReq", namespace = "urn:ebay:api:PayPalAPI")
public class SetAccessPermissionsReq {

    @XmlElement(name = "SetAccessPermissionsRequest", namespace = "urn:ebay:api:PayPalAPI", required = true)
    protected SetAccessPermissionsRequestType setAccessPermissionsRequest;

    /**
     * Gets the value of the setAccessPermissionsRequest property.
     * 
     * @return
     *     possible object is
     *     {@link SetAccessPermissionsRequestType }
     *     
     */
    public SetAccessPermissionsRequestType getSetAccessPermissionsRequest() {
        return setAccessPermissionsRequest;
    }

    /**
     * Sets the value of the setAccessPermissionsRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetAccessPermissionsRequestType }
     *     
     */
    public void setSetAccessPermissionsRequest(SetAccessPermissionsRequestType value) {
        this.setAccessPermissionsRequest = value;
    }

}
