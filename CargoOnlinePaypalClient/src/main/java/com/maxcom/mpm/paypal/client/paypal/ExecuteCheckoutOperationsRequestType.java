
package com.maxcom.mpm.paypal.client.paypal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExecuteCheckoutOperationsRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExecuteCheckoutOperationsRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ebay:apis:eBLBaseComponents}ExecuteCheckoutOperationsRequestDetails"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExecuteCheckoutOperationsRequestType", namespace = "urn:ebay:api:PayPalAPI", propOrder = {
    "executeCheckoutOperationsRequestDetails"
})
public class ExecuteCheckoutOperationsRequestType
    extends AbstractRequestType
{

    @XmlElement(name = "ExecuteCheckoutOperationsRequestDetails", namespace = "urn:ebay:apis:eBLBaseComponents", required = true)
    protected ExecuteCheckoutOperationsRequestDetailsType executeCheckoutOperationsRequestDetails;

    /**
     * Gets the value of the executeCheckoutOperationsRequestDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ExecuteCheckoutOperationsRequestDetailsType }
     *     
     */
    public ExecuteCheckoutOperationsRequestDetailsType getExecuteCheckoutOperationsRequestDetails() {
        return executeCheckoutOperationsRequestDetails;
    }

    /**
     * Sets the value of the executeCheckoutOperationsRequestDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExecuteCheckoutOperationsRequestDetailsType }
     *     
     */
    public void setExecuteCheckoutOperationsRequestDetails(ExecuteCheckoutOperationsRequestDetailsType value) {
        this.executeCheckoutOperationsRequestDetails = value;
    }

}
