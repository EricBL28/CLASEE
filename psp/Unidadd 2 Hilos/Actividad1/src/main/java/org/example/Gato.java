package org.example;

public class Gato extends Thread{
    @Override
    public void run() {

        System.out.println(" : Dame mi comida");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Adios");
    }
}
