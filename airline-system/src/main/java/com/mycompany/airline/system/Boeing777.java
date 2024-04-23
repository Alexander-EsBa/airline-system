package com.mycompany.airline.system;

import java.io.Serializable;

public class Boeing777 extends Airplane implements Serializable {
    // Constructor
    public Boeing777(String airplaneID) {
        super(airplaneID, "Boeing 777", 9, 8);
    }
}
