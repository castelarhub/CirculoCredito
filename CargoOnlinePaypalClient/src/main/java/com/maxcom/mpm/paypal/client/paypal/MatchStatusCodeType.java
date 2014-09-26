
package com.maxcom.mpm.paypal.client.paypal;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MatchStatusCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MatchStatusCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Matched"/>
 *     &lt;enumeration value="Unmatched"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MatchStatusCodeType")
@XmlEnum
public enum MatchStatusCodeType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Matched")
    MATCHED("Matched"),
    @XmlEnumValue("Unmatched")
    UNMATCHED("Unmatched");
    private final String value;

    MatchStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MatchStatusCodeType fromValue(String v) {
        for (MatchStatusCodeType c: MatchStatusCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
