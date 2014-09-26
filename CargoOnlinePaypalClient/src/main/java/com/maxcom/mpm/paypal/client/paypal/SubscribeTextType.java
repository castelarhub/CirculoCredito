
package com.maxcom.mpm.paypal.client.paypal;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubscribeTextType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SubscribeTextType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="BUYNOW"/>
 *     &lt;enumeration value="SUBSCRIBE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SubscribeTextType")
@XmlEnum
public enum SubscribeTextType {


    /**
     *   button wording is BUYNOW
     * 
     */
    BUYNOW,

    /**
     *  button wording is SUBSCRIBE
     * 
     */
    SUBSCRIBE;

    public String value() {
        return name();
    }

    public static SubscribeTextType fromValue(String v) {
        return valueOf(v);
    }

}
