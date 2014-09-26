
package com.maxcom.mpm.paypal.client.paypal;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusChangeActionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StatusChangeActionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Cancel"/>
 *     &lt;enumeration value="Suspend"/>
 *     &lt;enumeration value="Reactivate"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StatusChangeActionType")
@XmlEnum
public enum StatusChangeActionType {

    @XmlEnumValue("Cancel")
    CANCEL("Cancel"),
    @XmlEnumValue("Suspend")
    SUSPEND("Suspend"),
    @XmlEnumValue("Reactivate")
    REACTIVATE("Reactivate");
    private final String value;

    StatusChangeActionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StatusChangeActionType fromValue(String v) {
        for (StatusChangeActionType c: StatusChangeActionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
