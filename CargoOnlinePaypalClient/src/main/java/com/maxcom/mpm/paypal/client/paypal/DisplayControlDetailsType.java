
package com.maxcom.mpm.paypal.client.paypal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DisplayControlDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DisplayControlDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InContextPaymentButtonImage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisplayControlDetailsType", propOrder = {
    "inContextPaymentButtonImage"
})
public class DisplayControlDetailsType {

    @XmlElement(name = "InContextPaymentButtonImage")
    protected String inContextPaymentButtonImage;

    /**
     * Gets the value of the inContextPaymentButtonImage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInContextPaymentButtonImage() {
        return inContextPaymentButtonImage;
    }

    /**
     * Sets the value of the inContextPaymentButtonImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInContextPaymentButtonImage(String value) {
        this.inContextPaymentButtonImage = value;
    }

}
