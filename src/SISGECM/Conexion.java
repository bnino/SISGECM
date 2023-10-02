/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SISGECM;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Ingeniero Brayan
 */
public class Conexion {
    
    private static String bd = "modelo_citas";
    private static String usuario = "root";
    private static String pass = "";
    private static String url = "jdbc:mysql://localhost:3306/"+bd;

    public static String getUsuario() {
        return usuario;
    }

    public static String getPass() {
        return pass;
    }
    
    public Connection getConexion(){
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
            con = DriverManager.getConnection(url, usuario, pass);
            
        } catch (SQLException e) {
            System.out.println("ERROR EN CONEXIÓN "+e.getMessage());
        }catch(ClassNotFoundException e){
            System.out.println("ERROR EN CONEXIÓN "+e.getMessage());
        }
        return con;
    }
}
