package SISGECM;

import java.sql.*;
import java.text.DateFormat;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author Ingeniero Brayan
 */
public class Medicos extends javax.swing.JFrame {
    
    DateFormat df = DateFormat.getDateInstance();
    String fecha, nom_med;
    int idmedico;
    
    Conexion c = new Conexion();
    
    String op;
  
    public Medicos() {
        initComponents();
        
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        datos_med_panel.setVisible(false);
        
        fecha_cita.setVisible(false);
        
        busca_horario.setVisible(false);
        
        horas_disponibles_cmb.addItem("Seleccione...");
                
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        setIconImage(new ImageIcon(getClass().getResource("/img/icono.png")).getImage());
        
        Calendar calendario = new GregorianCalendar();
        
        fecha_cita.setCalendar(calendario);
        
        try{
        
        //CONEXIÓN CON LA BASE DE DATOS
        
            Connection miConexion= c.getConexion();
            
        //2. CREAR OBJETO STATMENT
			
        Statement miStatment = miConexion.createStatement();
        
        ResultSet rs = miStatment.executeQuery("SELECT * FROM medicos");
        
        while(rs.next()){
				
            lista_medicos.addItem(rs.getString(1)+ " "+ rs.getString(2)+ " "+ rs.getString(3));
				
        }
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lista_medicos = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        buscar_btn = new javax.swing.JButton();
        datos_med_panel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        nombre_lbl = new javax.swing.JLabel();
        nombre_txt = new javax.swing.JTextField();
        apellido1_lbl = new javax.swing.JLabel();
        apellidos_txt = new javax.swing.JTextField();
        id_medico_lbl = new javax.swing.JLabel();
        doc_lbl = new javax.swing.JLabel();
        doc_txt = new javax.swing.JTextField();
        tarj_prof_txt = new javax.swing.JTextField();
        tarj_prof_lbl = new javax.swing.JLabel();
        telefono_txt = new javax.swing.JTextField();
        telefono_lbl = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        fecha_cita = new com.toedter.calendar.JDateChooser();
        busca_horario = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        horas_disponibles_cmb = new javax.swing.JComboBox();
        aceptar_btn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HORA CITA");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setOpaque(false);

        lista_medicos.setActionCommand("");

        jLabel1.setText("Médico: ");

        buscar_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupa.png"))); // NOI18N
        buscar_btn.setText("Buscar");
        buscar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lista_medicos, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(buscar_btn)
                .addContainerGap(137, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lista_medicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(buscar_btn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        datos_med_panel.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("Datos de Médico");

        nombre_lbl.setText("Nombres:");

        apellido1_lbl.setText("Apellidos:");

        id_medico_lbl.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N

        doc_lbl.setText("Documento:");

        tarj_prof_lbl.setText("Tarj. Profesional:");

        telefono_lbl.setText("Telefono:");

        jLabel3.setText("Seleccione Dia: ");

        fecha_cita.setDateFormatString("dd-MMM-yyyy");

        busca_horario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupa2.png"))); // NOI18N
        busca_horario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busca_horarioActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setText("Horario");

        jLabel5.setText("Horas Disponibles: ");

        horas_disponibles_cmb.setOpaque(false);

        aceptar_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/aceptar.png"))); // NOI18N
        aceptar_btn.setText("Aceptar");
        aceptar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptar_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout datos_med_panelLayout = new javax.swing.GroupLayout(datos_med_panel);
        datos_med_panel.setLayout(datos_med_panelLayout);
        datos_med_panelLayout.setHorizontalGroup(
            datos_med_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datos_med_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(datos_med_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, datos_med_panelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(id_medico_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, datos_med_panelLayout.createSequentialGroup()
                        .addGroup(datos_med_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(doc_lbl)
                            .addComponent(nombre_lbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(datos_med_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(datos_med_panelLayout.createSequentialGroup()
                                .addComponent(doc_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(tarj_prof_lbl))
                            .addComponent(nombre_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(datos_med_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(datos_med_panelLayout.createSequentialGroup()
                                .addComponent(tarj_prof_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)
                                .addComponent(telefono_lbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(telefono_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(datos_med_panelLayout.createSequentialGroup()
                                .addComponent(apellido1_lbl)
                                .addGap(18, 18, 18)
                                .addComponent(apellidos_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, datos_med_panelLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fecha_cita, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(datos_med_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(aceptar_btn)
                            .addGroup(datos_med_panelLayout.createSequentialGroup()
                                .addComponent(busca_horario, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(horas_disponibles_cmb, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        datos_med_panelLayout.setVerticalGroup(
            datos_med_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datos_med_panelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(datos_med_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(id_medico_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(datos_med_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre_lbl)
                    .addComponent(nombre_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apellido1_lbl)
                    .addComponent(apellidos_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(datos_med_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(doc_lbl)
                    .addComponent(doc_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tarj_prof_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tarj_prof_lbl)
                    .addComponent(telefono_lbl)
                    .addComponent(telefono_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGroup(datos_med_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(datos_med_panelLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel3))
                    .addGroup(datos_med_panelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(fecha_cita, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(datos_med_panelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(datos_med_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(busca_horario, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(datos_med_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(horas_disponibles_cmb, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(aceptar_btn)
                .addGap(34, 34, 34))
        );

        getContentPane().add(datos_med_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 69, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/medicine.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar_btnActionPerformed
        // TODO add your handling code here:
        medico_seleccionado();
        datos_med_panel.setVisible(true);
        horas_disponibles_cmb.removeAllItems();
    }//GEN-LAST:event_buscar_btnActionPerformed

    private void busca_horarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busca_horarioActionPerformed
        // TODO add your handling code here:
        
        horas_disponibles_cmb.removeAllItems();
        
        int dia = fecha_cita.getCalendar().get(Calendar.DAY_OF_MONTH);
        int mes = fecha_cita.getCalendar().get(Calendar.MONTH) + 1;
        int año = fecha_cita.getCalendar().get(Calendar.YEAR);
        
        fecha = año + "-"+ mes+"-" + dia;
        idmedico = Integer.parseInt(id_medico_lbl.getText());
        
        ArrayList<String> horarios = Consultas.selecciona_horario(fecha, idmedico);
        
        for(int i=0; i<horarios.size();i++){             
            horas_disponibles_cmb.addItem(horarios.get(i));
        }
    }//GEN-LAST:event_busca_horarioActionPerformed

    private void aceptar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptar_btnActionPerformed
        // TODO add your handling code here:
        
        nom_med = nombre_txt.getText() + " "+ apellidos_txt.getText();
        
        int numero = horas_disponibles_cmb.getItemCount();
        
        String hora = (String)horas_disponibles_cmb.getSelectedItem();
        if(numero>0)
        {
            if(op.equals("asignar"))
            {
                AsignarCitas.getHorarioCita.recibeHorarioCita(idmedico,nom_med, fecha, hora);
                this.dispose();
            }
            else if(op.equals("cambiar"))
            {
                ModificaCitas.getHorarioCita.recibeHorarioCita(idmedico,nom_med, fecha, hora);
                this.dispose();
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, new JLabel("<html><center>NO SE HA SELECCIONADO UNA HORA <br> VERIFIQUE FECHA Y HORA</center></html>"),"ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_aceptar_btnActionPerformed
    
    /*public String [] getHorarioCita(int idmedico, String dia, String hora, boolean seleccionado){
        String [] cita = new String[4];
        
        cita[0] = String.valueOf(idmedico);
        cita[1] = dia;
        cita[2] = hora;
        cita[3] = String.valueOf(seleccionado);
        
        return cita;
    }
    
    public static String reemplazar(String cadena, String busqueda, String reemplazo) {
        return cadena.replaceAll(busqueda, reemplazo).substring(0, 5);
    }*/
    
    public void medico_seleccionado(){
        String cadena = (String)lista_medicos.getSelectedItem();
        String codigo = String.valueOf(cadena.charAt(0));
        String [] seleccionado = Consultas.busca_medico(Integer.parseInt(codigo));
        
        id_medico_lbl.setText(seleccionado[0]);
        nombre_txt.setText(seleccionado[1]);
        nombre_txt.setEditable(false);
        apellidos_txt.setText(seleccionado[2]);
        apellidos_txt.setEditable(false);
        doc_txt.setText(seleccionado[4]);
        doc_txt.setEditable(false);
        tarj_prof_txt.setText(seleccionado[5]);
        tarj_prof_txt.setEditable(false);
        telefono_txt.setText(seleccionado[6]);
        telefono_txt.setEditable(false);
        //panel_datos_medico.setVisible(true);
        
        fecha_cita.setVisible(true);
        
        busca_horario.setVisible(true);
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
            java.util.logging.Logger.getLogger(Medicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Medicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Medicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Medicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Medicos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptar_btn;
    private javax.swing.JLabel apellido1_lbl;
    private javax.swing.JTextField apellidos_txt;
    private javax.swing.JButton busca_horario;
    private javax.swing.JButton buscar_btn;
    private javax.swing.JPanel datos_med_panel;
    private javax.swing.JLabel doc_lbl;
    private javax.swing.JTextField doc_txt;
    private com.toedter.calendar.JDateChooser fecha_cita;
    private javax.swing.JComboBox horas_disponibles_cmb;
    private javax.swing.JLabel id_medico_lbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox lista_medicos;
    private javax.swing.JLabel nombre_lbl;
    private javax.swing.JTextField nombre_txt;
    private javax.swing.JLabel tarj_prof_lbl;
    private javax.swing.JTextField tarj_prof_txt;
    private javax.swing.JLabel telefono_lbl;
    private javax.swing.JTextField telefono_txt;
    // End of variables declaration//GEN-END:variables
}