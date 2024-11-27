package org.example;

public class Gato extends Thread {
    int contador;

    public Gato(int i) {
        this.contador = i;
    }

    @Override
    public void run() {
        contador++;
        setName("Gato"+contador);
        if(getName()=="Gato2"){
            setPriority(MAX_PRIORITY);
        }

        System.out.println(getName());

    }
}