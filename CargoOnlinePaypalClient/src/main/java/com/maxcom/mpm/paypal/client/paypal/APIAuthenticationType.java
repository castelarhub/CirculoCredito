
package com.maxcom.mpm.paypal.client.paypal;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for APIAuthenticationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="APIAuthenticationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Auth-None"/>
 *     &lt;enumeration value="Cert"/>
 *     &lt;enumeration value="Sign"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "APIAuthenticationType")
@XmlEnum
public enum APIAuthenticationType {

    @XmlEnumValue("Auth-None")
    AUTH_NONE("Auth-None"),
    @XmlEnumValue("Cert")
    CERT("Cert"),
    @XmlEnumValue("Sign")
    SIGN("Sign");
    private final String value;

    APIAuthenticationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static APIAuthenticationType fromValue(String v) {
        for (APIAuthenticationType c: APIAuthenticationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
