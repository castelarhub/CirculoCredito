
package com.maxcom.mpm.paypal.client.paypal;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PromotionItemPriceTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PromotionItemPriceTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="AuctionPrice"/>
 *     &lt;enumeration value="BuyItNowPrice"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PromotionItemPriceTypeCodeType")
@XmlEnum
public enum PromotionItemPriceTypeCodeType {


    /**
     * 
     * 						    Auction Item
     * 					
     * 
     */
    @XmlEnumValue("AuctionPrice")
    AUCTION_PRICE("AuctionPrice"),

    /**
     * 
     * 						  Buy It Now
     * 					
     * 
     */
    @XmlEnumValue("BuyItNowPrice")
    BUY_IT_NOW_PRICE("BuyItNowPrice"),

    /**
     * 
     * 						  Reserved. Do not use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    PromotionItemPriceTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PromotionItemPriceTypeCodeType fromValue(String v) {
        for (PromotionItemPriceTypeCodeType c: PromotionItemPriceTypeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
