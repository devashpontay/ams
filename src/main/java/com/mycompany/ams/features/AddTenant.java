/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.ams.features;

import com.mycompany.ams.features.RoomDisabler.RoomChecker;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.UUID;
import com.mycompany.ams.features.stringmanipulation.StringManipulation;
import java.util.ArrayList;

import javax.swing.JOptionPane;

/**
 *
 * @author Jerry Boy Tejada
 */
public class AddTenant extends javax.swing.JFrame {

    StringManipulation strManipulate = new StringManipulation();

    /**
     * Creates new form EditingForm
     */
    public AddTenant() {
        initComponents();
    }

    public AddTenant(String idNo) { // constructor that accepts an argument
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

        jLabel10 = new javax.swing.JLabel();
        clientDeposit = new javax.swing.JLabel();
        clientRoom = new javax.swing.JLabel();
        clientFullname = new javax.swing.JLabel();
        clientContact = new javax.swing.JLabel();
        clientEmail = new javax.swing.JLabel();
        clientBalance = new javax.swing.JLabel();
        clientFloor = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        newInput = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        BackgroundP = new javax.swing.JPanel();
        layer2bg = new javax.swing.JPanel();
        fname = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        jTextFieldFullName = new javax.swing.JTextField();
        jTextFieldContactNo = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        floorNo = new javax.swing.JComboBox<>();
        roomNum = new javax.swing.JComboBox<>();

        jLabel10.setText("FIELD");

        clientDeposit.setText(" ");
        clientDeposit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        clientRoom.setText(" ");
        clientRoom.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        clientFullname.setText(" ");
        clientFullname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        clientContact.setText(" ");
        clientContact.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        clientEmail.setText(" ");
        clientEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        clientBalance.setText(" ");
        clientBalance.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        clientFloor.setText(" ");
        clientFloor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel12.setText("NEW VALUE");

        newInput.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        newInput.setText(" ");
        newInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newInputActionPerformed(evt);
            }
        });
        newInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                newInputKeyReleased(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 153, 153));
        jButton2.setText("DELETE");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BackgroundP.setBackground(new java.awt.Color(208, 49, 49));

        layer2bg.setBackground(new java.awt.Color(255, 255, 255));

        fname.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        fname.setText("FULLNAME");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel2.setText("CONTACT NO");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel4.setText("EMAIL");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel6.setText("FLOOR NO.");

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel7.setText("UNIT NO.");

        jButton1.setBackground(new java.awt.Color(208, 49, 49));
        jButton1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(244, 245, 244));
        jButton1.setText("Save");
        jButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(208, 49, 49));
        jButton3.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(244, 245, 244));
        jButton3.setText("Back");
        jButton3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(208, 49, 49));
        jLabel11.setText("New Tenant");

        logo.setText(" ");

        jTextFieldFullName.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTextFieldFullName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFullNameActionPerformed(evt);
            }
        });

        jTextFieldContactNo.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        jTextFieldEmail.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        floorNo.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        floorNo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3" }));
        floorNo.setSelectedItem(null);
        floorNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                floorNoActionPerformed(evt);
            }
        });

        roomNum.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        roomNum.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {}));

        javax.swing.GroupLayout layer2bgLayout = new javax.swing.GroupLayout(layer2bg);
        layer2bg.setLayout(layer2bgLayout);
        layer2bgLayout.setHorizontalGroup(
            layer2bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layer2bgLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layer2bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layer2bgLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(71, 71, 71)
                        .addComponent(logo))
                    .addGroup(layer2bgLayout.createSequentialGroup()
                        .addGroup(layer2bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fname)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addGroup(layer2bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextFieldEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                                .addComponent(jTextFieldContactNo, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldFullName, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(49, 49, 49)
                        .addGroup(layer2bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layer2bgLayout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(roomNum, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(floorNo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layer2bgLayout.setVerticalGroup(
            layer2bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layer2bgLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layer2bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logo)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layer2bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fname)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layer2bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldFullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(floorNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layer2bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7))
                .addGap(8, 8, 8)
                .addGroup(layer2bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roomNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layer2bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57))
        );

        javax.swing.GroupLayout BackgroundPLayout = new javax.swing.GroupLayout(BackgroundP);
        BackgroundP.setLayout(BackgroundPLayout);
        BackgroundPLayout.setHorizontalGroup(
            BackgroundPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundPLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(layer2bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        BackgroundPLayout.setVerticalGroup(
            BackgroundPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundPLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(layer2bg, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BackgroundP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void saveTenantInfo() {
        UUID uuid = UUID.randomUUID();

        String randomIdNo = uuid.toString();
        String fullName = jTextFieldFullName.getText();
        String contactNumber = jTextFieldContactNo.getText();
        String email = jTextFieldEmail.getText();

        try {
            FileWriter fileWriter = new FileWriter("TenantsDB.txt", true);
            BufferedWriter writer = new BufferedWriter(fileWriter);

            if (floorNo.getSelectedItem().equals("1")) {
                String data = randomIdNo + "/" + fullName + "/" + contactNumber + "/" + email + "/" + "0" + "/" + "8000" + "/" + floorNo.getSelectedItem() + "/" + roomNum.getSelectedItem() + "/" + getLastName(fullName) + "@" + roomNum.getSelectedItem();
                String encryptedData = strManipulate.encrypt(data);
                writer.write(encryptedData);
                writer.newLine();
            } else if (floorNo.getSelectedItem().equals("2")) {
                String data = randomIdNo + "/" + fullName + "/" + contactNumber + "/" + email + "/" + "0" + "/" + "8000" + "/" + floorNo.getSelectedItem() + "/" + roomNum.getSelectedItem() + "/" + getLastName(fullName) + "@" + roomNum.getSelectedItem();
                String encryptedData = strManipulate.encrypt(data);
                writer.write(encryptedData);
                writer.newLine();
            } else {
                String data = randomIdNo + "/" + fullName + "/" + contactNumber + "/" + email + "/" + "0" + "/" + "8000" + "/" + floorNo.getSelectedItem() + "/" + roomNum.getSelectedItem() + "/" + getLastName(fullName) + "@" + roomNum.getSelectedItem();
                String encryptedData = strManipulate.encrypt(data);
                writer.write(encryptedData);
                writer.newLine();
            }

            // Close the buffered writer
            writer.close();

            // Display a success message
            JOptionPane.showMessageDialog(null, "Tenant added successfully!");

            // Clear the input fields after saving
        } catch (IOException e) {
            // Handle any exceptions that occur during file writing
            JOptionPane.showMessageDialog(null, "Failed to save tenant details!");
        }
    }

    public String getLastName(String data) {
        String[] parts = data.split(" ");
        String lastname = parts[parts.length - 1];
        return lastname.toUpperCase();
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void newInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newInputActionPerformed
        // TODO add your handling code here:
        //newInput.setText(null);
    }//GEN-LAST:event_newInputActionPerformed

    private void newInputKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_newInputKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_newInputKeyReleased

    private void jTextFieldFullNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFullNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFullNameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        saveTenantInfo();

        AdminPage adminPg = new AdminPage();

        this.setVisible(false);

        // Make the previous JFrame visible
        adminPg.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void floorNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_floorNoActionPerformed

        if (floorNo.getSelectedItem().equals("1")) {
            roomNum.removeAllItems();
            for (int i = 101; i <= 110; i++) {
                System.out.println(i);
                String tempItem = Integer.toString(i);
                roomNum.addItem(tempItem);
            }
            RoomChecker roomChecker = new RoomChecker();
            ArrayList<String> occupiedRoom = roomChecker.getOccupiedRoomFloorOne();

            for (int i = 0; i < occupiedRoom.size(); i++) {
                roomNum.removeItem(occupiedRoom.get(i));
            }
        } else if (floorNo.getSelectedItem().equals("2")) {
            roomNum.removeAllItems();
            for (int i = 201; i <= 210; i++) {
                String tempItem = Integer.toString(i);
                roomNum.addItem(tempItem);
            }
            RoomChecker roomChecker = new RoomChecker();
            ArrayList<String> occupiedRoom = roomChecker.getOccupiedRoomFloorTwo();

            for (int i = 0; i < occupiedRoom.size(); i++) {
                roomNum.removeItem(occupiedRoom.get(i));
            }
        } else {
            roomNum.removeAllItems();
            for (int i = 301; i <= 310; i++) {
                String tempItem = Integer.toString(i);
                roomNum.addItem(tempItem);
            }
            RoomChecker roomChecker = new RoomChecker();
            ArrayList<String> occupiedRoom = roomChecker.getOccupiedRoomFloorThree();

            for (int i = 0; i < occupiedRoom.size(); i++) {
                roomNum.removeItem(occupiedRoom.get(i));
            }
        }
    }//GEN-LAST:event_floorNoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Get the previous JFrame
        AdminPage adminPg = new AdminPage();

        // Make the current JFrame invisible
        this.setVisible(false);

        // Make the previous JFrame visible
        adminPg.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(AddTenant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddTenant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddTenant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddTenant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddTenant().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackgroundP;
    private javax.swing.JLabel clientBalance;
    private javax.swing.JLabel clientContact;
    private javax.swing.JLabel clientDeposit;
    private javax.swing.JLabel clientEmail;
    private javax.swing.JLabel clientFloor;
    private javax.swing.JLabel clientFullname;
    private javax.swing.JLabel clientRoom;
    private javax.swing.JComboBox<String> floorNo;
    private javax.swing.JLabel fname;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextFieldContactNo;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldFullName;
    private javax.swing.JPanel layer2bg;
    private javax.swing.JLabel logo;
    private javax.swing.JTextField newInput;
    private javax.swing.JComboBox<String> roomNum;
    // End of variables declaration//GEN-END:variables
}
