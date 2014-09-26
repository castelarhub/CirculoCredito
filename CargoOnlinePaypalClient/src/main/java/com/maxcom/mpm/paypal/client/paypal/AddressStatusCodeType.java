
package com.maxcom.mpm.paypal.client.paypal;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddressStatusCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AddressStatusCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Confirmed"/>
 *     &lt;enumeration value="Unconfirmed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AddressStatusCodeType")
@XmlEnum
public enum AddressStatusCodeType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Confirmed")
    CONFIRMED("Confirmed"),
    @XmlEnumValue("Unconfirmed")
    UNCONFIRMED("Unconfirmed");
    private final String value;

    AddressStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AddressStatusCodeType fromValue(String v) {
        for (AddressStatusCodeType c: AddressStatusCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
