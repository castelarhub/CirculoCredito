package com.maxcom.adaptador.dto;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Nelson Castelar
 */

@XmlRootElement
public class Payment {
    @XmlElement(name="ActivationCode",required=true)
    private String activationCode;
    @XmlElement(name="DateEvent",required=true)
    private String dateEvent;
    @XmlElement(name="Price",required=true)
    private String price;
    @XmlElement(name="MovieTitle",required=true)
    private String movieTitle;
    @XmlElement(name="AdultContent",required=true)
    private String adultContent;

    /**
     * @return the activationCode
     */
    public String getActivationCode() {
        return activationCode;
    }

    /**
     * @param activationCode the activationCode to set
     */
    public void setActivationCode(String activationCode) {
        this.activationCode = activationCode;
    }

    /**
     * @return the dateEvent
     */
    public String getDateEvent() {
        return dateEvent;
    }

    /**
     * @param dateEvent the dateEvent to set
     */
    public void setDateEvent(String dateEvent) {
        this.dateEvent = dateEvent;
    }

    /**
     * @return the price
     */
    public String getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(String price) {
        this.price = price;
    }

    /**
     * @return the movieTitle
     */
    public String getMovieTitle() {
        return movieTitle;
    }

    /**
     * @param movieTitle the movieTitle to set
     */
    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    /**
     * @return the adultContent
     */
    public String getAdultContent() {
        return adultContent;
    }

    /**
     * @param adultContent the adultContent to set
     */
    public void setAdultContent(String adultContent) {
        this.adultContent = adultContent;
    }

}
