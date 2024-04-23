package com.mycompany.airline.system;

public class AirplaneFactory {
    public static Airplane createAirplane(int type, String id) {
        switch (type) {
            case 1:
                return new AirbusA320(id);
            case 2:
                return new AirbusA340(id);
            case 3:
                return new Boeing737(id);
            case 4:
                return new Boeing747(id);
            case 5:
                return new Boeing777(id);
            default:
                return null;
        }
    }
}
