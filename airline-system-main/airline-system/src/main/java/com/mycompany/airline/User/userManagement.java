/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.airline.User;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author marih
 */
public class userManagement {

    private ArrayList<User> users;
    private ArrayList<Client> clients;
    private ArrayList<Employee> employees;

    public userManagement() {
        users = new ArrayList<>();
        clients = new ArrayList<>();
        employees = new ArrayList<>();
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    public ArrayList<Client> getClients() {
        return clients;
    }

    public void setClients(ArrayList<Client> clients) {
        this.clients = clients;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    //Add
    // Add client with validation to avoid duplicate IDs
    public void addClient(Client client) {
        // Check if the client ID already exists
        for (User user : users) {
            if (user.getIdUser() == client.getIdUser()) {
                // Display an error message if the ID is found
                JOptionPane.showMessageDialog(null, "Error: Client ID " + client.getIdUser() + " already exists.");
                return; // Stop execution if ID is found
            }
        }
        // If the ID doesn't exist, add the client
        clients.add(client);
        users.add(client);
    }

    // Add employee with validation to avoid duplicate IDs
    public void addEmployee(Employee employee) {
        // Check if the employee ID already exists
        for (User user : users) {
            if (user.getIdUser() == employee.getIdUser()) {
                // Display an error message if the ID is found
                JOptionPane.showMessageDialog(null, "Error: Employee ID " + employee.getIdUser() + " already exists.");
                return; // Stop execution if ID is found
            }
        }
        // If the ID doesn't exist, add the employee
        employees.add(employee);
        users.add(employee);
    }

    //Delete
    public void removeClientById(int clientId) {
        ArrayList<User> usersCopy = new ArrayList<>(users); // Create a copy of the users list
        for (User user : usersCopy) {
            if (user instanceof Client && user.getIdUser() == clientId) {
                clients.remove((Client) user); // Remove from clients list
                users.remove(user); // Remove from users list
                System.out.println("Client with ID " + clientId + " removed.");
                return; // Stop the iteration once the client is removed
            }
        }
        System.out.println("No client found with ID " + clientId + ".");
    }

    public void removeEmployeeById(int employeeId) {
        ArrayList<User> usersCopy = new ArrayList<>(users); // Create a copy of the users list
        for (User user : usersCopy) {
            if (user instanceof Employee && user.getIdUser() == employeeId) {
                employees.remove((Employee) user); // Remove from employees list
                users.remove(user); // Remove from users list
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
    public User findUserById(int id, String userType) {
        for (User user : users) {
            if (user.getIdUser() == id) {
                if (userType.equals("Client") && user instanceof Client) {
                    return user; // Devuelve el cliente si se encuentra y coincide con el tipo
                } else if (userType.equals("Employee") && user instanceof Employee) {
                    return user; // Devuelve el empleado si se encuentra y coincide con el tipo
                }
            }
        }
        return null; // Devuelve null si no se encuentra ningún usuario con ese ID o tipo
    }
}
