
package com.maxcom.mpm.paypal.client.paypal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ebay:api:PayPalAPI}ExecuteCheckoutOperationsRequest"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "executeCheckoutOperationsRequest"
})
@XmlRootElement(name = "ExecuteCheckoutOperationsReq", namespace = "urn:ebay:api:PayPalAPI")
public class ExecuteCheckoutOperationsReq {

    @XmlElement(name = "ExecuteCheckoutOperationsRequest", namespace = "urn:ebay:api:PayPalAPI", required = true)
    protected ExecuteCheckoutOperationsRequestType executeCheckoutOperationsRequest;

    /**
     * Gets the value of the executeCheckoutOperationsRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ExecuteCheckoutOperationsRequestType }
     *     
     */
    public ExecuteCheckoutOperationsRequestType getExecuteCheckoutOperationsRequest() {
        return executeCheckoutOperationsRequest;
    }

    /**
     * Sets the value of the executeCheckoutOperationsRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExecuteCheckoutOperationsRequestType }
     *     
     */
    public void setExecuteCheckoutOperationsRequest(ExecuteCheckoutOperationsRequestType value) {
        this.executeCheckoutOperationsRequest = value;
    }

}
