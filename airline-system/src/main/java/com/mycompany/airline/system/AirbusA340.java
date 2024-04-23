package com.mycompany.airline.system;

import java.io.Serializable;

public class AirbusA340 extends Airplane implements Serializable {
    // Constructors
    public AirbusA340(String airplaneID) {
        super(airplaneID, "Airbus A340", 9, 2);
    }
}
