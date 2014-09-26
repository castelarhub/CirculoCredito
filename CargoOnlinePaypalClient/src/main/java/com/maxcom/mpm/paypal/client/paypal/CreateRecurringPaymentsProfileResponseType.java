
package com.maxcom.mpm.paypal.client.paypal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateRecurringPaymentsProfileResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateRecurringPaymentsProfileResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ebay:apis:eBLBaseComponents}CreateRecurringPaymentsProfileResponseDetails"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateRecurringPaymentsProfileResponseType", namespace = "urn:ebay:api:PayPalAPI", propOrder = {
    "createRecurringPaymentsProfileResponseDetails"
})
public class CreateRecurringPaymentsProfileResponseType
    extends AbstractResponseType
{

    @XmlElement(name = "CreateRecurringPaymentsProfileResponseDetails", namespace = "urn:ebay:apis:eBLBaseComponents", required = true)
    protected CreateRecurringPaymentsProfileResponseDetailsType createRecurringPaymentsProfileResponseDetails;

    /**
     * Gets the value of the createRecurringPaymentsProfileResponseDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CreateRecurringPaymentsProfileResponseDetailsType }
     *     
     */
    public CreateRecurringPaymentsProfileResponseDetailsType getCreateRecurringPaymentsProfileResponseDetails() {
        return createRecurringPaymentsProfileResponseDetails;
    }

    /**
     * Sets the value of the createRecurringPaymentsProfileResponseDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateRecurringPaymentsProfileResponseDetailsType }
     *     
     */
    public void setCreateRecurringPaymentsProfileResponseDetails(CreateRecurringPaymentsProfileResponseDetailsType value) {
        this.createRecurringPaymentsProfileResponseDetails = value;
    }

}
