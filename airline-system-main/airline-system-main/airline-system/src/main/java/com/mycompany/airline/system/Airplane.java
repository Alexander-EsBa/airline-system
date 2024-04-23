package com.mycompany.airline.system;

public class Airplane {
    // Attributes
    private String airplaneID;
    private String airplaneModel;
    private int airplaneCapacity;
    private Seat[][] seats;

    // Constructor
    public Airplane(String airplaneID, String airplaneModel, int rows, int columns){
        this.airplaneID = airplaneID;
        this.airplaneModel = airplaneModel;
        this.airplaneCapacity = rows * columns;
        this.seats = new Seat[rows][columns];
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

    // Methods
    public String displaySeats(){
        StringBuilder str = new StringBuilder();
        // Print column headers
        str.append("   "); // For alignment
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
}
