
package com.maxcom.mpm.paypal.client.paypal;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChannelType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ChannelType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Merchant"/>
 *     &lt;enumeration value="eBayItem"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ChannelType")
@XmlEnum
public enum ChannelType {

    @XmlEnumValue("Merchant")
    MERCHANT("Merchant"),
    @XmlEnumValue("eBayItem")
    E_BAY_ITEM("eBayItem");
    private final String value;

    ChannelType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ChannelType fromValue(String v) {
        for (ChannelType c: ChannelType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
