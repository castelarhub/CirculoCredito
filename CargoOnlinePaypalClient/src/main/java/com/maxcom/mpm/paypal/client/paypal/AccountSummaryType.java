
package com.maxcom.mpm.paypal.client.paypal;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 *                      Includes account summary for the user. 
 *              
 * 
 * <p>Java class for AccountSummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountSummaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="AccountState" type="{urn:ebay:apis:eBLBaseComponents}AccountStateCodeType" minOccurs="0"/>
 *         &lt;element name="AdditionalAccount" type="{urn:ebay:apis:eBLBaseComponents}AdditionalAccountType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AdditionalAccountsCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element ref="{urn:ebay:apis:eBLBaseComponents}AmountPastDue" minOccurs="0"/>
 *         &lt;element name="BankAccountInfo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BankModifyDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="BillingCycleDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="CCExp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="CCInfo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CCModifyDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element ref="{urn:ebay:apis:eBLBaseComponents}CurrentBalance"/>
 *         &lt;element name="LastAmountPaid" type="{urn:ebay:apis:CoreComponentTypes}AmountType"/>
 *         &lt;element name="LastInvoiceAmount" type="{urn:ebay:apis:CoreComponentTypes}AmountType"/>
 *         &lt;element name="LastInvoiceDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="LastPaymentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="PastDue" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="PaymentMethod" type="{urn:ebay:apis:eBLBaseComponents}SellerPaymentMethodCodeType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountSummaryType", propOrder = {
    "content"
})
public class AccountSummaryType {

    @XmlElementRefs({
        @XmlElementRef(name = "AdditionalAccountsCount", namespace = "urn:ebay:apis:eBLBaseComponents", type = JAXBElement.class),
        @XmlElementRef(name = "LastInvoiceDate", namespace = "urn:ebay:apis:eBLBaseComponents", type = JAXBElement.class),
        @XmlElementRef(name = "LastAmountPaid", namespace = "urn:ebay:apis:eBLBaseComponents", type = JAXBElement.class),
        @XmlElementRef(name = "PaymentMethod", namespace = "urn:ebay:apis:eBLBaseComponents", type = JAXBElement.class),
        @XmlElementRef(name = "CCExp", namespace = "urn:ebay:apis:eBLBaseComponents", type = JAXBElement.class),
        @XmlElementRef(name = "CurrentBalance", namespace = "urn:ebay:apis:eBLBaseComponents", type = JAXBElement.class),
        @XmlElementRef(name = "PastDue", namespace = "urn:ebay:apis:eBLBaseComponents", type = JAXBElement.class),
        @XmlElementRef(name = "CCInfo", namespace = "urn:ebay:apis:eBLBaseComponents", type = JAXBElement.class),
        @XmlElementRef(name = "LastInvoiceAmount", namespace = "urn:ebay:apis:eBLBaseComponents", type = JAXBElement.class),
        @XmlElementRef(name = "LastPaymentDate", namespace = "urn:ebay:apis:eBLBaseComponents", type = JAXBElement.class),
        @XmlElementRef(name = "BankAccountInfo", namespace = "urn:ebay:apis:eBLBaseComponents", type = JAXBElement.class),
        @XmlElementRef(name = "CCModifyDate", namespace = "urn:ebay:apis:eBLBaseComponents", type = JAXBElement.class),
        @XmlElementRef(name = "AmountPastDue", namespace = "urn:ebay:apis:eBLBaseComponents", type = JAXBElement.class),
        @XmlElementRef(name = "AccountState", namespace = "urn:ebay:apis:eBLBaseComponents", type = JAXBElement.class),
        @XmlElementRef(name = "BillingCycleDate", namespace = "urn:ebay:apis:eBLBaseComponents", type = JAXBElement.class),
        @XmlElementRef(name = "BankModifyDate", namespace = "urn:ebay:apis:eBLBaseComponents", type = JAXBElement.class),
        @XmlElementRef(name = "AdditionalAccount", namespace = "urn:ebay:apis:eBLBaseComponents", type = JAXBElement.class)
    })
    @XmlMixed
    protected List<Serializable> content;

    /**
     * 
     *                      Includes account summary for the user. 
     *              Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * {@link JAXBElement }{@code <}{@link SellerPaymentMethodCodeType }{@code >}
     * {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     * {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     * {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     * {@link JAXBElement }{@code <}{@link AccountStateCodeType }{@code >}
     * {@link String }
     * {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * {@link JAXBElement }{@code <}{@link AdditionalAccountType }{@code >}
     * 
     * 
     */
    public List<Serializable> getContent() {
        if (content == null) {
            content = new ArrayList<Serializable>();
        }
        return this.content;
    }

}
