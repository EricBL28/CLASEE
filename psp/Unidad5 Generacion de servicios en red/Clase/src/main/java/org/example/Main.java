package org.example;

import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        try{

            FTPClient clienteFTP = new FTPClient();

            clienteFTP.connect("ftp.rediris.es");

             int respuesta=clienteFTP.getReplyCode();

            if(!FTPReply.isPositiveCompletion(respuesta)){


                //abre una sesión con el usuario anónimo
                clienteFTP.login("alumno", "alumno");
                //Activar el modo pasivo para no tener problemas con el Firewall de Windows
                clienteFTP.enterLocalPassiveMode();
                //lista las carpetas de primer nivel del servidor FTP
                System.out.println("Carpetas disponibles en Servidor:");

                clienteFTP.disconnect();
                System.out.println("Descarga finalizada correctamente");
            }else{
                clienteFTP.disconnect();
                System.err.println("FTP ha rechazado la conexión esblecida");
                System.exit(1);
            }


        }catch ( IOException e ){
            System.out.println(e.getMessage());
        }

    }
}