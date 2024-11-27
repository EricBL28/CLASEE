package org.example;

import java.util.Random;

public class Hilo extends Thread{
    protected   int segundos;

    public Hilo(String nombre) {
        super(nombre);
        segundos = (int) (Math.random() * 4) + 1;
    }

    @Override
    public void run() {
        Random rand=new Random();
        try {
            for (int i=0;i<100;i++){

                System.out.println(i+" "+getName());
                sleep(segundos*100);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }


}
