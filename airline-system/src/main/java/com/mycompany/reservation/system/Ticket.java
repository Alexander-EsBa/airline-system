/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reservation.system;
import com.mycompany.airline.system.*;

/**
 *
 * @author esqba
 */
public class Ticket {
    // Attributes
    private String ticketNumber;
    private Flight flight;
    private Seat seat;

    // Constructor
    public Ticket(String ticketNumber, Flight flight, int seatRow, char seatColumn) {
        this.ticketNumber = ticketNumber;
        this.flight = flight;
        this.seat = flight.getAirplane().getSeat(seatRow, seatColumn);
    }

    // Getters and Setters
    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    // Methods
    @Override
    public String toString() {
        return "Ticket{" +
                "ticketNumber='" + ticketNumber + '\'' +
                ", flight=" + flight +
                ", seat=" + seat +
                '}';
    }
}
