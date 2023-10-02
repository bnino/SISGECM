package SISGECM;

import java.awt.event.KeyEvent;
import javax.swing.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class EditarMedico extends javax.swing.JFrame {
    
    Conexion c = new Conexion();
    String doc;
    private int idmedico;

    public EditarMedico() {
        initComponents();
        
        setIconImage(new ImageIcon(getClass().getResource("/img/icono.png")).getImage());
        
        this.actualizar_btn.setEnabled(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        doc_txt = new javax.swing.JTextField();
        busacr_btn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        actualizar_btn = new javax.swing.JButton();
        cancelar_btn = new javax.swing.JButton();
        nombre_txt = new javax.swing.JTextField();
        apellidos_txt = new javax.swing.JTextField();
        tipodoc_cmb = new javax.swing.JComboBox();
        tarjetapro_txt = new javax.swing.JTextField();
        direccion_txt = new javax.swing.JTextField();
        area_cmb = new javax.swing.JComboBox();
        telefono_txt = new javax.swing.JTextField();
        email_txt = new javax.swing.JTextField();
        fondo_lbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EDITAR MÉDICO");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("DOCUMENTO:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, -1, -1));

        doc_txt.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        doc_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                doc_txtKeyPressed(evt);
            }
        });
        getContentPane().add(doc_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 120, 30));

        busacr_btn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        busacr_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupa.png"))); // NOI18N
        busacr_btn.setText("BUSCAR");
        busacr_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        busacr_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busacr_btnActionPerformed(evt);
            }
        });
        getContentPane().add(busacr_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, -1, 30));

        jPanel1.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("NOMBRE:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("APELLIDOS:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("TIPO DOCUMENTO:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("TARJETA PROFESIONAL:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("ÁREA:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("TELEFONO:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("EMAIL:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("DIRECCIÓN:");

        actualizar_btn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        actualizar_btn.setForeground(new java.awt.Color(255, 255, 255));
        actualizar_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/update.png"))); // NOI18N
        actualizar_btn.setText("ACTUALIZAR");
        actualizar_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        actualizar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizar_btnActionPerformed(evt);
            }
        });

        cancelar_btn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cancelar_btn.setForeground(new java.awt.Color(255, 255, 255));
        cancelar_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar.png"))); // NOI18N
        cancelar_btn.setText("CANCELAR");
        cancelar_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelar_btnActionPerformed(evt);
            }
        });

        nombre_txt.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        apellidos_txt.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        tipodoc_cmb.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        tipodoc_cmb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CC", "CE", "PASAPORTE" }));

        tarjetapro_txt.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        direccion_txt.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        area_cmb.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        area_cmb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "MEDICINA GENERAL", "ODONTOLOGÍA" }));

        telefono_txt.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        email_txt.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(actualizar_btn)
                        .addGap(34, 34, 34)
                        .addComponent(cancelar_btn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(telefono_txt)
                            .addComponent(direccion_txt)
                            .addComponent(tarjetapro_txt)
                            .addComponent(apellidos_txt)
                            .addComponent(nombre_txt)
                            .addComponent(email_txt)
                            .addComponent(tipodoc_cmb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(area_cmb, 0, 220, Short.MAX_VALUE))
                        .addGap(71, 71, 71)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apellidos_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipodoc_cmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tarjetapro_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(area_cmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(direccion_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefono_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(actualizar_btn)
                    .addComponent(cancelar_btn))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 500, 420));

        fondo_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/medicine.jpg"))); // NOI18N
        getContentPane().add(fondo_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelar_btnActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelar_btnActionPerformed

    private void busacr_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busacr_btnActionPerformed
        if(doc_txt.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "INGRESE NÚMERO DE DOCUMENTO DE MÉDICO", "ERROR", JOptionPane.ERROR_MESSAGE);
            doc_txt.requestFocus();
        }
        else if(!doc_txt.getText().matches("\\d*"))
        {
            JOptionPane.showMessageDialog(null, "EL DOCUMENTO SOLO DEBE CONTENER NÚMEROS", "ERROR", JOptionPane.ERROR_MESSAGE);
            doc_txt.requestFocus();
        }
        else
        {
            buscarMedico(Integer.parseInt(doc_txt.getText()));
            doc = doc_txt.getText();
        }
    }//GEN-LAST:event_busacr_btnActionPerformed

    private void actualizar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizar_btnActionPerformed
        String nombre = nombre_txt.getText().toUpperCase();
        String apellidos= apellidos_txt.getText().toUpperCase();
        String tipo_doc = tipodoc_cmb.getSelectedItem().toString();
        doc = doc_txt.getText();
        String tarjetapro = tarjetapro_txt.getText().toUpperCase();
        String area = area_cmb.getSelectedItem().toString();
        String direccion = direccion_txt.getText().toUpperCase();
        String telefono = telefono_txt.getText();
        String email= email_txt.getText();
        
        if (nombre.equals("")) {
            JOptionPane.showMessageDialog(null, "EL CAMPO NOMBRE NO PUEDE ESTAR VACIO", "ERROR", JOptionPane.ERROR_MESSAGE);
            nombre_txt.requestFocus();            
        } else if(apellidos.equals("")){
            JOptionPane.showMessageDialog(null, "EL CAMPO APELLIDOS NO PUEDE ESTAR VACIO", "ERROR", JOptionPane.ERROR_MESSAGE);
            apellidos_txt.requestFocus();            
        } else if(doc.equals("")){
            JOptionPane.showMessageDialog(null, "EL CAMPO DOCUMENTO NO PUEDE ESTAR VACIO", "ERROR", JOptionPane.ERROR_MESSAGE);
            doc_txt.requestFocus();            
        } else if(!doc.matches("\\d*")){
            JOptionPane.showMessageDialog(null, "EL DOCUMENTO SÓLO DEBE CONTENER NÚMEROS", "ERROR", JOptionPane.ERROR_MESSAGE);
            doc_txt.requestFocus();            
        } else if(direccion.equals("")){
            JOptionPane.showMessageDialog(null, "EL CAMPO DIRECCIÓN NO PUEDE ESTAR VACIO", "ERROR", JOptionPane.ERROR_MESSAGE);
            direccion_txt.requestFocus();            
        } else if(telefono.equals("")){
            JOptionPane.showMessageDialog(null, "EL CAMPO TELÉFONO NO PUEDE ESTAR VACIO", "ERROR", JOptionPane.ERROR_MESSAGE);
            telefono_txt.requestFocus();            
        } else if(!telefono.matches("\\d*")){
            JOptionPane.showMessageDialog(null, "EL TELÉFONO SÓLO DEBE CONTENER NÚMEROS", "ERROR", JOptionPane.ERROR_MESSAGE);
            telefono_txt.requestFocus();            
        } else {
            boolean respuesta = Consultas.actualizaMedico(idmedico, nombre, apellidos, tipo_doc, Integer.parseInt(doc), tarjetapro, area, direccion, telefono, email);
            if(respuesta)
            {
                
                JOptionPane.showMessageDialog(null, "DATOS ACTUALIZADOS CORRECTAMENTE", "INFORMACIÓN", JOptionPane.INFORMATION_MESSAGE);
                doc_txt.setText("");
                doc_txt.requestFocus();
                nombre_txt.setText("");
                apellidos_txt.setText("");
                tipodoc_cmb.setSelectedIndex(0);
                tarjetapro_txt.setText("");
                area_cmb.setSelectedIndex(0);
                direccion_txt.setText("");
                telefono_txt.setText("");
                email_txt.setText("");
                actualizar_btn.setEnabled(false);
            }
            else
            {
                System.out.println("Despues de consulta: "+respuesta);
                JOptionPane.showMessageDialog(null, "ERROR AL ACTUALIZAR MÉDICO", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_actualizar_btnActionPerformed

    private void doc_txtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_doc_txtKeyPressed
        if (evt.getKeyCode()== KeyEvent.VK_ENTER) {
            if(doc_txt.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null, "INGRESE NÚMERO DE DOCUMENTO DE MÉDICO", "ERROR", JOptionPane.ERROR_MESSAGE);
                doc_txt.requestFocus();
            }
            else if(!doc_txt.getText().matches("\\d*"))
            {
                JOptionPane.showMessageDialog(null, "EL DOCUMENTO SOLO DEBE CONTENER NÚMEROS", "ERROR", JOptionPane.ERROR_MESSAGE);
                doc_txt.requestFocus();
            }
            else
            {
                buscarMedico(Integer.parseInt(doc_txt.getText()));
            }
        }
    }//GEN-LAST:event_doc_txtKeyPressed

    public void buscarMedico(int doc)
    {
        try {
            Connection conexion = c.getConexion();
            
            String sql = "SELECT * FROM medicos WHERE doc=?";
            
            PreparedStatement sentencia = conexion.prepareStatement(sql);
            
            sentencia.setInt(1, doc);
            
            ResultSet rs = sentencia.executeQuery();
            
            if(rs.next())
            {
                this.idmedico = Integer.parseInt(rs.getString("idmedicos"));
                this.nombre_txt.setText(rs.getString("nombre"));
                this.apellidos_txt.setText(rs.getString("apellidos"));
                this.tipodoc_cmb.setSelectedItem(rs.getString("tipo_doc"));
                this.tarjetapro_txt.setText(rs.getString("tarjeta_profesional"));
                this.area_cmb.setSelectedItem(rs.getString("area"));
                this.direccion_txt.setText(rs.getString("direccion"));
                this.telefono_txt.setText(rs.getString("telefono"));
                this.email_txt.setText(rs.getString("email"));
                this.actualizar_btn.setEnabled(true);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "NO SE ENCONTRÓ MEDICO CON EL DOCUMENTO: "+doc, "ERROR", JOptionPane.ERROR_MESSAGE);
                this.actualizar_btn.setEnabled(false);
                this.doc_txt.requestFocus();
            }
            rs.close();
            conexion.close();
            
        } catch (SQLException ex) {
            System.out.println("ERROR AL BUSCAR MÉDICO: "+ex);
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
            java.util.logging.Logger.getLogger(EditarMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarMedico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizar_btn;
    private javax.swing.JTextField apellidos_txt;
    private javax.swing.JComboBox area_cmb;
    private javax.swing.JButton busacr_btn;
    private javax.swing.JButton cancelar_btn;
    private javax.swing.JTextField direccion_txt;
    private javax.swing.JTextField doc_txt;
    private javax.swing.JTextField email_txt;
    private javax.swing.JLabel fondo_lbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nombre_txt;
    private javax.swing.JTextField tarjetapro_txt;
    private javax.swing.JTextField telefono_txt;
    private javax.swing.JComboBox tipodoc_cmb;
    // End of variables declaration//GEN-END:variables
}
