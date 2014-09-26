
package com.maxcom.mpm.paypal.client.paypal;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BankAccountTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BankAccountTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Checking"/>
 *     &lt;enumeration value="Savings"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BankAccountTypeType")
@XmlEnum
public enum BankAccountTypeType {

    @XmlEnumValue("Checking")
    CHECKING("Checking"),
    @XmlEnumValue("Savings")
    SAVINGS("Savings");
    private final String value;

    BankAccountTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BankAccountTypeType fromValue(String v) {
        for (BankAccountTypeType c: BankAccountTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
