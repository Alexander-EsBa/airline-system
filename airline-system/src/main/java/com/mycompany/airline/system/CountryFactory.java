package com.mycompany.airline.system;

import java.awt.image.BufferedImage;

public class CountryFactory {
    public static Country createCountry(int code) {
        switch (code) {
            case 1:
                return new Country("United States", 1, null);
            case 2:
                return new Country("Mexico", 2, null);
            case 3:
                return new Country("Canada", 3, null);
            case 4:
                return new Country("Brazil", 4, null);
            case 5:
                return new Country("Argentina", 5, null);
            default:
                return null;
        }
    }
}
