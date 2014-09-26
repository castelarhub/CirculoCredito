
package com.maxcom.mpm.paypal.client.paypal;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ButtonStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ButtonStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="DELETE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ButtonStatusType")
@XmlEnum
public enum ButtonStatusType {


    /**
     *   Changes Button Status to DELETE 
     * 
     */
    DELETE;

    public String value() {
        return name();
    }

    public static ButtonStatusType fromValue(String v) {
        return valueOf(v);
    }

}
