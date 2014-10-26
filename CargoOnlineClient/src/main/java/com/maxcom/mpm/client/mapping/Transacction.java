package com.maxcom.mpm.client.mapping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Transacction {
    private String merchant;
    private String reference;
    @XmlElement(name="tp_operation")
    private String tpOperation;
    @XmlElement(name="creditcard")
    private CreditCard tarjeta;
    private String amount;
    private String currency;

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
     * @return the tpOperation
     */
    public String getTpOperation() {
        return tpOperation;
    }

    /**
     * @param tpOperation the tpOperation to set
     */
    public void setTpOperation(String tpOperation) {
        this.tpOperation = tpOperation;
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
