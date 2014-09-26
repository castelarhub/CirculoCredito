
package com.maxcom.mpm.paypal.client.paypal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PersonNameType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonNameType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Salutation" type="{urn:ebay:apis:eBLBaseComponents}SalutationType" minOccurs="0"/>
 *         &lt;element name="FirstName" type="{urn:ebay:apis:eBLBaseComponents}NameType" minOccurs="0"/>
 *         &lt;element name="MiddleName" type="{urn:ebay:apis:eBLBaseComponents}NameType" minOccurs="0"/>
 *         &lt;element name="LastName" type="{urn:ebay:apis:eBLBaseComponents}NameType" minOccurs="0"/>
 *         &lt;element name="Suffix" type="{urn:ebay:apis:eBLBaseComponents}SuffixType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonNameType", propOrder = {
    "salutation",
    "firstName",
    "middleName",
    "lastName",
    "suffix"
})
public class PersonNameType {

    @XmlElement(name = "Salutation")
    protected String salutation;
    @XmlElement(name = "FirstName")
    protected String firstName;
    @XmlElement(name = "MiddleName")
    protected String middleName;
    @XmlElement(name = "LastName")
    protected String lastName;
    @XmlElement(name = "Suffix")
    protected String suffix;

    /**
     * Gets the value of the salutation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalutation() {
        return salutation;
    }

    /**
     * Sets the value of the salutation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalutation(String value) {
        this.salutation = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the middleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Sets the value of the middleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleName(String value) {
        this.middleName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the suffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuffix() {
        return suffix;
    }

    /**
     * Sets the value of the suffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuffix(String value) {
        this.suffix = value;
    }

}
