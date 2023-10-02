package SISGECM;

import javax.swing.*;
import java.sql.*;

/**
 *
 * @author Ingeniero Brayan
 */
public class AgregarUsuario extends javax.swing.JFrame {

    boolean clavevalidada = false;
    Conexion c = new Conexion();
    
    public AgregarUsuario() {
        initComponents();
        
        setIconImage(new ImageIcon(getClass().getResource("/img/icono.png")).getImage());
        
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        nombres_txt = new javax.swing.JTextField();
        apellidos_txt = new javax.swing.JTextField();
        tipodoc_cmb = new javax.swing.JComboBox();
        doc_txt = new javax.swing.JTextField();
        telefono_txt = new javax.swing.JTextField();
        email_txt = new javax.swing.JTextField();
        usuario_txt = new javax.swing.JTextField();
        clave_psw = new javax.swing.JPasswordField();
        confirmaclave_psw = new javax.swing.JPasswordField();
        agregar_btn = new javax.swing.JButton();
        cancelar_btn = new javax.swing.JButton();
        validaclave_lbl = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        rol_cmb = new javax.swing.JComboBox();
        titulo_lbl = new javax.swing.JLabel();
        fondo_lbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AGREGAR NUEVO USUARIO");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("NOMBRES: ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("APELLIDOS: ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("TIPO DOCUMENTO: ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("DOCUMENTO: ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("TELEFONO: ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("EMAIL: ");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("NOMBRE DE USUARIO: ");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("CLAVE:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("REPITA CLAVE: ");

        nombres_txt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        apellidos_txt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        tipodoc_cmb.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tipodoc_cmb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECCIONE...", "CC", "CE", "PASAPORTE" }));

        doc_txt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        telefono_txt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        email_txt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        usuario_txt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        clave_psw.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        confirmaclave_psw.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        confirmaclave_psw.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                confirmaclave_pswKeyReleased(evt);
            }
        });

        agregar_btn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        agregar_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/guardar.png"))); // NOI18N
        agregar_btn.setText("AGREGAR");
        agregar_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        agregar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregar_btnActionPerformed(evt);
            }
        });

        cancelar_btn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cancelar_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar.png"))); // NOI18N
        cancelar_btn.setText("CANCELAR");
        cancelar_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelar_btnActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("ROL DE USUARIO: ");

        rol_cmb.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rol_cmb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECCIONE...", "ADMINISTRADOR", "ENCARGADO DE CITAS", "RECEPCIONISTA" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(90, Short.MAX_VALUE)
                .addComponent(agregar_btn)
                .addGap(50, 50, 50)
                .addComponent(cancelar_btn)
                .addGap(70, 70, 70))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(clave_psw, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usuario_txt, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(email_txt, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(telefono_txt, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(doc_txt, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(apellidos_txt, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombres_txt, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tipodoc_cmb, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(confirmaclave_psw)
                    .addComponent(rol_cmb, 0, 230, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(validaclave_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nombres_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(apellidos_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tipodoc_cmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(doc_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(telefono_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(email_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(usuario_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(clave_psw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(validaclave_lbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(confirmaclave_psw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(rol_cmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agregar_btn)
                    .addComponent(cancelar_btn))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 450, 480));

        titulo_lbl.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        titulo_lbl.setText("AGREGAR NUEVO USUARIO");
        getContentPane().add(titulo_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        fondo_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/medicine.jpg"))); // NOI18N
        getContentPane().add(fondo_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 530));

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

    private void cancelar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelar_btnActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelar_btnActionPerformed

    private void agregar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregar_btnActionPerformed
        String nombre = nombres_txt.getText().toUpperCase();
        String apellidos = apellidos_txt.getText().toUpperCase();
        String tipo_doc = tipodoc_cmb.getSelectedItem().toString();
        String doc = doc_txt.getText();
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
            JOptionPane.showMessageDialog(null, "INGRESE CLAVE PARA EL USUARIO", "ERROR", JOptionPane.ERROR_MESSAGE);
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
            int filas = validaUsuario(usuario);
            if(filas>0)
            {
                JOptionPane.showMessageDialog(null, "<html><center>EL NOMBRE DE USUARIO YA SE ENCUENTRA EN USO <br> VERIFIQUE</center></html>", "ERROR", JOptionPane.ERROR_MESSAGE);
                usuario_txt.requestFocus();
            }
            else{
                boolean respuesta = Consultas.agregarUsuario(nombre.toUpperCase(), apellidos.toUpperCase(),tipo_doc, doc,
                        telefono,email, usuario, clave, rol);
                if(respuesta)
                {
                    JOptionPane.showMessageDialog(null, "<html><center>USUARIO REGISTRADO CON ÉXITO<br/> RECUERDE QUE PARA INGRESAR AL "
                            + "SISTEMA DEBE HACERLO <br/> CON EL NOMBRE DE USUARIO Y CONTRASEÑA REGISTRADOS</center></html>", "INFORMACIÓN", JOptionPane.INFORMATION_MESSAGE);
                    nombres_txt.setText("");
                    nombres_txt.requestFocus();
                    apellidos_txt.setText("");
                    tipodoc_cmb.setSelectedIndex(0);
                    doc_txt.setText("");
                    telefono_txt.setText("");
                    email_txt.setText("");
                    usuario_txt.setText("");
                    clave_psw.setText("");
                    confirmaclave_psw.setText("");
                    rol_cmb.setSelectedIndex(0);
                    validaclave_lbl.setIcon(null);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "ERROR AL REGISTRAR USUARIO", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_agregar_btnActionPerformed


    public int validaUsuario(String usuario){
        
        Connection conexion = c.getConexion();
        int rows =0;
        
        try {
            PreparedStatement sentencia = conexion.prepareStatement("SELECT * FROM usuarios WHERE usuario=?");
            
            sentencia.setString(1, usuario);
            
            ResultSet rs = sentencia.executeQuery();

            while(rs.next())
            {
                rows++;
            }
            
        } catch (SQLException e) {
            System.out.println(e);
            
        }
        return rows;
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
            java.util.logging.Logger.getLogger(AgregarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar_btn;
    private javax.swing.JTextField apellidos_txt;
    private javax.swing.JButton cancelar_btn;
    private javax.swing.JPasswordField clave_psw;
    private javax.swing.JPasswordField confirmaclave_psw;
    private javax.swing.JTextField doc_txt;
    private javax.swing.JTextField email_txt;
    private javax.swing.JLabel fondo_lbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JLabel titulo_lbl;
    private javax.swing.JTextField usuario_txt;
    private javax.swing.JLabel validaclave_lbl;
    // End of variables declaration//GEN-END:variables
}
