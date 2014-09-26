
package com.maxcom.mpm.paypal.client.paypal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CancelRecoupRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CancelRecoupRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ebay:apis:EnhancedDataTypes}EnhancedCancelRecoupRequestDetails"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancelRecoupRequestType", namespace = "urn:ebay:api:PayPalAPI", propOrder = {
    "enhancedCancelRecoupRequestDetails"
})
public class CancelRecoupRequestType
    extends AbstractRequestType
{

    @XmlElement(name = "EnhancedCancelRecoupRequestDetails", namespace = "urn:ebay:apis:EnhancedDataTypes", required = true)
    protected EnhancedCancelRecoupRequestDetailsType enhancedCancelRecoupRequestDetails;

    /**
     * Gets the value of the enhancedCancelRecoupRequestDetails property.
     * 
     * @return
     *     possible object is
     *     {@link EnhancedCancelRecoupRequestDetailsType }
     *     
     */
    public EnhancedCancelRecoupRequestDetailsType getEnhancedCancelRecoupRequestDetails() {
        return enhancedCancelRecoupRequestDetails;
    }

    /**
     * Sets the value of the enhancedCancelRecoupRequestDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnhancedCancelRecoupRequestDetailsType }
     *     
     */
    public void setEnhancedCancelRecoupRequestDetails(EnhancedCancelRecoupRequestDetailsType value) {
        this.enhancedCancelRecoupRequestDetails = value;
    }

}
