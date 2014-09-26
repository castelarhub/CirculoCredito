
package com.maxcom.mpm.paypal.client.paypal;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				PaymentItemType 
 * 				Information about a Payment Item.
 * 			
 * 
 * <p>Java class for PaymentItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EbayItemTxnId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesTax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShippingAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HandlingAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InvoiceItemDetails" type="{urn:ebay:apis:eBLBaseComponents}InvoiceItemType" minOccurs="0"/>
 *         &lt;element name="CouponID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CouponAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CouponAmountCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LoyaltyCardDiscountAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LoyaltyCardDiscountCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Amount" type="{urn:ebay:apis:CoreComponentTypes}BasicAmountType" minOccurs="0"/>
 *         &lt;element name="Options" type="{urn:ebay:apis:eBLBaseComponents}OptionType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentItemType", propOrder = {
    "ebayItemTxnId",
    "name",
    "number",
    "quantity",
    "salesTax",
    "shippingAmount",
    "handlingAmount",
    "invoiceItemDetails",
    "couponID",
    "couponAmount",
    "couponAmountCurrency",
    "loyaltyCardDiscountAmount",
    "loyaltyCardDiscountCurrency",
    "amount",
    "options"
})
public class PaymentItemType {

    @XmlElement(name = "EbayItemTxnId")
    protected String ebayItemTxnId;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Number")
    protected String number;
    @XmlElement(name = "Quantity")
    protected String quantity;
    @XmlElement(name = "SalesTax")
    protected String salesTax;
    @XmlElement(name = "ShippingAmount")
    protected String shippingAmount;
    @XmlElement(name = "HandlingAmount")
    protected String handlingAmount;
    @XmlElement(name = "InvoiceItemDetails")
    protected InvoiceItemType invoiceItemDetails;
    @XmlElement(name = "CouponID")
    protected String couponID;
    @XmlElement(name = "CouponAmount")
    protected String couponAmount;
    @XmlElement(name = "CouponAmountCurrency")
    protected String couponAmountCurrency;
    @XmlElement(name = "LoyaltyCardDiscountAmount")
    protected String loyaltyCardDiscountAmount;
    @XmlElement(name = "LoyaltyCardDiscountCurrency")
    protected String loyaltyCardDiscountCurrency;
    @XmlElement(name = "Amount")
    protected BasicAmountType amount;
    @XmlElement(name = "Options")
    protected List<OptionType> options;

    /**
     * Gets the value of the ebayItemTxnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEbayItemTxnId() {
        return ebayItemTxnId;
    }

    /**
     * Sets the value of the ebayItemTxnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEbayItemTxnId(String value) {
        this.ebayItemTxnId = value;
    }

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
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantity(String value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the salesTax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesTax() {
        return salesTax;
    }

    /**
     * Sets the value of the salesTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesTax(String value) {
        this.salesTax = value;
    }

    /**
     * Gets the value of the shippingAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingAmount() {
        return shippingAmount;
    }

    /**
     * Sets the value of the shippingAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingAmount(String value) {
        this.shippingAmount = value;
    }

    /**
     * Gets the value of the handlingAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandlingAmount() {
        return handlingAmount;
    }

    /**
     * Sets the value of the handlingAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandlingAmount(String value) {
        this.handlingAmount = value;
    }

    /**
     * Gets the value of the invoiceItemDetails property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceItemType }
     *     
     */
    public InvoiceItemType getInvoiceItemDetails() {
        return invoiceItemDetails;
    }

    /**
     * Sets the value of the invoiceItemDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceItemType }
     *     
     */
    public void setInvoiceItemDetails(InvoiceItemType value) {
        this.invoiceItemDetails = value;
    }

    /**
     * Gets the value of the couponID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCouponID() {
        return couponID;
    }

    /**
     * Sets the value of the couponID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCouponID(String value) {
        this.couponID = value;
    }

    /**
     * Gets the value of the couponAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCouponAmount() {
        return couponAmount;
    }

    /**
     * Sets the value of the couponAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCouponAmount(String value) {
        this.couponAmount = value;
    }

    /**
     * Gets the value of the couponAmountCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCouponAmountCurrency() {
        return couponAmountCurrency;
    }

    /**
     * Sets the value of the couponAmountCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCouponAmountCurrency(String value) {
        this.couponAmountCurrency = value;
    }

    /**
     * Gets the value of the loyaltyCardDiscountAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoyaltyCardDiscountAmount() {
        return loyaltyCardDiscountAmount;
    }

    /**
     * Sets the value of the loyaltyCardDiscountAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoyaltyCardDiscountAmount(String value) {
        this.loyaltyCardDiscountAmount = value;
    }

    /**
     * Gets the value of the loyaltyCardDiscountCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoyaltyCardDiscountCurrency() {
        return loyaltyCardDiscountCurrency;
    }

    /**
     * Sets the value of the loyaltyCardDiscountCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoyaltyCardDiscountCurrency(String value) {
        this.loyaltyCardDiscountCurrency = value;
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
     * Gets the value of the options property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the options property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OptionType }
     * 
     * 
     */
    public List<OptionType> getOptions() {
        if (options == null) {
            options = new ArrayList<OptionType>();
        }
        return this.options;
    }

}
