
package com.maxcom.mpm.paypal.client.paypal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				OfferDetailsType
 * 				Specific information for an offer.
 * 			
 * 
 * <p>Java class for OfferDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfferDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OfferCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BMLOfferInfo" type="{urn:ebay:apis:eBLBaseComponents}BMLOfferInfoType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferDetailsType", propOrder = {
    "offerCode",
    "bmlOfferInfo"
})
public class OfferDetailsType {

    @XmlElement(name = "OfferCode")
    protected String offerCode;
    @XmlElement(name = "BMLOfferInfo")
    protected BMLOfferInfoType bmlOfferInfo;

    /**
     * Gets the value of the offerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferCode() {
        return offerCode;
    }

    /**
     * Sets the value of the offerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferCode(String value) {
        this.offerCode = value;
    }

    /**
     * Gets the value of the bmlOfferInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BMLOfferInfoType }
     *     
     */
    public BMLOfferInfoType getBMLOfferInfo() {
        return bmlOfferInfo;
    }

    /**
     * Sets the value of the bmlOfferInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BMLOfferInfoType }
     *     
     */
    public void setBMLOfferInfo(BMLOfferInfoType value) {
        this.bmlOfferInfo = value;
    }

}
