package SISGECM;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Ingeniero Brayan
 */
public class CancelaCita extends javax.swing.JFrame {
    
    private int idmedico=0;
    private String hora,horaReal;

    Conexion c = new Conexion();
    
    public CancelaCita() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.cancelar_btn.setEnabled(false);
        setIconImage(new ImageIcon(getClass().getResource("/img/icono.png")).getImage());
    }    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        doc_txt = new javax.swing.JTextField();
        buscar_btn = new javax.swing.JButton();
        datos_panel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        medico_lbl = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        hora_lbl = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        dia_lbl = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        nombre_lbl = new javax.swing.JLabel();
        cancelar_btn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CANCELAR CITAS MÉDICAS");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("CANCELAR CITAS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 22, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("DOCUMENTO:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 86, -1, -1));

        doc_txt.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        getContentPane().add(doc_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 81, 113, 30));

        buscar_btn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        buscar_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupa2.png"))); // NOI18N
        buscar_btn.setText("BUSCAR");
        buscar_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buscar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar_btnActionPerformed(evt);
            }
        });
        getContentPane().add(buscar_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(351, 76, -1, -1));

        datos_panel.setOpaque(false);

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel3.setText("NOMBRE: ");

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel4.setText("DATOS DE CITA:");

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel5.setText("MEDICO");

        medico_lbl.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel7.setText("HORA");

        hora_lbl.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel9.setText("DIA");

        dia_lbl.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N

        nombre_lbl.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N

        cancelar_btn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cancelar_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar.png"))); // NOI18N
        cancelar_btn.setText("CANCELAR CITA");
        cancelar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelar_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout datos_panelLayout = new javax.swing.GroupLayout(datos_panel);
        datos_panel.setLayout(datos_panelLayout);
        datos_panelLayout.setHorizontalGroup(
            datos_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datos_panelLayout.createSequentialGroup()
                .addGroup(datos_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(datos_panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(datos_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(datos_panelLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(290, 290, 290)
                                .addComponent(cancelar_btn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE))
                            .addGroup(datos_panelLayout.createSequentialGroup()
                                .addGroup(datos_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(datos_panelLayout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nombre_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(datos_panelLayout.createSequentialGroup()
                                        .addGroup(datos_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel9))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(datos_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(dia_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(medico_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(hora_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        datos_panelLayout.setVerticalGroup(
            datos_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datos_panelLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(datos_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(nombre_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(27, 27, 27)
                .addGroup(datos_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(medico_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(datos_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(datos_panelLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(cancelar_btn))
                    .addGroup(datos_panelLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(datos_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dia_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(25, 25, 25)
                        .addGroup(datos_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(hora_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(17, 17, 17))
        );

        getContentPane().add(datos_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 133, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/medicine.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar_btnActionPerformed

        String doc = doc_txt.getText();
        
        if(!doc.equals(""))
        {
            if(doc.matches("\\d*"))
            {
               buscaCita(Integer.parseInt(doc));
            }
            else
            {
                JOptionPane.showMessageDialog(null, "LA BÚSQUEDA SOLO PUEDE CONTENER NÚMEROS", "ERROR", JOptionPane.ERROR_MESSAGE);
                doc_txt.requestFocus();
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "POR FAVOR INGRESE NÚMERO DE DOCUMENTO", "ERROR", JOptionPane.ERROR_MESSAGE);
            doc_txt.requestFocus();
        }
    }//GEN-LAST:event_buscar_btnActionPerformed

    private void cancelar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelar_btnActionPerformed

        boolean resp = CancelarCita(Integer.parseInt(doc_txt.getText()),idmedico,dia_lbl.getText(),horaReal);
        
        if(resp)
        {
            JOptionPane.showMessageDialog(null, "CITA CANDELADA CON ÉXITO", "INFORMACIÓN", JOptionPane.INFORMATION_MESSAGE);
            this.nombre_lbl.setText("");
            this.medico_lbl.setText("");
            this.dia_lbl.setText("");
            this.hora_lbl.setText("");
            this.cancelar_btn.setEnabled(false);
            this.doc_txt.setText("");
            this.doc_txt.requestFocus();
        }
    }//GEN-LAST:event_cancelar_btnActionPerformed

    
     public void buscaCita(int documento){

        try {
            Connection conexion = c.getConexion();
            String sql = "SELECT CONCAT( pacientes.nombre1,  ' ', pacientes.nombre2,  ' ', pacientes.apellido1,  ' ', pacientes.apellido2 ) AS paciente,"+
                        " CONCAT( medicos.nombre,  ' ', medicos.apellidos ) AS MEDICO,medicos.idmedicos, citas.dia, citas.hora " +
                        "FROM pacientes, citas, medicos " +
                        "WHERE citas.medicos_idmedicos = medicos.idmedicos " +
                        "AND pacientes.doc =? " +
                        "AND citas.pacientes_docpaciente =? " +
                        "AND citas.estado =  'ASIGNADA'";
            PreparedStatement sentencia = conexion.prepareStatement(sql);
            
            sentencia.setInt(1, documento);
            sentencia.setInt(2,documento);
            
            ResultSet rs = sentencia.executeQuery();
            
            if(rs.next())
            {
                hora = rs.getString("hora");
                horaReal = rs.getString("hora");
                
                if(Integer.parseInt(hora.substring(0, 2))>12)
                {
                    int num = Integer.parseInt(hora.substring(0, 2))-12;
                    hora = "0"+num+hora.substring(2, 5)+" PM";
                }
                else
                {
                    hora = hora.substring(0, 5) + " AM";
                }
                
                this.nombre_lbl.setText(rs.getString("paciente"));
                this.medico_lbl.setText(rs.getString("medico"));
                this.dia_lbl.setText(rs.getString("dia"));
                this.hora_lbl.setText(hora);
                this.cancelar_btn.setEnabled(true);
                this.idmedico = Integer.parseInt(rs.getString("idmedicos"));
            }
            else
            {
                JOptionPane.showMessageDialog(null, "NO SE ENCONTRÓ CITA PARA EL DOCUMENTO "+documento, "ERROR", JOptionPane.ERROR_MESSAGE);
                //this.doc_txt.requestFocus();
            }
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "OCURRIÓ UN ERROR AL REALIZAR LA CONSULTA", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
     
     public boolean CancelarCita(int doc, int idmedico, String dia, String hora){
        
        boolean respuesta = true;
        
        try {
            Connection conexion = c.getConexion();
            
            String sql = "UPDATE citas SET estado='CANCELADA' WHERE pacientes_docpaciente=?";
            
            PreparedStatement sentencia = conexion.prepareStatement(sql);
            
            sentencia.setInt(1, doc);
            
            sentencia.execute();
            
            String sql2 = "UPDATE horarios SET estado='DISPONIBLE' WHERE medicos_idmedicos=? AND dia=?"+
                    " AND hora=?";
            PreparedStatement sentencia2 = conexion.prepareStatement(sql2);

            sentencia2.setInt(1, idmedico);
            sentencia2.setString(2, dia);
            sentencia2.setString(3, hora);

            sentencia2.execute();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR AL CANCELAR CITA", "ERROR", JOptionPane.ERROR_MESSAGE);
            System.out.println(ex);
            respuesta = false;
        }
        return respuesta;
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
            java.util.logging.Logger.getLogger(CancelaCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CancelaCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CancelaCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CancelaCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CancelaCita().setVisible(true);
            }
        });
    }   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscar_btn;
    private javax.swing.JButton cancelar_btn;
    private javax.swing.JPanel datos_panel;
    private javax.swing.JLabel dia_lbl;
    private javax.swing.JTextField doc_txt;
    private javax.swing.JLabel hora_lbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel medico_lbl;
    private javax.swing.JLabel nombre_lbl;
    // End of variables declaration//GEN-END:variables
}
