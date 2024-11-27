package org.example;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.dom.DOMSource;
import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.util.Scanner;

import static java.nio.charset.Charset.defaultCharset;


public class Main {


    public static void main(String[] args) {
        //crearArchivos();
        //escritor();
        //copiarFichero();
        //moverDirectorio();
        //copiarFichero2();
        crearXML();

    }
    public static void crearArchivos(){
        try{
            String ruta="C:\\Users\\dam\\Desktop\\CLASEE\\Acceso a datos\\Ejercicio1\\Carpeta_1";
            String ruta2="C:\\Users\\dam\\Desktop\\CLASEE\\Acceso a datos\\Ejercicio1\\Carpeta_2";
            String ruta3="C:\\Users\\dam\\Desktop\\CLASEE\\Acceso a datos\\Ejercicio1\\Carpeta_3";

            File fichero=new File(ruta);
            if(!fichero.exists()){
                fichero.mkdirs();
                System.out.println("Carpeta_1 creado");
            }else {
                System.out.println("Carpeta_1 ya creado");
            }

            fichero=new File(ruta+("\\Carpeta_1_1"));
            if(!fichero.exists()){
                fichero.mkdirs();
                System.out.println("Carpeta_1_1 creado");
            }else {
                System.out.println("Carpeta_1_1 ya creado");
            }

            fichero=new File(ruta+("\\fichero2.txt"));
            if(!fichero.exists()){
                fichero.createNewFile();
                System.out.println("fichero2.txt creado");
            }else {
                System.out.println("fichero2.txt ya creado");
            }

            fichero=new File(ruta+("\\Carpeta_1_1\\fichero.txt"));
            if(!fichero.exists()){
                fichero.createNewFile();
                System.out.println("fichero.txt creado");
            }else {
                System.out.println("fichero.txt ya creado");
            }

            fichero=new File(ruta2);
            if(!fichero.exists()){
                fichero.mkdir();
                System.out.println("Carpeta_2 creado");
            }else {
                System.out.println("Carpeta_2 ya creado");
            }

            fichero=new File(ruta2+("\\Carpeta_2_2"));
            if(!fichero.exists()){
                fichero.mkdir();
                System.out.println("Carpeta_2_2 creado");
            }else {
                System.out.println("Carpeta_2_2 ya creado");
            }

            fichero=new File(ruta3);
            if(!fichero.exists()){
                fichero.mkdir();
                System.out.println("Carpeta_3 creado");
            }else {
                System.out.println("Carpeta_3 ya creado");
            }

            fichero=new File(ruta3+("\\Fichero3.txt"));
            if(!fichero.exists()){
                fichero.createNewFile();
                System.out.println("fichero3.txt creado");
            }else {
                System.out.println("fichero3.txt ya creado");
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void escritor(){

        File fichero =new File("C:\\Users\\dam\\Desktop\\CLASEE\\Acceso a datos\\Ejercicio1\\Carpeta_3\\Fichero3.txt");
        Scanner s = new Scanner(System.in);
        String texto=s.nextLine();

        try {
            FileWriter escritor = new FileWriter(fichero);

            if(fichero.canWrite()){
                escritor.write(texto);
                escritor.close();

                System.out.println("Texto en el Fichero3.txt");
            }


        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void copiarFichero(){

       System.out.println("Ruta del fichero que quiere copiar ");
       Scanner leerTeclado= new Scanner(System.in);
       String fichero=leerTeclado.nextLine();
       File fichero1= new File(fichero);
       if(fichero1.exists()){
           try {
               System.out.println("Ruta del fichero que poner lo copiado ");
               fichero=leerTeclado.nextLine();
               File fichero2= new File(fichero);
               if (fichero2.exists()){
                   FileReader lector= new FileReader(fichero1);
                   FileWriter escritor=new FileWriter(fichero2);
                   BufferedReader bufferReader = new BufferedReader(lector);
                    String linea;
                    while ((linea=bufferReader.readLine()) != null){
                        escritor.write(linea);
                        escritor.close();
                    }
                    bufferReader.close();
                   

               }else{
                   System.out.println("La ruta o el fichero del segundo fichero no existe");
               }

           }catch (IOException  e){
               System.err.println(e.getMessage());
           }
       }else{
           System.out.println("La ruta o el fichero del primer fichero no existe");
       }



    }
    public static void moverDirectorio(){
        Path origenPath = FileSystems.getDefault().getPath("C:\\Users\\dam\\Desktop\\CLASEE\\Acceso a datos\\Ejercicio1\\Carpeta_1\\Carpeta_1_1");
        Path destinoPath = FileSystems.getDefault().getPath("C:\\Users\\dam\\Desktop\\CLASEE\\Acceso a datos\\Ejercicio1\\Carpeta_2\\Carpeta_2_2");

        try {
            Files.move(origenPath, destinoPath, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            System.err.println(e);
        }
    }
    public static void copiarFichero2() {
        try {
            System.out.println("Ruta del fichero que quiere copiar ");
            Scanner leerTeclado= new Scanner(System.in);
            String fichero=leerTeclado.nextLine();
            Path input = Paths.get(fichero);
            if(input.isAbsolute()){

                System.out.println("Ruta del fichero que poner lo copiado ");
                fichero=leerTeclado.nextLine();
                Path output = Paths.get(fichero);
                if (output.isAbsolute()){
                    BufferedReader inputReader = Files.newBufferedReader(input, Charset.defaultCharset());
                    BufferedWriter outputWriter = Files.newBufferedWriter(output, defaultCharset(), StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
                    String line;
                    while ((line = inputReader.readLine()) != null) {
                        outputWriter.write(line, 0, line.length());
                        outputWriter.newLine();
                    }
                    inputReader.close();
                    outputWriter.close();

                }else{
                    System.out.println("La ruta o el fichero del segundo fichero no existe");
                }


            }else{
                System.out.println("La ruta o el fichero del primer fichero no existe");
            }
        }catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
    public static void crearXML(){
        FileReader fr=null;
        try {
            //Cargamos el archivo de la ruta relativa
            File archivo = new File("C:\\Users\\dam\\Desktop\\CLASEE\\Biblioteca.txt");
            //Cargamos el objeto FileReader
             fr = new FileReader(archivo);
            //Creamos un buffer de lectura
            BufferedReader br = new BufferedReader(fr);
            String linea = null;
            String[] datos = null;
            String[] titulo=null;
            String[] autor=null;
            String[] genero=null;
            String[] year=null;
            int i=0;
            //Leemos hasta que se termine el archivo
            while ((linea = br.readLine()) != null) {
                //Utilizamos el separador para los datos
                datos = linea.split(";");
                //Asignamos dats los datos
                titulo[i]=datos[0];
                autor[i]=datos[0];
                genero[i]=datos[0];
                year[i]=datos[0];

                i++;
            }
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbf.newDocumentBuilder() ;
            DOMSource source = new DOMSource();
            //Capturamos las posibles excepciones
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }



    }
}