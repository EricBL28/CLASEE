package org.example;

import java.util.concurrent.CountDownLatch;

public class Main {

    public static void main(String[] args) {
        final CountDownLatch latch = new CountDownLatch(2);

        Tostadas tostadas = new Tostadas();
        Cafe cafe = new Cafe();
        Zumo zumo = new Zumo();

        System.out.println("Preparando desayuno...");

        cafe.run();
        zumo.start();
        tostadas.run();


        try{
            latch.await();
            System.out.println("DESAYUNO LISTO !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        }catch(InterruptedException e){
            System.err.println(e.getMessage());
        }


    }
}