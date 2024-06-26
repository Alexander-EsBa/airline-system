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
public class Employee extends User {

    private String role;
    private double salary;

    // Constructor vacío
    public Employee() {
    }

    // Constructor con parámetros
    public Employee(String role, double salary, int idUser, String firstName, String lastName, Date birthday, String country, int phoneNumber, String email) {
        super(idUser, firstName, lastName, birthday, country, phoneNumber, email);
        this.role = role;
        this.salary = salary;
    }

    // Getter y Setter para role
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    // Getter y Setter para salary
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
