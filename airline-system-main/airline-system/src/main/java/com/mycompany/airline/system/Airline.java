package com.mycompany.airline.system;

import java.util.ArrayList;
import java.util.Objects;

public class Airline {
    // Attributes
    private String name;
    private ArrayList<Airplane> airplanes;
    private ArrayList<Flight> flights;

    // Constructor
    public Airline(String name) {
        this.name = name;
        this.airplanes = new ArrayList<>();
        this.flights = new ArrayList<>();
        airplanes.add(AirplaneFactory.createAirplane(1, "A320-001"));
        airplanes.add(AirplaneFactory.createAirplane(2, "A340-001"));
        airplanes.add(AirplaneFactory.createAirplane(3, "B737-001"));
        airplanes.add(AirplaneFactory.createAirplane(4, "B747-001"));
        airplanes.add(AirplaneFactory.createAirplane(5, "B777-001"));
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Airplane> getAirplanes() {
        return airplanes;
    }

    public void setAirplanes(ArrayList<Airplane> airplanes) {
        this.airplanes = airplanes;
    }

    public ArrayList<Flight> getFlights() {
        return flights;
    }

    public void setFlights(ArrayList<Flight> flights) {
        this.flights = flights;
    }

    // Methods
    public void addAirplane(int type, String id) {
        airplanes.add(AirplaneFactory.createAirplane(type, id));
    }

    public void deleteAirplane(String id) {
        airplanes.removeIf(airplane -> Objects.equals(airplane.getAirplaneID(), id));
    }
}
