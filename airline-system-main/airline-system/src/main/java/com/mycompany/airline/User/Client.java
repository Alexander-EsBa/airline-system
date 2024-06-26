/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.airline.User;

import java.util.Date;

/**
 *
 * @author marih
 */
public class Client extends User {
    private int idPassport;

    // Constructor vacío
    public Client() {
    }
    
    // Constructor con parámetros
    public Client(int idPassport, int idUser, String firstName, String lastName, Date birthday, String country, int phoneNumber, String email) {
        super(idUser, firstName, lastName, birthday, country, phoneNumber, email);
        this.idPassport = idPassport;
    }
    
    // Getter y Setter para idPassport
    public int getIdPassport() {
        return idPassport;
    }

    public void setIdPassport(int idPassport) {
        this.idPassport = idPassport;
    }
}
