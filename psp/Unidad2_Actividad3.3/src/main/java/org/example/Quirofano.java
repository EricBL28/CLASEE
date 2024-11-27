package org.example;

public class Quirofano {
    private Gato gato;
    private Perro perro;

    public Gato getGato() {
        return gato;
    }
    public Perro getPerro() {
        return perro;
    }
    public void setGato(Gato gato) {
        this.gato = gato;
    }
    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    public synchronized void accesoQuirofano() throws InterruptedException {

        Perro.sleep(2000);
    }

    public synchronized void salidaQuirofano(){

    }
}
