package SISGECM;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.view.JasperViewer;


public class ReporteCitasXFecha extends javax.swing.JFrame {

    Conexion c = new Conexion();
    Calendar fecha = Calendar.getInstance();
    
    public ReporteCitasXFecha() {
        initComponents();
        
        setIconImage(new ImageIcon(getClass().getResource("/img/icono.png")).getImage());
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        mesinicio_cmb = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        mesfin_cmb = new javax.swing.JComboBox();
        generar_btn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        fondo_lbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Citas entre meses");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("DESDE:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 135, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("HASTA:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 135, -1, -1));

        mesinicio_cmb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ENERO", "FEBRERO", "MARZO", "ABRIL", "MAYO", "JUNIO", "JULIO", "AGOSTO", "SEPTIEMBRE", "OCTUBRE", "NOVIEMBRE", "DICIEMBRE" }));
        mesinicio_cmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesinicio_cmbActionPerformed(evt);
            }
        });
        getContentPane().add(mesinicio_cmb, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 120, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setText("<html><center>GENERAR REPORTE DE CITAS<br>CON MESES ESPECÍFICOS</center></html>");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 400, 60));

        mesfin_cmb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ENERO", "FEBRERO", "MARZO", "ABRIL", "MAYO", "JUNIO", "JULIO", "AGOSTO", "SEPTIEMBRE", "OCTUBRE", "NOVIEMBRE", "DICIEMBRE" }));
        getContentPane().add(mesfin_cmb, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 120, -1));

        generar_btn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        generar_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/generate.png"))); // NOI18N
        generar_btn.setText("GENERAR REPORTE");
        generar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generar_btnActionPerformed(evt);
            }
        });
        getContentPane().add(generar_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("AÑO: "+fecha.get(Calendar.YEAR));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        fondo_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/medicine.jpg"))); // NOI18N
        getContentPane().add(fondo_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void generar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generar_btnActionPerformed
        int mesinicio = mesinicio_cmb.getSelectedIndex() +1;
        int mesfin = mesfin_cmb.getSelectedIndex() +1;
        
//        String ruta = "src/reportes/CitasDosMeses.jasper";
        
        JasperReport jr = null;
        try {
            Map parametros = new HashMap();
            parametros.put("mesinicio", mesinicio);
            parametros.put("mesfinal", mesfin);
            
            System.out.println(parametros.values());
            //jr = (JasperReport) JRLoader.loadObject(getClass().getResource("/reportes/CitasDosMeses.jasper"));
            jr = JasperCompileManager.compileReport(getClass().getResourceAsStream("/reportes/CitasDosMeses.jrxml"));
            JasperPrint jp = JasperFillManager.fillReport(jr, parametros,c.getConexion());
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setTitle("Reporte de Citas Entre Meses");
            jv.setVisible(true);
            
        } catch (JRException ex) {
            Logger.getLogger(ReporteCitasXFecha.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_generar_btnActionPerformed

    private void mesinicio_cmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesinicio_cmbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mesinicio_cmbActionPerformed

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
            java.util.logging.Logger.getLogger(ReporteCitasXFecha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReporteCitasXFecha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReporteCitasXFecha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReporteCitasXFecha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReporteCitasXFecha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondo_lbl;
    private javax.swing.JButton generar_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JComboBox mesfin_cmb;
    private javax.swing.JComboBox mesinicio_cmb;
    // End of variables declaration//GEN-END:variables
}
