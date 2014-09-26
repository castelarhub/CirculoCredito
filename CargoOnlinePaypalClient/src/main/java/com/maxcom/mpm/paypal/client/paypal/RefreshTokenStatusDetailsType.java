
package com.maxcom.mpm.paypal.client.paypal;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RefreshTokenStatusDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RefreshTokenStatusDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RefreshTokenStatus" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="RefreshToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ImmutableID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RefreshTokenStatusDetailsType", propOrder = {
    "refreshTokenStatus",
    "refreshToken",
    "immutableID"
})
public class RefreshTokenStatusDetailsType {

    @XmlElement(name = "RefreshTokenStatus", required = true)
    protected BigInteger refreshTokenStatus;
    @XmlElement(name = "RefreshToken")
    protected String refreshToken;
    @XmlElement(name = "ImmutableID")
    protected String immutableID;

    /**
     * Gets the value of the refreshTokenStatus property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRefreshTokenStatus() {
        return refreshTokenStatus;
    }

    /**
     * Sets the value of the refreshTokenStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRefreshTokenStatus(BigInteger value) {
        this.refreshTokenStatus = value;
    }

    /**
     * Gets the value of the refreshToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefreshToken() {
        return refreshToken;
    }

    /**
     * Sets the value of the refreshToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefreshToken(String value) {
        this.refreshToken = value;
    }

    /**
     * Gets the value of the immutableID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImmutableID() {
        return immutableID;
    }

    /**
     * Sets the value of the immutableID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImmutableID(String value) {
        this.immutableID = value;
    }

}
