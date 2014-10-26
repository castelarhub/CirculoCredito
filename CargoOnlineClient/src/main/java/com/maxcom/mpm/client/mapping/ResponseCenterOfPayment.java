package com.maxcom.mpm.client.mapping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="CENTEROFPAYMENTS")
@XmlAccessorType(XmlAccessType.FIELD)
public class ResponseCenterOfPayment {
    @XmlElement
    private String reference;
    
    @XmlElement
    private String response;
    
    @XmlElement
    private String foliocpagos;
    
    @XmlElement
    private String auth;
    
    @XmlElement(name="cd_response")
    private String cdResponse;
    
    @XmlElement(name="cd_error")
    private String cdError;
    
    @XmlElement(name="nb_error")
    private String nbError;
    
    @XmlElement
    private String time;
    
    @XmlElement
    private String date;
    
    @XmlElement(name="nb_company")
    private String nbCompany;
    
    @XmlElement(name="nb_merchant")
    private String nbMerchant;
    
    @XmlElement(name="nb_street")
    private String nbStreet;
    
    @XmlElement(name="cc_type")
    private String ccType;
    
    @XmlElement(name="tp_operation")
    private String tpOperation;
    
    @XmlElement(name="cc_name")
    private String ccName;
    
    @XmlElement(name="cc_number")
    private String ccNumber;
    
    @XmlElement(name="cc_expmonth")
    private String ccExpmonth;
    
    @XmlElement(name="cc_expyear")
    private String ccExpyear;
    
    @XmlElement
    private String amount;
    
    @XmlElement
    private String voucher;
    
    @XmlElement
    private String tokenb5;
    
    @XmlElement
    private String tokenb6;
    
    @XmlElement(name="voucher_comercio")
    private String voucherComercio;
    
    @XmlElement(name="voucher_cliente")
    private String voucherCliente;
    
    @XmlElement(name="friendly_response")
    private String friendlyResponse;
    
    @XmlElement(name="emv_key_date")
    private String emvKeyDate;
    
    @XmlElement(name="icc_csn")
    private String iccCsn;
    
    @XmlElement(name="icc_atc")
    private String iccAtc;
    
    @XmlElement(name="icc_arpc")
    private String iccArpc;
    
    @XmlElement(name="icc_issuer_script")
    private String iccIssuerScript;
    
    @XmlElement(name="authorized_amount")
    private String authorizedAmount;
    
    @XmlElement(name="account_balance_1")
    private String accountBalance1;

    public ResponseCenterOfPayment(String reference, String response, String foliocpagos, String auth, String cdResponse, String cdError, String nbError, String time, String date, String nbCompany, String nbMerchant, String nbStreet, String ccType, String tpOperation, String ccName, String ccNumber, String ccExpmonth, String ccExpyear, String amount, String voucher, String tokenb5, String tokenb6, String voucherComercio, String voucherCliente, String friendlyResponse, String emvKeyDate, String iccCsn, String iccAtc, String iccArpc, String iccIssuerScript, String authorizedAmount, String accountBalance1) {
        this.reference = reference;
        this.response = response;
        this.foliocpagos = foliocpagos;
        this.auth = auth;
        this.cdResponse = cdResponse;
        this.cdError = cdError;
        this.nbError = nbError;
        this.time = time;
        this.date = date;
        this.nbCompany = nbCompany;
        this.nbMerchant = nbMerchant;
        this.nbStreet = nbStreet;
        this.ccType = ccType;
        this.tpOperation = tpOperation;
        this.ccName = ccName;
        this.ccNumber = ccNumber;
        this.ccExpmonth = ccExpmonth;
        this.ccExpyear = ccExpyear;
        this.amount = amount;
        this.voucher = voucher;
        this.tokenb5 = tokenb5;
        this.tokenb6 = tokenb6;
        this.voucherComercio = voucherComercio;
        this.voucherCliente = voucherCliente;
        this.friendlyResponse = friendlyResponse;
        this.emvKeyDate = emvKeyDate;
        this.iccCsn = iccCsn;
        this.iccAtc = iccAtc;
        this.iccArpc = iccArpc;
        this.iccIssuerScript = iccIssuerScript;
        this.authorizedAmount = authorizedAmount;
        this.accountBalance1 = accountBalance1;
    }
    
    /**
     * Constructor
     */
    public ResponseCenterOfPayment(){
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
     * @return the response
     */
    public String getResponse() {
        return response;
    }

    /**
     * @param response the response to set
     */
    public void setResponse(String response) {
        this.response = response;
    }

    /**
     * @return the foliocpagos
     */
    public String getFoliocpagos() {
        return foliocpagos;
    }

    /**
     * @param foliocpagos the foliocpagos to set
     */
    public void setFoliocpagos(String foliocpagos) {
        this.foliocpagos = foliocpagos;
    }

    /**
     * @return the auth
     */
    public String getAuth() {
        return auth;
    }

    /**
     * @param auth the auth to set
     */
    public void setAuth(String auth) {
        this.auth = auth;
    }

    /**
     * @return the cdResponse
     */
    public String getCdResponse() {
        return cdResponse;
    }

    /**
     * @param cdResponse the cdResponse to set
     */
    public void setCdResponse(String cdResponse) {
        this.cdResponse = cdResponse;
    }

    /**
     * @return the cdError
     */
    public String getCdError() {
        return cdError;
    }

    /**
     * @param cdError the cdError to set
     */
    public void setCdError(String cdError) {
        this.cdError = cdError;
    }

    /**
     * @return the nbError
     */
    public String getNbError() {
        return nbError;
    }

    /**
     * @param nbError the nbError to set
     */
    public void setNbError(String nbError) {
        this.nbError = nbError;
    }

    /**
     * @return the time
     */
    public String getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(String time) {
        this.time = time;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the nbCompany
     */
    public String getNbCompany() {
        return nbCompany;
    }

    /**
     * @param nbCompany the nbCompany to set
     */
    public void setNbCompany(String nbCompany) {
        this.nbCompany = nbCompany;
    }

    /**
     * @return the nbMerchant
     */
    public String getNbMerchant() {
        return nbMerchant;
    }

    /**
     * @param nbMerchant the nbMerchant to set
     */
    public void setNbMerchant(String nbMerchant) {
        this.nbMerchant = nbMerchant;
    }

    /**
     * @return the nbStreet
     */
    public String getNbStreet() {
        return nbStreet;
    }

    /**
     * @param nbStreet the nbStreet to set
     */
    public void setNbStreet(String nbStreet) {
        this.nbStreet = nbStreet;
    }

    /**
     * @return the ccType
     */
    public String getCcType() {
        return ccType;
    }

    /**
     * @param ccType the ccType to set
     */
    public void setCcType(String ccType) {
        this.ccType = ccType;
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
     * @return the ccName
     */
    public String getCcName() {
        return ccName;
    }

    /**
     * @param ccName the ccName to set
     */
    public void setCcName(String ccName) {
        this.ccName = ccName;
    }

    /**
     * @return the ccNumber
     */
    public String getCcNumber() {
        return ccNumber;
    }

    /**
     * @param ccNumber the ccNumber to set
     */
    public void setCcNumber(String ccNumber) {
        this.ccNumber = ccNumber;
    }

    /**
     * @return the ccExpmonth
     */
    public String getCcExpmonth() {
        return ccExpmonth;
    }

    /**
     * @param ccExpmonth the ccExpmonth to set
     */
    public void setCcExpmonth(String ccExpmonth) {
        this.ccExpmonth = ccExpmonth;
    }

    /**
     * @return the ccExpyear
     */
    public String getCcExpyear() {
        return ccExpyear;
    }

    /**
     * @param ccExpyear the ccExpyear to set
     */
    public void setCcExpyear(String ccExpyear) {
        this.ccExpyear = ccExpyear;
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
     * @return the voucher
     */
    public String getVoucher() {
        return voucher;
    }

    /**
     * @param voucher the voucher to set
     */
    public void setVoucher(String voucher) {
        this.voucher = voucher;
    }

    /**
     * @return the tokenb5
     */
    public String getTokenb5() {
        return tokenb5;
    }

    /**
     * @param tokenb5 the tokenb5 to set
     */
    public void setTokenb5(String tokenb5) {
        this.tokenb5 = tokenb5;
    }

    /**
     * @return the tokenb6
     */
    public String getTokenb6() {
        return tokenb6;
    }

    /**
     * @param tokenb6 the tokenb6 to set
     */
    public void setTokenb6(String tokenb6) {
        this.tokenb6 = tokenb6;
    }

    /**
     * @return the voucherComercio
     */
    public String getVoucherComercio() {
        return voucherComercio;
    }

    /**
     * @param voucherComercio the voucherComercio to set
     */
    public void setVoucherComercio(String voucherComercio) {
        this.voucherComercio = voucherComercio;
    }

    /**
     * @return the voucherCliente
     */
    public String getVoucherCliente() {
        return voucherCliente;
    }

    /**
     * @param voucherCliente the voucherCliente to set
     */
    public void setVoucherCliente(String voucherCliente) {
        this.voucherCliente = voucherCliente;
    }

    /**
     * @return the friendlyResponse
     */
    public String getFriendlyResponse() {
        return friendlyResponse;
    }

    /**
     * @param friendlyResponse the friendlyResponse to set
     */
    public void setFriendlyResponse(String friendlyResponse) {
        this.friendlyResponse = friendlyResponse;
    }

    /**
     * @return the emvKeyDate
     */
    public String getEmvKeyDate() {
        return emvKeyDate;
    }

    /**
     * @param emvKeyDate the emvKeyDate to set
     */
    public void setEmvKeyDate(String emvKeyDate) {
        this.emvKeyDate = emvKeyDate;
    }

    /**
     * @return the iccCsn
     */
    public String getIccCsn() {
        return iccCsn;
    }

    /**
     * @param iccCsn the iccCsn to set
     */
    public void setIccCsn(String iccCsn) {
        this.iccCsn = iccCsn;
    }

    /**
     * @return the iccAtc
     */
    public String getIccAtc() {
        return iccAtc;
    }

    /**
     * @param iccAtc the iccAtc to set
     */
    public void setIccAtc(String iccAtc) {
        this.iccAtc = iccAtc;
    }

    /**
     * @return the iccArpc
     */
    public String getIccArpc() {
        return iccArpc;
    }

    /**
     * @param iccArpc the iccArpc to set
     */
    public void setIccArpc(String iccArpc) {
        this.iccArpc = iccArpc;
    }

    /**
     * @return the iccIssuerScript
     */
    public String getIccIssuerScript() {
        return iccIssuerScript;
    }

    /**
     * @param iccIssuerScript the iccIssuerScript to set
     */
    public void setIccIssuerScript(String iccIssuerScript) {
        this.iccIssuerScript = iccIssuerScript;
    }

    /**
     * @return the authorizedAmount
     */
    public String getAuthorizedAmount() {
        return authorizedAmount;
    }

    /**
     * @param authorizedAmount the authorizedAmount to set
     */
    public void setAuthorizedAmount(String authorizedAmount) {
        this.authorizedAmount = authorizedAmount;
    }

    /**
     * @return the accountBalance1
     */
    public String getAccountBalance1() {
        return accountBalance1;
    }

    /**
     * @param accountBalance1 the accountBalance1 to set
     */
    public void setAccountBalance1(String accountBalance1) {
        this.accountBalance1 = accountBalance1;
    }
    
}
