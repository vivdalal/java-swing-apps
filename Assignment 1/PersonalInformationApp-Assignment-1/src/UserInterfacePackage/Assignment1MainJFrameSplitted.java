/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterfacePackage;

import BusinessPackage.AccountInfo;
import BusinessPackage.Address;
import BusinessPackage.DemographicInfo;
import BusinessPackage.DriverLicenseInfo;
import BusinessPackage.MedicalRecord;
import BusinessPackage.Person;
import UserInterfacePackage.Panels.Create.CreateAllPanel;
import UserInterfacePackage.Panels.View.ViewAllPanel;

/**
 *
 * @author vivekdalal
 */
public class Assignment1MainJFrameSplitted extends javax.swing.JFrame {

    //All sublcasses which we need to populate on Create Panel and show on View Panel
    public static Address address;
    private DriverLicenseInfo driverLicenseInfo;
    private MedicalRecord medicalRecord;
    private AccountInfo accountInfo;
    private DemographicInfo personalInfo;

    //The Wrapper class:  Parent
    private Person person;

    /**
     * Creates new form Assignment1MainJFrameSplitted
     */
    public Assignment1MainJFrameSplitted() {
        initComponents();
        person = new Person();

        personalInfo = new DemographicInfo();
        address = new Address();
        driverLicenseInfo = new DriverLicenseInfo();
        medicalRecord = new MedicalRecord();
        accountInfo = new AccountInfo();
        person.setPersonalInfo(personalInfo);
        person.setAddress(address);
        person.setAccountInfo(accountInfo);
        person.setDriverLicenseInfo(driverLicenseInfo);
        person.setMedicalRecord(medicalRecord);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        leftSplitPane = new javax.swing.JPanel();
        PersonCreateViewPanel = new javax.swing.JPanel();
        createAllBtn = new javax.swing.JButton();
        viewAllBtn = new javax.swing.JButton();
        rightSplitDefaultPanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setBackground(new java.awt.Color(204, 204, 255));

        leftSplitPane.setBackground(new java.awt.Color(255, 255, 204));
        leftSplitPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PersonCreateViewPanel.setBackground(new java.awt.Color(255, 255, 204));

        createAllBtn.setFont(new java.awt.Font("AppleGothic", 1, 13)); // NOI18N
        createAllBtn.setText("Create");
        createAllBtn.setSize(new java.awt.Dimension(84, 29));
        createAllBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAllBtnActionPerformed(evt);
            }
        });

        viewAllBtn.setFont(new java.awt.Font("AppleGothic", 1, 13)); // NOI18N
        viewAllBtn.setText("View");
        viewAllBtn.setMaximumSize(new java.awt.Dimension(84, 29));
        viewAllBtn.setMinimumSize(new java.awt.Dimension(84, 29));
        viewAllBtn.setPreferredSize(new java.awt.Dimension(84, 29));
        viewAllBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAllBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PersonCreateViewPanelLayout = new javax.swing.GroupLayout(PersonCreateViewPanel);
        PersonCreateViewPanel.setLayout(PersonCreateViewPanelLayout);
        PersonCreateViewPanelLayout.setHorizontalGroup(
            PersonCreateViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PersonCreateViewPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PersonCreateViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(createAllBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PersonCreateViewPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(viewAllBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        PersonCreateViewPanelLayout.setVerticalGroup(
            PersonCreateViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PersonCreateViewPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(createAllBtn)
                .addGap(18, 18, 18)
                .addComponent(viewAllBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        leftSplitPane.add(PersonCreateViewPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, 90));

        jSplitPane1.setLeftComponent(leftSplitPane);

        rightSplitDefaultPanel.setBackground(new java.awt.Color(204, 255, 204));

        javax.swing.GroupLayout rightSplitDefaultPanelLayout = new javax.swing.GroupLayout(rightSplitDefaultPanel);
        rightSplitDefaultPanel.setLayout(rightSplitDefaultPanelLayout);
        rightSplitDefaultPanelLayout.setHorizontalGroup(
            rightSplitDefaultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 982, Short.MAX_VALUE)
        );
        rightSplitDefaultPanelLayout.setVerticalGroup(
            rightSplitDefaultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 654, Short.MAX_VALUE)
        );

        jSplitPane1.setRightComponent(rightSplitDefaultPanel);

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));

        jLabel6.setFont(new java.awt.Font("AppleGothic", 3, 13)); // NOI18N
        jLabel6.setText("Welcome to the Personal Information App - Your All in One Information Collecter and Presenter!");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 889, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSplitPane1)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jSplitPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Method which is called when we click the View button. We navigate to the View Panel by setting it on the Right side of the JSplitPanel
    private void viewAllBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAllBtnActionPerformed
        //Invoking the View Panel for Report Gen Section
        ViewAllPanel rg = new ViewAllPanel(person);
        jSplitPane1.setRightComponent(rg);
    }//GEN-LAST:event_viewAllBtnActionPerformed

    //Method which is called when we click the Create button. We navigate to the Create Panel by setting it on the Right side of the JSplitPanel
    private void createAllBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAllBtnActionPerformed
        //Invoking the Create Panel for All Section
        CreateAllPanel createAll = new CreateAllPanel(person);
        jSplitPane1.setRightComponent(createAll);
    }//GEN-LAST:event_createAllBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Assignment1MainJFrameSplitted.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Assignment1MainJFrameSplitted.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Assignment1MainJFrameSplitted.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Assignment1MainJFrameSplitted.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Assignment1MainJFrameSplitted().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PersonCreateViewPanel;
    private javax.swing.JButton createAllBtn;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel leftSplitPane;
    private javax.swing.JPanel rightSplitDefaultPanel;
    private javax.swing.JButton viewAllBtn;
    // End of variables declaration//GEN-END:variables

}
