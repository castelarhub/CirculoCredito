
package com.maxcom.mpm.paypal.client.paypal;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TotalType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TotalType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Total"/>
 *     &lt;enumeration value="EstimatedTotal"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TotalType")
@XmlEnum
public enum TotalType {

    @XmlEnumValue("Total")
    TOTAL("Total"),
    @XmlEnumValue("EstimatedTotal")
    ESTIMATED_TOTAL("EstimatedTotal");
    private final String value;

    TotalType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TotalType fromValue(String v) {
        for (TotalType c: TotalType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
