/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SISGECM;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ingeniero Brayan
 */
public class VerPacientes extends javax.swing.JFrame {

    Conexion c = new Conexion();
    
    public VerPacientes() {
        initComponents();
        
        modelotabla.addColumn("TIPO DOC.");
        modelotabla.addColumn("DOCUMENTO");
    	modelotabla.addColumn("NOMBRES");
    	modelotabla.addColumn("APELLIDOS");
    	modelotabla.addColumn("FECHA DE NACI.");
    	modelotabla.addColumn("SEXO");
        modelotabla.addColumn("CITAS ESTE MÉS");
        
        tablaPacientes.setModel(modelotabla);
        
        tablaPacientes.getTableHeader().setReorderingAllowed(false) ;
        
        pacientes_panel.getViewport().add(tablaPacientes, null);

        tablaPacientes.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        tablaPacientes.setBorder(null);
        
        setIconImage(new ImageIcon(getClass().getResource("/img/icono.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        pacientes_panel = new javax.swing.JScrollPane();
        jLabel2 = new javax.swing.JLabel();
        busca_paciente_txt = new javax.swing.JTextField();
        buscar_btn = new javax.swing.JButton();
        carga_todos_btn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PACIENTES");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("PACIENTES REGISTRADOS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 17, -1, -1));
        getContentPane().add(pacientes_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 751, 393));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel2.setText("FILTRAR POR NOMBRES O APELLIDOS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, -1, -1));

        busca_paciente_txt.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        busca_paciente_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                busca_paciente_txtKeyReleased(evt);
            }
        });
        getContentPane().add(busca_paciente_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(486, 60, 140, 29));

        buscar_btn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        buscar_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupa.png"))); // NOI18N
        buscar_btn.setText("BUSCAR");
        buscar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar_btnActionPerformed(evt);
            }
        });
        getContentPane().add(buscar_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 60, -1, -1));

        carga_todos_btn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        carga_todos_btn.setText("CARGAR TODOS");
        carga_todos_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carga_todos_btnActionPerformed(evt);
            }
        });
        getContentPane().add(carga_todos_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 67, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/medicine.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar_btnActionPerformed
        int filas = modelotabla.getRowCount()-1;
            int i=0;
            while(filas>=0){
                
                modelotabla.removeRow(filas);
                filas = modelotabla.getRowCount()-1;
            }
        buscaPaciente_Filtro(busca_paciente_txt.getText());
        
    }//GEN-LAST:event_buscar_btnActionPerformed

    private void busca_paciente_txtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_busca_paciente_txtKeyReleased
        int filas = modelotabla.getRowCount()-1;
            int i=0;
            while(filas>=0){
                
                modelotabla.removeRow(filas);
                filas = modelotabla.getRowCount()-1;
            }
        buscaPaciente_Filtro(busca_paciente_txt.getText());
    }//GEN-LAST:event_busca_paciente_txtKeyReleased

    private void carga_todos_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carga_todos_btnActionPerformed
        Pacientes();
    }//GEN-LAST:event_carga_todos_btnActionPerformed

    public void Pacientes(){

        try {
            String tipo_doc, documento,nombres,apellidos,nacimiento,sexo;
            
            String[] fila= new String[7];
            
            Connection conexion = c.getConexion();
            
            PreparedStatement sentencia = conexion.prepareStatement("SELECT * FROM pacientes");
            
            ResultSet rs = sentencia.executeQuery();
            
            while(rs.next())
            {
                tipo_doc = rs.getString("tipo_doc");
                documento = rs.getString("doc");
                nombres = rs.getString("nombre1") + " " + rs.getString("nombre2");
                apellidos = rs.getString("apellido1") + " " + rs.getString("apellido2");
                nacimiento = rs.getString("fecha_naci");
                sexo = rs.getString("sexo");
                             
                fila[0]= tipo_doc;
                fila[1] = documento;
                fila[2] = nombres;
                fila[3] = apellidos;
                fila[4] = nacimiento;
                fila[5] = sexo;
                
                String sql = "SELECT COUNT(*) FROM citas WHERE pacientes_docpaciente ="+rs.getString("idpacientes");
                
                PreparedStatement sentencia2 = conexion.prepareStatement(sql);
                
                ResultSet result = sentencia2.executeQuery();
                
                while (result.next()) {
                    fila[6] = result.getString(1);
                }
                
                modelotabla.addRow(fila);                
            }
            rs.close();
        } catch (SQLException ex) {
            System.out.println("ERROR: "+ex);
        }       
    }
    
    private void buscaPaciente_Filtro(String busqueda){
        try {
            
            String tipo_doc, documento,nombres,apellidos,nacimiento,sexo;
            
            String[] fila= new String[7];
            
            String sql = "SELECT * FROM `pacientes` WHERE CONCAT(nombre1,' ',nombre2) LIKE '%"+busqueda+"%' OR CONCAT(apellido1,' ',apellido2) LIKE '%"+busqueda+"%'";
            
            Connection conexion = c.getConexion();
            
            PreparedStatement sentencia = conexion.prepareStatement(sql);
            
            ResultSet rs = sentencia.executeQuery();
            
            while(rs.next()){
                
                tipo_doc = rs.getString("tipo_doc");
                documento = rs.getString("doc");
                nombres = rs.getString("nombre1") + " " + rs.getString("nombre2");
                apellidos = rs.getString("apellido1") + " " + rs.getString("apellido2");
                nacimiento = rs.getString("fecha_naci");
                sexo = rs.getString("sexo");
                             
                fila[0]= tipo_doc;
                fila[1] = documento;
                fila[2] = nombres;
                fila[3] = apellidos;
                fila[4] = nacimiento;
                fila[5] = sexo;
                
                String sql2 = "SELECT COUNT(*) FROM citas WHERE pacientes_docpaciente ="+rs.getString("idpacientes");
                
                PreparedStatement sentencia2 = conexion.prepareStatement(sql2);
                
                ResultSet result = sentencia2.executeQuery();
                
                while (result.next()) {
                    fila[6] = result.getString(1);
                }
                
                modelotabla.addRow(fila);    
            }
            
            rs.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(VerPacientes.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "OCURRIÓ UN ERROR AL REALIZAR LA BÚSQUEDA", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VerPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VerPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VerPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VerPacientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField busca_paciente_txt;
    private javax.swing.JButton buscar_btn;
    private javax.swing.JButton carga_todos_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane pacientes_panel;
    // End of variables declaration//GEN-END:variables
    private JTable tablaPacientes = new JTable();
    DefaultTableModel modelotabla=new DefaultTableModel();
    ListSelectionModel escuchador=tablaPacientes.getSelectionModel();
    
}
