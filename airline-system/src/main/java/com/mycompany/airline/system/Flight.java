package com.mycompany.airline.system;

import java.time.LocalDateTime;

public class Flight {
    // Attributes
    private String flightID;
    private Country origin;
    private Country destination;
    private Airplane airplane;
    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;
    private int duration;
    private int distance;

    // Constructor
    public Flight(String flightID, Country origin, Country destination, Airplane airplane, LocalDateTime departureTime, LocalDateTime arrivalTime, int distance) {
        this.flightID = flightID;
        this.origin = origin;
        this.destination = destination;
        this.airplane = airplane;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.distance = distance;
        this.duration = (int) (arrivalTime.getHour() - departureTime.getHour());
    }

    // Getters and Setters
    public String getFlightID() {
        return flightID;
    }

    public void setFlightID(String flightID) {
        this.flightID = flightID;
    }

    public Country getOrigin() {
        return origin;
    }

    public void setOrigin(Country origin) {
        this.origin = origin;
    }

    public Country getDestination() {
        return destination;
    }

    public void setDestination(Country destination) {
        this.destination = destination;
    }

    public Airplane getAirplane() {
        return airplane;
    }

    public void setAirplane(Airplane airplane) {
        this.airplane = airplane;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalDateTime departureTime) {
        this.departureTime = departureTime;
    }

    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(LocalDateTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    // Methods

    @Override
    public String toString() {
        String str = "";
        str += "Flight ID: " + flightID + "\n";
        str += "Origin: " + origin.getName() + "\n";
        str += "Destination: " + destination.getName() + "\n";
        str += "Airplane: " + airplane.getAirplaneID() + "\n";
        str += "Departure Time: " + departureTime + "\n";
        str += "Arrival Time: " + arrivalTime + "\n";
        str += "Duration: " + duration + " hours\n";
        str += "Distance: " + distance + " km\n";
        return str;
    }
}
