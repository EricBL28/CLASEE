package org.example;

public class Perro extends Thread{
    int contador;

    public Perro(int i) {
        this.contador = i;
    }

    public void run() {
        contador++;
        setName("Perro"+contador);
        if(getName()=="Perro3"){
            setPriority(MAX_PRIORITY);
        }

    }




}
