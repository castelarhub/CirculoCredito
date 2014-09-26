
package com.maxcom.mpm.paypal.client.paypal;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MerchantPullStatusCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MerchantPullStatusCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Active"/>
 *     &lt;enumeration value="Canceled"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MerchantPullStatusCodeType")
@XmlEnum
public enum MerchantPullStatusCodeType {

    @XmlEnumValue("Active")
    ACTIVE("Active"),
    @XmlEnumValue("Canceled")
    CANCELED("Canceled");
    private final String value;

    MerchantPullStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MerchantPullStatusCodeType fromValue(String v) {
        for (MerchantPullStatusCodeType c: MerchantPullStatusCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
