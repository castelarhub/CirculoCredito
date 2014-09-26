
package com.maxcom.mpm.paypal.client.paypal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 			     Definition of an eBay Fee type.
 *                    
 * 
 * <p>Java class for FeeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Fee" type="{urn:ebay:apis:CoreComponentTypes}AmountType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeeType", propOrder = {
    "name",
    "fee"
})
public class FeeType {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Fee")
    protected AmountType fee;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the fee property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getFee() {
        return fee;
    }

    /**
     * Sets the value of the fee property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setFee(AmountType value) {
        this.fee = value;
    }

}
