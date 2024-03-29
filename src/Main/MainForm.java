/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.TableColumn;
import org.json.*;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime; 
/**
 *
 * @author user
 */
public class MainForm extends javax.swing.JFrame {

    /**
     * Creates new form MainForm
     */
    
    ClassApi api = new ClassApi();
    
    public MainForm() {
        initComponents();
        
        TableColumn column1 = tblHeader.getColumnModel().getColumn(0);
        TableColumn column2 = tblHeader.getColumnModel().getColumn(1);

        column1.setPreferredWidth(100);
        column2.setPreferredWidth(150);
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
        txtUrl = new javax.swing.JTextField();
        cbMethod = new javax.swing.JComboBox<>();
        btnSend = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtToken = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtRequest = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        rbtnAuthorization = new javax.swing.JRadioButton();
        lblBeautify = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtResponse = new javax.swing.JTextArea();
        lblStatus = new javax.swing.JLabel();
        rbtnHeader = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHeader = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Rest Client Apps");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(60, 63, 65));
        setPreferredSize(new java.awt.Dimension(1360, 700));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Rest Client");

        txtUrl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtUrl.setText("http://localhost:9000/api/v1");
        txtUrl.setAlignmentX(2.0F);

        cbMethod.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbMethod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "GET", "POST", "PATCH", "DELETE" }));

        btnSend.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSend.setText("Send");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        txtToken.setColumns(20);
        txtToken.setLineWrap(true);
        txtToken.setRows(5);
        txtToken.setWrapStyleWord(true);
        jScrollPane2.setViewportView(txtToken);

        txtRequest.setColumns(20);
        txtRequest.setLineWrap(true);
        txtRequest.setRows(5);
        txtRequest.setTabSize(2);
        txtRequest.setWrapStyleWord(true);
        txtRequest.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtRequestKeyPressed(evt);
            }
        });
        jScrollPane3.setViewportView(txtRequest);

        jLabel2.setText("Bearer Token");

        jLabel3.setText("Request");

        jLabel4.setText("Response");

        rbtnAuthorization.setText("Authorization");

        lblBeautify.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        lblBeautify.setText("Beautify");
        lblBeautify.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBeautify.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblBeautifyMouseReleased(evt);
            }
        });

        txtResponse.setEditable(false);
        txtResponse.setColumns(20);
        txtResponse.setLineWrap(true);
        txtResponse.setRows(5);
        txtResponse.setWrapStyleWord(true);
        txtResponse.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane4.setViewportView(txtResponse);

        lblStatus.setFont(new java.awt.Font("Dialog", 3, 11)); // NOI18N
        lblStatus.setText("  ");
        lblStatus.setToolTipText("");

        rbtnHeader.setText("Headers");

        tblHeader.setAutoCreateRowSorter(true);
        tblHeader.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        tblHeader.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Content-Type", "application/json"},
                {"", ""},
                {null, null}
            },
            new String [] {
                "KEY", "VALUE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblHeader.setCellSelectionEnabled(true);
        tblHeader.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tblHeader.setOpaque(false);
        tblHeader.setRowHeight(20);
        jScrollPane1.setViewportView(tblHeader);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(1535, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbMethod, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUrl, javax.swing.GroupLayout.PREFERRED_SIZE, 935, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(358, 358, 358))))
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtnHeader)
                    .addComponent(rbtnAuthorization)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblBeautify))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUrl, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbMethod, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblBeautify)
                            .addComponent(jLabel4)
                            .addComponent(lblStatus))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbtnHeader)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(rbtnAuthorization)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int ans = JOptionPane.showOptionDialog(this, 
                    "Are you sure to logout ?", 
                    "Logout", 
                    JOptionPane.YES_NO_OPTION, 
                    JOptionPane.QUESTION_MESSAGE, null, null, null);
    
        if(ans == JOptionPane.YES_OPTION){
            JOptionPane.showInternalMessageDialog(this.getContentPane(), "Logout & Exit", "Information", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
    }//GEN-LAST:event_formWindowClosing
        
    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        try{                                        
            String url = txtUrl.getText();
            String token = txtToken.getText();
            String method = (String)cbMethod.getSelectedItem();
            String req = txtRequest.getText();
            
            Boolean isAuth = rbtnAuthorization.isSelected();
            Boolean isAddHeader = rbtnHeader.isSelected();
            
            JSONObject jsonHeader = new JSONObject();
            
            for (int i= 0; i< tblHeader.getRowCount(); i++){
                if(tblHeader.getValueAt(i, 0) != null && tblHeader.getValueAt(i, 1) != null && !"".equals(String.valueOf(tblHeader.getValueAt(i, 0) )) && !"".equals(String.valueOf(tblHeader.getValueAt(i, 1)))){
                    try {
                        jsonHeader.put((String) tblHeader.getValueAt(i, 0), tblHeader.getValueAt(i, 1));
                    } catch (JSONException ex) {
                        Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            
            List<String> res = api.sendData(url, isAuth, token, isAddHeader, jsonHeader,  method, req);
            
            try{
                JSONObject json = new JSONObject(res.get(1));
                
                txtResponse.setText(json.toString(8));
                lblStatus.setText(res.get(0));
            }catch (JSONException ex) {
                Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
                txtResponse.setText(res.get(1));
                lblStatus.setText(res.get(0));
                JOptionPane.showMessageDialog(null, res.get(1), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }catch (JSONException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSendActionPerformed

    private void lblBeautifyMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBeautifyMouseReleased
        try{
            JSONObject json = new JSONObject(txtRequest.getText());
            txtRequest.setText(json.toString(8));
        }catch (JSONException ex){
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_lblBeautifyMouseReleased

    private void txtRequestKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRequestKeyPressed
    }//GEN-LAST:event_txtRequestKeyPressed

    
    public static void writeLog(String msg){
        try{
            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd");

            String directoryName = "D:\\NetBeans\\JavaAPI\\AppLog";
            String fileName = "LOG " + dtf.format(now) + ".txt";

            File directory = new File(directoryName);
            File file = new File(directoryName + "/" + fileName);

            if (!directory.exists()){
                directory.mkdir();
                file.createNewFile();

                FileWriter fileWritter = new FileWriter(directoryName + "/" + file.getName(),true);
                try (BufferedWriter bw = new BufferedWriter(fileWritter)) {
                    bw.write(DateTimeFormatter.ofPattern("yyyyMMdd HH:mm:ss").format(now) + " : " + msg + "\n");
                    bw.close();
                }
            }else{
                if(!file.exists()) {
                    file.createNewFile();
                }

                FileWriter fileWritter = new FileWriter(directoryName + "/" + file.getName(),true);
                try (BufferedWriter bw = new BufferedWriter(fileWritter)) {
                    bw.write(DateTimeFormatter.ofPattern("yyyyMMdd HH:mm:ss").format(now) + " : " + msg + "\n");
                    bw.close();
                }
            }
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
    
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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MainForm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSend;
    private javax.swing.JComboBox<String> cbMethod;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblBeautify;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JRadioButton rbtnAuthorization;
    private javax.swing.JRadioButton rbtnHeader;
    private javax.swing.JTable tblHeader;
    private javax.swing.JTextArea txtRequest;
    private javax.swing.JTextArea txtResponse;
    private javax.swing.JTextArea txtToken;
    private javax.swing.JTextField txtUrl;
    // End of variables declaration//GEN-END:variables
}
