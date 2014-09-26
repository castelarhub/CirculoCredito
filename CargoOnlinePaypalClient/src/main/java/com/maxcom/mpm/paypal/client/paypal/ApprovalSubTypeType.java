
package com.maxcom.mpm.paypal.client.paypal;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ApprovalSubTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ApprovalSubTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="MerchantInitiatedBilling"/>
 *     &lt;enumeration value="MerchantInitiatedBillingSingleAgreement"/>
 *     &lt;enumeration value="ChannelInitiatedBilling"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ApprovalSubTypeType")
@XmlEnum
public enum ApprovalSubTypeType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("MerchantInitiatedBilling")
    MERCHANT_INITIATED_BILLING("MerchantInitiatedBilling"),
    @XmlEnumValue("MerchantInitiatedBillingSingleAgreement")
    MERCHANT_INITIATED_BILLING_SINGLE_AGREEMENT("MerchantInitiatedBillingSingleAgreement"),
    @XmlEnumValue("ChannelInitiatedBilling")
    CHANNEL_INITIATED_BILLING("ChannelInitiatedBilling");
    private final String value;

    ApprovalSubTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ApprovalSubTypeType fromValue(String v) {
        for (ApprovalSubTypeType c: ApprovalSubTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
