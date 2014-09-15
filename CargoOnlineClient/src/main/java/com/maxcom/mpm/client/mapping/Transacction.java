package com.maxcom.mpm.client.mapping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Transacction {
    private String merchant;
    private String reference;
    private String tp_operation;
    @XmlElement(name="creditcard")
    private CreditCard tarjeta;
    private String amount;
    private String currency;
    //private String usrtransacction;
    //private String version;

    /**
     * @return the merchant
     */
    public String getMerchant() {
        return merchant;
    }

    /**
     * @param merchant the merchant to set
     */
    public void setMerchant(String merchant) {
        this.merchant = merchant;
    }

    /**
     * @return the reference
     */
    public String getReference() {
        return reference;
    }

    /**
     * @param reference the reference to set
     */
    public void setReference(String reference) {
        this.reference = reference;
    }

    /**
     * @return the tp_operation
     */
    public String getTp_operation() {
        return tp_operation;
    }

    /**
     * @param tp_operation the tp_operation to set
     */
    public void setTp_operation(String tp_operation) {
        this.tp_operation = tp_operation;
    }

    /**
     * @return the tarjeta
     */
    public CreditCard getTarjeta() {
        return tarjeta;
    }

    /**
     * @param tarjeta the tarjeta to set
     */
    public void setTarjeta(CreditCard tarjeta) {
        this.tarjeta = tarjeta;
    }

    /**
     * @return the amount
     */
    public String getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }

    /**
     * @return the currency
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * @param currency the currency to set
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }
    
    
}
