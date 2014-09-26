
package com.maxcom.mpm.paypal.client.paypal;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ButtonCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ButtonCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="HOSTED"/>
 *     &lt;enumeration value="ENCRYPTED"/>
 *     &lt;enumeration value="CLEARTEXT"/>
 *     &lt;enumeration value="TOKEN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ButtonCodeType")
@XmlEnum
public enum ButtonCodeType {


    /**
     *  Creates Hosted Button
     * 
     */
    HOSTED,

    /**
     *  Creates Encrypted Button
     * 
     */
    ENCRYPTED,

    /**
     *  Creates Cleartext Button
     * 
     */
    CLEARTEXT,

    /**
     *  Creates Token or temporary Button
     * 
     */
    TOKEN;

    public String value() {
        return name();
    }

    public static ButtonCodeType fromValue(String v) {
        return valueOf(v);
    }

}
