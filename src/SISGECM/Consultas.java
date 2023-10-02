package SISGECM;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author Ingeniero Brayan
 */
public class Consultas {
    
        private static Connection conexion;
        
        static Conexion c = new Conexion();

    public static String[] busca_medico(int cod){
                
        String [] medico =new String[8];
        
        try{
                
            conexion= c.getConexion();
            
            PreparedStatement sentencia = conexion.prepareStatement("SELECT * FROM medicos WHERE idmedicos=?");
            
            sentencia.setString(1, String.valueOf(cod));
            
            ResultSet rs = sentencia.executeQuery();
        
        while(rs.next()){                
            medico[0]= rs.getString("idmedicos");
            medico[1]=rs.getString("nombre");
            medico[2]=rs.getString("apellidos");
            medico[3]=rs.getString("tipo_doc");
            medico[4]=rs.getString("doc");
            medico[5]=rs.getString("tarjeta_profesional");
            medico[6]=rs.getString("telefono");
            medico[7]=rs.getString("email");
        }
        
        rs.close();
        conexion.close();
        }catch(Exception e){
            //e.printStackTrace();
        }
        return medico;
    }
        
    public static boolean agregaMedico(String nombre, String apellidos, String tipo_doc, String doc, String tarjeta, String area, String direccion, String telefono, String email){
        boolean respuesta = true;
        
        int documento, tel;
        documento = Integer.parseInt(doc);
        //tel = Integer.parseInt(telefono);
            try {
                String sql = "INSERT INTO MEDICOS(nombre, apellidos, tipo_doc, doc, tarjeta_profesional, area, direccion, telefono, email) VALUES(?,?,?,?,?,?,?,?,?)";
                
                Connection conexion = c.getConexion();
                
                PreparedStatement sentencia = conexion.prepareStatement(sql);
                
                sentencia.setString(1, nombre);
                sentencia.setString(2, apellidos);
                sentencia.setString(3, tipo_doc);
                sentencia.setInt(4, documento);
                sentencia.setString(5, tarjeta);
                sentencia.setString(6, area);
                sentencia.setString(7, direccion);
                sentencia.setString(8, telefono);
                sentencia.setString(9, email);
                
                sentencia.executeUpdate();

                conexion.close();
                
            } catch (SQLException ex) {
                System.out.println("ERROR: "+ex.getMessage());
                respuesta=false;
            }
            return respuesta;
    }
    
    public static boolean actualizaMedico(int idmedico, String nombre, String apellidos, String tipo_doc, int doc, String tarjeta, String area, String direccion, String telefono, String email){
        
        boolean respuesta = true;
        
        Connection conexion = c.getConexion();
        
        String sql = "UPDATE medicos SET nombre=?, apellidos=?, tipo_doc=?, doc=?, tarjeta_profesional=?,"+
                "area=?, direccion=?, telefono=?, email=? WHERE idmedicos=?";
        
        try {
            PreparedStatement sentencia = conexion.prepareStatement(sql);
            
            sentencia.setString(1, nombre);
            sentencia.setString(2, apellidos);
            sentencia.setString(3, tipo_doc);
            sentencia.setInt(4, doc);
            sentencia.setString(5, tarjeta);
            sentencia.setString(6, area);
            sentencia.setString(7, direccion);
            sentencia.setString(8, telefono);
            sentencia.setString(9, email);
            sentencia.setInt(10, idmedico);
            
            sentencia.execute();

            conexion.close();
            
        } catch (SQLException ex) {
            System.out.println(ex);
            respuesta = false;
        }
        
        return respuesta;
    }
    
    public static boolean asigna_horario(String idhorario, String dia, String hora, String id_medico){

                try {
                    
                    conexion = c.getConexion();
                    
                    String sql = "INSERT INTO horarios(idhorario,dia,hora,medicos_idmedicos) VALUES(?,?,?,?)";
                    
                    PreparedStatement sentencia = conexion.prepareStatement(sql);
                    
                    sentencia.setString(1, idhorario);
                    sentencia.setString(2, dia);
                    sentencia.setString(3, hora);
                    sentencia.setString(4, id_medico);
                    
                    sentencia.executeUpdate();

                    conexion.close();
                    
                } catch (SQLException ex) {
                    System.out.println("ERROR: "+ ex.getMessage());
                    return false;
                }

        return true;
    }
    
    public static int ultimo_horario(){
        
        int valor = 0;
        
        try
        {
            conexion= c.getConexion();

            String sql = "SELECT * FROM horarios ORDER BY idhorario DESC LIMIT 1";

            Statement miStatment = conexion.createStatement();

            ResultSet rs = miStatment.executeQuery(sql);

            if(rs.next()){
                
                String dato = rs.getString(1);
                
                valor = Integer.parseInt(dato.substring(3));
                
            }
            rs.close();
            conexion.close();            
        }
        catch(Exception e)
        {
            e.getMessage();
        }
                
        return valor;
    }
    
    public static ArrayList<String> selecciona_horario(String fecha, int idmedico){
        
        ArrayList<String> resultado = new ArrayList<String>();
        
        try{
            
            conexion= c.getConexion();

            String sql = "SELECT DATE_FORMAT(hora, '%h:%i %p') AS hora FROM horarios WHERE dia=? AND medicos_idmedicos=? AND estado = \"DISPONIBLE\"";
            
            PreparedStatement sentencia = conexion.prepareStatement(sql);
            
            sentencia.setString(1, fecha);
            sentencia.setInt(2, idmedico);
            
            
            
            ResultSet rs = sentencia.executeQuery();
            
            while(rs.next())
            {
                resultado.add(rs.getString(1));
            }
            
            rs.close();
            conexion.close();
            
        }catch(Exception e)
        {
            e.getMessage();
        }
                
        return resultado;
    }
    
    public static boolean asignaCita(String dia, String hora, int docpaciente, int idmedico){
        
        String AmPm= hora.substring(6);
        
        if(AmPm.equals("PM"))
        {
            if(hora.substring(0, 2).equals("12"))
                hora= hora.substring(0,5)+":00";
            else
                hora=Integer.parseInt(hora.substring(0,2))+12 +":"+hora.substring(3,5)+":00";
        }
        else{
            hora=hora.substring(0,5)+":00";
        }
            try{
                conexion = c.getConexion();
                
                PreparedStatement sentencia = conexion.prepareStatement("INSERT INTO citas (dia, hora, pacientes_docpaciente, medicos_idmedicos) VALUES (?,?,?,?)");
                
                sentencia.setString(1, dia);
                sentencia.setString(2, hora);
                sentencia.setInt(3, docpaciente);
                sentencia.setInt(4, idmedico);

                sentencia.execute();
                
                PreparedStatement sentencia2 = conexion.prepareStatement("UPDATE horarios SET estado=? WHERE dia=? AND hora=? AND medicos_idmedicos=?");
                
                sentencia2.setString(1,"OCUPADO");
                sentencia2.setString(2, dia);
                sentencia2.setString(3, hora);
                sentencia2.setInt(4, idmedico);
                
                sentencia2.execute();

                conexion.close();
                
            }catch(SQLException e){
                System.out.println(e.getMessage());
                return false;
            }
        
        return true;
    }  
    
    public static boolean modificaCita(int doc, String fecha, String hora, int idmedico){
        String AmPm= hora.substring(6);
        
        if(AmPm.equals("PM"))
        {
            if(hora.substring(0, 2).equals("12"))
                hora= hora.substring(0,5)+":00";
            else
                hora=Integer.parseInt(hora.substring(0,2))+12 +":"+hora.substring(3,5)+":00";
        }
        else{
            hora=hora.substring(0,5)+":00";
        }
        
        boolean respuesta=true;
        try {
            conexion = c.getConexion();
            
            PreparedStatement sentencia = conexion.prepareStatement("UPDATE citas SET dia=?, hora=?,medicos_idmedicos=? WHERE pacientes_docpaciente=?");
            
            sentencia.setString(1, fecha);
            sentencia.setString(2, hora);
            sentencia.setInt(3, idmedico);
            sentencia.setInt(4, doc);
            
            sentencia.execute();
            
            conexion.close();
            
        } catch (SQLException e) {
            System.out.println(e);
            respuesta=false;
        }
        
        return respuesta;
    }
    
    public static boolean agregarUsuario(String nombres, String apellidos, String tipo_doc, String doc, String telefono,String email, String usuario, String clave, String rol){
        boolean respuesta = true;
        try {
            Connection conexion = c.getConexion();
            
            String sql = "INSERT INTO usuarios(nombres, apellidos,"+
                    "tipo_doc,doc,telefono,email,usuario,clave,rol) VALUES"+
                    "(?,?,?,?,?,?,?,?,?)";
            PreparedStatement sentencia = conexion.prepareStatement(sql);
            
            sentencia.setString(1, nombres);
            sentencia.setString(2, apellidos);
            sentencia.setString(3, tipo_doc);
            sentencia.setString(4, doc);
            sentencia.setString(5, telefono);
            sentencia.setString(6, email);
            sentencia.setString(7, usuario);
            sentencia.setString(8, clave);
            sentencia.setString(9, rol);
            
            sentencia.executeUpdate();
            
            sentencia.close();
            
            conexion.close();
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            respuesta = false;
        }
        
        return respuesta;
    }
    
    public static boolean editarUsuario(String nombres, String apellidos, String tipo_doc, String doc, String telefono,String email, String usuario, String clave, String rol){
        boolean respuesta = true;
        try {
            Connection conexion = c.getConexion();
            
            String sql = "UPDATE usuarios SET nombres=?, apellidos=?, tipo_doc=?, telefono=?,"
                    + " email=?, usuario=?, clave=?, rol=? WHERE doc=?";
            PreparedStatement sentencia = conexion.prepareStatement(sql);
            
            sentencia.setString(1, nombres);
            sentencia.setString(2, apellidos);
            sentencia.setString(3, tipo_doc);
            sentencia.setString(4, telefono);
            sentencia.setString(5, email);
            sentencia.setString(6, usuario);
            sentencia.setString(7, clave);
            sentencia.setString(8, rol);
            sentencia.setString(9, doc);
            
            sentencia.executeUpdate();
            
            sentencia.close();
            
            conexion.close();
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            respuesta = false;
        }
        
        return respuesta;
    }
    
    public static boolean eliminarUsuario(String doc){
        boolean respuesta=true;
            try {
                Connection conexion = c.getConexion();
                
                PreparedStatement sentencia = conexion.prepareStatement("DELETE FROM usuarios WHERE doc=?");
                
                sentencia.setString(1, doc);
                
                sentencia.execute();
                
                sentencia.close();
                conexion.close();
                
            } catch (SQLException ex) {
                Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
                respuesta=false;
            }
            return respuesta;
    }
}
