
package com.maxcom.mpm.paypal.client.paypal;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BuyNowTextType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BuyNowTextType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="BUYNOW"/>
 *     &lt;enumeration value="PAYNOW"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BuyNowTextType")
@XmlEnum
public enum BuyNowTextType {


    /**
     *   button wording is BUYNOW
     * 
     */
    BUYNOW,

    /**
     *  button wording is PAYNOW
     * 
     */
    PAYNOW;

    public String value() {
        return name();
    }

    public static BuyNowTextType fromValue(String v) {
        return valueOf(v);
    }

}
