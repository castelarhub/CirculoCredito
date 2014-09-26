
package com.maxcom.mpm.paypal.client.paypal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuthorizationRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuthorizationRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IsRequested" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthorizationRequestType", propOrder = {
    "isRequested"
})
public class AuthorizationRequestType {

    @XmlElement(name = "IsRequested")
    protected boolean isRequested;

    /**
     * Gets the value of the isRequested property.
     * 
     */
    public boolean isIsRequested() {
        return isRequested;
    }

    /**
     * Sets the value of the isRequested property.
     * 
     */
    public void setIsRequested(boolean value) {
        this.isRequested = value;
    }

}
