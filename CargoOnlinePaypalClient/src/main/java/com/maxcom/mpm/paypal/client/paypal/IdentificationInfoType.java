
package com.maxcom.mpm.paypal.client.paypal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IdentificationInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IdentificationInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MobileIDInfo" type="{urn:ebay:apis:eBLBaseComponents}MobileIDInfoType" minOccurs="0"/>
 *         &lt;element name="RememberMeIDInfo" type="{urn:ebay:apis:eBLBaseComponents}RememberMeIDInfoType" minOccurs="0"/>
 *         &lt;element name="IdentityTokenInfo" type="{urn:ebay:apis:eBLBaseComponents}IdentityTokenInfoType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentificationInfoType", propOrder = {
    "mobileIDInfo",
    "rememberMeIDInfo",
    "identityTokenInfo"
})
public class IdentificationInfoType {

    @XmlElement(name = "MobileIDInfo")
    protected MobileIDInfoType mobileIDInfo;
    @XmlElement(name = "RememberMeIDInfo")
    protected RememberMeIDInfoType rememberMeIDInfo;
    @XmlElement(name = "IdentityTokenInfo")
    protected IdentityTokenInfoType identityTokenInfo;

    /**
     * Gets the value of the mobileIDInfo property.
     * 
     * @return
     *     possible object is
     *     {@link MobileIDInfoType }
     *     
     */
    public MobileIDInfoType getMobileIDInfo() {
        return mobileIDInfo;
    }

    /**
     * Sets the value of the mobileIDInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobileIDInfoType }
     *     
     */
    public void setMobileIDInfo(MobileIDInfoType value) {
        this.mobileIDInfo = value;
    }

    /**
     * Gets the value of the rememberMeIDInfo property.
     * 
     * @return
     *     possible object is
     *     {@link RememberMeIDInfoType }
     *     
     */
    public RememberMeIDInfoType getRememberMeIDInfo() {
        return rememberMeIDInfo;
    }

    /**
     * Sets the value of the rememberMeIDInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RememberMeIDInfoType }
     *     
     */
    public void setRememberMeIDInfo(RememberMeIDInfoType value) {
        this.rememberMeIDInfo = value;
    }

    /**
     * Gets the value of the identityTokenInfo property.
     * 
     * @return
     *     possible object is
     *     {@link IdentityTokenInfoType }
     *     
     */
    public IdentityTokenInfoType getIdentityTokenInfo() {
        return identityTokenInfo;
    }

    /**
     * Sets the value of the identityTokenInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentityTokenInfoType }
     *     
     */
    public void setIdentityTokenInfo(IdentityTokenInfoType value) {
        this.identityTokenInfo = value;
    }

}
