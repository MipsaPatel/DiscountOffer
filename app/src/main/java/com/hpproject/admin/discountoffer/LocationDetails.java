package com.hpproject.admin.discountoffer;

/**
 * Created by Mipsa on 3/26/2017.
 */

public class LocationDetails {
    private double latitude;
    private double longitude;
    private  String store;

    public LocationDetails() {

    }

    public LocationDetails(LocationDetails location) {
        this.latitude = location.latitude;
        this.longitude = location.longitude;
        this.store = location.store;
    }

    public LocationDetails(double latitude, double longitude, String store) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.store = store;
    }

    public double getlatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }
}
