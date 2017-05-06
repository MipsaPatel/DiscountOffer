/**
 * Created by Mipsa on 3/24/2017.
 */

package com.hpproject.admin.discountoffer;

import android.util.Log;

import com.google.android.gms.maps.model.LatLng;

public class OfferDetails {

    private String bank;
    private String offer;
    private String validFrom;
    private String validTill;
    private double latitude;
    private double longitude;
    private String store;
    // LocationDetails location;
    // private LatLng location;


    public OfferDetails() {
    }

    public OfferDetails(String bank, String offer, String validFrom, String validTill, double latitude, double longitude, String store) {
        this.bank = bank;
        this.offer = offer;
        this.validFrom = validFrom;
        this.validTill = validTill;
        this.latitude = latitude;
        this.longitude = longitude;
        this.store = store;
        // this.location = location;
    }

    /*
    public LatLng getLocation() {
        return location;
    }
    */

    /* public void setLocation(LatLng location) {
        this.location = location;
    }
    */

    public String getBank() {
        return bank;
    }

    /*
    public LocationDetails getLocation() {

        return location;
    }
    */

    public String getOffer() {
        return offer;
    }

    public String getValidFrom() {
        return validFrom;
    }

    public String getValidTill() {
        return validTill;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public String getStore() {
        return store;
    }

    public void setBank(String bankName) {
        this.bank = bankName;
    }

    /*
    public void setLocation(LocationDetails location) {
        this.location = location;
    }
    */

    public void setOffer(String offer) {
        this.offer = offer;
    }

    public void setValidFrom(String validity) {
        this.validFrom = validity;
    }

    public void setValidTill(String validity) {
        this.validTill = validity;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public void setStore(String store) {
        this.store = store;
    }
}
