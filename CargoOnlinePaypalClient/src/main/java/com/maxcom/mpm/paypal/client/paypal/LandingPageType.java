
package com.maxcom.mpm.paypal.client.paypal;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LandingPageType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LandingPageType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Login"/>
 *     &lt;enumeration value="Billing"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LandingPageType")
@XmlEnum
public enum LandingPageType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Login")
    LOGIN("Login"),
    @XmlEnumValue("Billing")
    BILLING("Billing");
    private final String value;

    LandingPageType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LandingPageType fromValue(String v) {
        for (LandingPageType c: LandingPageType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
