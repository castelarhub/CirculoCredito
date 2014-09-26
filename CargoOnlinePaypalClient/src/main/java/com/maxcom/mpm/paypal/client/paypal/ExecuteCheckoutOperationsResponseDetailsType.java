
package com.maxcom.mpm.paypal.client.paypal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExecuteCheckoutOperationsResponseDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExecuteCheckoutOperationsResponseDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SetDataResponse" type="{urn:ebay:apis:eBLBaseComponents}SetDataResponseType"/>
 *         &lt;element name="AuthorizationResponse" type="{urn:ebay:apis:eBLBaseComponents}AuthorizationResponseType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExecuteCheckoutOperationsResponseDetailsType", propOrder = {
    "setDataResponse",
    "authorizationResponse"
})
public class ExecuteCheckoutOperationsResponseDetailsType {

    @XmlElement(name = "SetDataResponse", required = true)
    protected SetDataResponseType setDataResponse;
    @XmlElement(name = "AuthorizationResponse")
    protected AuthorizationResponseType authorizationResponse;

    /**
     * Gets the value of the setDataResponse property.
     * 
     * @return
     *     possible object is
     *     {@link SetDataResponseType }
     *     
     */
    public SetDataResponseType getSetDataResponse() {
        return setDataResponse;
    }

    /**
     * Sets the value of the setDataResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetDataResponseType }
     *     
     */
    public void setSetDataResponse(SetDataResponseType value) {
        this.setDataResponse = value;
    }

    /**
     * Gets the value of the authorizationResponse property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorizationResponseType }
     *     
     */
    public AuthorizationResponseType getAuthorizationResponse() {
        return authorizationResponse;
    }

    /**
     * Sets the value of the authorizationResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorizationResponseType }
     *     
     */
    public void setAuthorizationResponse(AuthorizationResponseType value) {
        this.authorizationResponse = value;
    }

}
