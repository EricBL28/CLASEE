package org.example;


public class Main {
    public static void main(String[] args)  {

        Gato[] gato = new Gato[10];
        Perro[] perro = new Perro[10];
        for(int i=0;i<10;i++){

            gato[i]=new Gato(i);
            perro[i]=new Perro(i);

            gato[i].run();
            perro[i].run();
            try{
                gato[i].join();
            }catch (InterruptedException e){
                System.err.println(e.getMessage());
            }
        }



    }
}