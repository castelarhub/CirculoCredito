
package com.maxcom.mpm.paypal.client.paypal;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ApprovalTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ApprovalTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="BillingAgreement"/>
 *     &lt;enumeration value="Profile"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ApprovalTypeType")
@XmlEnum
public enum ApprovalTypeType {

    @XmlEnumValue("BillingAgreement")
    BILLING_AGREEMENT("BillingAgreement"),
    @XmlEnumValue("Profile")
    PROFILE("Profile");
    private final String value;

    ApprovalTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ApprovalTypeType fromValue(String v) {
        for (ApprovalTypeType c: ApprovalTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
