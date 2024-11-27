package org.example;

public class Tostadas extends Thread{
    @Override
    public void run() {
        System.out.println("Preparando tosatadas");


        System.out.println("Tostadas listas");
        Untar untar= new Untar();
        untar.run();

    }
}
