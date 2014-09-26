
package com.maxcom.mpm.paypal.client.paypal;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserChannelCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UserChannelCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="WEB"/>
 *     &lt;enumeration value="MOBILE"/>
 *     &lt;enumeration value="POS"/>
 *     &lt;enumeration value="KIOSK"/>
 *     &lt;enumeration value="IHSTB"/>
 *     &lt;enumeration value="IVR"/>
 *     &lt;enumeration value="ADMIN"/>
 *     &lt;enumeration value="CSOPS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UserChannelCodeType")
@XmlEnum
public enum UserChannelCodeType {

    WEB,
    MOBILE,
    POS,
    KIOSK,
    IHSTB,
    IVR,
    ADMIN,
    CSOPS;

    public String value() {
        return name();
    }

    public static UserChannelCodeType fromValue(String v) {
        return valueOf(v);
    }

}
