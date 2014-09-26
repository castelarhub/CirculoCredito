
package com.maxcom.mpm.paypal.client.paypal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				UATP Card Details Type 
 * 			
 * 
 * <p>Java class for UATPDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UATPDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UATPNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ExpMonth" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ExpYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UATPDetailsType", propOrder = {
    "uatpNumber",
    "expMonth",
    "expYear"
})
public class UATPDetailsType {

    @XmlElement(name = "UATPNumber", required = true)
    protected String uatpNumber;
    @XmlElement(name = "ExpMonth")
    protected int expMonth;
    @XmlElement(name = "ExpYear")
    protected int expYear;

    /**
     * Gets the value of the uatpNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUATPNumber() {
        return uatpNumber;
    }

    /**
     * Sets the value of the uatpNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUATPNumber(String value) {
        this.uatpNumber = value;
    }

    /**
     * Gets the value of the expMonth property.
     * 
     */
    public int getExpMonth() {
        return expMonth;
    }

    /**
     * Sets the value of the expMonth property.
     * 
     */
    public void setExpMonth(int value) {
        this.expMonth = value;
    }

    /**
     * Gets the value of the expYear property.
     * 
     */
    public int getExpYear() {
        return expYear;
    }

    /**
     * Sets the value of the expYear property.
     * 
     */
    public void setExpYear(int value) {
        this.expYear = value;
    }

}
