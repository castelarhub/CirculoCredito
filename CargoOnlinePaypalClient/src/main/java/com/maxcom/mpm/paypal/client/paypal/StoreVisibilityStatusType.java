
package com.maxcom.mpm.paypal.client.paypal;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StoreVisibilityStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StoreVisibilityStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="DISABLE"/>
 *     &lt;enumeration value="ENABLE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StoreVisibilityStatusType")
@XmlEnum
public enum StoreVisibilityStatusType {

    DISABLE,
    ENABLE;

    public String value() {
        return name();
    }

    public static StoreVisibilityStatusType fromValue(String v) {
        return valueOf(v);
    }

}
