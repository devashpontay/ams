/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.ams.features;

import java.io.BufferedReader;
import java.io.FileReader;
import com.mycompany.ams.features.data_struct.MyLinkedList;
import com.mycompany.ams.features.data_struct.Node;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import com.mycompany.ams.features.stringmanipulation.StringManipulation;

/**
 *
 * @author Admin Billona
 */
public class PendingTransaction extends javax.swing.JFrame {

    MyLinkedList linkedList = new MyLinkedList();
    StringManipulation strManipulate = new StringManipulation();

    /**
     * Creates new form tans
     */
    public PendingTransaction() {
        initComponents();
        initFields();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jButton3.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jButton3.setText("Admin Account");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(44, 44, 44))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jButton3)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(58, 69, 76));
        jLabel1.setText("TRANSACTION LIST");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(58, 69, 76));
        jLabel2.setText("pending transaction list");

        jButton1.setBackground(new java.awt.Color(244, 245, 244));
        jButton1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(221, 48, 49));
        jButton1.setText(" Accept");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(244, 245, 244));
        jButton2.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(221, 48, 49));
        jButton2.setText(" Decline");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        cancel.setBackground(new java.awt.Color(208, 49, 49));
        cancel.setForeground(new java.awt.Color(244, 245, 244));
        cancel.setText("Back");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Floor No", "Unit No"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(bgLayout.createSequentialGroup()
                            .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1)
                            .addGap(18, 18, 18)
                            .addComponent(jButton2))))
                .addContainerGap(61, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)))
                .addGap(29, 29, 29)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int row = jTable1.getSelectedRow();
        Node currentNode = linkedList.head;
        if (jTable1.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "There are no transaction to show.");
        } else if (row == -1) {
            JOptionPane.showMessageDialog(null, "Please select a row!");
        } else {
            int dialogButton = JOptionPane.showConfirmDialog(null, "Are you sure?", "WARNING", JOptionPane.YES_NO_OPTION);

            if (dialogButton == JOptionPane.YES_OPTION) {
                while (currentNode != null) {
                    if (currentNode.getIdNo().equals(clientIdNo.get(row))) {
                        try {
                            FileWriter fileWriter = new FileWriter("TenantsDB.txt", true);
                            BufferedWriter writer = new BufferedWriter(fileWriter);

                            String data = currentNode.getIdNo() + "/" + currentNode.getFullname() + "/" + currentNode.getContactNo() + "/" + currentNode.getEmail() + "/" + currentNode.getBalance() + "/" + currentNode.getSecurityDeposit() + "/" + currentNode.getFloorNo() + "/" + currentNode.getUnitNo();
                            String encryptedData = strManipulate.encrypt(data);
                            writer.write(encryptedData);
                            writer.newLine();
                            writer.close();
                            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                            model.removeRow(row);
                            deleteData(row);
                            saveToDB();

                            // Display a success message

                            // Clear the input fields after saving
                        } catch (IOException e) {
                            // Handle any exceptions that occur during file writing
                            JOptionPane.showMessageDialog(null, "Your request failed to save details!");
                        }
                    }
                    currentNode = currentNode.next;
                }
                
                
            } else {
                System.out.println("No");
            }

            //JOptionPane.showMessageDialog(null, "Successfully accept the request.");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public String getLastName(String data) {
        String[] parts = data.split(" ");
        String lastname = parts[parts.length - 1];
        return lastname.toUpperCase();
    }
    
    private void deleteData(int row) {
        Node p ,q;
        p = q = linkedList.head;
        
        if(p.getIdNo().equals(clientIdNo.get(row))) {
            linkedList.head = linkedList.head.next;
            return;
        }
        
        while(p != null && !(p.getIdNo().equals(row))) {
            q = p;
            p = p.next;
        }
        
        q.next = p.next;
        
    }
    
    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        AdminPage adminPage = new AdminPage();
        adminPage.show();
        dispose();
    }//GEN-LAST:event_cancelActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int row = jTable1.getSelectedRow();

        if (jTable1.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "There are no clients to decline!");
        } else if (row == -1) {
            JOptionPane.showMessageDialog(null, "Please select a row!");
        } else {
            int dialogButton = JOptionPane.showConfirmDialog(null, "Are you sure?", "WARNING", JOptionPane.YES_NO_OPTION);
            if (dialogButton == JOptionPane.YES_OPTION) {
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                model.removeRow(row);
                deleteData(row);
                saveToDB();
                JOptionPane.showMessageDialog(null, "Successfully declined.");
            } else {
                System.out.println("No");
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int result = JOptionPane.showConfirmDialog(this, "Are you sure you want to sign out?", "Sign Out", JOptionPane.YES_NO_OPTION);
        if (result == JOptionPane.YES_OPTION) {
            LandingPage landingPage = new LandingPage();
            landingPage.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void saveToDB() {
        Node currentNode = linkedList.head;

        BufferedWriter writer;
        try {
            writer = new BufferedWriter(new FileWriter("PendingTransDB.txt"));
            while (currentNode != null) {
                String data = currentNode.getIdNo() + "/" + currentNode.getFullname() + "/" + currentNode.getContactNo() + "/" + currentNode.getEmail() + "/" + currentNode.getBalance() + "/" + currentNode.getSecurityDeposit() + "/" + currentNode.getFloorNo() + "/" + currentNode.getUnitNo();
                String encryptedData = strManipulate.encrypt(data);
                writer.write(encryptedData);
                writer.newLine();
                currentNode = currentNode.next;
            }
            writer.close();
        } catch (IOException e) {
            Logger.getLogger(PendingTransaction.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    ArrayList<String> clientIdNo = new ArrayList<>();

    private void initFields() {

        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader("PendingTransDB.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                line = strManipulate.decrypt(line);
                System.out.println(" " + line);
                String[] data = line.split("/");
                linkedList.add(data[0], data[1], data[2], data[3], Integer.parseInt(data[4]), Integer.parseInt(data[5]), Integer.parseInt(data[6]), Integer.parseInt(data[7]), data[8]);
            }

            reader.close();
        } catch (IOException e) {
        }
        //linkedList.display();
        Node currentNode = linkedList.head;
        while (currentNode != null) {
            //System.out.println(" " + currentNode.getIdNo());
            clientIdNo.add(currentNode.getIdNo());
            Object[] rowData = {
                currentNode.getFullname(),
                currentNode.getFloorNo(),
                currentNode.getUnitNo()
            };

            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.addRow(rowData);
            currentNode = currentNode.next;
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
            java.util.logging.Logger.getLogger(PendingTransaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PendingTransaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PendingTransaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PendingTransaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PendingTransaction().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton cancel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
