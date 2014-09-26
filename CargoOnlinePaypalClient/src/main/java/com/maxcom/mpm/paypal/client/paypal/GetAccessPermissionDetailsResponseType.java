
package com.maxcom.mpm.paypal.client.paypal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetAccessPermissionDetailsResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetAccessPermissionDetailsResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ebay:apis:eBLBaseComponents}GetAccessPermissionDetailsResponseDetails"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAccessPermissionDetailsResponseType", namespace = "urn:ebay:api:PayPalAPI", propOrder = {
    "getAccessPermissionDetailsResponseDetails"
})
public class GetAccessPermissionDetailsResponseType
    extends AbstractResponseType
{

    @XmlElement(name = "GetAccessPermissionDetailsResponseDetails", namespace = "urn:ebay:apis:eBLBaseComponents", required = true)
    protected GetAccessPermissionDetailsResponseDetailsType getAccessPermissionDetailsResponseDetails;

    /**
     * Gets the value of the getAccessPermissionDetailsResponseDetails property.
     * 
     * @return
     *     possible object is
     *     {@link GetAccessPermissionDetailsResponseDetailsType }
     *     
     */
    public GetAccessPermissionDetailsResponseDetailsType getGetAccessPermissionDetailsResponseDetails() {
        return getAccessPermissionDetailsResponseDetails;
    }

    /**
     * Sets the value of the getAccessPermissionDetailsResponseDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetAccessPermissionDetailsResponseDetailsType }
     *     
     */
    public void setGetAccessPermissionDetailsResponseDetails(GetAccessPermissionDetailsResponseDetailsType value) {
        this.getAccessPermissionDetailsResponseDetails = value;
    }

}
