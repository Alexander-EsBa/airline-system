/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.airline.system;
import java.util.Date;
import java.util.Scanner;
import User.User;
import User.Employee;
import User.Client;
/**
 * @author esqba
 */
public class AirlineSystem {

    public static void main(String[] args) {
        User[] users = new User[10]; // Crear el array de usuarios

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("MENU:");
            System.out.println("1. Add Client");
            System.out.println("2. Add Employee");
            System.out.println("3. Remove Client");
            System.out.println("4. Remove Employee");
            System.out.println("5. List Clients");
            System.out.println("6. List Employees");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addClient(users);
                    break;
                case 2:
                    addEmployee(users);
                    break;
                case 3:
                    removeClient(users);
                    break;
                case 4:
                    removeEmployee(users);
                    break;
                case 5:
                    User.listClients(users);
                    break;
                case 6:
                    User.listEmployees(users);
                    break;
                case 7:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 7.");
            }
        } while (choice != 7);
    }

    public static void addClient(User[] users) {
        // Simplemente solicita los datos del cliente y agrega un nuevo cliente al array
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Client details:");
        System.out.print("ID: ");
        int id = scanner.nextInt();
        System.out.print("First Name: ");
        String firstName = scanner.next();
        System.out.print("Last Name: ");
        String lastName = scanner.next();
        // Puedes solicitar más atributos del cliente si es necesario
        Client.addClient(users, new Client(0, id, firstName, lastName, new Date(), "", "", ""));
    }

    public static void addEmployee(User[] users) {
        // Solicita los datos del empleado y agrega un nuevo empleado al array
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Employee details:");
        System.out.print("ID: ");
        int id = scanner.nextInt();
        System.out.print("First Name: ");
        String firstName = scanner.next();
        System.out.print("Last Name: ");
        String lastName = scanner.next();
        // Puedes solicitar más atributos del empleado si es necesario
        Employee.addEmployee(users, new Employee("", 0, id, firstName, lastName, new Date(), "", "", ""));
    }

    public static void removeClient(User[] users) {
        // Solicita el ID del cliente a eliminar y lo elimina del array
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Client ID to remove: ");
        int id = scanner.nextInt();
        Client.removeClient(users, id);
    }

    public static void removeEmployee(User[] users) {
        // Solicita el ID del empleado a eliminar y lo elimina del array
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Employee ID to remove: ");
        int id = scanner.nextInt();
        Employee.removeEmployee(users, id);
    }

}
