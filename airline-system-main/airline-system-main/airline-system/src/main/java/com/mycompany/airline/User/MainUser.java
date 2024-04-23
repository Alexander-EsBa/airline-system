/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.airline.User;

import java.util.Date;

/**
 *
 * @author marih
 */
public class MainUser {

    /**
     * Solo para probar la lista de usuarios
     */
    public static void main(String[] args) {
        // Crear una instancia de UserManagement
        userManagement userManagement = new userManagement();

        // Crear algunos clientes y empleados
        Client client1 = new Client(1001, 1, "John", "Doe", new Date(), "USA", "123456789", "john@example.com");
        Client client2 = new Client(1002, 2, "Jane", "Smith", new Date(), "Canada", "987654321", "jane@example.com");

        Employee employee1 = new Employee("Manager", 50000, 101, "Alice", "Johnson", new Date(), "UK", "555555555", "alice@example.com");
        Employee employee2 = new Employee("Developer", 60000, 102, "Bob", "Williams", new Date(), "Australia", "666666666", "bob@example.com");

        // Agregar clientes y empleados
        userManagement.addClient(client1);
        userManagement.addClient(client2);
        userManagement.addEmployee(employee1);
        userManagement.addEmployee(employee2);

        // Mostrar clientes y empleados
        System.out.println("Lista de clientes:");
        userManagement.showClients();

        System.out.println("\nLista de empleados:");
        userManagement.showEmployees();

        // Eliminar un cliente y un empleado
        userManagement.removeClientById(1001);
        userManagement.removeEmployeeById(101);

        // Mostrar clientes y empleados actualizados
        System.out.println("\nLista de clientes después de eliminar:");
        userManagement.showClients();

        System.out.println("\nLista de empleados después de eliminar:");
        userManagement.showEmployees();
        
        // Buscar un usuario por ID
        int userIdToFind = 101;
        userManagement.findUserById(userIdToFind);

    }

}
