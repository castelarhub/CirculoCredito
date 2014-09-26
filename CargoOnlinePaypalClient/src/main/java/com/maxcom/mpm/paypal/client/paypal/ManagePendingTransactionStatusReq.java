
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
 *         &lt;element ref="{urn:ebay:api:PayPalAPI}ManagePendingTransactionStatusRequest"/>
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
    "managePendingTransactionStatusRequest"
})
@XmlRootElement(name = "ManagePendingTransactionStatusReq", namespace = "urn:ebay:api:PayPalAPI")
public class ManagePendingTransactionStatusReq {

    @XmlElement(name = "ManagePendingTransactionStatusRequest", namespace = "urn:ebay:api:PayPalAPI", required = true)
    protected ManagePendingTransactionStatusRequestType managePendingTransactionStatusRequest;

    /**
     * Gets the value of the managePendingTransactionStatusRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ManagePendingTransactionStatusRequestType }
     *     
     */
    public ManagePendingTransactionStatusRequestType getManagePendingTransactionStatusRequest() {
        return managePendingTransactionStatusRequest;
    }

    /**
     * Sets the value of the managePendingTransactionStatusRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagePendingTransactionStatusRequestType }
     *     
     */
    public void setManagePendingTransactionStatusRequest(ManagePendingTransactionStatusRequestType value) {
        this.managePendingTransactionStatusRequest = value;
    }

}
