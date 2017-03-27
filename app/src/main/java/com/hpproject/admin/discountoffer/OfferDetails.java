/**
 * Created by Mipsa on 3/24/2017.
 */

package com.hpproject.admin.discountoffer;

import android.util.Log;

public class OfferDetails {

    private String bank;
    private String offer;
    private String validFrom;
    private String validTill;
    LocationDetails location;


    public OfferDetails() {
    }

    public OfferDetails(String bank, String offer, String validFrom, String validTill, LocationDetails location) {
        this.bank = bank;
        this.offer = offer;
        this.validFrom = validFrom;
        this.validTill = validTill;
        Log.d("location", String.valueOf(location));
    }

    public String getBank() {
        return bank;
    }

    public LocationDetails getLocation() {
        return location;
    }

    public String getOffer() {
        return offer;
    }

    public String getValidFrom() {
        return validFrom;
    }

    public String getValidTill() {
        return validTill;
    }

    public void setBank(String bankName) {
        this.bank = bankName;
    }

    public void setLocation(LocationDetails location) {
        this.location = location;
    }

    public void setOffer(String offer) {
        this.offer = offer;
    }

    public void setValidFrom(String validity) {
        this.validFrom = validity;
    }

    public void setValidTill(String validity) {
        this.validTill = validity;
    }


}
