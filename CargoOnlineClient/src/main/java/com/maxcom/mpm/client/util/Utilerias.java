package com.maxcom.mpm.client.util;

public class Utilerias {
    
    private static final String XML_LINARIZATION_REGEX = "(>|&gt;){1,1}(\\t)*(\\n|\\r)+(\\s)*(<|&lt;){1,1}";

    private static final String XML_LINARIZATION_REPLACEMENT = "$1$5";
    
    private static final String SEMILLA_PAGO="986585C1";

    public static String getLinearizationXML(String xml) {
        return (xml!= null) ? xml.trim().replaceAll(XML_LINARIZATION_REGEX, XML_LINARIZATION_REPLACEMENT) : null;
    }
    
    public static String getEncryptedString(String str){
        rc4 crpt = new rc4();
        return crpt.StringToHexString(crpt.Salaa(str, SEMILLA_PAGO));
    }
    
}
