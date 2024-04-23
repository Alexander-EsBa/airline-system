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
public class User {

    private int idUser;
    private String firstName;
    private String lastName;
    private Date birthday;
    private String country;
    private String phoneNumber;
    private String email;

    //constructor
    public User() {
    }

    public User(int idUser, String firstName, String lastName, Date birthday, String country, String phoneNumber, String email) {
        this.idUser = idUser;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.country = country;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Method to search for an user in an array
    public static User searchUser(User[] users, int userId) {
        for (User user : users) {
            if (user.getIdUser() == userId) {
                return user;
            }
        }
        System.out.println("User not found.");
        return null; // User not found
    }

    // Method to insert an user into the array
    public void insertUser(User[] users, User user) {
        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) {
                users[i] = user;
                System.out.println("User created successfully.");
                return;
            }
        }
        System.out.println("User cannot be created.");
    }

    //Display client list
    public static void listClients(User[] users) {
        System.out.println("List of Clients:");
        for (User user : users) {
            if (user instanceof Client) {
                System.out.println("Client ID: " + user.getIdUser());
                System.out.println("First Name: " + user.getFirstName());
                System.out.println("Last Name: " + user.getLastName());
                System.out.println();
            }
        }
    }

    //Display employee list
    public static void listEmployees(User[] users) {
        System.out.println("List of Employees:");
        for (User user : users) {
            if (user instanceof Employee) {
                System.out.println("Employee ID: " + user.getIdUser());
                System.out.println("First Name: " + user.getFirstName());
                System.out.println("Last Name: " + user.getLastName());
                System.out.println();
            }
        }
    }

}
