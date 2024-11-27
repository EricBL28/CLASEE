package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class MiEditor {
    public static void main(String[] args) {
        JFrame frame = new JFrame("MiEditor");
        frame.setContentPane(new MiEditor().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    private JPanel panel1;
    private JButton miBoton;
    public MiEditor() {
        miBoton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Process nuevoProceoso;
                try {
                    nuevoProceoso=Runtime.getRuntime().exec("java -jar MiNotepad.jar");
                    nuevoProceoso.waitFor();
                }catch(IOException |InterruptedException except){
                System.err.println(except.getMessage());
                }
            }
        });
    }

}
