
package com.maxcom.mpm.paypal.client.paypal;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LocationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Consumer"/>
 *     &lt;enumeration value="Store"/>
 *     &lt;enumeration value="PickupDropoff"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LocationType")
@XmlEnum
public enum LocationType {


    /**
     * Consumer
     * 
     */
    @XmlEnumValue("Consumer")
    CONSUMER("Consumer"),

    /**
     * Store
     * 
     */
    @XmlEnumValue("Store")
    STORE("Store"),

    /**
     * PickupDropOff
     * 
     */
    @XmlEnumValue("PickupDropoff")
    PICKUP_DROPOFF("PickupDropoff");
    private final String value;

    LocationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LocationType fromValue(String v) {
        for (LocationType c: LocationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
