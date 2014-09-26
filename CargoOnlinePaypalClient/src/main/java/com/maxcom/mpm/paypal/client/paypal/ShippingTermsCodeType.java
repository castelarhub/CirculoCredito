
package com.maxcom.mpm.paypal.client.paypal;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShippingTermsCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ShippingTermsCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="SellerPays"/>
 *     &lt;enumeration value="BuyerPays"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ShippingTermsCodeType")
@XmlEnum
public enum ShippingTermsCodeType {


    /**
     * 
     * 						    Seller pays all shipping costs. 
     * 					
     * 
     */
    @XmlEnumValue("SellerPays")
    SELLER_PAYS("SellerPays"),

    /**
     * 
     * 						    Buyer pays all shipping costs. 
     * 					
     * 
     */
    @XmlEnumValue("BuyerPays")
    BUYER_PAYS("BuyerPays"),

    /**
     * 
     * 						  Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    ShippingTermsCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ShippingTermsCodeType fromValue(String v) {
        for (ShippingTermsCodeType c: ShippingTermsCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
