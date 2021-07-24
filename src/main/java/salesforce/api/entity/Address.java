/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala.
 */

package salesforce.api.entity;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Represents address entity of salesforce.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Address {
    private String city;
    private String country;
    private Object geocodeAccuracy;
    private Object latitude;
    private Object longitude;
    private String postalCode;
    private String state;
    private String street;

    public String getCity() {
        return city;
    }

    public void setCity(final String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(final String country) {
        this.country = country;
    }

    public Object getGeocodeAccuracy() {
        return geocodeAccuracy;
    }

    public void setGeocodeAccuracy(final Object geocodeAccuracy) {
        this.geocodeAccuracy = geocodeAccuracy;
    }

    public Object getLatitude() {
        return latitude;
    }

    public void setLatitude(final Object latitude) {
        this.latitude = latitude;
    }

    public Object getLongitude() {
        return longitude;
    }

    public void setLongitude(final Object longitude) {
        this.longitude = longitude;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(final String postalCode) {
        this.postalCode = postalCode;
    }

    public String getState() {
        return state;
    }

    public void setState(final String state) {
        this.state = state;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(final String street) {
        this.street = street;
    }
}
