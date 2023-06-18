/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.ams.features;
import com.mycompany.ams.features.PathFinder.GetFilePath;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


/**
 *
 * @author finns
 */
public class TenantsDashboard extends javax.swing.JFrame {
   
    public TenantsDashboard() {
        initComponents();
        populateTenantInformation();
    }

    private void populateTenantInformation() {
        //String filePath = "TenantDB.txt";
        BufferedReader tenantReader;
        BufferedReader requestReader;
        try {
            tenantReader = new BufferedReader(new FileReader("TenantsDB.txt"));
            requestReader = new BufferedReader(new FileReader("PendingTransDB.txt"));
            String line;
            int tenantCount = 0;

            while ((line = tenantReader.readLine()) != null) {
                String[] fields = line.split("/");
                String idNo = fields[0];
                String fullname = fields[1];
                String contactNo = fields[2];
                String email = fields[3];
                int balance = Integer.parseInt(fields[4]);
                int securityDeposit = Integer.parseInt(fields[5]);
                int floorNo = Integer.parseInt(fields[6]);
                int roomNo = Integer.parseInt(fields[7]);

                if (tenantCount == 0) {
                    // Extract the first name from the full name
                    String FirstName = fullname.split(" ")[0] + "!";
                    //FirstName += "!"; // Add an exclamation mark
                    
                    TenantName.setText(fullname);
                    firstName.setText(FirstName);
                    ContactNum.setText(contactNo);
                    Email.setText(email);
                    Balance.setText(String.valueOf("P" + balance));
                    deposit.setText(String.valueOf("P" + securityDeposit));
                    String floorAndRoom = getFloorAndRoomInfo(floorNo, roomNo);
                    floorNum.setText(floorAndRoom);
                    String floorInfo = getFloorInfo(floorNo);
                    roomNum.setText(floorInfo);
                    
                    // Set the amenities based on the floor number
                    setAmenitiesByFloor(floorNo);
                }

                tenantCount++;
            }

            numOfTenants.setText(tenantCount + " tenants");
            
            // Read requests information and count the number of lines
            int requestCount = 0;
            while (requestReader.readLine() != null) {
                requestCount++;
            }

            numOfRequests.setText(String.valueOf(requestCount + " requests"));
            
            // Display the current date
            LocalDate currentDate = LocalDate.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy, EEEE");
            String formattedDate = currentDate.format(formatter);
            currentDateLabel.setText(formattedDate);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String getFloorAndRoomInfo(int floorNo, int roomNo) {
        String floorInfo;
        if (floorNo == 1) {
            floorInfo = "1st Floor";
        } else if (floorNo == 2) {
            floorInfo = "2nd Floor";
        } else if (floorNo == 3) {
            floorInfo = "3rd Floor";
        } else {
            floorInfo = floorNo + "th Floor";
        }

        return floorInfo + ", Room " + roomNo;
    }

    
    private String getFloorInfo(int floorInfo) {
        if (floorInfo == 1) {
            return "1 living room, 1 bathroom, 1 kitchen, 29 m²";
        } else if (floorInfo == 2) {
            return "1 bedroom, 1 living room, 1 bathroom, 1 kitchen, 35 m²";
        } else if (floorInfo == 3) {
            return "2 bedrooms, 1 living room, 2 bathrooms, 1 kitchen, 49 m²";
        } else {
            return "";
        }
    }
    
    private void setAmenitiesByFloor(int floorNo) {
        if (floorNo == 1) {
            equipment1.setText("Fitness Center");
            equipment2.setText("Swimming Pool");
            equipment3.setText("24/7 Concierge Services");
            equipment4.setText("Pet-Friendly Facilities");
            equipment5.setText("");
            equipment6.setText("");
        } else if (floorNo == 2) {
            equipment1.setText("Fitness Center");
            equipment2.setText("Swimming Pool");
            equipment3.setText("24/7 Concierge Services");
            equipment4.setText("Pet-Friendly Facilities");
            equipment5.setText("Panoramic Views");
            equipment6.setText("");
        } else if (floorNo == 3) {
            equipment1.setText("Fitness Center");
            equipment2.setText("Swimming Pool");
            equipment3.setText("24/7 Concierge Services");
            equipment4.setText("Pet-Friendly Facilities");
            equipment5.setText("Panoramic Views");
            equipment6.setText("Smart Home Technology");
        } else {
            equipment1.setText("");
            equipment2.setText("");
            equipment3.setText("");
            equipment4.setText("");
            equipment5.setText("");
            equipment6.setText("");
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

        TenantName = new javax.swing.JLabel();
        Balance = new javax.swing.JLabel();
        ContactNum = new javax.swing.JLabel();
        Email = new javax.swing.JLabel();
        currentDateLabel = new javax.swing.JLabel();
        roomNum = new javax.swing.JLabel();
        floorNum = new javax.swing.JLabel();
        numOfTenants = new javax.swing.JLabel();
        numOfRequests = new javax.swing.JLabel();
        deposit = new javax.swing.JLabel();
        firstName = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        equipment1 = new javax.swing.JLabel();
        equipment2 = new javax.swing.JLabel();
        equipment3 = new javax.swing.JLabel();
        equipment4 = new javax.swing.JLabel();
        equipment5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        equipment6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();
        card1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(45, 45, 48));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TenantName.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        TenantName.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(TenantName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 180, 23));

        Balance.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        Balance.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(Balance, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 230, 60));

        ContactNum.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        ContactNum.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(ContactNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 106, 23));

        Email.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        Email.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 150, 25));

        currentDateLabel.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        currentDateLabel.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(currentDateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 280, 28));

        roomNum.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        roomNum.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(roomNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 374, 410, 50));

        floorNum.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        floorNum.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(floorNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 300, 270, 50));

        numOfTenants.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        numOfTenants.setForeground(new java.awt.Color(55, 49, 49));
        numOfTenants.setIcon(GetFilePath.getFilePath("tenants-icon"));
        getContentPane().add(numOfTenants, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 160, 90, 30));

        numOfRequests.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        numOfRequests.setForeground(new java.awt.Color(55, 49, 49));
        numOfRequests.setIcon(GetFilePath.getFilePath("request-icon"));
        getContentPane().add(numOfRequests, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 160, 100, 30));

        deposit.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        deposit.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(deposit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1046, 400, 90, 20));

        firstName.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        firstName.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(firstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(341, 55, 230, 65));

        jButton2.setBackground(new java.awt.Color(208, 49, 49));
        jButton2.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(244, 245, 244));
        jButton2.setText("Change Password");
        jButton2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 430, 360, 50));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Welcome Back,");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 55, 280, 65));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(215, 116, 116));
        jLabel8.setText("Report");
        jLabel8.setToolTipText("");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, -1, 30));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(215, 116, 116));
        jLabel7.setText("Your Balance");
        jLabel7.setToolTipText("");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, -1, 30));

        equipment1.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        equipment1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(equipment1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 450, 100, 24));

        equipment2.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        equipment2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(equipment2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 480, 100, 24));

        equipment3.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        equipment3.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(equipment3, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 450, 140, 26));

        equipment4.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        equipment4.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(equipment4, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 480, 140, 24));

        equipment5.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        equipment5.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(equipment5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 450, 120, 24));

        jButton1.setBackground(new java.awt.Color(208, 49, 49));
        jButton1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(244, 245, 244));
        jButton1.setText("Ask for Repair");
        jButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 198, 270, 40));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(55, 49, 49));
        jLabel2.setIcon(GetFilePath.getFilePath("properties"));
        jLabel2.setText("properties");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 160, 90, 30));

        equipment6.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        equipment6.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(equipment6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 480, 140, 26));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(215, 116, 116));
        jLabel5.setText("Your Security Deposit:");
        jLabel5.setToolTipText("");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 370, -1, 30));

        label1.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("Name:");
        getContentPane().add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 60, 23));

        label2.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        label2.setForeground(new java.awt.Color(255, 255, 255));
        label2.setText("Contact:");
        getContentPane().add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 70, 23));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(215, 116, 116));
        jLabel6.setText("Your Information:");
        jLabel6.setToolTipText("");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, -1, 40));

        label3.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        label3.setForeground(new java.awt.Color(255, 255, 255));
        label3.setText("Email:");
        getContentPane().add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, 50, 25));

        card1.setIcon(GetFilePath.getFilePath("dashboard-card1"));
        getContentPane().add(card1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 60, -1, -1));

        jLabel3.setIcon(GetFilePath.getFilePath("dashboard-card2"));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 280, -1, -1));

        jLabel4.setIcon(GetFilePath.getFilePath("dashboard-card3"));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, 370));

        jPanel1.setBackground(new java.awt.Color(45, 45, 48));
        jPanel1.setForeground(new java.awt.Color(45, 45, 48));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1230, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1230, 560));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(TenantsDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TenantsDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TenantsDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TenantsDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TenantsDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Balance;
    private javax.swing.JLabel ContactNum;
    private javax.swing.JLabel Email;
    private javax.swing.JLabel TenantName;
    private javax.swing.JLabel card1;
    private javax.swing.JLabel currentDateLabel;
    private javax.swing.JLabel deposit;
    private javax.swing.JLabel equipment1;
    private javax.swing.JLabel equipment2;
    private javax.swing.JLabel equipment3;
    private javax.swing.JLabel equipment4;
    private javax.swing.JLabel equipment5;
    private javax.swing.JLabel equipment6;
    private javax.swing.JLabel firstName;
    private javax.swing.JLabel floorNum;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel numOfRequests;
    private javax.swing.JLabel numOfTenants;
    private javax.swing.JLabel roomNum;
    // End of variables declaration//GEN-END:variables
}
