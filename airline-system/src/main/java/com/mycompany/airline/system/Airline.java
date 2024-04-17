package com.mycompany.airline.system;

import java.time.LocalDateTime;
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

    public void addFlight(String flightID, Country origin, Country destination, Airplane airplane, LocalDateTime departureTime, LocalDateTime arrivalTime, int distance) {
        flights.add(new Flight(flightID, origin, destination, airplane, departureTime, arrivalTime, distance));
    }

    public void deleteFlight(String flightID) {
        flights.removeIf(flight -> Objects.equals(flight.getFlightID(), flightID));
    }

    public String showFleet() {
        StringBuilder fleet = new StringBuilder();
        for (Airplane airplane : airplanes) {
            fleet.append("-----------------------------------\n");
            fleet.append(airplane.toString()).append("\n");
        }
        return fleet.toString();
    }

    public String showAircraft(String id) {
        for (Airplane airplane : airplanes) {
            if (Objects.equals(airplane.getAirplaneID(), id)) {
                StringBuilder aircraft = new StringBuilder();
                aircraft.append("========== Aircraft ").append(airplane.getAirplaneID()).append(" ==========\n\n");
                aircraft.append("Model: ").append(airplane.getAirplaneModel()).append("\n");
                aircraft.append("Capacity: ").append(airplane.getAirplaneCapacity()).append("\n");
                aircraft.append("Available: ").append(airplane.isAvailable() ? "Yes" : "No").append("\n\n");
                aircraft.append("-----> Seats <-----\n");
                aircraft.append(airplane.displaySeats());
                return aircraft.toString();
            }
        }
        return "Aircraft not found";
    }
}
