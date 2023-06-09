/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.ams.features;

import com.mycompany.ams.features.RoomDisabler.RoomChecker;
import com.mycompany.ams.features.PathFinder.GetFilePath;
import javax.swing.JOptionPane;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.mycompany.ams.features.RoomDisabler.RoomChecker;
import com.mycompany.ams.features.stringmanipulation.StringManipulation;

/**
 *
 * @author Ezekiel Billona
 * @author Ashley Pontay
 */
public class RegistrationForm extends javax.swing.JFrame {

    StringManipulation strManipulate = new StringManipulation();

    /**
     * Creates new form RegistrationForm
     */
    public RegistrationForm() {
        initComponents();
        initComboBox();
    }

    private void initComboBox() {
        RoomChecker roomChecker = new RoomChecker();
        ArrayList<String> occupiedRoom = roomChecker.getOccupiedRoomFloorOne();

        for (int i = 0; i < occupiedRoom.size(); i++) {
            roomNum.removeItem(occupiedRoom.get(i));
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        regFormLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        clientFullName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        clientEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        clientContactNo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        floorChoiceNo = new javax.swing.JComboBox<>();
        roomNum = new javax.swing.JComboBox<>();
        regFormSubmitBtn = new javax.swing.JButton();
        regFormCancelBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jTextField3.setText("jTextField3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(239, 220, 220));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        regFormLabel.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        regFormLabel.setText("Join Our Residential Community");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel3.setText("FULL NAME");

        clientFullName.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        clientFullName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientFullNameActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel4.setText("EMAIL ");

        clientEmail.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        clientEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientEmailActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel5.setText("CONTACT NO");

        clientContactNo.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        clientContactNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientContactNoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel6.setText("FLOOR CHOICE NO");

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel7.setText("UNIT CHOICE NO");

        floorChoiceNo.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        floorChoiceNo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3" }));
        floorChoiceNo.setSelectedItem(null);
        floorChoiceNo.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                floorChoiceNoInputMethodTextChanged(evt);
            }
        });
        floorChoiceNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                floorChoiceNoActionPerformed(evt);
            }
        });

        roomNum.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        roomNum.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {}));
        roomNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomNumActionPerformed(evt);
            }
        });

        regFormSubmitBtn.setBackground(new java.awt.Color(208, 49, 49));
        regFormSubmitBtn.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        regFormSubmitBtn.setForeground(new java.awt.Color(244, 245, 244));
        regFormSubmitBtn.setText("Submit");
        regFormSubmitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regFormSubmitBtnActionPerformed(evt);
            }
        });

        regFormCancelBtn.setBackground(new java.awt.Color(244, 245, 244));
        regFormCancelBtn.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        regFormCancelBtn.setForeground(new java.awt.Color(208, 49, 49));
        regFormCancelBtn.setText("Cancel");
        regFormCancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regFormCancelBtnActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(239, 220, 220));
        jButton1.setFont(new java.awt.Font("Segoe UI", 2, 10)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 102, 255));
        jButton1.setText("Can't Decide? Check our units.");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 8)); // NOI18N
        jLabel2.setText("By proceeding with the apartment fill-up form, you acknowledge and");

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 8)); // NOI18N
        jLabel8.setText("handle your personal information with utmost confidentiality and will ");

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 8)); // NOI18N
        jLabel9.setText("not disclose it to third parties without  explicit consent. ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jButton1))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(clientContactNo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(floorChoiceNo, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(roomNum, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(regFormSubmitBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(regFormCancelBtn))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(regFormLabel))
                                .addGap(0, 8, Short.MAX_VALUE))
                            .addComponent(clientEmail, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(clientFullName, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(35, 35, 35))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(regFormLabel)
                .addGap(38, 38, 38)
                .addComponent(jLabel3)
                .addGap(7, 7, 7)
                .addComponent(clientFullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clientEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(floorChoiceNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roomNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clientContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(regFormSubmitBtn)
                    .addComponent(regFormCancelBtn))
                .addGap(43, 43, 43))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, -1, 492));

        jButton2.setIcon(GetFilePath.getFilePath("small-admin-logo"));
        jButton2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel1.setIcon(GetFilePath.getFilePath("reg-center-image"));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void floorChoiceNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_floorChoiceNoActionPerformed
        // TODO add your handling code here:

        if (floorChoiceNo.getSelectedItem().equals("1")) {
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
        } else if (floorChoiceNo.getSelectedItem().equals("2")) {
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


    }//GEN-LAST:event_floorChoiceNoActionPerformed

    private void roomNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomNumActionPerformed

    }//GEN-LAST:event_roomNumActionPerformed

    private void regFormSubmitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regFormSubmitBtnActionPerformed
        UUID uuid = UUID.randomUUID();

        String randomId = uuid.toString();
        String name = clientFullName.getText();
        String email = clientEmail.getText();
        String contact = clientContactNo.getText();
        String floorNo = floorChoiceNo.getSelectedItem().toString();
        String unitNo = roomNum.getSelectedItem().toString();

        BufferedWriter writer;
        try {
            writer = new BufferedWriter(new FileWriter("PendingTransDB.txt"));
            if (floorNo.equals("1")) {
                String data = randomId + "/" + name + "/" + contact + "/" + email + "/" + "0" + "/" + "8000" + "/" + floorNo + "/" + unitNo + "/" + getLastName(name) + "@" + unitNo;
                String encryptedData = strManipulate.encrypt(data);
                writer.write(encryptedData);
            } else if (floorNo.equals("2")) {
                String data = randomId + "/" + name + "/" + contact + "/" + email + "/" + "0" + "/" + "11000" + "/" + floorNo + "/" + unitNo + "/" + getLastName(name) + "@" + unitNo;
                String encryptedData = strManipulate.encrypt(data);
                writer.write(encryptedData);
            } else {
                String data = randomId + "/" + name + "/" + contact + "/" + email + "/" + "0" + "/" + "15000" + "/" + floorNo + "/" + unitNo + "/" + getLastName(name) + "@" + unitNo;
                String encryptedData = strManipulate.encrypt(data);
                writer.write(encryptedData);
            }
            writer.close();

        } catch (IOException e) {
            Logger.getLogger(RegistrationForm.class.getName()).log(Level.SEVERE, null, e);
        }

        clientFullName.setText(null);
        clientEmail.setText(null);
        clientContactNo.setText(null);
        floorChoiceNo.setSelectedItem("1");

        Object[] options = {"Continue", "Exit"};

        int choice = JOptionPane.showOptionDialog(null, "Your registration was submitted! Do you want to continue or exit?", "Prompt",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

        if (choice == 0) {
            DisplayUnits display = new DisplayUnits();
            display.show();
            dispose();
        } else if (choice == 1) {
            System.exit(0);
        }

//        System.out.println(email + " " + name);
    }//GEN-LAST:event_regFormSubmitBtnActionPerformed

    
    public String getLastName(String data) {
        String[] parts = data.split(" ");
        String lastname = parts[parts.length - 1];
        return lastname.toUpperCase();
    }
    
    private void floorChoiceNoInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_floorChoiceNoInputMethodTextChanged

    }//GEN-LAST:event_floorChoiceNoInputMethodTextChanged

    private void clientFullNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientFullNameActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_clientFullNameActionPerformed

    private void clientEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientEmailActionPerformed

    }//GEN-LAST:event_clientEmailActionPerformed

    private void clientContactNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientContactNoActionPerformed

    }//GEN-LAST:event_clientContactNoActionPerformed

    private void regFormCancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regFormCancelBtnActionPerformed
        DisplayUnits display = new DisplayUnits();

        // Make the current JFrame invisible
        this.setVisible(false);

        // Make the previous JFrame visible
        display.setVisible(true);
    }//GEN-LAST:event_regFormCancelBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DisplayUnits display = new DisplayUnits();

        // Make the current JFrame invisible
        this.setVisible(false);

        // Make the previous JFrame visible
        display.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrationForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField clientContactNo;
    private javax.swing.JTextField clientEmail;
    private javax.swing.JTextField clientFullName;
    private javax.swing.JComboBox<String> floorChoiceNo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JButton regFormCancelBtn;
    private javax.swing.JLabel regFormLabel;
    private javax.swing.JButton regFormSubmitBtn;
    private javax.swing.JComboBox<String> roomNum;
    // End of variables declaration//GEN-END:variables
}
