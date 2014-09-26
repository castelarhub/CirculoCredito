
package com.maxcom.mpm.paypal.client.paypal;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BMButtonSearchResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BMButtonSearchResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ebay:apis:eBLBaseComponents}ButtonSearchResult" maxOccurs="100" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BMButtonSearchResponseType", namespace = "urn:ebay:api:PayPalAPI", propOrder = {
    "buttonSearchResult"
})
public class BMButtonSearchResponseType
    extends AbstractResponseType
{

    @XmlElement(name = "ButtonSearchResult", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<ButtonSearchResultType> buttonSearchResult;

    /**
     * Gets the value of the buttonSearchResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the buttonSearchResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getButtonSearchResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ButtonSearchResultType }
     * 
     * 
     */
    public List<ButtonSearchResultType> getButtonSearchResult() {
        if (buttonSearchResult == null) {
            buttonSearchResult = new ArrayList<ButtonSearchResultType>();
        }
        return this.buttonSearchResult;
    }

}
