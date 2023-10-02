package SISGECM;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.*;

/**
 *
 * @author Ingeniero Brayan
 */
public class AgregaMedico extends javax.swing.JFrame {

    public AgregaMedico() {
        initComponents();
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setIconImage(new ImageIcon(getClass().getResource("/img/icono.png")).getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nombre_txt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        apellidos_txt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tipo_doc_cmb = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        documento_txt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tarj_prof_txt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        email_txt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tel_txt = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        area_cmb = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        direccion_txt = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AGREGAR NUEVO MÉDICO");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("Agregar Nuevo Médico");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 11, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("*Nombre:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        nombre_txt.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(nombre_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 94, 155, 28));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("*Apellidos: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, -1, -1));

        apellidos_txt.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(apellidos_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 170, 28));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("*Tipo Documento:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 167, -1, -1));

        tipo_doc_cmb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECCIONE...", "CC", "CE", "PASAPORTE" }));
        getContentPane().add(tipo_doc_cmb, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 161, 155, 29));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("*Documento: ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, -1, -1));

        documento_txt.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(documento_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, 170, 29));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setText("Tarjeta Profesional: ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, -1, -1));

        tarj_prof_txt.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(tarj_prof_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 280, 170, 30));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setText("*Telefono: ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));

        email_txt.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(email_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 150, 28));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8.setText("Email:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 40, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/guardar.png"))); // NOI18N
        jButton1.setText("GUARDAR");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 430, -1, 57));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/medico.png"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 381, -1, 131));

        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("Los campos marcados con * son obligatorios");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 498, -1, -1));
        getContentPane().add(tel_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 160, 32));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salir.png"))); // NOI18N
        jButton2.setText("CERRAR");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 430, -1, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel11.setText("*Area:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));

        area_cmb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECCIONE", "MEDICINA GENERAL", "ODONTOLOGÍA" }));
        getContentPane().add(area_cmb, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 226, 157, 28));

        jLabel13.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel13.setText("*Dirección:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, -1, -1));

        direccion_txt.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(direccion_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, 170, 30));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/medicine.jpg"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        String nombre = nombre_txt.getText().toUpperCase();
        String apellidos = apellidos_txt.getText().toUpperCase();
        String tipo_doc = tipo_doc_cmb.getSelectedItem().toString().toUpperCase();
        String documento = documento_txt.getText();
        String tarjeta = tarj_prof_txt.getText();
        String tel = tel_txt.getText();
        String email = email_txt.getText();
        String area = area_cmb.getSelectedItem().toString();
        String direccion = direccion_txt.getText().toUpperCase();
        
        Pattern soloNumeros = Pattern.compile("\\d{1,20}");
     	Matcher matDoc = soloNumeros.matcher(documento_txt.getText());
        
     	Matcher matTel = soloNumeros.matcher(tel_txt.getText());
        
        if (nombre.equals("")) {
            JOptionPane.showMessageDialog(null, "DEBE INGRESAR NOMBRE","ERROR",JOptionPane.ERROR_MESSAGE);
            nombre_txt.requestFocus();
        } else if (apellidos.equals("")) {
            JOptionPane.showMessageDialog(null, "DEBE INGRESAR APELLIDO","ERROR",JOptionPane.ERROR_MESSAGE);
            apellidos_txt.requestFocus();
        }else if (tipo_doc_cmb.getSelectedIndex()==0) {
            JOptionPane.showMessageDialog(null, "ESCOJA TIPO DE DOCUMENTO","ERROR",JOptionPane.ERROR_MESSAGE);
            tipo_doc_cmb.requestFocus();
        }else if (area_cmb.getSelectedIndex()==0) {
            JOptionPane.showMessageDialog(null, "ESCOJA ÁREA DE TRABAJO","ERROR",JOptionPane.ERROR_MESSAGE);
            area_cmb.requestFocus();
        }else if (documento_txt.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "DEBE INGRESAR NÚMERO DE DOCUMENTO","ERROR",JOptionPane.ERROR_MESSAGE);
            documento_txt.requestFocus();
        }else if (!matDoc.matches()) {
            JOptionPane.showMessageDialog(null, "EL DOCUMENTO SOLO DEBE CONTENER NÚMEROS","ERROR",JOptionPane.ERROR_MESSAGE);
            documento_txt.requestFocus();
        }else if (direccion_txt.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "DEBE INGRESAR DIRECCIÓN","ERROR",JOptionPane.ERROR_MESSAGE);
            direccion_txt.requestFocus();
        }else if (tel_txt.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "DEBE INGRESAR TELÉFONO DE CONTACTO","ERROR",JOptionPane.ERROR_MESSAGE);
            tel_txt.requestFocus();
        }else if (!matTel.matches()) {
            JOptionPane.showMessageDialog(null, "EL TELEFONO SOLO DEBE CONTENER NÚMEROS","ERROR",JOptionPane.ERROR_MESSAGE);
            tel_txt.requestFocus();
        }else {
            boolean respuesta = Consultas.agregaMedico(nombre, apellidos, tipo_doc, documento, tarjeta, area, direccion, tel, email);
            
            if(respuesta){
                this.nombre_txt.setText("");
                this.nombre_txt.requestFocus();
                this.apellidos_txt.setText("");
                this.documento_txt.setText("");
                this.tel_txt.setText("");
                this.tarj_prof_txt.setText("");
                this.email_txt.setText("");
                this.tipo_doc_cmb.setSelectedIndex(0);
                this.area_cmb.setSelectedIndex(0);
                this.direccion_txt.setText("");
                JOptionPane.showMessageDialog(null, "SE HA REGISTRADO EL MÉDICO CON DOCUMENTO "+ documento, "INFORMACIÓN", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "OCURRIÓ UN ERROR AL REGISTRAR MÉDICO", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(AgregaMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregaMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregaMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregaMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregaMedico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidos_txt;
    private javax.swing.JComboBox area_cmb;
    private javax.swing.JTextField direccion_txt;
    private javax.swing.JTextField documento_txt;
    private javax.swing.JTextField email_txt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nombre_txt;
    private javax.swing.JTextField tarj_prof_txt;
    private javax.swing.JTextField tel_txt;
    private javax.swing.JComboBox tipo_doc_cmb;
    // End of variables declaration//GEN-END:variables
}
