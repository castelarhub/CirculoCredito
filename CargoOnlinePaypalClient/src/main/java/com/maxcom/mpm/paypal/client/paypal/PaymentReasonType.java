
package com.maxcom.mpm.paypal.client.paypal;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentReasonType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentReasonType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Refund"/>
 *     &lt;enumeration value="ReturnShipment"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PaymentReasonType")
@XmlEnum
public enum PaymentReasonType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Refund")
    REFUND("Refund"),

    /**
     * 
     * 					Identifies a BA flow for return shipment
     * 				
     * 
     */
    @XmlEnumValue("ReturnShipment")
    RETURN_SHIPMENT("ReturnShipment");
    private final String value;

    PaymentReasonType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PaymentReasonType fromValue(String v) {
        for (PaymentReasonType c: PaymentReasonType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
