package com.maxcom.mpm.client.mapping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class Business {
    private String id_company;
    private String id_branch;
    private String country;
    private String user;
    private String pwd;

    /**
     * @return the id_company
     */
    public String getId_company() {
        return id_company;
    }

    /**
     * @param id_company the id_company to set
     */
    public void setId_company(String id_company) {
        this.id_company = id_company;
    }

    /**
     * @return the id_branch
     */
    public String getId_branch() {
        return id_branch;
    }

    /**
     * @param id_branch the id_branch to set
     */
    public void setId_branch(String id_branch) {
        this.id_branch = id_branch;
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
