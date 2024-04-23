/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package User;

import java.util.Date;

/**
 *
 * @author marih
 */
public class Employee extends User{
    private String role;
    private double salary;

    //Constructor
    public Employee(String role, double salary, int idUser, String firstName, String lastName, Date birthday, String country, String phoneNumber, String email) {
        super(idUser, firstName, lastName, birthday, country, phoneNumber, email);
        this.role = role;
        this.salary = salary;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    //methods
    
    // add employee to the array
    public static void addEmployee(User[] users, Employee employee) {
        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) {
                users[i] = employee;
                System.out.println("Employee added successfully.");
                return;
            }
        }
        System.out.println("Error. Cannot add employee.");
    }
    
    // delete employee to the array
    public static void removeEmployee(User[] users, int idEmployee) {
    for (int i = 0; i < users.length; i++) {
        if (users[i] instanceof Employee && users[i].getIdUser() == idEmployee) {
            users[i] = null;
            System.out.println("Employee removed successfully.");
            return;
        }
    }
    System.out.println("Employee with ID " + idEmployee + " not found.");
}

}
