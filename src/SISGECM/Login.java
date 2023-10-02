package SISGECM;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.*;
import java.sql.*;

/**
 *
 * @author Ingeniero Brayan
 */
public class Login extends javax.swing.JFrame {
    
    private Timer tiempo;
    int cont;
    public static final int TWO_SECOND=5;
    
    private static Principal principal;
    
    static Conexion c = new Conexion();

    public Login() {
        initComponents();
        
        MyIcon icon = new MyIcon();

        while(c.getConexion()==null){
            
            String [] opciones = {"REINTENTAR", "SALIR"};            
            int seleccion = JOptionPane.showOptionDialog(null, "ERROR AL CONECTAR A LA BASE DE DATOS", "ERROR", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, icon, opciones, opciones[0]);
            
            if(seleccion==1)
                System.exit(0);
        }
        
        setIconImage(new ImageIcon(getClass().getResource("/img/icono.png")).getImage());
        //setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        
        barraprogreso.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        usuario_txt = new javax.swing.JTextField();
        ingresar_btn = new javax.swing.JButton();
        clave_psw = new javax.swing.JPasswordField();
        barraprogreso = new javax.swing.JProgressBar();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN - SISTEMA DE GESTIÓN DE CITAS MÉDICAS");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/login.png"))); // NOI18N
        jLabel1.setText("INICIAR SESIÓN");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 11, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user.png"))); // NOI18N
        jLabel2.setText("USUARIO:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 86, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/clave.png"))); // NOI18N
        jLabel3.setText("CLAVE:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 129, 124, -1));

        usuario_txt.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        getContentPane().add(usuario_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 86, 153, 32));

        ingresar_btn.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        ingresar_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ingresar.png"))); // NOI18N
        ingresar_btn.setText("INGRESAR");
        ingresar_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ingresar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresar_btnActionPerformed(evt);
            }
        });
        getContentPane().add(ingresar_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 179, -1, 49));

        clave_psw.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                clave_pswKeyPressed(evt);
            }
        });
        getContentPane().add(clave_psw, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 129, 153, 32));

        barraprogreso.setBackground(new java.awt.Color(51, 255, 51));
        barraprogreso.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(barraprogreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 239, 405, 23));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/medicine.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ingresar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresar_btnActionPerformed
        validaDatos();     
    }//GEN-LAST:event_ingresar_btnActionPerformed

    private void clave_pswKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_clave_pswKeyPressed
        if (evt.getKeyCode()== KeyEvent.VK_ENTER) {
            validaDatos();
        }
    }//GEN-LAST:event_clave_pswKeyPressed
 
    public void validaDatos(){
        String clave = new String(clave_psw.getPassword());
        String usuario = usuario_txt.getText();

        if(usuario.equals(""))
        {
            JOptionPane.showMessageDialog(null, "POR FAVOR INGRESE NOMBRE DE USUARIO", "ERROR", JOptionPane.ERROR_MESSAGE);
            usuario_txt.requestFocus();
        }else if (clave.length()==0){
            JOptionPane.showMessageDialog(null, "POR FAVOR INGRESE CONTRASEÑA", "ERROR", JOptionPane.ERROR_MESSAGE);
            clave_psw.requestFocus();
        }
        else{
            SesionUsuario(usuario, clave);
        }
    }
    public static void requiereFocus(String valor ){
        if(valor.equals("clave"))
            clave_psw.requestFocus();
        else if(valor.equals("usuario"))
            usuario_txt.requestFocus();
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    
    class TimerListener implements ActionListener{
        
        String usuario = usuario_txt.getText();
        String clave = new String(clave_psw.getPassword());

        public void actionPerformed(ActionEvent e) {
            cont++;
            barraprogreso.setValue(cont);
            if(cont==100){
                tiempo.stop();
                esconder();
                principal = new Principal();
                principal.recibeSesion(usuario, clave);
                principal.setVisible(true);
                usuario_txt.setText("");
                usuario_txt.requestFocus();
                clave_psw.setText("");
                barraprogreso.setVisible(false);
                setVisible(false);
            }
        }
    }
    
    public void esconder(){this.setVisible(false);}
    public void activar(){tiempo.start();}
    
    public void SesionUsuario(String usuario, String clave){
            try {

                Connection conexion = c.getConexion();

                PreparedStatement sentencia = conexion.prepareStatement("SELECT usuario FROM usuarios WHERE usuario=?");

                sentencia.setString(1, usuario);

                ResultSet rs = sentencia.executeQuery();

                if(rs.next()){
                    usuario=rs.getString(1);

                    sentencia = conexion.prepareStatement("SELECT clave FROM usuarios WHERE clave=?");

                    sentencia.setString(1, clave);

                    rs = sentencia.executeQuery();

                    if(rs.next()){
                        clave=rs.getString(1);
                        barraprogreso.setVisible(true);
                        cont=-1;
                        barraprogreso.setValue(0);
                        barraprogreso.setStringPainted(true);
                        tiempo = new Timer(TWO_SECOND, new TimerListener());
                        activar();
                    }
                    else{
                        JOptionPane.showMessageDialog(null,new JLabel("<html><center>LA CLAVE ES INCORRECTA <br> VUELVA A INTENTARLO</center></html>"), "ERROR", JOptionPane.ERROR_MESSAGE);
                        clave_psw.requestFocus();
                        //login.setVisible(true);
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null,new JLabel("<html><center>EL USUARIO <strong>"+usuario+"</strong> NO SE ENCUENTRA <br> EN NUESTRA BASE DE DATOS</center></html>"), "ERROR", JOptionPane.ERROR_MESSAGE);
                    usuario_txt.requestFocus();
                    //login.setVisible(true);
                }
                rs.close();

            } catch (SQLException ex) {
                System.out.println("OCURRIÓ UN ERROR AL OBTENER LOS DATOS DE USUARIO "+ ex.getMessage());
            }
            
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar barraprogreso;
    private static javax.swing.JPasswordField clave_psw;
    private javax.swing.JButton ingresar_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private static javax.swing.JTextField usuario_txt;
    // End of variables declaration//GEN-END:variables
}

