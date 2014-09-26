
package com.maxcom.mpm.paypal.client.paypal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentDirectivesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentDirectivesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PaymentType" type="{urn:ebay:apis:eBLBaseComponents}MerchantPullPaymentCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentDirectivesType", propOrder = {
    "paymentType"
})
public class PaymentDirectivesType {

    @XmlElement(name = "PaymentType")
    protected MerchantPullPaymentCodeType paymentType;

    /**
     * Gets the value of the paymentType property.
     * 
     * @return
     *     possible object is
     *     {@link MerchantPullPaymentCodeType }
     *     
     */
    public MerchantPullPaymentCodeType getPaymentType() {
        return paymentType;
    }

    /**
     * Sets the value of the paymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MerchantPullPaymentCodeType }
     *     
     */
    public void setPaymentType(MerchantPullPaymentCodeType value) {
        this.paymentType = value;
    }

}
