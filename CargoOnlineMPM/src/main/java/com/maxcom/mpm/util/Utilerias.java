package com.maxcom.mpm.util;

import java.util.Calendar;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Contiene funcionalidades comunes que se comparten en el proyecto.
 * @author Nelson C.
 */
public class Utilerias {
        
    public static final Pattern VALID_DATE = 
        Pattern.compile("^\\d{2}/\\d{2}/\\d{4}$", Pattern.CASE_INSENSITIVE);
    
    public static final Pattern VALID_EMAIL_ADDRESS_REGEX = 
        Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);    
    
    public static final Pattern VALID_CUSTOMER_NAME_REGEX = 
        Pattern.compile("^\\p{L}+(?: \\p{L}+)*$", Pattern.CASE_INSENSITIVE);
    
    /**
     * Valida si una cadena no es nula o esta vacia.
     * @param s Cadena a validar
     * @return True-Si la cadena no es nula y tiene al menos un caracter.
     */
    public static boolean isValidString(String s){
        return s!=null && s.length()>0;
    }
    
    /**
     * Valida si el año es valido. Un año es valido si es mayor o igual al actual.
     * @param m Año a validar
     * @return True - Si el año enviado es valido
     */
    public static boolean isValidNumberYear(int m){
        Calendar cal = Calendar.getInstance();
        int anioActual = cal.get(Calendar.YEAR);        
        return m >= anioActual;
    }    
    
    public static boolean isValidNumberMonth(int m){
        return m>=1 && m<=12;
    }
    
    public static boolean isValidIntegerNumber(String n){
        Integer numero;
        boolean bValido = true;
        try{
            numero = Integer.valueOf(n);
        }catch(NumberFormatException e){
            bValido = false;
        }
        return bValido;
    }    
    
    /**
     * Valida si una lista es nulla o esta vacia.
     * @param l Lista a validar
     * @return True - Si la lista no es nula y tiene al menos un elemento
     */
    public static boolean isValidList(List l){
        return l!=null && l.size()>0;
    }    
    
    public static boolean isValidEmail(String email){
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX .matcher(email);
        return matcher.find();
    }    
    
    public static boolean isValidDate(String date){
        Matcher matcher = VALID_DATE .matcher(date);
        return matcher.find();
    }        
    
    /**
     * Valida si la cadena de entrada corresponde a un nombre de cliente valido
     * @param name
     * @return 
     */
    public static boolean isValidCustomerName(String name){
        name = name.trim();
        Matcher matcher = VALID_CUSTOMER_NAME_REGEX .matcher(name);
        return matcher.find();
    }
    
    /**
     * Obtiene el periodo de acuerdo a la fecha actual
     * @return Una cadena con el periodo en formato mm-aaaa
     */
    public static String getCurrentPeriodo(){
        Calendar cal = Calendar.getInstance();
        int mes = cal.get(Calendar.MONTH)+1;
        int anio = cal.get(Calendar.YEAR);                
        
        return ((mes>9)?mes+"":("0"+mes))+"-"+ anio ;
    }
      
    
}
