package com.mycompany.reservation.system;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import com.mycompany.airline.system.*;

public class ReservServerThread extends Thread{
    private ServerSocket serverSocket;
    private ArrayList<Flight> flights;
    public ReservServerThread(ServerSocket serverSocket) {
        this.serverSocket = serverSocket;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Socket socket = serverSocket.accept();
                ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
                ArrayList<Flight> flights = (ArrayList<Flight>) in.readObject();
                this.flights = flights;
                System.out.println("Received flights: " + flights);
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    public ArrayList<Flight> getFlights(){
        return this.flights;
    }
}
