package com.mycompany.airline.system;

import java.io.Serializable;

public class Boeing737 extends Airplane implements Serializable {
    // Constructor
    public Boeing737(String airplaneID) {
        super(airplaneID, "Boeing 737", 5, 4);
    }
}
