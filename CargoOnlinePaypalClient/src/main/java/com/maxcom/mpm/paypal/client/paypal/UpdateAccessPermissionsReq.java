
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
 *         &lt;element ref="{urn:ebay:api:PayPalAPI}UpdateAccessPermissionsRequest"/>
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
    "updateAccessPermissionsRequest"
})
@XmlRootElement(name = "UpdateAccessPermissionsReq", namespace = "urn:ebay:api:PayPalAPI")
public class UpdateAccessPermissionsReq {

    @XmlElement(name = "UpdateAccessPermissionsRequest", namespace = "urn:ebay:api:PayPalAPI", required = true)
    protected UpdateAccessPermissionsRequestType updateAccessPermissionsRequest;

    /**
     * Gets the value of the updateAccessPermissionsRequest property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateAccessPermissionsRequestType }
     *     
     */
    public UpdateAccessPermissionsRequestType getUpdateAccessPermissionsRequest() {
        return updateAccessPermissionsRequest;
    }

    /**
     * Sets the value of the updateAccessPermissionsRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateAccessPermissionsRequestType }
     *     
     */
    public void setUpdateAccessPermissionsRequest(UpdateAccessPermissionsRequestType value) {
        this.updateAccessPermissionsRequest = value;
    }

}
