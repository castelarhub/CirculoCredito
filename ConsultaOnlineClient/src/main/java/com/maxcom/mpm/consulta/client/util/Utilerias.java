package com.maxcom.mpm.consulta.client.util;

public class Utilerias {
    
    private static final String SEMILLA_CONSULTA="RepGEmPgs";
    
    public static String getEncryptedString(String str){
        rc4 crpt = new rc4();
        return crpt.StringToHexString(crpt.Salaa(str, SEMILLA_CONSULTA));
    }
    
}
