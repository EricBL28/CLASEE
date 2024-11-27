package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        clientes.add(new Cliente("Cliente 1", new int[] { 2, 2, 1, 1})); // 6 Seg
        clientes.add(new Cliente("Cliente 2", new int[] { 1, 1, 2, 1})); // 5 Seg
        clientes.add(new Cliente("Cliente 3", new int[] { 2, 3, 1, 1})); // 7 Seg
        clientes.add(new Cliente("Cliente 4", new int[] { 1 })); // 1 Seg
        clientes.add(new Cliente("Cliente 5", new int[] { 1, 2, 1})); // 4 Seg
        clientes.add(new Cliente("Cliente 6", new int[] { 1, 2, 1, 3, 1 })); // 8 Seg
        clientes.add(new Cliente("Cliente 7", new int[] { 1, 1, 2})); // 4 Seg

    }
}