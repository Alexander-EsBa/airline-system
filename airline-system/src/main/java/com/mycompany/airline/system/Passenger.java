package com.mycompany.airline.system;

import java.io.Serializable;

public class Passenger implements Serializable {
    // Attributes
    private String name;

    // Constructor
    public Passenger(String name){
        this.name = name;
    }
}
