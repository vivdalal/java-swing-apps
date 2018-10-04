/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterfacePackage.Panels.Create;

import BusinessPackage.DemographicInfo;

/**
 *
 * @author vivekdalal
 */
public class CreatePIPanel extends javax.swing.JPanel {

    private DemographicInfo personalInfo;

    /**
     * Creates new form CreatePIPanel
     */
    //public CreatePIPanel() {
    //  initComponents();
    //}
    public CreatePIPanel(DemographicInfo personalInfo) {
        initComponents();
        //Initializing the combo box for Age(1-150)
        for (int i = 1; i < 150; i++) {
            ageComboBoxFld.addItem(Integer.toString(i));
        }
        ageComboBoxFld.setSelectedIndex(0);
        this.personalInfo = personalInfo;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        createPIBtn = new javax.swing.JButton();
        fnTxtFLd = new javax.swing.JTextField();
        lnTxtFLd = new javax.swing.JTextField();
        pnTxtFLd = new javax.swing.JTextField();
        dobTxtFLd = new javax.swing.JTextField();
        hghtTxtFLd = new javax.swing.JTextField();
        ssnTxtFLd = new javax.swing.JTextField();
        wghtTxtFLd = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ageComboBoxFld = new javax.swing.JComboBox<>();

        createPIBtn.setText("Create");
        createPIBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createPIBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("First Name");

        jLabel2.setText("Lastt Name");

        jLabel3.setText("Phone Number");

        jLabel4.setText("Date of Birth");

        jLabel5.setText("SSN");

        jLabel6.setText("Age");

        jLabel7.setText("Height");

        jLabel8.setText("Weight");

        ageComboBoxFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageComboBoxFldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(367, 367, 367)
                .addComponent(createPIBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(377, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fnTxtFLd, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(lnTxtFLd)
                    .addComponent(pnTxtFLd)
                    .addComponent(dobTxtFLd, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ssnTxtFLd, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(109, 109, 109)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hghtTxtFLd)
                            .addComponent(wghtTxtFLd, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(143, 143, 143))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ageComboBoxFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fnTxtFLd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6)
                    .addComponent(ageComboBoxFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(hghtTxtFLd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lnTxtFLd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(pnTxtFLd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(wghtTxtFLd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dobTxtFLd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ssnTxtFLd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                .addComponent(createPIBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createPIBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createPIBtnActionPerformed
        storePersonalInfo();

    }//GEN-LAST:event_createPIBtnActionPerformed

    private void storePersonalInfo() {
//        Assignment1MainJFrameSplitted.personalInfo.setAge(ageComboBoxFld.getSelectedIndex());
//        Assignment1MainJFrameSplitted.personalInfo.setFirstName(fnTxtFLd.getText());
//        Assignment1MainJFrameSplitted.personalInfo.setLastName(lnTxtFLd.getText());
//        Assignment1MainJFrameSplitted.personalInfo.setPhoneNum(Integer.parseInt(pnTxtFLd.getText()));
//        Assignment1MainJFrameSplitted.personalInfo.setDateOfBirth(dobTxtFLd.getText());
//        Assignment1MainJFrameSplitted.personalInfo.setSSN(Integer.parseInt(ssnTxtFLd.getText()));
//        Assignment1MainJFrameSplitted.personalInfo.setHeight(Double.parseDouble(hghtTxtFLd.getText()));
//        Assignment1MainJFrameSplitted.personalInfo.setWeight(Double.parseDouble(wghtTxtFLd.getText()));

        personalInfo.setAge(ageComboBoxFld.getSelectedIndex());
        personalInfo.setFirstName(fnTxtFLd.getText());
        personalInfo.setLastName(lnTxtFLd.getText());
        personalInfo.setPhoneNum(pnTxtFLd.getText());
        personalInfo.setDateOfBirth(dobTxtFLd.getText());
        personalInfo.setSSN(Integer.parseInt(ssnTxtFLd.getText()));
        personalInfo.setHeight(Double.parseDouble(hghtTxtFLd.getText()));
        personalInfo.setWeight(Double.parseDouble(wghtTxtFLd.getText()));

    }

    private void ageComboBoxFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageComboBoxFldActionPerformed
        //

    }//GEN-LAST:event_ageComboBoxFldActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ageComboBoxFld;
    private javax.swing.JButton createPIBtn;
    private javax.swing.JTextField dobTxtFLd;
    private javax.swing.JTextField fnTxtFLd;
    private javax.swing.JTextField hghtTxtFLd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField lnTxtFLd;
    private javax.swing.JTextField pnTxtFLd;
    private javax.swing.JTextField ssnTxtFLd;
    private javax.swing.JTextField wghtTxtFLd;
    // End of variables declaration//GEN-END:variables
}