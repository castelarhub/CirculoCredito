
package com.maxcom.mpm.paypal.client.paypal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BuyerDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BuyerDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdentificationInfo" type="{urn:ebay:apis:eBLBaseComponents}IdentificationInfoType" minOccurs="0"/>
 *         &lt;element name="RiskSessionCorrelationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BuyerDetailType", propOrder = {
    "identificationInfo",
    "riskSessionCorrelationID"
})
public class BuyerDetailType {

    @XmlElement(name = "IdentificationInfo")
    protected IdentificationInfoType identificationInfo;
    @XmlElement(name = "RiskSessionCorrelationID")
    protected String riskSessionCorrelationID;

    /**
     * Gets the value of the identificationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link IdentificationInfoType }
     *     
     */
    public IdentificationInfoType getIdentificationInfo() {
        return identificationInfo;
    }

    /**
     * Sets the value of the identificationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificationInfoType }
     *     
     */
    public void setIdentificationInfo(IdentificationInfoType value) {
        this.identificationInfo = value;
    }

    /**
     * Gets the value of the riskSessionCorrelationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRiskSessionCorrelationID() {
        return riskSessionCorrelationID;
    }

    /**
     * Sets the value of the riskSessionCorrelationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRiskSessionCorrelationID(String value) {
        this.riskSessionCorrelationID = value;
    }

}
