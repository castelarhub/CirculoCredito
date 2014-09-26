
package com.maxcom.mpm.paypal.client.paypal;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ButtonSubTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ButtonSubTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="PRODUCTS"/>
 *     &lt;enumeration value="SERVICES"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ButtonSubTypeType")
@XmlEnum
public enum ButtonSubTypeType {


    /**
     *   button subtype is PRODUCTS
     * 
     */
    PRODUCTS,

    /**
     *  button subtype is SERVICES
     * 
     */
    SERVICES;

    public String value() {
        return name();
    }

    public static ButtonSubTypeType fromValue(String v) {
        return valueOf(v);
    }

}
