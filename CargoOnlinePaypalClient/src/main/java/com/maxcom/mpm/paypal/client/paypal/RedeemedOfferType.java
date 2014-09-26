
package com.maxcom.mpm.paypal.client.paypal;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RedeemedOfferType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RedeemedOfferType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="MERCHANT_COUPON"/>
 *     &lt;enumeration value="LOYALTY_CARD"/>
 *     &lt;enumeration value="MANUFACTURER_COUPON"/>
 *     &lt;enumeration value="RESERVED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RedeemedOfferType")
@XmlEnum
public enum RedeemedOfferType {

    MERCHANT_COUPON,
    LOYALTY_CARD,
    MANUFACTURER_COUPON,
    RESERVED;

    public String value() {
        return name();
    }

    public static RedeemedOfferType fromValue(String v) {
        return valueOf(v);
    }

}
