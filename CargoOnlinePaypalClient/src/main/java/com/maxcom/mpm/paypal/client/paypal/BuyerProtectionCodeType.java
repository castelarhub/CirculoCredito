
package com.maxcom.mpm.paypal.client.paypal;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BuyerProtectionCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BuyerProtectionCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="ItemIneligible"/>
 *     &lt;enumeration value="ItemEligible"/>
 *     &lt;enumeration value="ItemMarkedIneligible"/>
 *     &lt;enumeration value="ItemMarkedEligible"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BuyerProtectionCodeType")
@XmlEnum
public enum BuyerProtectionCodeType {


    /**
     * 
     * 						    Item is ineligible (e.g., category not applicable).
     * 					
     * 
     */
    @XmlEnumValue("ItemIneligible")
    ITEM_INELIGIBLE("ItemIneligible"),

    /**
     * 
     * 						     Item is eligible per standard criteria. 
     * 					
     * 
     */
    @XmlEnumValue("ItemEligible")
    ITEM_ELIGIBLE("ItemEligible"),

    /**
     * 
     * 						   Item marked ineligible per special criteria (e.g., seller's account closed).
     * 					
     * 
     */
    @XmlEnumValue("ItemMarkedIneligible")
    ITEM_MARKED_INELIGIBLE("ItemMarkedIneligible"),

    /**
     * 
     * 						  Item marked eligible per other criteria.
     * 					
     * 
     */
    @XmlEnumValue("ItemMarkedEligible")
    ITEM_MARKED_ELIGIBLE("ItemMarkedEligible"),

    /**
     * 
     * 						  Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    BuyerProtectionCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BuyerProtectionCodeType fromValue(String v) {
        for (BuyerProtectionCodeType c: BuyerProtectionCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
