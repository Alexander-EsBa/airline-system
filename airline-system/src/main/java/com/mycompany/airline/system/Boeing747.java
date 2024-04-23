package com.mycompany.airline.system;

import java.io.Serializable;

public class Boeing747 extends Airplane implements Serializable {
    // Constructor
    public Boeing747(String airplaneID) {
        super(airplaneID, "Boeing 747", 8, 6);
    }
}
