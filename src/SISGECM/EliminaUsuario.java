package SISGECM;

import java.sql.*;
import javax.swing.*;

/**
 *
 * @author Ingeniero Brayan
 */
public class EliminaUsuario extends javax.swing.JFrame {
    
    Conexion c = new Conexion();
    
    String doc;

    public EliminaUsuario() {
        initComponents();
        
        setIconImage(new ImageIcon(getClass().getResource("/img/icono.png")).getImage());
        
        nombre_txt.setEditable(false);
        apellidos_txt.setEditable(false);
        rol_txt.setEditable(false);
        eliminar_btn.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        doc_txt = new javax.swing.JTextField();
        buscar_btn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nombre_txt = new javax.swing.JTextField();
        apellidos_txt = new javax.swing.JTextField();
        rol_txt = new javax.swing.JTextField();
        eliminar_btn = new javax.swing.JButton();
        canclar_btn = new javax.swing.JButton();
        fondo_lbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ELIMINAR USUARIO");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("DOCUMENTO: ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));
        getContentPane().add(doc_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 160, 30));

        buscar_btn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        buscar_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupa.png"))); // NOI18N
        buscar_btn.setText("BUSCAR");
        buscar_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buscar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar_btnActionPerformed(evt);
            }
        });
        getContentPane().add(buscar_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 110, 30));

        jPanel1.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("DATOS DE USUARIO:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("NOMBRE: ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("APELLIDOS: ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("ROL DE USUARIO: ");

        eliminar_btn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        eliminar_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete-user.png"))); // NOI18N
        eliminar_btn.setText("ELIMINAR");
        eliminar_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eliminar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar_btnActionPerformed(evt);
            }
        });

        canclar_btn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        canclar_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancel.png"))); // NOI18N
        canclar_btn.setText("CANCELAR");
        canclar_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        canclar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                canclar_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombre_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(apellidos_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rol_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(78, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(eliminar_btn)
                .addGap(68, 68, 68)
                .addComponent(canclar_btn)
                .addGap(88, 88, 88))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nombre_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(apellidos_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(rol_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eliminar_btn)
                    .addComponent(canclar_btn))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 480, 290));

        fondo_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/medicine.jpg"))); // NOI18N
        getContentPane().add(fondo_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar_btnActionPerformed
        if(doc_txt.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "POR FAVOR INGRESE UN NÚMERO DE DOCUMENTO", "ERROR", JOptionPane.ERROR_MESSAGE);
        }else if(!doc_txt.getText().matches("\\d*")){
            JOptionPane.showMessageDialog(null, "EL DOCUMENTO SOLO DEBE CONTENER NÚMEROS", "ERROR", JOptionPane.ERROR_MESSAGE);
        }else{
            doc=doc_txt.getText();
            buscaUsuario(Integer.parseInt(doc));
        }
    }//GEN-LAST:event_buscar_btnActionPerformed

    private void eliminar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar_btnActionPerformed
        
        int res = JOptionPane.showConfirmDialog(null, "<html><center>ESTA SEGURO DE ELIMINAR EL USUARIO <br/> CON DOCUMENTO: "+
                doc+"?</center></html>", "ALERTA", JOptionPane.YES_NO_OPTION);
        if(res== JOptionPane.YES_OPTION)
        {
            boolean respuesta = Consultas.eliminarUsuario(doc);
            if(respuesta){
                JOptionPane.showMessageDialog(null, "USUARIO ELIMINADO CON ÉXITO", "INFORMACIÓN", JOptionPane.INFORMATION_MESSAGE);
                nombre_txt.setText("");
                apellidos_txt.setText("");
                rol_txt.setText("");
                eliminar_btn.setEnabled(false);
                
            }else{
                JOptionPane.showMessageDialog(null, "OCURRIÓ UN ERROR AL ELIMINAR EL USUARIO", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_eliminar_btnActionPerformed

    private void canclar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_canclar_btnActionPerformed
        this.dispose();
    }//GEN-LAST:event_canclar_btnActionPerformed

    private void buscaUsuario (int doc){
        try {
            Connection conexion = c.getConexion();
            
            String sql = "SELECT * FROM usuarios WHERE doc=?";
            
            PreparedStatement sentencia=conexion.prepareStatement(sql);
            
            sentencia.setInt(1, doc);
            
            ResultSet rs = sentencia.executeQuery();
            
            if(rs.next())
            {
                nombre_txt.setText(rs.getString("nombres"));
                apellidos_txt.setText(rs.getString("apellidos"));
                rol_txt.setText(rs.getString("rol"));
                eliminar_btn.setEnabled(true);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "NO SE EN CONTRÓ NINGUN USUARIO CON EL DOCUMENTO: "+doc);
            }
            
        } catch (SQLException e) {
            System.out.println(e);
            System.out.println(e.getCause());
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
            java.util.logging.Logger.getLogger(EliminaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EliminaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EliminaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EliminaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EliminaUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidos_txt;
    private javax.swing.JButton buscar_btn;
    private javax.swing.JButton canclar_btn;
    private javax.swing.JTextField doc_txt;
    private javax.swing.JButton eliminar_btn;
    private javax.swing.JLabel fondo_lbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nombre_txt;
    private javax.swing.JTextField rol_txt;
    // End of variables declaration//GEN-END:variables
}
