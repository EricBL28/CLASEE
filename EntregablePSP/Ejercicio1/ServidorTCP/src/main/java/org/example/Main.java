package org.example;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    static final int Puerto = 2000;
    public static void main(String[] args) {

        try {
            ServerSocket skServidor = new ServerSocket(Puerto);
            System.out.println("Escucho el puerto " + Puerto);
            for (int nCli = 0; nCli < 3; nCli++) {
                Socket sCliente = skServidor.accept();
                System.out.println("Sirvo al cliente " + nCli);
                OutputStream aux = sCliente.getOutputStream();
                DataOutputStream flujo_salida = new DataOutputStream(aux);
                flujo_salida.writeUTF("Hola cliente " + nCli);
                sCliente.close();
            }
            System.out.println("Ya se han atendido los 3 clientes");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}