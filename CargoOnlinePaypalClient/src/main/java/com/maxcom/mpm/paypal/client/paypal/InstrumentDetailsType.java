
package com.maxcom.mpm.paypal.client.paypal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				InstrumentDetailsType
 * 				Promotional Instrument Information.
 * 			
 * 
 * <p>Java class for InstrumentDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InstrumentDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InstrumentCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InstrumentID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstrumentDetailsType", propOrder = {
    "instrumentCategory",
    "instrumentID"
})
public class InstrumentDetailsType {

    @XmlElement(name = "InstrumentCategory")
    protected String instrumentCategory;
    @XmlElement(name = "InstrumentID")
    protected String instrumentID;

    /**
     * Gets the value of the instrumentCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstrumentCategory() {
        return instrumentCategory;
    }

    /**
     * Sets the value of the instrumentCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstrumentCategory(String value) {
        this.instrumentCategory = value;
    }

    /**
     * Gets the value of the instrumentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstrumentID() {
        return instrumentID;
    }

    /**
     * Sets the value of the instrumentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstrumentID(String value) {
        this.instrumentID = value;
    }

}
