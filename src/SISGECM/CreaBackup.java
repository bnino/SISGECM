package SISGECM;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URL;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Ingeniero Brayan
 */

public class CreaBackup{
    
    Calendar c = Calendar.getInstance();
    String fecha = String.valueOf(c.get(Calendar.YEAR)) 
            +"-"+String.valueOf(c.get(Calendar.MONTH)) 
            +"-"+String.valueOf(c.get(Calendar.DATE));
    
    public CreaBackup(){
        int resp;
        
        String direccion = System.getProperty("user.dir");
        
        System.out.println(direccion);

            try {
                Runtime runtime = Runtime.getRuntime();
                String backupfile = direccion+"/backup/backup_"+fecha+".sql";
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
                JOptionPane.showMessageDialog(null,"ERROR; NO SE GENERÓ EL ARCHIVO BACKUP \n "+e,"ERROR",JOptionPane.ERROR_MESSAGE);
            }
    }
}
