
package com.maxcom.mpm.paypal.client.paypal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IncentiveRequestDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IncentiveRequestDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RequestId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RequestType" type="{urn:ebay:apis:eBLBaseComponents}IncentiveRequestCodeType" minOccurs="0"/>
 *         &lt;element name="RequestDetailLevel" type="{urn:ebay:apis:eBLBaseComponents}IncentiveRequestDetailLevelCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IncentiveRequestDetailsType", propOrder = {
    "requestId",
    "requestType",
    "requestDetailLevel"
})
public class IncentiveRequestDetailsType {

    @XmlElement(name = "RequestId")
    protected String requestId;
    @XmlElement(name = "RequestType")
    protected IncentiveRequestCodeType requestType;
    @XmlElement(name = "RequestDetailLevel")
    protected IncentiveRequestDetailLevelCodeType requestDetailLevel;

    /**
     * Gets the value of the requestId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * Sets the value of the requestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestId(String value) {
        this.requestId = value;
    }

    /**
     * Gets the value of the requestType property.
     * 
     * @return
     *     possible object is
     *     {@link IncentiveRequestCodeType }
     *     
     */
    public IncentiveRequestCodeType getRequestType() {
        return requestType;
    }

    /**
     * Sets the value of the requestType property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncentiveRequestCodeType }
     *     
     */
    public void setRequestType(IncentiveRequestCodeType value) {
        this.requestType = value;
    }

    /**
     * Gets the value of the requestDetailLevel property.
     * 
     * @return
     *     possible object is
     *     {@link IncentiveRequestDetailLevelCodeType }
     *     
     */
    public IncentiveRequestDetailLevelCodeType getRequestDetailLevel() {
        return requestDetailLevel;
    }

    /**
     * Sets the value of the requestDetailLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncentiveRequestDetailLevelCodeType }
     *     
     */
    public void setRequestDetailLevel(IncentiveRequestDetailLevelCodeType value) {
        this.requestDetailLevel = value;
    }

}
