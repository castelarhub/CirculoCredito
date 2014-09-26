
package com.maxcom.mpm.paypal.client.paypal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateRecurringPaymentsProfileRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateRecurringPaymentsProfileRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ebay:apis:eBLBaseComponents}CreateRecurringPaymentsProfileRequestDetails"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateRecurringPaymentsProfileRequestType", namespace = "urn:ebay:api:PayPalAPI", propOrder = {
    "createRecurringPaymentsProfileRequestDetails"
})
public class CreateRecurringPaymentsProfileRequestType
    extends AbstractRequestType
{

    @XmlElement(name = "CreateRecurringPaymentsProfileRequestDetails", namespace = "urn:ebay:apis:eBLBaseComponents", required = true)
    protected CreateRecurringPaymentsProfileRequestDetailsType createRecurringPaymentsProfileRequestDetails;

    /**
     * Gets the value of the createRecurringPaymentsProfileRequestDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CreateRecurringPaymentsProfileRequestDetailsType }
     *     
     */
    public CreateRecurringPaymentsProfileRequestDetailsType getCreateRecurringPaymentsProfileRequestDetails() {
        return createRecurringPaymentsProfileRequestDetails;
    }

    /**
     * Sets the value of the createRecurringPaymentsProfileRequestDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateRecurringPaymentsProfileRequestDetailsType }
     *     
     */
    public void setCreateRecurringPaymentsProfileRequestDetails(CreateRecurringPaymentsProfileRequestDetailsType value) {
        this.createRecurringPaymentsProfileRequestDetails = value;
    }

}
