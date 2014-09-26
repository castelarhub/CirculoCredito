
package com.maxcom.mpm.paypal.client.paypal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SenderDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SenderDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DeviceDetails" type="{urn:ebay:apis:eBLBaseComponents}DeviceDetailsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SenderDetailsType", propOrder = {
    "deviceDetails"
})
public class SenderDetailsType {

    @XmlElement(name = "DeviceDetails")
    protected DeviceDetailsType deviceDetails;

    /**
     * Gets the value of the deviceDetails property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceDetailsType }
     *     
     */
    public DeviceDetailsType getDeviceDetails() {
        return deviceDetails;
    }

    /**
     * Sets the value of the deviceDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceDetailsType }
     *     
     */
    public void setDeviceDetails(DeviceDetailsType value) {
        this.deviceDetails = value;
    }

}
