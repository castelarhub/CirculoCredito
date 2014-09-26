
package com.maxcom.mpm.paypal.client.paypal;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				PaymentDetailsItemType 
 * 				Information about a Payment Item.
 * 			
 * 
 * <p>Java class for PaymentDetailsItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentDetailsItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="Tax" type="{urn:ebay:apis:CoreComponentTypes}BasicAmountType" minOccurs="0"/>
 *         &lt;element name="Amount" type="{urn:ebay:apis:CoreComponentTypes}BasicAmountType" minOccurs="0"/>
 *         &lt;element name="EbayItemPaymentDetailsItem" type="{urn:ebay:apis:eBLBaseComponents}EbayItemPaymentDetailsItemType" minOccurs="0"/>
 *         &lt;element name="PromoCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductCategory" type="{urn:ebay:apis:eBLBaseComponents}ProductCategoryType" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ItemWeight" type="{urn:ebay:apis:CoreComponentTypes}MeasureType" minOccurs="0"/>
 *         &lt;element name="ItemLength" type="{urn:ebay:apis:CoreComponentTypes}MeasureType" minOccurs="0"/>
 *         &lt;element name="ItemWidth" type="{urn:ebay:apis:CoreComponentTypes}MeasureType" minOccurs="0"/>
 *         &lt;element name="ItemHeight" type="{urn:ebay:apis:CoreComponentTypes}MeasureType" minOccurs="0"/>
 *         &lt;element name="ItemURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EnhancedItemData" type="{urn:ebay:apis:EnhancedDataTypes}EnhancedItemDataType" minOccurs="0"/>
 *         &lt;element name="ItemCategory" type="{urn:ebay:apis:eBLBaseComponents}ItemCategoryType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentDetailsItemType", propOrder = {
    "name",
    "number",
    "quantity",
    "tax",
    "amount",
    "ebayItemPaymentDetailsItem",
    "promoCode",
    "productCategory",
    "description",
    "itemWeight",
    "itemLength",
    "itemWidth",
    "itemHeight",
    "itemURL",
    "enhancedItemData",
    "itemCategory"
})
public class PaymentDetailsItemType {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Number")
    protected String number;
    @XmlElement(name = "Quantity")
    protected BigInteger quantity;
    @XmlElement(name = "Tax")
    protected BasicAmountType tax;
    @XmlElement(name = "Amount")
    protected BasicAmountType amount;
    @XmlElement(name = "EbayItemPaymentDetailsItem")
    protected EbayItemPaymentDetailsItemType ebayItemPaymentDetailsItem;
    @XmlElement(name = "PromoCode")
    protected String promoCode;
    @XmlElement(name = "ProductCategory")
    protected ProductCategoryType productCategory;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "ItemWeight")
    protected MeasureType itemWeight;
    @XmlElement(name = "ItemLength")
    protected MeasureType itemLength;
    @XmlElement(name = "ItemWidth")
    protected MeasureType itemWidth;
    @XmlElement(name = "ItemHeight")
    protected MeasureType itemHeight;
    @XmlElement(name = "ItemURL")
    protected String itemURL;
    @XmlElement(name = "EnhancedItemData")
    protected EnhancedItemDataType enhancedItemData;
    @XmlElement(name = "ItemCategory")
    protected ItemCategoryType itemCategory;

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
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQuantity(BigInteger value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the tax property.
     * 
     * @return
     *     possible object is
     *     {@link BasicAmountType }
     *     
     */
    public BasicAmountType getTax() {
        return tax;
    }

    /**
     * Sets the value of the tax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicAmountType }
     *     
     */
    public void setTax(BasicAmountType value) {
        this.tax = value;
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
     * Gets the value of the ebayItemPaymentDetailsItem property.
     * 
     * @return
     *     possible object is
     *     {@link EbayItemPaymentDetailsItemType }
     *     
     */
    public EbayItemPaymentDetailsItemType getEbayItemPaymentDetailsItem() {
        return ebayItemPaymentDetailsItem;
    }

    /**
     * Sets the value of the ebayItemPaymentDetailsItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link EbayItemPaymentDetailsItemType }
     *     
     */
    public void setEbayItemPaymentDetailsItem(EbayItemPaymentDetailsItemType value) {
        this.ebayItemPaymentDetailsItem = value;
    }

    /**
     * Gets the value of the promoCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromoCode() {
        return promoCode;
    }

    /**
     * Sets the value of the promoCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromoCode(String value) {
        this.promoCode = value;
    }

    /**
     * Gets the value of the productCategory property.
     * 
     * @return
     *     possible object is
     *     {@link ProductCategoryType }
     *     
     */
    public ProductCategoryType getProductCategory() {
        return productCategory;
    }

    /**
     * Sets the value of the productCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductCategoryType }
     *     
     */
    public void setProductCategory(ProductCategoryType value) {
        this.productCategory = value;
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
     * Gets the value of the itemWeight property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getItemWeight() {
        return itemWeight;
    }

    /**
     * Sets the value of the itemWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setItemWeight(MeasureType value) {
        this.itemWeight = value;
    }

    /**
     * Gets the value of the itemLength property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getItemLength() {
        return itemLength;
    }

    /**
     * Sets the value of the itemLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setItemLength(MeasureType value) {
        this.itemLength = value;
    }

    /**
     * Gets the value of the itemWidth property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getItemWidth() {
        return itemWidth;
    }

    /**
     * Sets the value of the itemWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setItemWidth(MeasureType value) {
        this.itemWidth = value;
    }

    /**
     * Gets the value of the itemHeight property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getItemHeight() {
        return itemHeight;
    }

    /**
     * Sets the value of the itemHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setItemHeight(MeasureType value) {
        this.itemHeight = value;
    }

    /**
     * Gets the value of the itemURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemURL() {
        return itemURL;
    }

    /**
     * Sets the value of the itemURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemURL(String value) {
        this.itemURL = value;
    }

    /**
     * Gets the value of the enhancedItemData property.
     * 
     * @return
     *     possible object is
     *     {@link EnhancedItemDataType }
     *     
     */
    public EnhancedItemDataType getEnhancedItemData() {
        return enhancedItemData;
    }

    /**
     * Sets the value of the enhancedItemData property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnhancedItemDataType }
     *     
     */
    public void setEnhancedItemData(EnhancedItemDataType value) {
        this.enhancedItemData = value;
    }

    /**
     * Gets the value of the itemCategory property.
     * 
     * @return
     *     possible object is
     *     {@link ItemCategoryType }
     *     
     */
    public ItemCategoryType getItemCategory() {
        return itemCategory;
    }

    /**
     * Sets the value of the itemCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemCategoryType }
     *     
     */
    public void setItemCategory(ItemCategoryType value) {
        this.itemCategory = value;
    }

}
