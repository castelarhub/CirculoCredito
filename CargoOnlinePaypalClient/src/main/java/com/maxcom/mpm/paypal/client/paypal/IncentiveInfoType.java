
package com.maxcom.mpm.paypal.client.paypal;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 *   
 * 		    		Details of incentive application on individual bucket.  
 * 				
 * 
 * <p>Java class for IncentiveInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IncentiveInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IncentiveCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ApplyIndication" type="{urn:ebay:apis:eBLBaseComponents}IncentiveApplyIndicationType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IncentiveInfoType", propOrder = {
    "incentiveCode",
    "applyIndication"
})
public class IncentiveInfoType {

    @XmlElement(name = "IncentiveCode")
    protected String incentiveCode;
    @XmlElement(name = "ApplyIndication")
    protected List<IncentiveApplyIndicationType> applyIndication;

    /**
     * Gets the value of the incentiveCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncentiveCode() {
        return incentiveCode;
    }

    /**
     * Sets the value of the incentiveCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncentiveCode(String value) {
        this.incentiveCode = value;
    }

    /**
     * Gets the value of the applyIndication property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applyIndication property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplyIndication().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IncentiveApplyIndicationType }
     * 
     * 
     */
    public List<IncentiveApplyIndicationType> getApplyIndication() {
        if (applyIndication == null) {
            applyIndication = new ArrayList<IncentiveApplyIndicationType>();
        }
        return this.applyIndication;
    }

}
