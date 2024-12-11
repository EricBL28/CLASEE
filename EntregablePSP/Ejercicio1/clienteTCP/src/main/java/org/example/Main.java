package org.example;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.Socket;

public class Main {
    static final String HOST = "localhost";
    static final int Puerto = 2000;


    public static void main(String[] args) {
        try {
            Socket sCliente = new Socket(HOST, Puerto);
            InputStream aux = sCliente.getInputStream();
            DataInputStream flujo_entrada = new DataInputStream(aux);
            System.out.println(flujo_entrada.readUTF());
            sCliente.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}