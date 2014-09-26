
package com.maxcom.mpm.paypal.client.paypal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RememberMeIDInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RememberMeIDInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExternalRememberMeID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RememberMeIDInfoType", propOrder = {
    "externalRememberMeID"
})
public class RememberMeIDInfoType {

    @XmlElement(name = "ExternalRememberMeID")
    protected String externalRememberMeID;

    /**
     * Gets the value of the externalRememberMeID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalRememberMeID() {
        return externalRememberMeID;
    }

    /**
     * Sets the value of the externalRememberMeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalRememberMeID(String value) {
        this.externalRememberMeID = value;
    }

}
