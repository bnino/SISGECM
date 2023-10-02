package SISGECM;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.Calendar;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Ingeniero Brayan
 */

public class BackUpBD extends JFileChooser{
    
    JFileChooser chooser = new JFileChooser();
    
    public BackUpBD(){
        int resp;
        
        Calendar c = Calendar.getInstance();
        String fecha = String.valueOf(c.get(Calendar.DATE));
        fecha = fecha+"-"+String.valueOf(c.get(Calendar.MONTH)+1);
        fecha = fecha+"-"+String.valueOf(c.get(Calendar.YEAR));
        
        resp=chooser.showSaveDialog(this);
        if(resp==JFileChooser.APPROVE_OPTION){
            try {
                Runtime runtime = Runtime.getRuntime();
                File backupfile = new File(String.valueOf(chooser.getSelectedFile())
                        +"_"+fecha+".sql");
                FileWriter fw = new FileWriter(backupfile);
                
                Process child = runtime.exec(System.getProperty("user.dir")
                        +"\\mysqldump --opt --password= --user=root "
                + "--databases modelo_citas -R");
                InputStreamReader irs = new InputStreamReader(child.getInputStream());
                BufferedReader br = new BufferedReader(irs);
                
                String line;
                
                while( (line=br.readLine()) != null){
                    fw.write(line+ "\n");
                }
                
                fw.close();
                irs.close();
                br.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"ERROR; NO SE GENERÓ EL ARCHIVO "+e.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
            }
            JOptionPane.showMessageDialog(null, "ARCHIVO GENERADO; VERIFICAR", "INFORMACIÓN", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
