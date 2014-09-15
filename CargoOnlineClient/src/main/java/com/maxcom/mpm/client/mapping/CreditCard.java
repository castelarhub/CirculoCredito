package com.maxcom.mpm.client.mapping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class CreditCard {
    private String crypto;
    private String type;
    private String name;
    private String number;
    private String expmonth;
    private String expyear;
    @XmlElement(name="cvv-csc")
    private String cvv_csc;

    /**
     * @return the crypto
     */
    public String getCrypto() {
        return crypto;
    }

    /**
     * @param crypto the crypto to set
     */
    public void setCrypto(String crypto) {
        this.crypto = crypto;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the number
     */
    public String getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * @return the expmonth
     */
    public String getExpmonth() {
        return expmonth;
    }

    /**
     * @param expmonth the expmonth to set
     */
    public void setExpmonth(String expmonth) {
        this.expmonth = expmonth;
    }

    /**
     * @return the expyear
     */
    public String getExpyear() {
        return expyear;
    }

    /**
     * @param expyear the expyear to set
     */
    public void setExpyear(String expyear) {
        this.expyear = expyear;
    }

    /**
     * @return the cvv_csc
     */
    public String getCvv_csc() {
        return cvv_csc;
    }

    /**
     * @param cvv_csc the cvv_csc to set
     */
    public void setCvv_csc(String cvv_csc) {
        this.cvv_csc = cvv_csc;
    }
    
}
