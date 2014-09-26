
package com.maxcom.mpm.paypal.client.paypal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Fallback shipping options type.
 * 			
 * 
 * <p>Java class for ShippingOptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShippingOptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ShippingOptionIsDefault" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShippingOptionAmount" type="{urn:ebay:apis:CoreComponentTypes}BasicAmountType" minOccurs="0"/>
 *         &lt;element name="ShippingOptionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShippingOptionType", propOrder = {
    "shippingOptionIsDefault",
    "shippingOptionAmount",
    "shippingOptionName"
})
public class ShippingOptionType {

    @XmlElement(name = "ShippingOptionIsDefault")
    protected String shippingOptionIsDefault;
    @XmlElement(name = "ShippingOptionAmount")
    protected BasicAmountType shippingOptionAmount;
    @XmlElement(name = "ShippingOptionName")
    protected String shippingOptionName;

    /**
     * Gets the value of the shippingOptionIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingOptionIsDefault() {
        return shippingOptionIsDefault;
    }

    /**
     * Sets the value of the shippingOptionIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingOptionIsDefault(String value) {
        this.shippingOptionIsDefault = value;
    }

    /**
     * Gets the value of the shippingOptionAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BasicAmountType }
     *     
     */
    public BasicAmountType getShippingOptionAmount() {
        return shippingOptionAmount;
    }

    /**
     * Sets the value of the shippingOptionAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicAmountType }
     *     
     */
    public void setShippingOptionAmount(BasicAmountType value) {
        this.shippingOptionAmount = value;
    }

    /**
     * Gets the value of the shippingOptionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingOptionName() {
        return shippingOptionName;
    }

    /**
     * Sets the value of the shippingOptionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingOptionName(String value) {
        this.shippingOptionName = value;
    }

}
