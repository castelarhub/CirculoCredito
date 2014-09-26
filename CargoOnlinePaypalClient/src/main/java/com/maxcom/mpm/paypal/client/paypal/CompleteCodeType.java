
package com.maxcom.mpm.paypal.client.paypal;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompleteCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CompleteCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="NotComplete"/>
 *     &lt;enumeration value="Complete"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CompleteCodeType")
@XmlEnum
public enum CompleteCodeType {

    @XmlEnumValue("NotComplete")
    NOT_COMPLETE("NotComplete"),
    @XmlEnumValue("Complete")
    COMPLETE("Complete");
    private final String value;

    CompleteCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CompleteCodeType fromValue(String v) {
        for (CompleteCodeType c: CompleteCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
