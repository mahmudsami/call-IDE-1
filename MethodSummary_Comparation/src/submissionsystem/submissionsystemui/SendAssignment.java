package submissionsystem.submissionsystemui;

import submissionsystem.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import net.lingala.zip4j.core.*;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.model.*;
import net.lingala.zip4j.util.*;
/**
 *
 * @author Abdullah Talayhan
 */
public class SendAssignment extends javax.swing.JFrame {

    /**
     * Creates new form SendAssignment
     */
    
    Client client;
    File toSend;
    String assignmentPath;
    String courseCode;
    FileInputStream fis;
    
    public SendAssignment(Client pclient, String code) {
        client = pclient;
        courseCode = code;
        initComponents();
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        dueDate = new javax.swing.JTextField();
        metRestField = new javax.swing.JTextField();
        classRestField = new javax.swing.JTextField();
        browseBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        publishBtn = new javax.swing.JButton();
        courseName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Publish Assignment");

        jLabel1.setText("Course:");

        jLabel2.setText("Assignment Name: ");

        jLabel3.setText("Due Date: ");

        jLabel4.setText("Method Restrictions: ");

        jLabel5.setText("Class Restrictions: ");

        browseBtn.setText("Browse");
        browseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseBtnActionPerformed(evt);
            }
        });

        jLabel6.setText("Assignment File");

        publishBtn.setText("Publish");
        publishBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                publishBtnActionPerformed(evt);
            }
        });

        courseName.setText("CS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(courseName)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(nameField, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                .addComponent(dueDate))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(browseBtn)
                                .addGap(58, 58, 58)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(metRestField, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addComponent(classRestField)
                            .addComponent(publishBtn, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(courseName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(dueDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(metRestField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(classRestField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(publishBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(browseBtn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void publishBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_publishBtnActionPerformed
        // TODO add your handling code here:
        long length = toSend.length();
        
        if(length > Integer.MAX_VALUE) {
            JOptionPane.showMessageDialog(this, "Assignment file is more than 2 GB", "Call-IDE Error!", JOptionPane.ERROR);

        }
        else {
            
                client.sendUTFDataToServer("PUBLISH_ASSIGNMENT");
                
                long millis=System.currentTimeMillis();
                client.sendUTFDataToServer(nameField.getText());
                client.sendObjectToServer(Date.valueOf(dueDate.getText()));
                client.sendObjectToServer(new Date(millis));
                client.sendUTFDataToServer(courseCode);
                //construct toSend here
                //client.sendUTFDataToServer(toSend.getName());
                
                // send length
                //client.sendIntDataToServer((int)length);
            try {
                ZipParameters zipParams = new ZipParameters();
                zipParams.setCompressionMethod(Zip4jConstants.COMP_DEFLATE);
                zipParams.setCompressionLevel(Zip4jConstants.DEFLATE_LEVEL_NORMAL);
                
                String compressedPath = toSend.getParent() + "/" + nameField.getText() + ".zip";
                ZipFile compressedFile = new ZipFile(compressedPath);
                
                compressedFile.addFolder(toSend, zipParams);
                File toSendZip = new File(compressedPath);
                
                fis = new FileInputStream(toSendZip);
                byte[] data = new byte[(int)toSendZip.length()];
                fis.read(data);
                fis.close();
               
                client.sendObjectToServer(data);
                
                
                String ans = client.getUTFDataFromServer();
                if(ans.equals("PUBLISHED")) {
                    JOptionPane.showMessageDialog(this, "Assignment Published", "Call-IDE Submission System", JOptionPane.INFORMATION_MESSAGE);
                }   
            } catch (FileNotFoundException ex) {
                Logger.getLogger(SendAssignment.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(SendAssignment.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ZipException ex) {
                Logger.getLogger(SendAssignment.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
        
        
    }//GEN-LAST:event_publishBtnActionPerformed

    private void browseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseBtnActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooser.showOpenDialog(null);
        
        toSend = chooser.getSelectedFile();
        
    }//GEN-LAST:event_browseBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton browseBtn;
    private javax.swing.JTextField classRestField;
    private javax.swing.JLabel courseName;
    private javax.swing.JTextField dueDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField metRestField;
    private javax.swing.JTextField nameField;
    private javax.swing.JButton publishBtn;
    // End of variables declaration//GEN-END:variables
}
