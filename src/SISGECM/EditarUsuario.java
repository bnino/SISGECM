package SISGECM;

import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Ingeniero Brayan
 */
public class EditarUsuario extends javax.swing.JFrame {

    boolean clavevalidada = false;
    String doc;
    Conexion c= new Conexion();

    public EditarUsuario() {
        initComponents();
        
        setIconImage(new ImageIcon(getClass().getResource("/img/icono.png")).getImage());

        actualizar_btn.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        doc_txt = new javax.swing.JTextField();
        buscar_btn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        nombres_txt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        apellidos_txt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tipodoc_cmb = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        telefono_txt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        email_txt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        usuario_txt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        clave_psw = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();
        confirmaclave_psw = new javax.swing.JPasswordField();
        jLabel12 = new javax.swing.JLabel();
        rol_cmb = new javax.swing.JComboBox();
        validaclave_lbl = new javax.swing.JLabel();
        actualizar_btn = new javax.swing.JButton();
        cancelar_btn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EDITAR DATOS DE USUARIO");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("DOCUMENTO: ");

        doc_txt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        buscar_btn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        buscar_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupa.png"))); // NOI18N
        buscar_btn.setText("BUSCAR");
        buscar_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buscar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar_btnActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("NOMBRES: ");

        nombres_txt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("APELLIDOS: ");

        apellidos_txt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("TIPO DOCUMENTO: ");

        tipodoc_cmb.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tipodoc_cmb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECCIONE...", "CC", "CE", "PASAPORTE" }));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("TELEFONO: ");

        telefono_txt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("EMAIL: ");

        email_txt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("NOMBRE DE USUARIO: ");

        usuario_txt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("NUEVA CLAVE: ");

        clave_psw.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("REPITA CLAVE: ");

        confirmaclave_psw.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        confirmaclave_psw.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                confirmaclave_pswKeyReleased(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("ROL DE USUARIO: ");

        rol_cmb.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rol_cmb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECCIONE...", "ADMINISTRADOR", "ENCARGADO DE CITAS", "RECEPCIONISTA" }));

        actualizar_btn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        actualizar_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/update.png"))); // NOI18N
        actualizar_btn.setText("ACTUALIZAR");
        actualizar_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        actualizar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizar_btnActionPerformed(evt);
            }
        });

        cancelar_btn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cancelar_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar.png"))); // NOI18N
        cancelar_btn.setText("CANCELAR");
        cancelar_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelar_btnActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setText("EDITAR DATOS DE USUARIO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(doc_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buscar_btn))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel12))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(clave_psw, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(usuario_txt, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(email_txt, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(telefono_txt, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(apellidos_txt, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nombres_txt, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tipodoc_cmb, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(confirmaclave_psw)
                                    .addComponent(rol_cmb, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(validaclave_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(actualizar_btn)
                        .addGap(29, 29, 29)
                        .addComponent(cancelar_btn)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(doc_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscar_btn))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(nombres_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(apellidos_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tipodoc_cmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefono_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(usuario_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(clave_psw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(confirmaclave_psw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(validaclave_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(rol_cmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelar_btn)
                    .addComponent(actualizar_btn))
                .addGap(41, 41, 41))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 470, 510));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/medicine.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void confirmaclave_pswKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_confirmaclave_pswKeyReleased
        if(!String.valueOf(clave_psw.getPassword()).equals(String.valueOf(confirmaclave_psw.getPassword())))
        {
            String error = "/img/cancel.png";
            ImageIcon icono = new ImageIcon(getClass().getResource(error));
            this.validaclave_lbl.setIcon(icono);

            clavevalidada=false;
        }
        else
        {
            String correcto = "/img/correct.png";
            ImageIcon icono = new ImageIcon(getClass().getResource(correcto));
            this.validaclave_lbl.setIcon(icono);
            clavevalidada=true;
        }

    }//GEN-LAST:event_confirmaclave_pswKeyReleased

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

    private void actualizar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizar_btnActionPerformed
        String nombre = nombres_txt.getText().toUpperCase();
        String apellidos = apellidos_txt.getText().toUpperCase();
        String tipo_doc = tipodoc_cmb.getSelectedItem().toString();
        String telefono = telefono_txt.getText();
        String email = email_txt.getText();
        String usuario = usuario_txt.getText();
        String clave = new String(clave_psw.getPassword());
        String rol = rol_cmb.getSelectedItem().toString();

        if(nombre.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "INGRESE NOMBRES", "ERROR", JOptionPane.ERROR_MESSAGE);
            nombres_txt.requestFocus();
        }else if(apellidos.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "INGRESE APELLIDOS", "ERROR", JOptionPane.ERROR_MESSAGE);
            apellidos_txt.requestFocus();
        }else if(tipodoc_cmb.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(null, "SELECCIONE TIPO DE DOCUMENTO", "ERROR", JOptionPane.ERROR_MESSAGE);
            tipodoc_cmb.requestFocus();
        }else if(doc.isEmpty()){
            JOptionPane.showMessageDialog(null, "INGRESE NÚMERO DE DOCUMENTO", "ERROR", JOptionPane.ERROR_MESSAGE);
            doc_txt.requestFocus();
        }else if(!doc.matches("\\d*")){
            JOptionPane.showMessageDialog(null, "EL DOCUMENTO SÓLO DEBE CONTENER NÚMEROS", "ERROR", JOptionPane.ERROR_MESSAGE);
            doc_txt.requestFocus();
        }else if(telefono.isEmpty()){
            JOptionPane.showMessageDialog(null, "INGRESE TELÉFONO", "ERROR", JOptionPane.ERROR_MESSAGE);
            telefono_txt.requestFocus();
        }else if(!telefono.matches("\\d*")){
            JOptionPane.showMessageDialog(null, "EL TELÉFONO SOLO DEBE CONTENER NÚMEROS", "ERROR", JOptionPane.ERROR_MESSAGE);
            telefono_txt.requestFocus();
        }else if(usuario.isEmpty()){
            JOptionPane.showMessageDialog(null, "INGRESE NOMBRE DE USUARIO", "ERROR", JOptionPane.ERROR_MESSAGE);
            usuario_txt.requestFocus();
        }else if(clave.length()==0){
            JOptionPane.showMessageDialog(null, "INGRESE NUEVA CLAVE PARA EL USUARIO", "ERROR", JOptionPane.ERROR_MESSAGE);
            clave_psw.requestFocus();
        }else if(!clavevalidada){
            JOptionPane.showMessageDialog(null, "LAS CONTRASEÑAS NO COINCIDEN, REVISE", "ERROR", JOptionPane.ERROR_MESSAGE);
            confirmaclave_psw.requestFocus();
        }else if(rol_cmb.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(null, "SELECCIONE ROL DE USUARIO", "ERROR", JOptionPane.ERROR_MESSAGE);
            rol_cmb.requestFocus();
        }
        else
        {
            boolean respuesta = Consultas.editarUsuario(nombre.toUpperCase(), apellidos.toUpperCase(),tipo_doc, doc,
                        telefono,email, usuario, clave, rol);
                if (respuesta) {
                JOptionPane.showMessageDialog(null, "<html><center>USUARIO ACTUALIZADO CON ÉXITO<br/> RECUERDE QUE PARA INGRESAR AL "
                        + "SISTEMA DEBE HACERLO <br/> CON EL NOMBRE DE USUARIO Y CONTRASEÑA REGISTRADOS</center></html>", "INFORMACIÓN", JOptionPane.INFORMATION_MESSAGE);
                nombres_txt.setText("");
                doc_txt.setText("");
                doc_txt.requestFocus();
                apellidos_txt.setText("");
                tipodoc_cmb.setSelectedIndex(0);
                telefono_txt.setText("");
                email_txt.setText("");
                usuario_txt.setText("");
                clave_psw.setText("");
                confirmaclave_psw.setText("");
                rol_cmb.setSelectedIndex(0);
                validaclave_lbl.setIcon(null);
            } else {
                JOptionPane.showMessageDialog(null, "ERROR AL REGISTRAR USUARIO", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_actualizar_btnActionPerformed

    private void cancelar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelar_btnActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelar_btnActionPerformed


    private void buscaUsuario (int doc){
        try {
            Connection conexion = c.getConexion();

            String sql = "SELECT * FROM usuarios WHERE doc=?";

            PreparedStatement sentencia=conexion.prepareStatement(sql);

            sentencia.setInt(1, doc);

            ResultSet rs = sentencia.executeQuery();

            if(rs.next())
            {
                nombres_txt.setText(rs.getString("nombres"));
                apellidos_txt.setText(rs.getString("apellidos"));
                tipodoc_cmb.setSelectedItem(rs.getString("tipo_doc"));
                telefono_txt.setText(rs.getString("telefono"));
                email_txt.setText(rs.getString("email"));
                usuario_txt.setText(rs.getString("usuario"));
                rol_cmb.setSelectedItem(rs.getString("rol"));
                actualizar_btn.setEnabled(true);
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
            java.util.logging.Logger.getLogger(EditarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizar_btn;
    private javax.swing.JTextField apellidos_txt;
    private javax.swing.JButton buscar_btn;
    private javax.swing.JButton cancelar_btn;
    private javax.swing.JPasswordField clave_psw;
    private javax.swing.JPasswordField confirmaclave_psw;
    private javax.swing.JTextField doc_txt;
    private javax.swing.JTextField email_txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nombres_txt;
    private javax.swing.JComboBox rol_cmb;
    private javax.swing.JTextField telefono_txt;
    private javax.swing.JComboBox tipodoc_cmb;
    private javax.swing.JTextField usuario_txt;
    private javax.swing.JLabel validaclave_lbl;
    // End of variables declaration//GEN-END:variables
}
