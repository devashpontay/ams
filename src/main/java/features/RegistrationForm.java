/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package features;

import javax.swing.JOptionPane;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ezekiel Billona
 * @author Ashley Pontay
 */
public class RegistrationForm extends javax.swing.JFrame {

    /**
     * Creates new form RegistrationForm
     */
    public RegistrationForm() {
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

        jTextField3 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        regFormImg = new javax.swing.JLabel();
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
        unitChoiceNo = new javax.swing.JComboBox<>();
        regFormSubmitBtn = new javax.swing.JButton();
        regFormCancelBtn = new javax.swing.JButton();

        jTextField3.setText("jTextField3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        regFormImg.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin Billona\\Desktop\\ams\\src\\main\\java\\resources\\form_img.png")); // NOI18N

        regFormLabel.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        regFormLabel.setText("REGISTRATION FORM");

        jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 10)); // NOI18N
        jLabel3.setText("FULL NAME");

        clientFullName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientFullNameActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI Emoji", 0, 10)); // NOI18N
        jLabel4.setText("EMAIL ");

        clientEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientEmailActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI Emoji", 0, 10)); // NOI18N
        jLabel5.setText("CONTACT NO");

        clientContactNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientContactNoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI Emoji", 0, 10)); // NOI18N
        jLabel6.setText("FLOOR CHOICE NO");

        jLabel7.setFont(new java.awt.Font("Segoe UI Emoji", 0, 10)); // NOI18N
        jLabel7.setText("UNIT CHOICE NO");

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

        unitChoiceNo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {}));
        unitChoiceNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unitChoiceNoActionPerformed(evt);
            }
        });

        regFormSubmitBtn.setBackground(new java.awt.Color(153, 255, 255));
        regFormSubmitBtn.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        regFormSubmitBtn.setText("SUBMIT");
        regFormSubmitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regFormSubmitBtnActionPerformed(evt);
            }
        });

        regFormCancelBtn.setBackground(new java.awt.Color(153, 255, 255));
        regFormCancelBtn.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        regFormCancelBtn.setText("CANCEL");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(regFormImg, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(clientContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(100, 100, 100))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(clientFullName, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                                    .addComponent(clientEmail)))
                            .addComponent(unitChoiceNo, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(floorChoiceNo, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(regFormSubmitBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(regFormCancelBtn)))
                        .addContainerGap(27, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(regFormLabel)
                        .addGap(73, 73, 73))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(regFormLabel)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clientFullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clientEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clientContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(floorChoiceNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(unitChoiceNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(regFormSubmitBtn)
                    .addComponent(regFormCancelBtn))
                .addGap(25, 25, 25))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(regFormImg))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void floorChoiceNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_floorChoiceNoActionPerformed
        // TODO add your handling code here:
        
        if(floorChoiceNo.getSelectedItem().equals("1")) {
            unitChoiceNo.removeAllItems();
            for(int i = 101; i <= 110; i++) {
                System.out.println(i);
                String tempItem = Integer.toString(i);
                unitChoiceNo.addItem(tempItem);
            }
        }else if (floorChoiceNo.getSelectedItem().equals("2")) {
            unitChoiceNo.removeAllItems();
            for(int i = 201; i <= 210; i++) {
                String tempItem = Integer.toString(i);
                unitChoiceNo.addItem(tempItem);
            }
        }else {
            unitChoiceNo.removeAllItems();
            for(int i = 301; i <= 310; i++) {
                String tempItem = Integer.toString(i);
                unitChoiceNo.addItem(tempItem);
            }
        }


    }//GEN-LAST:event_floorChoiceNoActionPerformed

    private void unitChoiceNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unitChoiceNoActionPerformed
        
    }//GEN-LAST:event_unitChoiceNoActionPerformed

    private void regFormSubmitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regFormSubmitBtnActionPerformed
        UUID uuid = UUID.randomUUID();

        String randomId = uuid.toString();
        String name = clientFullName.getText();
        String email = clientEmail.getText();
        String contact = clientContactNo.getText();
        String floorNo = floorChoiceNo.getSelectedItem().toString();
        String unitNo = unitChoiceNo.getSelectedItem().toString();

        BufferedWriter writer;
        try {
            writer = new BufferedWriter(new FileWriter("regForm.txt"));
            writer.write(randomId + "@" + name + "@" + email + "@" + contact + "@" + floorNo + "@" + unitNo);
            writer.close();
        } catch (IOException ex) {
            Logger.getLogger(RegistrationForm.class.getName()).log(Level.SEVERE, null, ex);
        }

        clientFullName.setText(null);
        clientEmail.setText(null);
        clientContactNo.setText(null);
        floorChoiceNo.setSelectedItem("1");
        floorChoiceNo.setSelectedItem("1");

        Object[] options = {"Continue", "Exit"};

        int choice = JOptionPane.showOptionDialog(null, "Your registration was submitted! Do you want to continue or exit?", "Prompt",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

        if (choice == 0) {
            JOptionPane.showMessageDialog(null, "You clicked Continue.");
        } else if (choice == 1) {
            System.exit(0);
        }

//        System.out.println(email + " " + name);
    }//GEN-LAST:event_regFormSubmitBtnActionPerformed

    private void floorChoiceNoInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_floorChoiceNoInputMethodTextChanged

    }//GEN-LAST:event_floorChoiceNoInputMethodTextChanged

    private void clientFullNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientFullNameActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_clientFullNameActionPerformed

    private void clientEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientEmailActionPerformed
        
    }//GEN-LAST:event_clientEmailActionPerformed

    private void clientContactNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientContactNoActionPerformed

    }//GEN-LAST:event_clientContactNoActionPerformed

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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JButton regFormCancelBtn;
    private javax.swing.JLabel regFormImg;
    private javax.swing.JLabel regFormLabel;
    private javax.swing.JButton regFormSubmitBtn;
    private javax.swing.JComboBox<String> unitChoiceNo;
    // End of variables declaration//GEN-END:variables
}
