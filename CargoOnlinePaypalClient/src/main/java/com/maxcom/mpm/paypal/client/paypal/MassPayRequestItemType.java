
package com.maxcom.mpm.paypal.client.paypal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 					MassPayRequestItemType
 * 				
 * 
 * <p>Java class for MassPayRequestItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MassPayRequestItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReceiverEmail" type="{urn:ebay:apis:eBLBaseComponents}EmailAddressType" minOccurs="0"/>
 *         &lt;element name="ReceiverPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReceiverID" type="{urn:ebay:apis:eBLBaseComponents}UserIDType" minOccurs="0"/>
 *         &lt;element name="Amount" type="{urn:ebay:apis:CoreComponentTypes}BasicAmountType"/>
 *         &lt;element name="UniqueId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MassPayRequestItemType", namespace = "urn:ebay:api:PayPalAPI", propOrder = {
    "receiverEmail",
    "receiverPhone",
    "receiverID",
    "amount",
    "uniqueId",
    "note"
})
public class MassPayRequestItemType {

    @XmlElement(name = "ReceiverEmail")
    protected String receiverEmail;
    @XmlElement(name = "ReceiverPhone")
    protected String receiverPhone;
    @XmlElement(name = "ReceiverID")
    protected String receiverID;
    @XmlElement(name = "Amount", required = true)
    protected BasicAmountType amount;
    @XmlElement(name = "UniqueId")
    protected String uniqueId;
    @XmlElement(name = "Note")
    protected String note;

    /**
     * Gets the value of the receiverEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverEmail() {
        return receiverEmail;
    }

    /**
     * Sets the value of the receiverEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverEmail(String value) {
        this.receiverEmail = value;
    }

    /**
     * Gets the value of the receiverPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverPhone() {
        return receiverPhone;
    }

    /**
     * Sets the value of the receiverPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverPhone(String value) {
        this.receiverPhone = value;
    }

    /**
     * Gets the value of the receiverID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverID() {
        return receiverID;
    }

    /**
     * Sets the value of the receiverID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverID(String value) {
        this.receiverID = value;
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
     * Gets the value of the uniqueId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniqueId() {
        return uniqueId;
    }

    /**
     * Sets the value of the uniqueId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniqueId(String value) {
        this.uniqueId = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

}
