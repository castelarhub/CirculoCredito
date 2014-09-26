
package com.maxcom.mpm.paypal.client.paypal;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionSearchResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionSearchResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ebay:apis:eBLBaseComponents}PaymentTransactions" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionSearchResponseType", namespace = "urn:ebay:api:PayPalAPI", propOrder = {
    "paymentTransactions"
})
public class TransactionSearchResponseType
    extends AbstractResponseType
{

    @XmlElement(name = "PaymentTransactions", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<PaymentTransactionSearchResultType> paymentTransactions;

    /**
     * Results of a Transaction Search.Gets the value of the paymentTransactions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentTransactions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentTransactions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentTransactionSearchResultType }
     * 
     * 
     */
    public List<PaymentTransactionSearchResultType> getPaymentTransactions() {
        if (paymentTransactions == null) {
            paymentTransactions = new ArrayList<PaymentTransactionSearchResultType>();
        }
        return this.paymentTransactions;
    }

}
