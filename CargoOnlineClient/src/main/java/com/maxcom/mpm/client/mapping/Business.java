package com.maxcom.mpm.client.mapping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Business {
    @XmlElement(name="id_company")
    private String idCompany;
    @XmlElement(name="id_branch")
    private String idBranch;
    private String country;
    private String user;
    private String pwd;

    /**
     * @return the idCompany
     */
    public String getIdCompany() {
        return idCompany;
    }

    /**
     * @param idCompany the idCompany to set
     */
    public void setIdCompany(String idCompany) {
        this.idCompany = idCompany;
    }

    /**
     * @return the idBranch
     */
    public String getIdBranch() {
        return idBranch;
    }

    /**
     * @param idBranch the idBranch to set
     */
    public void setIdBranch(String idBranch) {
        this.idBranch = idBranch;
    }

    /**
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * @return the user
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * @return the pwd
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * @param pwd the pwd to set
     */
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
    
}
