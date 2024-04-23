package com.mycompany.airline.system;

import java.awt.image.BufferedImage;

public class Country {
    // Attributes
    private String name;
    private int code;
    private BufferedImage flag;

    // Constructor
    public Country(String name, int code, BufferedImage flag) {
        this.name = name;
        this.code = code;
        this.flag = flag;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public BufferedImage getFlag() {
        return flag;
    }

    public void setFlag(BufferedImage flag) {
        this.flag = flag;
    }
}
