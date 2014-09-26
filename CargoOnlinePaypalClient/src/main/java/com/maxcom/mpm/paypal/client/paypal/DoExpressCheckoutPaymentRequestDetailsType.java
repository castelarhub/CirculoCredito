
package com.maxcom.mpm.paypal.client.paypal;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DoExpressCheckoutPaymentRequestDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DoExpressCheckoutPaymentRequestDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PaymentAction" type="{urn:ebay:apis:eBLBaseComponents}PaymentActionCodeType" minOccurs="0"/>
 *         &lt;element name="Token" type="{urn:ebay:apis:eBLBaseComponents}ExpressCheckoutTokenType"/>
 *         &lt;element name="PayerID" type="{urn:ebay:apis:eBLBaseComponents}UserIDType"/>
 *         &lt;element name="OrderURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MsgSubID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentDetails" type="{urn:ebay:apis:eBLBaseComponents}PaymentDetailsType" maxOccurs="10" minOccurs="0"/>
 *         &lt;element name="PromoOverrideFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PromoCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EnhancedData" type="{urn:ebay:apis:eBLBaseComponents}EnhancedDataType" minOccurs="0"/>
 *         &lt;element name="SoftDescriptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserSelectedOptions" type="{urn:ebay:apis:eBLBaseComponents}UserSelectedOptionType" minOccurs="0"/>
 *         &lt;element name="GiftMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GiftReceiptEnable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GiftWrapName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GiftWrapAmount" type="{urn:ebay:apis:CoreComponentTypes}BasicAmountType" minOccurs="0"/>
 *         &lt;element name="BuyerMarketingEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SurveyQuestion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SurveyChoiceSelected" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ButtonSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SkipBACreation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UseSessionPaymentDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CoupledBuckets" type="{urn:ebay:apis:eBLBaseComponents}CoupledBucketsType" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="ClientID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductLine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DoExpressCheckoutPaymentRequestDetailsType", propOrder = {
    "paymentAction",
    "token",
    "payerID",
    "orderURL",
    "msgSubID",
    "paymentDetails",
    "promoOverrideFlag",
    "promoCode",
    "enhancedData",
    "softDescriptor",
    "userSelectedOptions",
    "giftMessage",
    "giftReceiptEnable",
    "giftWrapName",
    "giftWrapAmount",
    "buyerMarketingEmail",
    "surveyQuestion",
    "surveyChoiceSelected",
    "buttonSource",
    "skipBACreation",
    "useSessionPaymentDetails",
    "coupledBuckets",
    "clientID",
    "productLine"
})
public class DoExpressCheckoutPaymentRequestDetailsType {

    @XmlElement(name = "PaymentAction")
    protected PaymentActionCodeType paymentAction;
    @XmlElement(name = "Token", required = true)
    protected String token;
    @XmlElement(name = "PayerID", required = true)
    protected String payerID;
    @XmlElement(name = "OrderURL")
    protected String orderURL;
    @XmlElement(name = "MsgSubID")
    protected String msgSubID;
    @XmlElement(name = "PaymentDetails")
    protected List<PaymentDetailsType> paymentDetails;
    @XmlElement(name = "PromoOverrideFlag")
    protected String promoOverrideFlag;
    @XmlElement(name = "PromoCode")
    protected String promoCode;
    @XmlElement(name = "EnhancedData")
    protected EnhancedDataType enhancedData;
    @XmlElement(name = "SoftDescriptor")
    protected String softDescriptor;
    @XmlElement(name = "UserSelectedOptions")
    protected UserSelectedOptionType userSelectedOptions;
    @XmlElement(name = "GiftMessage")
    protected String giftMessage;
    @XmlElement(name = "GiftReceiptEnable")
    protected String giftReceiptEnable;
    @XmlElement(name = "GiftWrapName")
    protected String giftWrapName;
    @XmlElement(name = "GiftWrapAmount")
    protected BasicAmountType giftWrapAmount;
    @XmlElement(name = "BuyerMarketingEmail")
    protected String buyerMarketingEmail;
    @XmlElement(name = "SurveyQuestion")
    protected String surveyQuestion;
    @XmlElement(name = "SurveyChoiceSelected")
    protected List<String> surveyChoiceSelected;
    @XmlElement(name = "ButtonSource")
    protected String buttonSource;
    @XmlElement(name = "SkipBACreation")
    protected Boolean skipBACreation;
    @XmlElement(name = "UseSessionPaymentDetails")
    protected String useSessionPaymentDetails;
    @XmlElement(name = "CoupledBuckets")
    protected List<CoupledBucketsType> coupledBuckets;
    @XmlElement(name = "ClientID")
    protected String clientID;
    @XmlElement(name = "ProductLine")
    protected String productLine;

    /**
     * Gets the value of the paymentAction property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentActionCodeType }
     *     
     */
    public PaymentActionCodeType getPaymentAction() {
        return paymentAction;
    }

    /**
     * Sets the value of the paymentAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentActionCodeType }
     *     
     */
    public void setPaymentAction(PaymentActionCodeType value) {
        this.paymentAction = value;
    }

    /**
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
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
     * Gets the value of the orderURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderURL() {
        return orderURL;
    }

    /**
     * Sets the value of the orderURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderURL(String value) {
        this.orderURL = value;
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

    /**
     * Gets the value of the paymentDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentDetailsType }
     * 
     * 
     */
    public List<PaymentDetailsType> getPaymentDetails() {
        if (paymentDetails == null) {
            paymentDetails = new ArrayList<PaymentDetailsType>();
        }
        return this.paymentDetails;
    }

    /**
     * Gets the value of the promoOverrideFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromoOverrideFlag() {
        return promoOverrideFlag;
    }

    /**
     * Sets the value of the promoOverrideFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromoOverrideFlag(String value) {
        this.promoOverrideFlag = value;
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
     * Gets the value of the enhancedData property.
     * 
     * @return
     *     possible object is
     *     {@link EnhancedDataType }
     *     
     */
    public EnhancedDataType getEnhancedData() {
        return enhancedData;
    }

    /**
     * Sets the value of the enhancedData property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnhancedDataType }
     *     
     */
    public void setEnhancedData(EnhancedDataType value) {
        this.enhancedData = value;
    }

    /**
     * Gets the value of the softDescriptor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoftDescriptor() {
        return softDescriptor;
    }

    /**
     * Sets the value of the softDescriptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoftDescriptor(String value) {
        this.softDescriptor = value;
    }

    /**
     * Gets the value of the userSelectedOptions property.
     * 
     * @return
     *     possible object is
     *     {@link UserSelectedOptionType }
     *     
     */
    public UserSelectedOptionType getUserSelectedOptions() {
        return userSelectedOptions;
    }

    /**
     * Sets the value of the userSelectedOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserSelectedOptionType }
     *     
     */
    public void setUserSelectedOptions(UserSelectedOptionType value) {
        this.userSelectedOptions = value;
    }

    /**
     * Gets the value of the giftMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiftMessage() {
        return giftMessage;
    }

    /**
     * Sets the value of the giftMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiftMessage(String value) {
        this.giftMessage = value;
    }

    /**
     * Gets the value of the giftReceiptEnable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiftReceiptEnable() {
        return giftReceiptEnable;
    }

    /**
     * Sets the value of the giftReceiptEnable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiftReceiptEnable(String value) {
        this.giftReceiptEnable = value;
    }

    /**
     * Gets the value of the giftWrapName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiftWrapName() {
        return giftWrapName;
    }

    /**
     * Sets the value of the giftWrapName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiftWrapName(String value) {
        this.giftWrapName = value;
    }

    /**
     * Gets the value of the giftWrapAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BasicAmountType }
     *     
     */
    public BasicAmountType getGiftWrapAmount() {
        return giftWrapAmount;
    }

    /**
     * Sets the value of the giftWrapAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicAmountType }
     *     
     */
    public void setGiftWrapAmount(BasicAmountType value) {
        this.giftWrapAmount = value;
    }

    /**
     * Gets the value of the buyerMarketingEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyerMarketingEmail() {
        return buyerMarketingEmail;
    }

    /**
     * Sets the value of the buyerMarketingEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyerMarketingEmail(String value) {
        this.buyerMarketingEmail = value;
    }

    /**
     * Gets the value of the surveyQuestion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurveyQuestion() {
        return surveyQuestion;
    }

    /**
     * Sets the value of the surveyQuestion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurveyQuestion(String value) {
        this.surveyQuestion = value;
    }

    /**
     * Gets the value of the surveyChoiceSelected property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the surveyChoiceSelected property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSurveyChoiceSelected().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSurveyChoiceSelected() {
        if (surveyChoiceSelected == null) {
            surveyChoiceSelected = new ArrayList<String>();
        }
        return this.surveyChoiceSelected;
    }

    /**
     * Gets the value of the buttonSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getButtonSource() {
        return buttonSource;
    }

    /**
     * Sets the value of the buttonSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setButtonSource(String value) {
        this.buttonSource = value;
    }

    /**
     * Gets the value of the skipBACreation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSkipBACreation() {
        return skipBACreation;
    }

    /**
     * Sets the value of the skipBACreation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSkipBACreation(Boolean value) {
        this.skipBACreation = value;
    }

    /**
     * Gets the value of the useSessionPaymentDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseSessionPaymentDetails() {
        return useSessionPaymentDetails;
    }

    /**
     * Sets the value of the useSessionPaymentDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseSessionPaymentDetails(String value) {
        this.useSessionPaymentDetails = value;
    }

    /**
     * Gets the value of the coupledBuckets property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coupledBuckets property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoupledBuckets().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CoupledBucketsType }
     * 
     * 
     */
    public List<CoupledBucketsType> getCoupledBuckets() {
        if (coupledBuckets == null) {
            coupledBuckets = new ArrayList<CoupledBucketsType>();
        }
        return this.coupledBuckets;
    }

    /**
     * Gets the value of the clientID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientID() {
        return clientID;
    }

    /**
     * Sets the value of the clientID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientID(String value) {
        this.clientID = value;
    }

    /**
     * Gets the value of the productLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductLine() {
        return productLine;
    }

    /**
     * Sets the value of the productLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductLine(String value) {
        this.productLine = value;
    }

}
