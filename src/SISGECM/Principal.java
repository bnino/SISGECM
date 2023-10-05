package SISGECM;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.*;
/**
 *
 * @author Ingeniero Brayan
 */
public class Principal extends JFrame {
    
    static Conexion c = new Conexion();
    
    //static Logger log = Logger.getLogger(Principal.class);
    
    public Principal() {
        initComponents();
        
        MyIcon icon = new MyIcon();
        
        while(c.getConexion()==null){
            
            String [] opciones = {"REINTENTAR", "SALIR"};            
            int seleccion = JOptionPane.showOptionDialog(null, "ERROR AL CONECTAR A LA BASE DE DATOS", "ERROR", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, icon, opciones, opciones[0]);
            
            if(seleccion==1)
                System.exit(0);
        }

        setTitle("GESTOR DE CITAS MÉDICAS");
        
        setIconImage(new ImageIcon(getClass().getResource("/img/icono.png")).getImage());

        this.setLocationRelativeTo(null);

        //-----------------------------

        modelotabla.addColumn("DOCUMENTO");
    	modelotabla.addColumn("NOMBRES");
    	modelotabla.addColumn("APELLIDOS");
    	modelotabla.addColumn("MEDICO");
    	modelotabla.addColumn("HORA");
        modelotabla.addColumn("ÁREA");
        
        tablaCitasHoy.setModel(modelotabla);
        
        tablaCitasHoy.getTableHeader().setReorderingAllowed(false) ;
        
        panelTabla.getViewport().add(tablaCitasHoy, null);
        
        panelTabla.setOpaque(true);
        
        timer.start();
        
        backup.start();
        
        eliminaHorario();
        
        tablaCitasHoy.setFont(new Font("Verdana", Font.PLAIN, 13));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelTabla = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        usuario_lbl = new javax.swing.JLabel();
        cerrar_sesion_btn = new javax.swing.JButton();
        imprimir_citas_btn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        barra_menu = new javax.swing.JMenuBar();
        menu_citas = new javax.swing.JMenu();
        asigna_cita_menu = new javax.swing.JMenuItem();
        cancelar_cita_menu = new javax.swing.JMenuItem();
        modifica_cita_menu = new javax.swing.JMenuItem();
        menu_medicos = new javax.swing.JMenu();
        agrega_medico = new javax.swing.JMenuItem();
        editar_medico_menu = new javax.swing.JMenuItem();
        asig_horario_medico = new javax.swing.JMenuItem();
        menu_pacientes = new javax.swing.JMenu();
        actualizarPacientes_menu = new javax.swing.JMenuItem();
        verPacientes_menu = new javax.swing.JMenuItem();
        usuarios_menu = new javax.swing.JMenu();
        agregausuario_menu = new javax.swing.JMenuItem();
        editausuario_menu = new javax.swing.JMenuItem();
        eliminausuario_menu = new javax.swing.JMenuItem();
        reportes_menu = new javax.swing.JMenu();
        citasMes_menu = new javax.swing.JMenuItem();
        citas_meses_menu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SISGECM - SISTEMA DE GESTIÓN DE CITAS MÉDICAS");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setOpaque(false);

        panelTabla.setOpaque(false);

        jPanel2.setOpaque(false);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setText("CITAS PARA HOY");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(35, 35, 35))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        usuario_lbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        cerrar_sesion_btn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cerrar_sesion_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logout.png"))); // NOI18N
        cerrar_sesion_btn.setText("Cerrar Sesión");
        cerrar_sesion_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cerrar_sesion_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrar_sesion_btnActionPerformed(evt);
            }
        });

        imprimir_citas_btn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        imprimir_citas_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/print.png"))); // NOI18N
        imprimir_citas_btn.setText("IMPRIMIR CITAS");
        imprimir_citas_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        imprimir_citas_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimir_citas_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cerrar_sesion_btn))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(panelTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 772, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(imprimir_citas_btn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(usuario_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(usuario_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cerrar_sesion_btn))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(panelTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(imprimir_citas_btn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, 440));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/medicine.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 560));

        barra_menu.setBackground(new java.awt.Color(0, 0, 255));
        barra_menu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        menu_citas.setText("Citas");
        menu_citas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        asigna_cita_menu.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        asigna_cita_menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/assign-icon.png"))); // NOI18N
        asigna_cita_menu.setText("Asignar Citas");
        asigna_cita_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asigna_cita_menuActionPerformed(evt);
            }
        });
        menu_citas.add(asigna_cita_menu);

        cancelar_cita_menu.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        cancelar_cita_menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancel.png"))); // NOI18N
        cancelar_cita_menu.setText("Cancelar Cita");
        cancelar_cita_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelar_cita_menuActionPerformed(evt);
            }
        });
        menu_citas.add(cancelar_cita_menu);

        modifica_cita_menu.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        modifica_cita_menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/modify_icon.png"))); // NOI18N
        modifica_cita_menu.setText("Modificar Cita");
        modifica_cita_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifica_cita_menuActionPerformed(evt);
            }
        });
        menu_citas.add(modifica_cita_menu);

        barra_menu.add(menu_citas);

        menu_medicos.setText("Medicos");
        menu_medicos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        agrega_medico.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        agrega_medico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/medic.png"))); // NOI18N
        agrega_medico.setText("Agregar Médico");
        agrega_medico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agrega_medicoActionPerformed(evt);
            }
        });
        menu_medicos.add(agrega_medico);

        editar_medico_menu.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        editar_medico_menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/edit.png"))); // NOI18N
        editar_medico_menu.setText("Editar Médico");
        editar_medico_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editar_medico_menuActionPerformed(evt);
            }
        });
        menu_medicos.add(editar_medico_menu);

        asig_horario_medico.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        asig_horario_medico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/horario.png"))); // NOI18N
        asig_horario_medico.setText("Asignar Horario");
        asig_horario_medico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asig_horario_medicoActionPerformed(evt);
            }
        });
        menu_medicos.add(asig_horario_medico);

        barra_menu.add(menu_medicos);

        menu_pacientes.setText("Pacientes");
        menu_pacientes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        actualizarPacientes_menu.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        actualizarPacientes_menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/actualizar.png"))); // NOI18N
        actualizarPacientes_menu.setText("Actualizar Pacientes");
        actualizarPacientes_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarPacientes_menuActionPerformed(evt);
            }
        });
        menu_pacientes.add(actualizarPacientes_menu);

        verPacientes_menu.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        verPacientes_menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/view.png"))); // NOI18N
        verPacientes_menu.setText("Ver Pacientes");
        verPacientes_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verPacientes_menuActionPerformed(evt);
            }
        });
        menu_pacientes.add(verPacientes_menu);

        barra_menu.add(menu_pacientes);

        usuarios_menu.setText("Usuarios");
        usuarios_menu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        agregausuario_menu.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        agregausuario_menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add-user.png"))); // NOI18N
        agregausuario_menu.setText("Agregar Usuario");
        agregausuario_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregausuario_menuActionPerformed(evt);
            }
        });
        usuarios_menu.add(agregausuario_menu);

        editausuario_menu.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        editausuario_menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/edit-user.png"))); // NOI18N
        editausuario_menu.setText("Editar Usuario");
        editausuario_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editausuario_menuActionPerformed(evt);
            }
        });
        usuarios_menu.add(editausuario_menu);

        eliminausuario_menu.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        eliminausuario_menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete-user.png"))); // NOI18N
        eliminausuario_menu.setText("Eliminar Usuario");
        eliminausuario_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminausuario_menuActionPerformed(evt);
            }
        });
        usuarios_menu.add(eliminausuario_menu);

        barra_menu.add(usuarios_menu);

        reportes_menu.setText("Reportes");
        reportes_menu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        citasMes_menu.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        citasMes_menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/report-icon.png"))); // NOI18N
        citasMes_menu.setText("Citas este mes");
        citasMes_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                citasMes_menuActionPerformed(evt);
            }
        });
        reportes_menu.add(citasMes_menu);

        citas_meses_menu.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        citas_meses_menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/report-icon.png"))); // NOI18N
        citas_meses_menu.setText("Citas entre meses");
        citas_meses_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                citas_meses_menuActionPerformed(evt);
            }
        });
        reportes_menu.add(citas_meses_menu);

        barra_menu.add(reportes_menu);

        setJMenuBar(barra_menu);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void asig_horario_medicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asig_horario_medicoActionPerformed
        // TODO add your handling code here:
        
        agregaHorario = new AgregarHorarioMedico();
        
        agregaHorario.setVisible(true);
        agregaHorario.setLocationRelativeTo(null);
        agregaHorario.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_asig_horario_medicoActionPerformed

    private void agrega_medicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agrega_medicoActionPerformed
        // TODO add your handling code here:
        agregaMed = new AgregaMedico();
        
        agregaMed.setVisible(true);
        agregaMed.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        agregaMed.setLocationRelativeTo(null);
    }//GEN-LAST:event_agrega_medicoActionPerformed

    private void cerrar_sesion_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrar_sesion_btnActionPerformed

        actualizaPacientes = new ActualizarPacientes();
        this.dispose();
        login.setVisible(true);
    }//GEN-LAST:event_cerrar_sesion_btnActionPerformed

    private void actualizarPacientes_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarPacientes_menuActionPerformed
        // TODO add your handling code here:
        actualizaPacientes = new ActualizarPacientes();
        actualizaPacientes.setVisible(true);
        actualizaPacientes.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_actualizarPacientes_menuActionPerformed

    private void verPacientes_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verPacientes_menuActionPerformed
        // TODO add your handling code here:
        verpaciente = new VerPacientes();
        verpaciente.setVisible(true);
        verpaciente.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        verpaciente.setLocationRelativeTo(null);
    }//GEN-LAST:event_verPacientes_menuActionPerformed

    private void imprimir_citas_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimir_citas_btnActionPerformed
        reporteCitasHoy();
    }//GEN-LAST:event_imprimir_citas_btnActionPerformed

    private void cancelar_cita_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelar_cita_menuActionPerformed
       cancelar_cita = new CancelaCita();
       cancelar_cita.setVisible(true);
       cancelar_cita.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       cancelar_cita.setLocationRelativeTo(null);
    }//GEN-LAST:event_cancelar_cita_menuActionPerformed

    private void modifica_cita_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifica_cita_menuActionPerformed
        modificaCitas = new ModificaCitas();
        modificaCitas.setLocationRelativeTo(null);
        modificaCitas.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        modificaCitas.setVisible(true);
    }//GEN-LAST:event_modifica_cita_menuActionPerformed

    private void asigna_cita_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asigna_cita_menuActionPerformed
        asignaCitas = new AsignarCitas();
        asignaCitas.setVisible(true);
        asignaCitas.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        asignaCitas.setLocationRelativeTo(null);
    }//GEN-LAST:event_asigna_cita_menuActionPerformed

    private void editar_medico_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editar_medico_menuActionPerformed
        editamedico = new EditarMedico();
        editamedico.setVisible(true);
        editamedico.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        editamedico.setLocationRelativeTo(null);
    }//GEN-LAST:event_editar_medico_menuActionPerformed

    private void agregausuario_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregausuario_menuActionPerformed
        agregausuario = new AgregarUsuario();
        agregausuario.setVisible(true);
        agregausuario.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        agregausuario.setLocationRelativeTo(null);
    }//GEN-LAST:event_agregausuario_menuActionPerformed

    private void eliminausuario_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminausuario_menuActionPerformed
        eliminarusuario = new EliminaUsuario();
        eliminarusuario.setVisible(true);
        eliminarusuario.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        eliminarusuario.setLocationRelativeTo(null);
    }//GEN-LAST:event_eliminausuario_menuActionPerformed

    private void editausuario_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editausuario_menuActionPerformed
        editausuario = new EditarUsuario();
        editausuario.setVisible(true);
        editausuario.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        editausuario.setLocationRelativeTo(null);
    }//GEN-LAST:event_editausuario_menuActionPerformed

    private void citasMes_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_citasMes_menuActionPerformed
        try {
            Connection conexion  = c.getConexion();
//            String report = "src/reportes/CitasMes.jasper";
            JasperReport jr = null;
            
            //jr = (JasperReport) JRLoader.loadObject(getClass().getResource("/reportes/CitasMes.jasper"));
            
            jr = JasperCompileManager.compileReport(getClass().getResourceAsStream("/reportes/CitasMes.jrxml"));
            
            JasperPrint jprint = JasperFillManager.fillReport(jr, null, conexion);
            
            JasperViewer jv = new JasperViewer(jprint, false);
            
            jv.setVisible(true);
            
            String mes="";
            int num_mes = calendario.get(Calendar.MONTH);
            switch(num_mes){
                case 0:
                    mes="ENERO";
                    break;
                case 1:
                    mes="FEBRERO";
                    break;
                case 2:
                    mes="MARZO";
                    break;
                case 3:
                    mes="ABRIL";
                    break;
                case 4:
                    mes="MAYO";
                    break;
                case 5:
                    mes="JUNIO";
                    break;
                case 6:
                    mes="JULIO";
                    break;
                case 7:
                    mes="AGOSTO";
                    break;
                case 8:
                    mes="SEPTIEMBRE";
                    break;
                case 9:
                    mes="OCTUBRE";
                    break;
                case 10:
                    mes="NOVIEMBRE";
                    break;
                case 11:
                    mes="DICIEMBRE";
                    break;
            }

            jv.setTitle("MES: "+ mes + " - "+ calendario.get(Calendar.YEAR));
            
        } catch (JRException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_citasMes_menuActionPerformed

    private void citas_meses_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_citas_meses_menuActionPerformed
        citasxmeses = new ReporteCitasXFecha();
        citasxmeses.setVisible(true);
        citasxmeses.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        citasxmeses.setLocationRelativeTo(null);
    }//GEN-LAST:event_citas_meses_menuActionPerformed

    public void reporteCitasHoy()
    {
        try {
    
            Connection conexion  = c.getConexion();
           File report = new File("src/reportes/CitasHoy.jasper");
            JasperReport jr = null;
            
            //jr = (JasperReport) JRLoader.loadObject(getClass().getResource("/reportes/CitasHoy.jasper"));
            
            jr = JasperCompileManager.compileReport(getClass().getResourceAsStream("/reportes/CitasHoy.jrxml"));
            //jr = (JasperReport) JRLoader.loadObject(report);
            
            JasperPrint jprint = JasperFillManager.fillReport(jr, null, conexion);
            
            JasperViewer jv = new JasperViewer(jprint, false);
            
            jv.setVisible(true);

            jv.setTitle("CITAS PARA: "+ calendario.get(Calendar.DATE)+"-"+ (calendario.get(Calendar.MONTH)+1)+
                    "-"+ calendario.get(Calendar.YEAR));
            
        } catch (JRException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "ERROR AL GENERAR REPORTE", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void citasHoy(){
        
        Calendar calendario = Calendar.getInstance();
        String fechaHoy = String.valueOf(calendario.get(Calendar.YEAR))+ "-" + String.valueOf(calendario.get(Calendar.MONTH)+1) + "-" + String.valueOf(calendario.get(Calendar.DATE));

        try {
            String documento,nombres,apellidos,medico,hora,area;
            
            String[] fila= new String[6];
            
            Connection conexion = c.getConexion();
            
            PreparedStatement sentencia = conexion.prepareStatement("SELECT pacientes.doc, CONCAT(pacientes.nombre1,' ', pacientes.nombre2) AS nombre,"+
                    " CONCAT(pacientes.apellido1,' ', pacientes.apellido2) AS apellidos,"+
                    " CONCAT(medicos.nombre,' ', medicos.apellidos) AS medico,medicos.area, DATE_FORMAT(citas.hora, '%h:%i %p') AS hora " +
                    "FROM pacientes, medicos, citas " +
                    "WHERE pacientes.doc = citas.pacientes_docpaciente " +
                    "AND medicos.idmedicos = citas.medicos_idmedicos " +
                    "AND citas.dia=CURDATE() AND citas.estado='ASIGNADA' ORDER BY hora ASC");
            //sentencia.setString(1,fechaHoy);
            
            ResultSet rs = sentencia.executeQuery();
            
            while(rs.next())
            {
                documento= rs.getString("doc");
                nombres = rs.getString("nombre");
                apellidos = rs.getString("apellidos");
                medico = rs.getString("medico");
                hora = rs.getString("hora");
                area=rs.getString("area");
                //System.out.println(hora);

                fila[0]= documento;
                fila[1] = nombres;
                fila[2] = apellidos;
                fila[3] = medico;
                fila[4] = hora;
                fila[5] = area;
                
                modelotabla.addRow(fila);
            }
            rs.close();
        } catch (SQLException ex) {
            System.out.println("OCURRIO UN ERROR AL OBTENER CITAS: "+ex);
        }       
    }
    
    private void eliminaHorario(){
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
    
    Timer timer = new Timer (5000, new ActionListener () 
    { 
        @Override
        public void actionPerformed(ActionEvent e) {
            int filas = modelotabla.getRowCount()-1;
            int i=0;
            while(filas>=0){
                
                modelotabla.removeRow(filas);
                filas = modelotabla.getRowCount()-1;
            }
                citasHoy();           
        }
    });
    
    Timer backup = new Timer (100000, new ActionListener () 
    { 
        @Override
        public void actionPerformed(ActionEvent e) {
            new CreaBackup();
        }
    });
    
    public static void recibeSesion(String usuario, String clave){
        
        try {

            Connection conexion = c.getConexion();

            String sql = "SELECT CONCAT(nombres,' ',apellidos) AS usuario, rol FROM usuarios WHERE usuario = ?";
            
            PreparedStatement sentencia = conexion.prepareStatement(sql);
            
            sentencia.setString(1, usuario);
            
            ResultSet rs = sentencia.executeQuery();

            if(rs.next()){
                if(rs.getString("rol").equals("ENCARGADO DE CITAS"))
                {
                    barra_menu.remove(reportes_menu);
                    barra_menu.remove(usuarios_menu);
                    menu_pacientes.remove(actualizarPacientes_menu);
                }
                else if(rs.getString("rol").equals("RECEPCIONISTA"))
                {
                    barra_menu.remove(reportes_menu);
                    barra_menu.remove(usuarios_menu);
                    barra_menu.remove(menu_medicos);
                    menu_citas.remove(asigna_cita_menu);
                    menu_pacientes.remove(actualizarPacientes_menu);
                }
                usuario_lbl.setText("BIENVENIDO: " + rs.getString("usuario"));
            }
                        
            rs.close();
        } catch (SQLException ex) {
            System.out.println("OCURRIO UN ERROR CON LA SESIÓN: "+ ex.getMessage());
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JMenuItem actualizarPacientes_menu;
    private static javax.swing.JMenuItem agrega_medico;
    private javax.swing.JMenuItem agregausuario_menu;
    private javax.swing.JMenuItem asig_horario_medico;
    private static javax.swing.JMenuItem asigna_cita_menu;
    private static javax.swing.JMenuBar barra_menu;
    private javax.swing.JMenuItem cancelar_cita_menu;
    private javax.swing.JButton cerrar_sesion_btn;
    private javax.swing.JMenuItem citasMes_menu;
    private javax.swing.JMenuItem citas_meses_menu;
    private static javax.swing.JMenuItem editar_medico_menu;
    private javax.swing.JMenuItem editausuario_menu;
    private javax.swing.JMenuItem eliminausuario_menu;
    private javax.swing.JButton imprimir_citas_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private static javax.swing.JMenu menu_citas;
    private static javax.swing.JMenu menu_medicos;
    private static javax.swing.JMenu menu_pacientes;
    private javax.swing.JMenuItem modifica_cita_menu;
    private javax.swing.JScrollPane panelTabla;
    private static javax.swing.JMenu reportes_menu;
    private static javax.swing.JLabel usuario_lbl;
    private static javax.swing.JMenu usuarios_menu;
    private javax.swing.JMenuItem verPacientes_menu;
    // End of variables declaration//GEN-END:variables
    private final JTable tablaCitasHoy = new JTable();
    DefaultTableModel modelotabla=new DefaultTableModel();
    ListSelectionModel escuchador=tablaCitasHoy.getSelectionModel();
    
    //private int idpaciente;
    private static int codmed;
     
    Calendar calendario = Calendar.getInstance();
    
    private Medicos medico; 
    private static final Login login = new Login();
    private ActualizarPacientes actualizaPacientes;
    private AgregaMedico agregaMed;
    private AgregarHorarioMedico agregaHorario ;
    private VerPacientes verpaciente;
    private CancelaCita cancelar_cita;
    private ModificaCitas modificaCitas;
    private AsignarCitas asignaCitas;
    private EditarMedico editamedico;
    private AgregarUsuario agregausuario;
    private EliminaUsuario eliminarusuario;
    private EditarUsuario editausuario;
    private ReporteCitasXFecha citasxmeses;
}