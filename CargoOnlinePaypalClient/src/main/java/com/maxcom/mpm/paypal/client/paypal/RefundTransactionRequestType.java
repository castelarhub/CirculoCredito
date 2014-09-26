
package com.maxcom.mpm.paypal.client.paypal;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RefundTransactionRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RefundTransactionRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="TransactionID" type="{urn:ebay:apis:eBLBaseComponents}TransactionId" minOccurs="0"/>
 *         &lt;element name="PayerID" type="{urn:ebay:apis:eBLBaseComponents}UserIDType" minOccurs="0"/>
 *         &lt;element name="InvoiceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RefundType" type="{urn:ebay:apis:eBLBaseComponents}RefundType" minOccurs="0"/>
 *         &lt;element name="Amount" type="{urn:ebay:apis:CoreComponentTypes}BasicAmountType" minOccurs="0"/>
 *         &lt;element name="Memo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RetryUntil" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="RefundSource" type="{urn:ebay:apis:eBLBaseComponents}RefundSourceCodeType" minOccurs="0"/>
 *         &lt;element name="RefundAdvice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element ref="{urn:ebay:apis:eBLBaseComponents}MerchantStoreDetails" minOccurs="0"/>
 *         &lt;element ref="{urn:ebay:apis:eBLBaseComponents}RefundItemDetails" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MsgSubID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RefundTransactionRequestType", namespace = "urn:ebay:api:PayPalAPI", propOrder = {
    "transactionID",
    "payerID",
    "invoiceID",
    "refundType",
    "amount",
    "memo",
    "retryUntil",
    "refundSource",
    "refundAdvice",
    "merchantStoreDetails",
    "refundItemDetails",
    "msgSubID"
})
public class RefundTransactionRequestType
    extends AbstractRequestType
{

    @XmlElement(name = "TransactionID")
    protected String transactionID;
    @XmlElement(name = "PayerID")
    protected String payerID;
    @XmlElement(name = "InvoiceID")
    protected String invoiceID;
    @XmlElement(name = "RefundType")
    protected RefundType refundType;
    @XmlElement(name = "Amount")
    protected BasicAmountType amount;
    @XmlElement(name = "Memo")
    protected String memo;
    @XmlElement(name = "RetryUntil")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar retryUntil;
    @XmlElement(name = "RefundSource")
    protected RefundSourceCodeType refundSource;
    @XmlElement(name = "RefundAdvice")
    protected Boolean refundAdvice;
    @XmlElement(name = "MerchantStoreDetails", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected MerchantStoreDetailsType merchantStoreDetails;
    @XmlElement(name = "RefundItemDetails", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<InvoiceItemType> refundItemDetails;
    @XmlElement(name = "MsgSubID")
    protected String msgSubID;

    /**
     * Gets the value of the transactionID property.
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
     * Gets the value of the payerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerID() {
        return payerID;
    }

    /**
     * Sets the value of the payerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerID(String value) {
        this.payerID = value;
    }

    /**
     * Gets the value of the invoiceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceID() {
        return invoiceID;
    }

    /**
     * Sets the value of the invoiceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceID(String value) {
        this.invoiceID = value;
    }

    /**
     * Gets the value of the refundType property.
     * 
     * @return
     *     possible object is
     *     {@link RefundType }
     *     
     */
    public RefundType getRefundType() {
        return refundType;
    }

    /**
     * Sets the value of the refundType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefundType }
     *     
     */
    public void setRefundType(RefundType value) {
        this.refundType = value;
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
     * Gets the value of the memo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemo() {
        return memo;
    }

    /**
     * Sets the value of the memo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemo(String value) {
        this.memo = value;
    }

    /**
     * Gets the value of the retryUntil property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRetryUntil() {
        return retryUntil;
    }

    /**
     * Sets the value of the retryUntil property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRetryUntil(XMLGregorianCalendar value) {
        this.retryUntil = value;
    }

    /**
     * Gets the value of the refundSource property.
     * 
     * @return
     *     possible object is
     *     {@link RefundSourceCodeType }
     *     
     */
    public RefundSourceCodeType getRefundSource() {
        return refundSource;
    }

    /**
     * Sets the value of the refundSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefundSourceCodeType }
     *     
     */
    public void setRefundSource(RefundSourceCodeType value) {
        this.refundSource = value;
    }

    /**
     * Gets the value of the refundAdvice property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRefundAdvice() {
        return refundAdvice;
    }

    /**
     * Sets the value of the refundAdvice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRefundAdvice(Boolean value) {
        this.refundAdvice = value;
    }

    /**
     * To pass the Merchant store information
     *                     
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;br xmlns="http://www.w3.org/2001/XMLSchema" xmlns:SOAP-ENC="http://schemas.xmlsoap.org/soap/encoding/" xmlns:cc="urn:ebay:apis:CoreComponentTypes" xmlns:ebl="urn:ebay:apis:eBLBaseComponents" xmlns:ed="urn:ebay:apis:EnhancedDataTypes" xmlns:ns="urn:ebay:api:PayPalAPI" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:wsdlsoap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsd="http://www.w3.org/2001/XMLSchema"/&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;br xmlns="http://www.w3.org/2001/XMLSchema" xmlns:SOAP-ENC="http://schemas.xmlsoap.org/soap/encoding/" xmlns:cc="urn:ebay:apis:CoreComponentTypes" xmlns:ebl="urn:ebay:apis:eBLBaseComponents" xmlns:ed="urn:ebay:apis:EnhancedDataTypes" xmlns:ns="urn:ebay:api:PayPalAPI" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:wsdlsoap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsd="http://www.w3.org/2001/XMLSchema"/&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;b xmlns="http://www.w3.org/2001/XMLSchema" xmlns:SOAP-ENC="http://schemas.xmlsoap.org/soap/encoding/" xmlns:cc="urn:ebay:apis:CoreComponentTypes" xmlns:ebl="urn:ebay:apis:eBLBaseComponents" xmlns:ed="urn:ebay:apis:EnhancedDataTypes" xmlns:ns="urn:ebay:api:PayPalAPI" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:wsdlsoap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Optional&lt;/b&gt;
     * </pre>
     * 
     * 
     * @return
     *     possible object is
     *     {@link MerchantStoreDetailsType }
     *     
     */
    public MerchantStoreDetailsType getMerchantStoreDetails() {
        return merchantStoreDetails;
    }

    /**
     * Sets the value of the merchantStoreDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link MerchantStoreDetailsType }
     *     
     */
    public void setMerchantStoreDetails(MerchantStoreDetailsType value) {
        this.merchantStoreDetails = value;
    }

    /**
     * Information about the individual details of the items to be refunded.
     *                     
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;br xmlns="http://www.w3.org/2001/XMLSchema" xmlns:SOAP-ENC="http://schemas.xmlsoap.org/soap/encoding/" xmlns:cc="urn:ebay:apis:CoreComponentTypes" xmlns:ebl="urn:ebay:apis:eBLBaseComponents" xmlns:ed="urn:ebay:apis:EnhancedDataTypes" xmlns:ns="urn:ebay:api:PayPalAPI" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:wsdlsoap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsd="http://www.w3.org/2001/XMLSchema"/&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;b xmlns="http://www.w3.org/2001/XMLSchema" xmlns:SOAP-ENC="http://schemas.xmlsoap.org/soap/encoding/" xmlns:cc="urn:ebay:apis:CoreComponentTypes" xmlns:ebl="urn:ebay:apis:eBLBaseComponents" xmlns:ed="urn:ebay:apis:EnhancedDataTypes" xmlns:ns="urn:ebay:api:PayPalAPI" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:wsdlsoap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Optional&lt;/b&gt;
     * </pre>
     * Gets the value of the refundItemDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refundItemDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefundItemDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvoiceItemType }
     * 
     * 
     */
    public List<InvoiceItemType> getRefundItemDetails() {
        if (refundItemDetails == null) {
            refundItemDetails = new ArrayList<InvoiceItemType>();
        }
        return this.refundItemDetails;
    }

    /**
     * Gets the value of the msgSubID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgSubID() {
        return msgSubID;
    }

    /**
     * Sets the value of the msgSubID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgSubID(String value) {
        this.msgSubID = value;
    }

}
