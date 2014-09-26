
package com.maxcom.mpm.paypal.client.paypal;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemCategoryType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ItemCategoryType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Physical"/>
 *     &lt;enumeration value="Digital"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ItemCategoryType")
@XmlEnum
public enum ItemCategoryType {


    /**
     * Physical
     * 
     */
    @XmlEnumValue("Physical")
    PHYSICAL("Physical"),

    /**
     * Digital
     * 
     */
    @XmlEnumValue("Digital")
    DIGITAL("Digital");
    private final String value;

    ItemCategoryType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemCategoryType fromValue(String v) {
        for (ItemCategoryType c: ItemCategoryType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
