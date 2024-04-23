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
public class Client extends User{
    private int idPassport;

    //constructor
    public Client(int idPassport, int idUser, String firstName, String lastName, Date birthday, String country, String phoneNumber, String email) {
        super(idUser, firstName, lastName, birthday, country, phoneNumber, email);
        this.idPassport = idPassport;
    }

    public int getIdPassport() {
        return idPassport;
    }

    public void setIdPassport(int idPassport) {
        this.idPassport = idPassport;
    }
    
    //methods
    
    //add Client to the array
    public static void addClient(User[] users, Client client) {
        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) {
                users[i] = client;
                System.out.println("Client added successfully.");
                return;
            }
        }
        System.out.println("Error. Cannot add employee.");
    }
    
    //delete client to the array
    public static void removeClient(User[] users, int idClient) {
    for (int i = 0; i < users.length; i++) {
        if (users[i] instanceof Client && users[i].getIdUser() == idClient) {
            users[i] = null;
            System.out.println("Client removed successfully.");
            return;
        }
    }
    System.out.println("Client with ID " + idClient + " not found.");
}

}
