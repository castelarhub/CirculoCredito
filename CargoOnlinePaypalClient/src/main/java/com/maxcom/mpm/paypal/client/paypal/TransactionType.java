
package com.maxcom.mpm.paypal.client.paypal;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 *  
 *                        Contains information about a single transaction. A transaction contains information 
 *                        about the sale of a particular item. The system creates a transaction when a buyer 
 *                        has made a purchase (Fixed Price items) or is the winning bidder (BIN and auction 
 *                        items). A listing can be associated with one or more transactions in these cases:
 *                            	Multi-Item Fixed Price Listings
 *                            	Dutch Auction Listings
 *                       A listing is associated with a single transaction in these cases:
 *                            	Single-Item Fixed Price Listings
 *                            	Single-Item Auction Listings
 *                    
 * 
 * <p>Java class for TransactionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ebay:apis:eBLBaseComponents}AmountPaid" minOccurs="0"/>
 *         &lt;element name="Buyer" type="{urn:ebay:apis:eBLBaseComponents}UserType" minOccurs="0"/>
 *         &lt;element ref="{urn:ebay:apis:eBLBaseComponents}ShippingDetails" minOccurs="0"/>
 *         &lt;element name="ConvertedAmountPaid" type="{urn:ebay:apis:CoreComponentTypes}AmountType" minOccurs="0"/>
 *         &lt;element name="ConvertedTransactionPrice" type="{urn:ebay:apis:CoreComponentTypes}AmountType" minOccurs="0"/>
 *         &lt;element name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DepositType" type="{urn:ebay:apis:eBLBaseComponents}DepositTypeCodeType" minOccurs="0"/>
 *         &lt;element name="Item" type="{urn:ebay:apis:eBLBaseComponents}ItemType" minOccurs="0"/>
 *         &lt;element name="QuantityPurchased" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ShippingHandlingTotal" type="{urn:ebay:apis:CoreComponentTypes}AmountType" minOccurs="0"/>
 *         &lt;element name="Status" type="{urn:ebay:apis:eBLBaseComponents}TransactionStatusType" minOccurs="0"/>
 *         &lt;element ref="{urn:ebay:apis:eBLBaseComponents}TransactionID" minOccurs="0"/>
 *         &lt;element ref="{urn:ebay:apis:eBLBaseComponents}AuthorizationID"/>
 *         &lt;element name="TransactionPrice" type="{urn:ebay:apis:CoreComponentTypes}AmountType" minOccurs="0"/>
 *         &lt;element name="VATPercent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionType", propOrder = {
    "amountPaid",
    "buyer",
    "shippingDetails",
    "convertedAmountPaid",
    "convertedTransactionPrice",
    "createdDate",
    "depositType",
    "item",
    "quantityPurchased",
    "shippingHandlingTotal",
    "status",
    "transactionID",
    "authorizationID",
    "transactionPrice",
    "vatPercent"
})
public class TransactionType {

    @XmlElement(name = "AmountPaid")
    protected AmountType amountPaid;
    @XmlElement(name = "Buyer")
    protected UserType buyer;
    @XmlElement(name = "ShippingDetails")
    protected ShippingDetailsType shippingDetails;
    @XmlElement(name = "ConvertedAmountPaid")
    protected AmountType convertedAmountPaid;
    @XmlElement(name = "ConvertedTransactionPrice")
    protected AmountType convertedTransactionPrice;
    @XmlElement(name = "CreatedDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlElement(name = "DepositType")
    protected DepositTypeCodeType depositType;
    @XmlElement(name = "Item")
    protected ItemType item;
    @XmlElement(name = "QuantityPurchased")
    protected Integer quantityPurchased;
    @XmlElement(name = "ShippingHandlingTotal")
    protected AmountType shippingHandlingTotal;
    @XmlElement(name = "Status")
    protected TransactionStatusType status;
    @XmlElement(name = "TransactionID")
    protected String transactionID;
    @XmlElement(name = "AuthorizationID", required = true)
    protected String authorizationID;
    @XmlElement(name = "TransactionPrice")
    protected AmountType transactionPrice;
    @XmlElement(name = "VATPercent")
    protected BigDecimal vatPercent;

    /**
     *  
     * 						The amount the buyer paid for the item or agreed to pay, 
     * 						depending on how far into the checkout process the item is. 
     * 						If the seller allowed the buyer to change the item total, the buyer 
     * 						is able to change the total until the time that the transaction's 
     * 						status moves to Complete. Determine whether the buyer 
     * 						changed the amount by calling GetSellerTransactions or 
     * 						GetSellerTransactions and comparing the AmountPaid value 
     * 						to what the seller expected. For Motors items, AmountPaid is 
     * 						the amount paid by the buyer for the deposit.
     * 					
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAmountPaid() {
        return amountPaid;
    }

    /**
     * Sets the value of the amountPaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAmountPaid(AmountType value) {
        this.amountPaid = value;
    }

    /**
     * Gets the value of the buyer property.
     * 
     * @return
     *     possible object is
     *     {@link UserType }
     *     
     */
    public UserType getBuyer() {
        return buyer;
    }

    /**
     * Sets the value of the buyer property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserType }
     *     
     */
    public void setBuyer(UserType value) {
        this.buyer = value;
    }

    /**
     * 
     * 						Includes shipping payment data.  
     * 					
     * 
     * @return
     *     possible object is
     *     {@link ShippingDetailsType }
     *     
     */
    public ShippingDetailsType getShippingDetails() {
        return shippingDetails;
    }

    /**
     * Sets the value of the shippingDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingDetailsType }
     *     
     */
    public void setShippingDetails(ShippingDetailsType value) {
        this.shippingDetails = value;
    }

    /**
     * Gets the value of the convertedAmountPaid property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getConvertedAmountPaid() {
        return convertedAmountPaid;
    }

    /**
     * Sets the value of the convertedAmountPaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setConvertedAmountPaid(AmountType value) {
        this.convertedAmountPaid = value;
    }

    /**
     * Gets the value of the convertedTransactionPrice property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getConvertedTransactionPrice() {
        return convertedTransactionPrice;
    }

    /**
     * Sets the value of the convertedTransactionPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setConvertedTransactionPrice(AmountType value) {
        this.convertedTransactionPrice = value;
    }

    /**
     * Gets the value of the createdDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets the value of the createdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedDate(XMLGregorianCalendar value) {
        this.createdDate = value;
    }

    /**
     * Gets the value of the depositType property.
     * 
     * @return
     *     possible object is
     *     {@link DepositTypeCodeType }
     *     
     */
    public DepositTypeCodeType getDepositType() {
        return depositType;
    }

    /**
     * Sets the value of the depositType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepositTypeCodeType }
     *     
     */
    public void setDepositType(DepositTypeCodeType value) {
        this.depositType = value;
    }

    /**
     * Gets the value of the item property.
     * 
     * @return
     *     possible object is
     *     {@link ItemType }
     *     
     */
    public ItemType getItem() {
        return item;
    }

    /**
     * Sets the value of the item property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemType }
     *     
     */
    public void setItem(ItemType value) {
        this.item = value;
    }

    /**
     * Gets the value of the quantityPurchased property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuantityPurchased() {
        return quantityPurchased;
    }

    /**
     * Sets the value of the quantityPurchased property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuantityPurchased(Integer value) {
        this.quantityPurchased = value;
    }

    /**
     * Gets the value of the shippingHandlingTotal property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getShippingHandlingTotal() {
        return shippingHandlingTotal;
    }

    /**
     * Sets the value of the shippingHandlingTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setShippingHandlingTotal(AmountType value) {
        this.shippingHandlingTotal = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionStatusType }
     *     
     */
    public TransactionStatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionStatusType }
     *     
     */
    public void setStatus(TransactionStatusType value) {
        this.status = value;
    }

    /**
     *  
     * 			              	Unique identifier for a transaction. Returns 0 when Type=1 
     * 			             		(Chinese auction). Typically, an ItemID and a TransactionID 
     * 			             		uniquely identify a checkout  transaction.
     * 					
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionID() {
        return transactionID;
    }

    /**
     * Sets the value of the transactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionID(String value) {
        this.transactionID = value;
    }

    /**
     *  
     * 			              	Unique identifier for an authorization.
     *                               		
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizationID() {
        return authorizationID;
    }

    /**
     * Sets the value of the authorizationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizationID(String value) {
        this.authorizationID = value;
    }

    /**
     * Gets the value of the transactionPrice property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTransactionPrice() {
        return transactionPrice;
    }

    /**
     * Sets the value of the transactionPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTransactionPrice(AmountType value) {
        this.transactionPrice = value;
    }

    /**
     * Gets the value of the vatPercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVATPercent() {
        return vatPercent;
    }

    /**
     * Sets the value of the vatPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVATPercent(BigDecimal value) {
        this.vatPercent = value;
    }

}
