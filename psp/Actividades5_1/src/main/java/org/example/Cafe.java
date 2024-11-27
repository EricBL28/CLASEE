package org.example;

public class Cafe extends Thread {
    @Override
    public void run() {
        System.out.println("Preparando cafe....");

        System.out.println("Cafe hecho");
    }
}
