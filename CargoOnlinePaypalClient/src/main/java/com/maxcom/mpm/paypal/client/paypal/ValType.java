
package com.maxcom.mpm.paypal.client.paypal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ValueLiteral" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ValueID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValType", propOrder = {
    "valueLiteral"
})
public class ValType {

    @XmlElement(name = "ValueLiteral", required = true)
    protected String valueLiteral;
    @XmlAttribute(name = "ValueID")
    protected String valueID;

    /**
     * Gets the value of the valueLiteral property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueLiteral() {
        return valueLiteral;
    }

    /**
     * Sets the value of the valueLiteral property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueLiteral(String value) {
        this.valueLiteral = value;
    }

    /**
     * Gets the value of the valueID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueID() {
        return valueID;
    }

    /**
     * Sets the value of the valueID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueID(String value) {
        this.valueID = value;
    }

}
