package com.hpproject.admin.discountoffer;

/**
 * Created by Mipsa on 4/24/2017.
 */

public class FlightDetails {
    String name;
    String from;
    String to;
    int seats;
    int fare;

    public FlightDetails (String name, String from, String to, int seats, int fare) {
        this.name = name;
        this.from = from;
        this.to = to;
        this.fare = fare;
        this.seats = seats;
    }

    void setName (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    void setFrom (String from) {
        this.from = from;
    }

    public void setFare(int fare) {
        this.fare = fare;
    }

    public int getFare() {
        return fare;
    }

    public int getSeats() {
        return seats;
    }

    public String getFrom() {
        return from;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

}
