
package com.maxcom.mpm.paypal.client.paypal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BillingApprovalDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillingApprovalDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ApprovalType" type="{urn:ebay:apis:eBLBaseComponents}ApprovalTypeType"/>
 *         &lt;element name="ApprovalSubType" type="{urn:ebay:apis:eBLBaseComponents}ApprovalSubTypeType" minOccurs="0"/>
 *         &lt;element name="OrderDetails" type="{urn:ebay:apis:eBLBaseComponents}OrderDetailsType" minOccurs="0"/>
 *         &lt;element name="PaymentDirectives" type="{urn:ebay:apis:eBLBaseComponents}PaymentDirectivesType" minOccurs="0"/>
 *         &lt;element name="Custom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillingApprovalDetailsType", propOrder = {
    "approvalType",
    "approvalSubType",
    "orderDetails",
    "paymentDirectives",
    "custom"
})
public class BillingApprovalDetailsType {

    @XmlElement(name = "ApprovalType", required = true)
    protected ApprovalTypeType approvalType;
    @XmlElement(name = "ApprovalSubType")
    protected ApprovalSubTypeType approvalSubType;
    @XmlElement(name = "OrderDetails")
    protected OrderDetailsType orderDetails;
    @XmlElement(name = "PaymentDirectives")
    protected PaymentDirectivesType paymentDirectives;
    @XmlElement(name = "Custom")
    protected String custom;

    /**
     * Gets the value of the approvalType property.
     * 
     * @return
     *     possible object is
     *     {@link ApprovalTypeType }
     *     
     */
    public ApprovalTypeType getApprovalType() {
        return approvalType;
    }

    /**
     * Sets the value of the approvalType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApprovalTypeType }
     *     
     */
    public void setApprovalType(ApprovalTypeType value) {
        this.approvalType = value;
    }

    /**
     * Gets the value of the approvalSubType property.
     * 
     * @return
     *     possible object is
     *     {@link ApprovalSubTypeType }
     *     
     */
    public ApprovalSubTypeType getApprovalSubType() {
        return approvalSubType;
    }

    /**
     * Sets the value of the approvalSubType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApprovalSubTypeType }
     *     
     */
    public void setApprovalSubType(ApprovalSubTypeType value) {
        this.approvalSubType = value;
    }

    /**
     * Gets the value of the orderDetails property.
     * 
     * @return
     *     possible object is
     *     {@link OrderDetailsType }
     *     
     */
    public OrderDetailsType getOrderDetails() {
        return orderDetails;
    }

    /**
     * Sets the value of the orderDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderDetailsType }
     *     
     */
    public void setOrderDetails(OrderDetailsType value) {
        this.orderDetails = value;
    }

    /**
     * Gets the value of the paymentDirectives property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentDirectivesType }
     *     
     */
    public PaymentDirectivesType getPaymentDirectives() {
        return paymentDirectives;
    }

    /**
     * Sets the value of the paymentDirectives property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentDirectivesType }
     *     
     */
    public void setPaymentDirectives(PaymentDirectivesType value) {
        this.paymentDirectives = value;
    }

    /**
     * Gets the value of the custom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustom() {
        return custom;
    }

    /**
     * Sets the value of the custom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustom(String value) {
        this.custom = value;
    }

}
