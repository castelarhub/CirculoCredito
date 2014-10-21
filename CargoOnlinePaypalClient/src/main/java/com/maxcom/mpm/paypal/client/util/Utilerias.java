package com.maxcom.mpm.paypal.client.util;

import com.maxcom.mpm.paypal.client.paypal.BasicAmountType;
import com.maxcom.mpm.paypal.client.paypal.CurrencyCodeType;
import java.text.NumberFormat;
import java.util.Locale;

public class Utilerias {

    public static BasicAmountType buildAmount(Double amount,
            CurrencyCodeType currencyCodeType) {
        BasicAmountType orderTotal = new BasicAmountType();

        NumberFormat nf = NumberFormat.getNumberInstance(Locale.US);

        nf.setMaximumFractionDigits(2);
        nf.setMinimumFractionDigits(2);

        orderTotal.setValue(nf.format(amount));
        orderTotal.setCurrencyID(currencyCodeType);
        return orderTotal;
    }
    
    public static double buildAmount(Double amount) throws Exception{
        NumberFormat nf = NumberFormat.getNumberInstance(Locale.US);
        
        nf.setMaximumFractionDigits(2);
        nf.setMinimumFractionDigits(2);
        
        String numFomato = nf.format(amount);
        
        Number parse = nf.parse(numFomato);
        
        return parse.doubleValue();
    }

}
