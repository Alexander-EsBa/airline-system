package com.mycompany.airline.system;

import java.io.Serializable;

public class Airplane implements Serializable {
    // Attributes
    private String airplaneID;
    private String airplaneModel;
    private int airplaneCapacity;
    private Seat[][] seats;
    private boolean isAvailable;

    // Constructor
    public Airplane(String airplaneID, String airplaneModel, int rows, int columns){
        this.airplaneID = airplaneID;
        this.airplaneModel = airplaneModel;
        this.airplaneCapacity = rows * columns;
        this.seats = new Seat[rows][columns];
        this.isAvailable = true;
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                this.seats[i][j] = new Seat(i + 1, (char)('A' + j));
            }
        }
    }

    // Getters and Setters
    public String getAirplaneID() {
        return airplaneID;
    }

    public void setAirplaneID(String airplaneID) {
        this.airplaneID = airplaneID;
    }

    public String getAirplaneModel() {
        return airplaneModel;
    }

    public void setAirplaneModel(String airplaneModel) {
        this.airplaneModel = airplaneModel;
    }

    public int getAirplaneCapacity() {
        return airplaneCapacity;
    }

    public void setAirplaneCapacity(int airplaneCapacity) {
        this.airplaneCapacity = airplaneCapacity;
    }

    public Seat[][] getSeats() {
        return seats;
    }

    public void setSeats(Seat[][] seats) {
        this.seats = seats;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    // Methods
    @Override
    public String toString() {
        String str = "";
        str += "Airplane ID: " + airplaneID + "\n";
        str += "Airplane Model: " + airplaneModel + "\n";
        str += "Airplane Capacity: " + airplaneCapacity + "\n";
        str += "Available: " + (isAvailable ? "Yes" : "No") + "\n";
        return str;
    }

    public String displaySeats(){
        StringBuilder str = new StringBuilder();
        // Print column headers
        str.append("     "); // For alignment
        for(int j = 0; j < seats[0].length; j++){
            str.append((char)('A' + j) + " ");
        }
        str.append("\n");

        // Print rows
        for(int i = 0; i < seats.length; i++){
            str.append(i + 1 + " "); // Print row number
            if(i + 1 < 10) {
                str.append(" "); // For alignment of single digit row numbers
            }
            for(int j = 0; j < seats[i].length; j++){
                str.append(seats[i][j].isAvailable() ? "O " : "X ");
            }
            str.append("\n");
        }
        return str.toString();
    }

    public Seat getSeat(int row, char column){
        return seats[row - 1][column - 'A'];
    }
}
