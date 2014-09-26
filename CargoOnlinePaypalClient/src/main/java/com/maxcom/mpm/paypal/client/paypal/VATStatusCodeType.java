
package com.maxcom.mpm.paypal.client.paypal;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VATStatusCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VATStatusCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="NoVATTax"/>
 *     &lt;enumeration value="VATTax"/>
 *     &lt;enumeration value="VATExempt"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VATStatusCodeType")
@XmlEnum
public enum VATStatusCodeType {


    /**
     * 
     * 						No VAT Tax
     * 					
     * 
     */
    @XmlEnumValue("NoVATTax")
    NO_VAT_TAX("NoVATTax"),

    /**
     * 
     * 						VAT Tax
     * 					
     * 
     */
    @XmlEnumValue("VATTax")
    VAT_TAX("VATTax"),

    /**
     * 
     * 						VAT Exempt
     * 					
     * 
     */
    @XmlEnumValue("VATExempt")
    VAT_EXEMPT("VATExempt"),

    /**
     * 
     * 						  Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    VATStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VATStatusCodeType fromValue(String v) {
        for (VATStatusCodeType c: VATStatusCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
