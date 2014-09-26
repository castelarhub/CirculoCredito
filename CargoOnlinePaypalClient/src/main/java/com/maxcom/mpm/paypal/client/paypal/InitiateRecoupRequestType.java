
package com.maxcom.mpm.paypal.client.paypal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InitiateRecoupRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InitiateRecoupRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ebay:apis:EnhancedDataTypes}EnhancedInitiateRecoupRequestDetails"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InitiateRecoupRequestType", namespace = "urn:ebay:api:PayPalAPI", propOrder = {
    "enhancedInitiateRecoupRequestDetails"
})
public class InitiateRecoupRequestType
    extends AbstractRequestType
{

    @XmlElement(name = "EnhancedInitiateRecoupRequestDetails", namespace = "urn:ebay:apis:EnhancedDataTypes", required = true)
    protected EnhancedInitiateRecoupRequestDetailsType enhancedInitiateRecoupRequestDetails;

    /**
     * Gets the value of the enhancedInitiateRecoupRequestDetails property.
     * 
     * @return
     *     possible object is
     *     {@link EnhancedInitiateRecoupRequestDetailsType }
     *     
     */
    public EnhancedInitiateRecoupRequestDetailsType getEnhancedInitiateRecoupRequestDetails() {
        return enhancedInitiateRecoupRequestDetails;
    }

    /**
     * Sets the value of the enhancedInitiateRecoupRequestDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnhancedInitiateRecoupRequestDetailsType }
     *     
     */
    public void setEnhancedInitiateRecoupRequestDetails(EnhancedInitiateRecoupRequestDetailsType value) {
        this.enhancedInitiateRecoupRequestDetails = value;
    }

}
