package com.maxcom.adaptador.dto;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Nelson Castelar
 */

@XmlRootElement
public class ResponseRentAssetPayment {
    private String success;
    private String message;

    /**
     * @return the success
     */
    public String getSuccess() {
        return success;
    }

    /**
     * @param success the success to set
     */
    public void setSuccess(String success) {
        this.success = success;
    }

    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }
    
}
