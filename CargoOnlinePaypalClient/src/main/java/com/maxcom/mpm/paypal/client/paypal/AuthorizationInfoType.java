
package com.maxcom.mpm.paypal.client.paypal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Authorization details
 * 			
 * 
 * <p>Java class for AuthorizationInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuthorizationInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PaymentStatus" type="{urn:ebay:apis:eBLBaseComponents}PaymentStatusCodeType"/>
 *         &lt;element name="PendingReason" type="{urn:ebay:apis:eBLBaseComponents}PendingStatusCodeType" minOccurs="0"/>
 *         &lt;element name="ProtectionEligibility" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProtectionEligibilityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthorizationInfoType", propOrder = {
    "paymentStatus",
    "pendingReason",
    "protectionEligibility",
    "protectionEligibilityType"
})
public class AuthorizationInfoType {

    @XmlElement(name = "PaymentStatus", required = true)
    protected PaymentStatusCodeType paymentStatus;
    @XmlElement(name = "PendingReason")
    protected PendingStatusCodeType pendingReason;
    @XmlElement(name = "ProtectionEligibility")
    protected String protectionEligibility;
    @XmlElement(name = "ProtectionEligibilityType")
    protected String protectionEligibilityType;

    /**
     * Gets the value of the paymentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentStatusCodeType }
     *     
     */
    public PaymentStatusCodeType getPaymentStatus() {
        return paymentStatus;
    }

    /**
     * Sets the value of the paymentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentStatusCodeType }
     *     
     */
    public void setPaymentStatus(PaymentStatusCodeType value) {
        this.paymentStatus = value;
    }

    /**
     * Gets the value of the pendingReason property.
     * 
     * @return
     *     possible object is
     *     {@link PendingStatusCodeType }
     *     
     */
    public PendingStatusCodeType getPendingReason() {
        return pendingReason;
    }

    /**
     * Sets the value of the pendingReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingStatusCodeType }
     *     
     */
    public void setPendingReason(PendingStatusCodeType value) {
        this.pendingReason = value;
    }

    /**
     * Gets the value of the protectionEligibility property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtectionEligibility() {
        return protectionEligibility;
    }

    /**
     * Sets the value of the protectionEligibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtectionEligibility(String value) {
        this.protectionEligibility = value;
    }

    /**
     * Gets the value of the protectionEligibilityType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtectionEligibilityType() {
        return protectionEligibilityType;
    }

    /**
     * Sets the value of the protectionEligibilityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtectionEligibilityType(String value) {
        this.protectionEligibilityType = value;
    }

}
