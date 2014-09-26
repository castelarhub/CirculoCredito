
package com.maxcom.mpm.paypal.client.paypal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 The Common 3DS fields. Common for both GTD and DCC API's.
 *             
 * 
 * <p>Java class for ThreeDSecureRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ThreeDSecureRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Eci3ds" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Cavv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Xid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MpiVendor3ds" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AuthStatus3ds" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ThreeDSecureRequestType", propOrder = {
    "eci3Ds",
    "cavv",
    "xid",
    "mpiVendor3Ds",
    "authStatus3Ds"
})
public class ThreeDSecureRequestType {

    @XmlElement(name = "Eci3ds")
    protected String eci3Ds;
    @XmlElement(name = "Cavv")
    protected String cavv;
    @XmlElement(name = "Xid")
    protected String xid;
    @XmlElement(name = "MpiVendor3ds")
    protected String mpiVendor3Ds;
    @XmlElement(name = "AuthStatus3ds")
    protected String authStatus3Ds;

    /**
     * Gets the value of the eci3Ds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEci3Ds() {
        return eci3Ds;
    }

    /**
     * Sets the value of the eci3Ds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEci3Ds(String value) {
        this.eci3Ds = value;
    }

    /**
     * Gets the value of the cavv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCavv() {
        return cavv;
    }

    /**
     * Sets the value of the cavv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCavv(String value) {
        this.cavv = value;
    }

    /**
     * Gets the value of the xid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXid() {
        return xid;
    }

    /**
     * Sets the value of the xid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXid(String value) {
        this.xid = value;
    }

    /**
     * Gets the value of the mpiVendor3Ds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMpiVendor3Ds() {
        return mpiVendor3Ds;
    }

    /**
     * Sets the value of the mpiVendor3Ds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMpiVendor3Ds(String value) {
        this.mpiVendor3Ds = value;
    }

    /**
     * Gets the value of the authStatus3Ds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthStatus3Ds() {
        return authStatus3Ds;
    }

    /**
     * Sets the value of the authStatus3Ds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthStatus3Ds(String value) {
        this.authStatus3Ds = value;
    }

}
