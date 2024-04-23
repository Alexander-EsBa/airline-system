package com.mycompany.airline.system;

import java.io.Serializable;

public class AirbusA320 extends Airplane implements Serializable {
    // Constructors
    public AirbusA320(String airplaneID) {
        super(airplaneID, "Airbus A320", 5, 2);
    }

}
