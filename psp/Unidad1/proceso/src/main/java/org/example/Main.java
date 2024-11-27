package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        try {

            Process proceso = Runtime.getRuntime().exec("CMD /C DIR");

            InputStream cosa = proceso.getInputStream();
            BufferedReader leer = new BufferedReader(new InputStreamReader(cosa));

            String linea;
            while ((linea = leer.readLine()) != null) {
                System.out.println(linea);
            }

            leer.close();

        } catch (IOException  e) {
            System.err.println(e.getMessage());
        }
    }
}
