
package com.maxcom.mpm.paypal.client.paypal;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WalletItemType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WalletItemType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="MERCHANT_COUPON"/>
 *     &lt;enumeration value="LOYALTY_CARD"/>
 *     &lt;enumeration value="MANUFACTURER_COUPON"/>
 *     &lt;enumeration value="MERCHANT_CLOSED_LOOP_OFFER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WalletItemType")
@XmlEnum
public enum WalletItemType {

    MERCHANT_COUPON,
    LOYALTY_CARD,
    MANUFACTURER_COUPON,
    MERCHANT_CLOSED_LOOP_OFFER;

    public String value() {
        return name();
    }

    public static WalletItemType fromValue(String v) {
        return valueOf(v);
    }

}
