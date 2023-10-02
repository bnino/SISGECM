package SISGECM;

import java.sql.*;
import java.text.DateFormat;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author Ingeniero Brayan
 */
public class AgregarHorarioMedico extends javax.swing.JFrame {

    DateFormat df = DateFormat.getDateInstance();
    //private int cod;
    
    public AgregarHorarioMedico() {
        initComponents();
        
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        setIconImage(new ImageIcon(getClass().getResource("/img/icono.png")).getImage());
        
        Calendar calendario = new GregorianCalendar();
        
        fecha_horario.setCalendar(calendario);
        
        ejecutar_consulta();
        
        panel_datos_medico.setVisible(false);
        
        modeloSpinner1.setCalendarField(Calendar.HOUR);
        
        modeloSpinner2.setCalendarField(Calendar.HOUR);
        
        hora_inicio.setModel(modeloSpinner1);
        
        hora_inicio.setEditor(new JSpinner.DateEditor(hora_inicio, "hh a"));
  
        hora_fin.setModel(modeloSpinner2);
        
        hora_fin.setEditor(new JSpinner.DateEditor(hora_fin,"hh a"));
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lista_medicos = new javax.swing.JComboBox();
        buscar_btn = new javax.swing.JButton();
        cerrar_btn = new javax.swing.JButton();
        panel_datos_medico = new javax.swing.JPanel();
        nombre_lbl = new javax.swing.JLabel();
        nombre_txt = new javax.swing.JTextField();
        apellidos_txt = new javax.swing.JTextField();
        apellido1_lbl = new javax.swing.JLabel();
        doc_txt = new javax.swing.JTextField();
        doc_lbl = new javax.swing.JLabel();
        tarjeta_lbl = new javax.swing.JLabel();
        tarjeta_txt = new javax.swing.JTextField();
        telefono_txt = new javax.swing.JTextField();
        telefono_lbl = new javax.swing.JLabel();
        fecha_horario = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        hora_inicio = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        hora_fin = new javax.swing.JSpinner();
        agrega_btn = new javax.swing.JButton();
        id_medico_lbl = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ASIGNAR HORARIO A MÉDICO");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setOpaque(false);

        jLabel1.setText("Medico: ");

        buscar_btn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        buscar_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupa.png"))); // NOI18N
        buscar_btn.setText("Buscar");
        buscar_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buscar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar_btnActionPerformed(evt);
            }
        });

        cerrar_btn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cerrar_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salir.png"))); // NOI18N
        cerrar_btn.setText("Salir");
        cerrar_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cerrar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrar_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(lista_medicos, 0, 183, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(buscar_btn)
                .addGap(31, 31, 31)
                .addComponent(cerrar_btn)
                .addGap(36, 36, 36))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lista_medicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscar_btn)
                    .addComponent(cerrar_btn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 5, 560, -1));

        panel_datos_medico.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panel_datos_medico.setOpaque(false);

        nombre_lbl.setText("Nombre:");

        apellido1_lbl.setText("Apellidos: ");

        doc_lbl.setText("Documento");

        tarjeta_lbl.setText("Tarj. Profesional:");

        telefono_lbl.setText("Telefono:");

        fecha_horario.setDateFormatString("yyyy-MM-dd");

        jLabel2.setText("Fecha de Horario: ");

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel3.setText("Datos de Médico");

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel4.setText("Horario");

        jLabel5.setText("Hora Inicio:");

        jLabel6.setText("Hora Fin: ");

        agrega_btn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        agrega_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/guardar.png"))); // NOI18N
        agrega_btn.setText("Guardar");
        agrega_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        agrega_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agrega_btnActionPerformed(evt);
            }
        });

        id_medico_lbl.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        id_medico_lbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout panel_datos_medicoLayout = new javax.swing.GroupLayout(panel_datos_medico);
        panel_datos_medico.setLayout(panel_datos_medicoLayout);
        panel_datos_medicoLayout.setHorizontalGroup(
            panel_datos_medicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_datos_medicoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panel_datos_medicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_datos_medicoLayout.createSequentialGroup()
                        .addComponent(doc_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(doc_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(tarjeta_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(panel_datos_medicoLayout.createSequentialGroup()
                        .addComponent(nombre_lbl)
                        .addGap(18, 18, 18)
                        .addComponent(nombre_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(panel_datos_medicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_datos_medicoLayout.createSequentialGroup()
                        .addComponent(tarjeta_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(telefono_lbl)
                        .addGap(18, 18, 18)
                        .addComponent(telefono_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_datos_medicoLayout.createSequentialGroup()
                        .addComponent(apellido1_lbl)
                        .addGap(18, 18, 18)
                        .addComponent(apellidos_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38))
            .addComponent(jSeparator1)
            .addGroup(panel_datos_medicoLayout.createSequentialGroup()
                .addGroup(panel_datos_medicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_datos_medicoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel_datos_medicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_datos_medicoLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(id_medico_lbl))
                            .addComponent(jLabel4)
                            .addGroup(panel_datos_medicoLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fecha_horario, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(hora_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(hora_fin, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panel_datos_medicoLayout.createSequentialGroup()
                        .addGap(277, 277, 277)
                        .addComponent(agrega_btn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_datos_medicoLayout.setVerticalGroup(
            panel_datos_medicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_datos_medicoLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(panel_datos_medicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(id_medico_lbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_datos_medicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel_datos_medicoLayout.createSequentialGroup()
                        .addGroup(panel_datos_medicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(apellidos_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(apellido1_lbl))
                        .addGap(18, 18, 18)
                        .addGroup(panel_datos_medicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tarjeta_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(telefono_lbl)
                            .addComponent(telefono_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel_datos_medicoLayout.createSequentialGroup()
                        .addGroup(panel_datos_medicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombre_lbl)
                            .addComponent(nombre_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panel_datos_medicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(doc_lbl)
                            .addComponent(doc_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tarjeta_lbl))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_datos_medicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(fecha_horario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_datos_medicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(hora_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6)
                        .addComponent(hora_fin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(agrega_btn)
                .addContainerGap())
        );

        getContentPane().add(panel_datos_medico, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 94, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/medicine.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar_btnActionPerformed
        // TODO add your handling code here:
        medico_seleccionado();
    }//GEN-LAST:event_buscar_btnActionPerformed

    private void agrega_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agrega_btnActionPerformed
        // TODO add your handling code here:
        java.util.Date h_i = (java.util.Date)hora_inicio.getValue();
        
        java.util.Date h_f = (java.util.Date)hora_fin.getValue();
        
        Calendar c = Calendar.getInstance();
        
        Calendar c2 = Calendar.getInstance();
        
        c.setTime(h_i);
        
        c2.setTime(h_f);
        
        int h_inicio = c.get(Calendar.HOUR_OF_DAY);
        
        int m_inicio = 0;
        
        int h_finaliza = c2.get(Calendar.HOUR_OF_DAY);
        
        int num_horas = h_finaliza-h_inicio;
        
        int num_turnos = num_horas * 4;
  
        int dia = fecha_horario.getCalendar().get(Calendar.DAY_OF_MONTH);
        int mes = fecha_horario.getCalendar().get(Calendar.MONTH) + 1;
        int año = fecha_horario.getCalendar().get(Calendar.YEAR);
        
        String fecha = año+"-"+mes+"-"+dia;
        
        String cod_medico= id_medico_lbl.getText();
        
        int idhorario = Consultas.ultimo_horario();
        
        int nuevoHorario = idhorario+1;
        
        String horario = "hor"+ nuevoHorario;
        
        
        
        boolean respuesta = false;
        
        for (int i = 0; i < num_turnos; i++) {
            
            if(m_inicio>=59)
            {
                h_inicio+=1;
                m_inicio=00;
            }
            
            String hora = h_inicio + ":" + m_inicio;
            
            respuesta = Consultas.asigna_horario(horario, fecha, hora, cod_medico);
            
            m_inicio+=15;
            
        }
        
        if(respuesta)
            {
                JOptionPane.showMessageDialog(null,new JLabel("HORARIO ALMACENADO CON ÉXITO!!!", JLabel.CENTER),"MENSAJE",JOptionPane.INFORMATION_MESSAGE);
                fecha_horario.setCalendar(null);
                //hora_inicio;
                //hora_fin.setValue(null);
                panel_datos_medico.setVisible(false);
            }
            else
            {
                JOptionPane.showMessageDialog(null,new JLabel("OCURRIÓ UN ERROR, POR FAVOR VUELVA A INTENTARLO", JLabel.CENTER),"ERROR",JOptionPane.ERROR_MESSAGE);
                
            }

    }//GEN-LAST:event_agrega_btnActionPerformed

    private void cerrar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrar_btnActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_cerrar_btnActionPerformed

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
        tarjeta_txt.setText(seleccionado[5]);
        tarjeta_txt.setEditable(false);
        telefono_txt.setText(seleccionado[6]);
        telefono_txt.setEditable(false);
        panel_datos_medico.setVisible(true);
    }
    
    public void ejecutar_consulta(){
        try{
        
        //CONEXIÓN CON LA BASE DE DATOS
        
            Connection miConexion= DriverManager.getConnection("jdbc:mysql://localhost:3306/modelo_citas","root","");
            
        //2. CREAR OBJETO STATMENT
			
        Statement miStatment = miConexion.createStatement();
        
        ResultSet rs = miStatment.executeQuery("SELECT * FROM medicos");
        
        while(rs.next()){
               //cod = Integer.parseInt(rs.getString("idmedicos"));
               
               String cadena = rs.getString("idmedicos")+ " "+ rs.getString(2)+ " "+ rs.getString(3);
                
            lista_medicos.addItem(cadena);
            
        }
            
        }catch(Exception e){
            e.printStackTrace();
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
            java.util.logging.Logger.getLogger(AgregarHorarioMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarHorarioMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarHorarioMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarHorarioMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarHorarioMedico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agrega_btn;
    private javax.swing.JLabel apellido1_lbl;
    private javax.swing.JTextField apellidos_txt;
    private javax.swing.JButton buscar_btn;
    private javax.swing.JButton cerrar_btn;
    private javax.swing.JLabel doc_lbl;
    private javax.swing.JTextField doc_txt;
    private com.toedter.calendar.JDateChooser fecha_horario;
    private javax.swing.JSpinner hora_fin;
    private javax.swing.JSpinner hora_inicio;
    private javax.swing.JLabel id_medico_lbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox lista_medicos;
    private javax.swing.JLabel nombre_lbl;
    private javax.swing.JTextField nombre_txt;
    private javax.swing.JPanel panel_datos_medico;
    private javax.swing.JLabel tarjeta_lbl;
    private javax.swing.JTextField tarjeta_txt;
    private javax.swing.JLabel telefono_lbl;
    private javax.swing.JTextField telefono_txt;
    // End of variables declaration//GEN-END:variables

    SpinnerDateModel modeloSpinner1 = new SpinnerDateModel();
    SpinnerDateModel modeloSpinner2 = new SpinnerDateModel();
}
