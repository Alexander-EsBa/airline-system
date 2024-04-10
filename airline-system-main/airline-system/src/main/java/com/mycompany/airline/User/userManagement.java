/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.airline.User;

import java.util.ArrayList;

/**
 *
 * @author marih
 */
public class userManagement {

    private ArrayList<User> users;

    public userManagement() {
        users = new ArrayList<>();
    }

    //Add
    public void addClient(Client client) {
        users.add(client);
    }

    public void addEmployee(Employee employee) {
        users.add(employee);
    }

    //Delete
    public void removeClientById(int clientId) {
        for (User user : users) {
            if (user instanceof Client && user.getIdUser() == clientId) {
                users.remove(user);
                System.out.println("Client with ID " + clientId + " removed.");
                return; // Stop the iteration once the client is removed
            }
        }
        System.out.println("No client found with ID " + clientId + ".");
    }

    public void removeEmployeeById(int employeeId) {
        for (User user : users) {
            if (user instanceof Employee && user.getIdUser() == employeeId) {
                users.remove(user);
                System.out.println("Employee with ID " + employeeId + " removed.");
                return; // Stop the iteration once the employee is removed
            }
        }
        System.out.println("No employee found with ID " + employeeId + ".");
    }

    //Display
    public void showClients() {
        System.out.println("Clients:");
        for (User user : users) {
            if (user instanceof Client) {
                System.out.println(user.getFirstName() + " " + user.getLastName());
            }
        }
    }

    public void showEmployees() {
        System.out.println("Employees:");
        for (User user : users) {
            if (user instanceof Employee) {
                System.out.println(user.getFirstName() + " " + user.getLastName());
            }
        }
    }

    //Search user
    public void findUserById(int id) {
        boolean found = false;
        for (User user : users) {
            if (user.getIdUser() == id) {
                found = true;
                System.out.println("\nUser Foundo:");
                System.out.println("ID: " + user.getIdUser());
                System.out.println("Name: " + user.getFirstName() + " " + user.getLastName());
                System.out.println("Birthday: " + user.getBirthday());
                System.out.println("Country: " + user.getCountry());
                System.out.println("Phone Number: " + user.getPhoneNumber());
                System.out.println("Email: " + user.getEmail());

                if (user instanceof Client) {
                    System.out.println("Type: Client");
                    System.out.println("ID Passport: " + ((Client) user).getIdPassport());
                } else if (user instanceof Employee) {
                    System.out.println("Type: Employee");
                    System.out.println("Role: " + ((Employee) user).getRole());
                    System.out.println("Salary: " + ((Employee) user).getSalary());
                }

                break;
            }
        }
        if (!found) {
            System.out.println("\nThe user " + id + " was not found.");
        }
    }
}
