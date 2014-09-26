
package com.maxcom.mpm.paypal.client.paypal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetRecurringPaymentsProfileDetailsResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetRecurringPaymentsProfileDetailsResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ebay:apis:eBLBaseComponents}GetRecurringPaymentsProfileDetailsResponseDetails"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetRecurringPaymentsProfileDetailsResponseType", namespace = "urn:ebay:api:PayPalAPI", propOrder = {
    "getRecurringPaymentsProfileDetailsResponseDetails"
})
public class GetRecurringPaymentsProfileDetailsResponseType
    extends AbstractResponseType
{

    @XmlElement(name = "GetRecurringPaymentsProfileDetailsResponseDetails", namespace = "urn:ebay:apis:eBLBaseComponents", required = true)
    protected GetRecurringPaymentsProfileDetailsResponseDetailsType getRecurringPaymentsProfileDetailsResponseDetails;

    /**
     * Gets the value of the getRecurringPaymentsProfileDetailsResponseDetails property.
     * 
     * @return
     *     possible object is
     *     {@link GetRecurringPaymentsProfileDetailsResponseDetailsType }
     *     
     */
    public GetRecurringPaymentsProfileDetailsResponseDetailsType getGetRecurringPaymentsProfileDetailsResponseDetails() {
        return getRecurringPaymentsProfileDetailsResponseDetails;
    }

    /**
     * Sets the value of the getRecurringPaymentsProfileDetailsResponseDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetRecurringPaymentsProfileDetailsResponseDetailsType }
     *     
     */
    public void setGetRecurringPaymentsProfileDetailsResponseDetails(GetRecurringPaymentsProfileDetailsResponseDetailsType value) {
        this.getRecurringPaymentsProfileDetailsResponseDetails = value;
    }

}
