package SISGECM;

import java.awt.Container;
import java.awt.HeadlessException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author Ingeniero Brayan
 */
public class AsignarCitas extends javax.swing.JFrame {
    
    Container frame;

    public String cedula;
    Conexion c = new Conexion();
    Medicos medico = new Medicos();
    
    public static String op;
   
    public AsignarCitas() {
        initComponents();
        
        selec_med_btn.setEnabled(false);
        setIconImage(new ImageIcon(getClass().getResource("/img/icono.png")).getImage());
        
        asignar_btn.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBusqueda = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        buscar_txt = new javax.swing.JTextField();
        buscar_btn = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        contenido = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nombre_lbl = new javax.swing.JLabel();
        apellidos_lbl = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        selec_med_btn = new javax.swing.JButton();
        cita_panel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        nom_med_lbl = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        dia_lbl = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        hora_lbl = new javax.swing.JLabel();
        asignar_btn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ASIGNAR CITA MÉDICA");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelBusqueda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelBusqueda.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Cedula: ");

        buscar_btn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        buscar_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupa.png"))); // NOI18N
        buscar_btn.setText("Buscar");
        buscar_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buscar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar_btnActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setText("Buscar Paciente");

        javax.swing.GroupLayout panelBusquedaLayout = new javax.swing.GroupLayout(panelBusqueda);
        panelBusqueda.setLayout(panelBusquedaLayout);
        panelBusquedaLayout.setHorizontalGroup(
            panelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBusquedaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBusquedaLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buscar_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buscar_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelBusquedaLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelBusquedaLayout.setVerticalGroup(
            panelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBusquedaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscar_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(buscar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(panelBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 61, -1, -1));

        jPanel1.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("ASIGNAR CITAS MÉDICAS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 5, -1, -1));

        contenido.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        contenido.setOpaque(false);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Nombre");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Apellidos");

        nombre_lbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        apellidos_lbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Seleccione Médico");

        selec_med_btn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        selec_med_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/seleccionar.png"))); // NOI18N
        selec_med_btn.setText("Seleccionar");
        selec_med_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        selec_med_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selec_med_btnActionPerformed(evt);
            }
        });

        cita_panel.setOpaque(false);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Médico: ");

        nom_med_lbl.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        nom_med_lbl.setPreferredSize(new java.awt.Dimension(200, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Dia: ");

        dia_lbl.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Hora:");

        hora_lbl.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N

        asignar_btn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        asignar_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/asigna.png"))); // NOI18N
        asignar_btn.setText("Asignar Cita");
        asignar_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        asignar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asignar_btnActionPerformed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(255, 204, 204));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/datos.png"))); // NOI18N
        jLabel9.setText("Datos de Cita");

        javax.swing.GroupLayout cita_panelLayout = new javax.swing.GroupLayout(cita_panel);
        cita_panel.setLayout(cita_panelLayout);
        cita_panelLayout.setHorizontalGroup(
            cita_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cita_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cita_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(cita_panelLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addGroup(cita_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(asignar_btn)
                            .addGroup(cita_panelLayout.createSequentialGroup()
                                .addComponent(dia_lbl)
                                .addGap(33, 33, 33)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(hora_lbl))))
                    .addGroup(cita_panelLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(nom_med_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(128, Short.MAX_VALUE))
        );
        cita_panelLayout.setVerticalGroup(
            cita_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cita_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(28, 28, 28)
                .addGroup(cita_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nom_med_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cita_panelLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(8, 8, 8)))
                .addGap(26, 26, 26)
                .addGroup(cita_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dia_lbl)
                    .addComponent(jLabel8)
                    .addComponent(hora_lbl)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(asignar_btn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout contenidoLayout = new javax.swing.GroupLayout(contenido);
        contenido.setLayout(contenidoLayout);
        contenidoLayout.setHorizontalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenidoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenidoLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombre_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(apellidos_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contenidoLayout.createSequentialGroup()
                        .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contenidoLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(selec_med_btn))
                            .addComponent(cita_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 11, Short.MAX_VALUE)))
                .addContainerGap())
        );
        contenidoLayout.setVerticalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenidoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(apellidos_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombre_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(22, 22, 22)
                .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(selec_med_btn))
                .addGap(39, 39, 39)
                .addComponent(cita_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(contenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 158, 440, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/medicine.jpg"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar_btnActionPerformed
        // TODO add your handling code here:
        cedula= buscar_txt.getText();

        if(cedula.isEmpty())
        {
            JOptionPane.showMessageDialog(null, new JLabel("DEBES INGRESAR UN NÚMERO DE CÉDULA",JLabel.CENTER), "ERROR", JOptionPane.ERROR_MESSAGE);

            buscar_txt.requestFocus();

        }else if(!cedula.matches("\\d*")){
            JOptionPane.showMessageDialog(null, new JLabel("SÓLO SE ADMITEN NÚMEROS",JLabel.CENTER), "ERROR", JOptionPane.ERROR_MESSAGE);

            buscar_txt.requestFocus();

        }
        else
        {
            busca_paciente(cedula);
        }
    }//GEN-LAST:event_buscar_btnActionPerformed

    private void selec_med_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selec_med_btnActionPerformed
        // TODO add your handling code here:

        medico = new Medicos();
        medico.setVisible(true);
        medico.setLocationRelativeTo(null);
        medico.op = "asignar";
        
    }//GEN-LAST:event_selec_med_btnActionPerformed

    private void asignar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asignar_btnActionPerformed
        
        String paciente = nombre_lbl.getText() + "  " + apellidos_lbl.getText();
        String medico = nom_med_lbl.getText();
        String doc = buscar_txt.getText();
        String fecha = dia_lbl.getText();
        String hora = hora_lbl.getText();
        
        if(doc.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "INGRESE DOCUMENTO DE PACIENTE", "ALERTA", JOptionPane.WARNING_MESSAGE);
            buscar_txt.requestFocus();
        }
        else
        {            
            boolean resultado = Consultas.asignaCita(dia_lbl.getText(), hora_lbl.getText(), Integer.parseInt(buscar_txt.getText()), codmed);
            if(resultado)
            {
                int imprimir =JOptionPane.showConfirmDialog(null,"CITA ASIGNADA CORRECTAMENTE, DESEA IMPRIMIR COMPROBANTE" , "INFORMACION", JOptionPane.YES_NO_OPTION);
                cita_panel.setVisible(false);
                nombre_lbl.setText("");
                apellidos_lbl.setText("");
                buscar_txt.setText("");
                buscar_txt.requestFocus();
                selec_med_btn.setEnabled(false);
                eliminaHorario();
                if(imprimir == JOptionPane.YES_OPTION){
                    imprime = new Impresiones(new javax.swing.JFrame(), true);
                    imprime.setVisible(true);
                    imprime.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    imprime.setLocationRelativeTo(null);
                    Impresiones.recibeDatos(doc,paciente,medico,fecha,hora);
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "NO SE PUDO AGREGAR LA CITA, INTENTE NUEVAMENTE", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            
        }

    }//GEN-LAST:event_asignar_btnActionPerformed

    public void busca_paciente(String cedula){
                String [] resultado = new String[4];
        try{
            
            Connection conexion = c.getConexion();

            PreparedStatement sentencia = conexion.prepareStatement("SELECT * FROM citas WHERE pacientes_docpaciente=? AND"
                    + " citas.estado='ASIGNADA' AND dia= CURDATE()");
            
            sentencia.setString(1, cedula);
            
            ResultSet result = sentencia.executeQuery();
            
            if(!result.next())
            {
            
            //2. PREPARAR CONSULTA
			
		PreparedStatement sentencia2 = conexion.prepareStatement("SELECT idpacientes, nombre1, apellido1, apellido2 FROM pacientes"
		+ " WHERE doc=?");
                
                sentencia2.setString(1, cedula);
                
                ResultSet rs = sentencia2.executeQuery();
                
                if(rs.next())
                {
                    contenido.setVisible(true);
                    contenido.setSize(524, 415);
                    //idpaciente = Integer.parseInt(resultado[0]);
                    nombre_lbl.setText(rs.getString("nombre1"));
                    apellidos_lbl.setText(rs.getString("apellido1") + " " + rs.getString("apellido2"));
                    selec_med_btn.setEnabled(true);
                }
                else{
                    JOptionPane.showMessageDialog(null, "NO SE ENCONTRÓ EL DOCUMENTO: "+cedula + "; VERIFIQUE", "ERROR", JOptionPane.ERROR_MESSAGE);
                    buscar_txt.requestFocus();
                }
                                    
                rs.close();
            }
            else{
                JOptionPane.showMessageDialog(null, "<html><center>EL DOCUMENTO: "+cedula + " <br> CUENTA CON UNA CITA ASIGNADA PARA HOY</center></html>", "ERROR", JOptionPane.ERROR_MESSAGE);
                buscar_txt.requestFocus();
            }
		           
        }catch( SQLException | HeadlessException e){
            //e.printStackTrace();
            JOptionPane.showMessageDialog(null,"NO SE PUDO REALIZAR LA CONSULTA A LA BASE DE DATOS", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
        //return resultado;
    }
    
    public void eliminaHorario(){
        try {
            Connection conexion = c.getConexion();
           
            PreparedStatement sentencia = conexion.prepareStatement("DELETE FROM horarios WHERE dia<CURDATE()");            
            
            sentencia.execute();
            
            PreparedStatement sentencia2 = conexion.prepareStatement("UPDATE citas SET estado='ATENDIDA' WHERE dia<CURDATE() AND estado='ASIGNADA'");
            
            sentencia2.execute();
            
            conexion.close();
        } catch (SQLException ex) {
            System.out.println("OCURRIÓ UN ERROR AL ELIMINAR HORARIOS Y LAS CITAS" + ex.getMessage());
        }
    }
        
    public static class getHorarioCita{
        
        public static void recibeHorarioCita(int idmedico,String medico, String dia, String hora){
            
            codmed = idmedico;
            nom_med_lbl.setText(medico);
            dia_lbl.setText(dia);
            hora_lbl.setText(hora);
            cita_panel.setSize(500, 175);
            asignar_btn.setEnabled(true);
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
            java.util.logging.Logger.getLogger(AsignarCitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AsignarCitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AsignarCitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AsignarCitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AsignarCitas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apellidos_lbl;
    private static javax.swing.JButton asignar_btn;
    private javax.swing.JButton buscar_btn;
    private javax.swing.JTextField buscar_txt;
    private static javax.swing.JPanel cita_panel;
    private javax.swing.JPanel contenido;
    private static javax.swing.JLabel dia_lbl;
    private static javax.swing.JLabel hora_lbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private static javax.swing.JLabel nom_med_lbl;
    private javax.swing.JLabel nombre_lbl;
    private javax.swing.JPanel panelBusqueda;
    private javax.swing.JButton selec_med_btn;
    // End of variables declaration//GEN-END:variables

    private static int codmed;
    private Impresiones imprime;
}
