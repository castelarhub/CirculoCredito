
package com.maxcom.mpm.paypal.client.paypal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExternalRememberMeOwnerDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExternalRememberMeOwnerDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExternalRememberMeOwnerIDType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExternalRememberMeOwnerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExternalRememberMeOwnerDetailsType", propOrder = {
    "externalRememberMeOwnerIDType",
    "externalRememberMeOwnerID"
})
public class ExternalRememberMeOwnerDetailsType {

    @XmlElement(name = "ExternalRememberMeOwnerIDType")
    protected String externalRememberMeOwnerIDType;
    @XmlElement(name = "ExternalRememberMeOwnerID")
    protected String externalRememberMeOwnerID;

    /**
     * Gets the value of the externalRememberMeOwnerIDType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalRememberMeOwnerIDType() {
        return externalRememberMeOwnerIDType;
    }

    /**
     * Sets the value of the externalRememberMeOwnerIDType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalRememberMeOwnerIDType(String value) {
        this.externalRememberMeOwnerIDType = value;
    }

    /**
     * Gets the value of the externalRememberMeOwnerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalRememberMeOwnerID() {
        return externalRememberMeOwnerID;
    }

    /**
     * Sets the value of the externalRememberMeOwnerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalRememberMeOwnerID(String value) {
        this.externalRememberMeOwnerID = value;
    }

}
