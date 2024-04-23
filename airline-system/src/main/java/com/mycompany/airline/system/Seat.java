package com.mycompany.airline.system;

import java.io.Serializable;

public class Seat implements Serializable {
    // Attributes
    private int row;
    private char column;
    private boolean isAvailable;
    private Passenger passenger;

    // Constructor
    public Seat(int row, char column){
        this.row = row;
        this.column = column;
        this.isAvailable = true;
        this.passenger = null;
    }

    // Getters and Setters
    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public char getColumn() {
        return column;
    }

    public void setColumn(char column) {
        this.column = column;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }
}
