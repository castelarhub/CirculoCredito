
package com.maxcom.mpm.paypal.client.paypal;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for POSTransactionCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="POSTransactionCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="F"/>
 *     &lt;enumeration value="S"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "POSTransactionCodeType")
@XmlEnum
public enum POSTransactionCodeType {

    F,
    S;

    public String value() {
        return name();
    }

    public static POSTransactionCodeType fromValue(String v) {
        return valueOf(v);
    }

}
