
package com.maxcom.mpm.paypal.client.paypal;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShippingRatesTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ShippingRatesTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Flat"/>
 *     &lt;enumeration value="Calculated"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ShippingRatesTypeCodeType")
@XmlEnum
public enum ShippingRatesTypeCodeType {


    /**
     * 
     * 						    Flat shipping rate.
     * 					
     * 
     */
    @XmlEnumValue("Flat")
    FLAT("Flat"),

    /**
     * 
     * 						  Calculated shipping rate.
     * 					
     * 
     */
    @XmlEnumValue("Calculated")
    CALCULATED("Calculated"),

    /**
     * 
     * 						  Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    ShippingRatesTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ShippingRatesTypeCodeType fromValue(String v) {
        for (ShippingRatesTypeCodeType c: ShippingRatesTypeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
