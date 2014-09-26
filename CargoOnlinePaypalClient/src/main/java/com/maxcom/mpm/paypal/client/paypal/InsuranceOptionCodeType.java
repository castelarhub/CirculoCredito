
package com.maxcom.mpm.paypal.client.paypal;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InsuranceOptionCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InsuranceOptionCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Optional"/>
 *     &lt;enumeration value="Required"/>
 *     &lt;enumeration value="NotOffered"/>
 *     &lt;enumeration value="IncludedInShippingHandling"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InsuranceOptionCodeType")
@XmlEnum
public enum InsuranceOptionCodeType {


    /**
     * 
     * 						    Insurance optional.
     * 					
     * 
     */
    @XmlEnumValue("Optional")
    OPTIONAL("Optional"),

    /**
     * 
     * 						   Insurance required. 
     * 					
     * 
     */
    @XmlEnumValue("Required")
    REQUIRED("Required"),

    /**
     * 
     * 						   Insurance not offered.
     * 					
     * 
     */
    @XmlEnumValue("NotOffered")
    NOT_OFFERED("NotOffered"),

    /**
     * 
     * 						   Insurance included in Shipping and Handling costs.
     * 					
     * 
     */
    @XmlEnumValue("IncludedInShippingHandling")
    INCLUDED_IN_SHIPPING_HANDLING("IncludedInShippingHandling"),

    /**
     * 
     * 						  Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    InsuranceOptionCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InsuranceOptionCodeType fromValue(String v) {
        for (InsuranceOptionCodeType c: InsuranceOptionCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
