
package com.maxcom.mpm.paypal.client.paypal;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 						Describes discount information.
 * 					
 * 
 * <p>Java class for DiscountInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiscountInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Amount" type="{urn:ebay:apis:CoreComponentTypes}BasicAmountType" minOccurs="0"/>
 *         &lt;element name="RedeemedOfferType" type="{urn:ebay:apis:eBLBaseComponents}RedeemedOfferType" minOccurs="0"/>
 *         &lt;element name="RedeemedOfferId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PointsAccrued" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiscountInfoType", propOrder = {
    "name",
    "description",
    "amount",
    "redeemedOfferType",
    "redeemedOfferId",
    "pointsAccrued"
})
public class DiscountInfoType {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Amount")
    protected BasicAmountType amount;
    @XmlElement(name = "RedeemedOfferType")
    protected RedeemedOfferType redeemedOfferType;
    @XmlElement(name = "RedeemedOfferId")
    protected String redeemedOfferId;
    @XmlElement(name = "PointsAccrued")
    protected BigDecimal pointsAccrued;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BasicAmountType }
     *     
     */
    public BasicAmountType getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicAmountType }
     *     
     */
    public void setAmount(BasicAmountType value) {
        this.amount = value;
    }

    /**
     * Gets the value of the redeemedOfferType property.
     * 
     * @return
     *     possible object is
     *     {@link RedeemedOfferType }
     *     
     */
    public RedeemedOfferType getRedeemedOfferType() {
        return redeemedOfferType;
    }

    /**
     * Sets the value of the redeemedOfferType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RedeemedOfferType }
     *     
     */
    public void setRedeemedOfferType(RedeemedOfferType value) {
        this.redeemedOfferType = value;
    }

    /**
     * Gets the value of the redeemedOfferId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedeemedOfferId() {
        return redeemedOfferId;
    }

    /**
     * Sets the value of the redeemedOfferId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedeemedOfferId(String value) {
        this.redeemedOfferId = value;
    }

    /**
     * Gets the value of the pointsAccrued property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPointsAccrued() {
        return pointsAccrued;
    }

    /**
     * Sets the value of the pointsAccrued property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPointsAccrued(BigDecimal value) {
        this.pointsAccrued = value;
    }

}
