
package com.maxcom.mpm.paypal.client.paypal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateRecurringPaymentsProfileRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateRecurringPaymentsProfileRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ebay:apis:eBLBaseComponents}UpdateRecurringPaymentsProfileRequestDetails"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateRecurringPaymentsProfileRequestType", namespace = "urn:ebay:api:PayPalAPI", propOrder = {
    "updateRecurringPaymentsProfileRequestDetails"
})
public class UpdateRecurringPaymentsProfileRequestType
    extends AbstractRequestType
{

    @XmlElement(name = "UpdateRecurringPaymentsProfileRequestDetails", namespace = "urn:ebay:apis:eBLBaseComponents", required = true)
    protected UpdateRecurringPaymentsProfileRequestDetailsType updateRecurringPaymentsProfileRequestDetails;

    /**
     * Gets the value of the updateRecurringPaymentsProfileRequestDetails property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateRecurringPaymentsProfileRequestDetailsType }
     *     
     */
    public UpdateRecurringPaymentsProfileRequestDetailsType getUpdateRecurringPaymentsProfileRequestDetails() {
        return updateRecurringPaymentsProfileRequestDetails;
    }

    /**
     * Sets the value of the updateRecurringPaymentsProfileRequestDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateRecurringPaymentsProfileRequestDetailsType }
     *     
     */
    public void setUpdateRecurringPaymentsProfileRequestDetails(UpdateRecurringPaymentsProfileRequestDetailsType value) {
        this.updateRecurringPaymentsProfileRequestDetails = value;
    }

}
