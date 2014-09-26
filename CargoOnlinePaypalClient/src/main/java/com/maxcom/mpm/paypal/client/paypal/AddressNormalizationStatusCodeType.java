
package com.maxcom.mpm.paypal.client.paypal;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddressNormalizationStatusCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AddressNormalizationStatusCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Normalized"/>
 *     &lt;enumeration value="Unnormalized"/>
 *     &lt;enumeration value="UserPreferred"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AddressNormalizationStatusCodeType")
@XmlEnum
public enum AddressNormalizationStatusCodeType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Normalized")
    NORMALIZED("Normalized"),
    @XmlEnumValue("Unnormalized")
    UNNORMALIZED("Unnormalized"),
    @XmlEnumValue("UserPreferred")
    USER_PREFERRED("UserPreferred");
    private final String value;

    AddressNormalizationStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AddressNormalizationStatusCodeType fromValue(String v) {
        for (AddressNormalizationStatusCodeType c: AddressNormalizationStatusCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
