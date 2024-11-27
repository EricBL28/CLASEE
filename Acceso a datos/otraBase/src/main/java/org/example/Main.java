package org.example;


import java.sql.*;

public class Main {
    public static void main(String[] args) {

        try{
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/biblioteca","alumno","alumno");

            Statement sentencia = conexion.createStatement();

            String sql= " SELECT * FROM autor";

            ResultSet resul = sentencia.executeQuery(sql);
            while(resul.next()){
                System.out.println(resul.getInt(1)+" "+resul.getString(2)+" "+resul.getString(3));
            }
            resul.close();
            sentencia.close();
            conexion.close();
        }catch(SQLException e){
            e.printStackTrace();
        }

    }
}