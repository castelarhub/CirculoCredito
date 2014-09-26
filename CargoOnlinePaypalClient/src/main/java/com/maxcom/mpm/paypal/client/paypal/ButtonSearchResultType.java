
package com.maxcom.mpm.paypal.client.paypal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ButtonSearchResultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ButtonSearchResultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HostedButtonID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ButtonType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ItemName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ModifyDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ButtonSearchResultType", propOrder = {
    "hostedButtonID",
    "buttonType",
    "itemName",
    "modifyDate"
})
public class ButtonSearchResultType {

    @XmlElement(name = "HostedButtonID")
    protected String hostedButtonID;
    @XmlElement(name = "ButtonType")
    protected String buttonType;
    @XmlElement(name = "ItemName")
    protected String itemName;
    @XmlElement(name = "ModifyDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modifyDate;

    /**
     * Gets the value of the hostedButtonID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostedButtonID() {
        return hostedButtonID;
    }

    /**
     * Sets the value of the hostedButtonID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostedButtonID(String value) {
        this.hostedButtonID = value;
    }

    /**
     * Gets the value of the buttonType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getButtonType() {
        return buttonType;
    }

    /**
     * Sets the value of the buttonType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setButtonType(String value) {
        this.buttonType = value;
    }

    /**
     * Gets the value of the itemName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * Sets the value of the itemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemName(String value) {
        this.itemName = value;
    }

    /**
     * Gets the value of the modifyDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getModifyDate() {
        return modifyDate;
    }

    /**
     * Sets the value of the modifyDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setModifyDate(XMLGregorianCalendar value) {
        this.modifyDate = value;
    }

}
