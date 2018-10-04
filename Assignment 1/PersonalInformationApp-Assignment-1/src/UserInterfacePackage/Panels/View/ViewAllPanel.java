/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterfacePackage.Panels.View;

import BusinessPackage.Person;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author vivekdalal
 */
public class ViewAllPanel extends javax.swing.JPanel {

    private Person person;

    /**
     * Creates new form ViewRGPanel
     */
    public ViewAllPanel(Person person) {
        initComponents();
        //Updating the view by showing all the elements on the screen

        this.person = person;

        //Adding a check to ensure that the user has completed the create panel activities before jumping to View.
        if (person.getPersonalInfo() != null && person.getPersonalInfo().getFirstName() != null && !person.getPersonalInfo().getFirstName().isEmpty()) {
            updateView();
        } else {
            JOptionPane.showMessageDialog(this, "Please fill in all the details on Create Panel before entering the View Panel");
        }

    }

    private void updateView() {
        //Consolidated view of all the details. Setting the values selected/set on the Create Panel by User
        //Personal Info
        fnTxtFLd.setText(person.getPersonalInfo().getFirstName());
        fnTxtFLd.setEnabled(false);
        lnTxtFLd.setText(person.getPersonalInfo().getLastName());
        lnTxtFLd.setEnabled(false);
        dobTxtFLd.setText(person.getPersonalInfo().getDateOfBirth());
        dobTxtFLd.setEnabled(false);
        pnTxtFLd.setText(person.getPersonalInfo().getPhoneNum());
        pnTxtFLd.setEnabled(false);
        ssnTxtFLd.setText(Integer.toString(person.getPersonalInfo().getSSN()));
        ssnTxtFLd.setEnabled(false);
        ageTxtFLd.setText(Integer.toString(person.getPersonalInfo().getAge()));
        ageTxtFLd.setEnabled(false);
        wghtTxtFLd.setText(Double.toString(person.getPersonalInfo().getWeight()));
        wghtTxtFLd.setEnabled(false);
        hghtTxtFLd.setText(Double.toString(person.getPersonalInfo().getHeight()));
        hghtTxtFLd.setEnabled(false);

        //Address
        addrLn1Fld.setText(person.getAddress().getAddrLn1());
        addrLn1Fld.setEnabled(false);
        addrLn2Fld.setText(person.getAddress().getAddrLn2());
        addrLn2Fld.setEnabled(false);
        cityFld.setText(person.getAddress().getCity());
        cityFld.setEnabled(false);
        zipcodeFld.setText(person.getAddress().getZipCd());
        zipcodeFld.setEnabled(false);
        stateFld.setText(person.getAddress().getState());
        stateFld.setEnabled(false);

        //Bank Details
        bankNmFld.setText(person.getAccountInfo().getBankName());
        bankNmFld.setEnabled(false);
        routingNmFld.setText(person.getAccountInfo().getRoutingNum());
        routingNmFld.setEnabled(false);
        acctNmFld.setText(person.getAccountInfo().getAcctNum());
        acctNmFld.setEnabled(false);
        acctBalFld.setText(Double.toString(person.getAccountInfo().getAcctBal()));
        acctBalFld.setEnabled(false);
        acctTypFld.setText(person.getAccountInfo().getAcctTyp());
        acctTypFld.setEnabled(false);

        //Driving License Info
        dlNumFld.setText(person.getDriverLicenseInfo().getLicenseNum());
        dlNumFld.setEnabled(false);
        dtIssuedFld.setText(person.getDriverLicenseInfo().getDateIssued());
        dtIssuedFld.setEnabled(false);
        dtExpiryFld.setText(person.getDriverLicenseInfo().getDateExpiry());
        dtExpiryFld.setEnabled(false);
        bloodTypFld.setText(person.getDriverLicenseInfo().getBloodTyp());
        bloodTypFld.setEnabled(false);

        //Medical Records
        rcrdNumFld.setText(person.getMedicalRecord().getRecordNum());
        rcrdNumFld.setEnabled(false);
        alergy1Fld.setText(person.getMedicalRecord().getAlergy1());
        alergy1Fld.setEnabled(false);
        alergy2Fld.setText(person.getMedicalRecord().getAlergy2());
        alergy2Fld.setEnabled(false);
        alergy3Fld.setText(person.getMedicalRecord().getAlergy3());
        alergy3Fld.setEnabled(false);

        //For Displaying Image
        String fileName = person.getDriverLicenseInfo().getImagePathOnDisc();

        try {
            ImageIcon ii = new ImageIcon(scaleImage(120, 120, ImageIO.read(new File(fileName))));//get the image from file chooser and fit it to match Label size
            imageUploadSpaceLbl.setIcon(ii);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    //Method to scale the image and fit it in a prefixed size so that it looks good on the Interface
    public static BufferedImage scaleImage(int w, int h, BufferedImage img) throws Exception {
        BufferedImage bi;
        bi = new BufferedImage(w, h, BufferedImage.TRANSLUCENT);
        Graphics2D g2d = (Graphics2D) bi.createGraphics();
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.addRenderingHints(new RenderingHints(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY));
        g2d.drawImage(img, 0, 0, w, h, null);
        g2d.dispose();
        return bi;
    }

//    public void printComponent(Component component) {
//        PrinterJob pj = PrinterJob.getPrinterJob();
//        pj.setJobName(" Print Component ");
//
//        pj.setPrintable(new Printable() {
//            public int print(Graphics pg, PageFormat pf, int pageNum) {
//                if (pageNum > 0) {
//                    return Printable.NO_SUCH_PAGE;
//                }
//
//                Graphics2D g2 = (Graphics2D) pg;
//                g2.translate(pf.getImageableX(), pf.getImageableY());
//                component.paint(g2);
//                return Printable.PAGE_EXISTS;
//            }
//        });
//        if (pj.printDialog() == false) {
//            return;
//        }
//
//        try {
//            pj.print();
//        } catch (PrinterException ex) {
//            System.out.println("Something went wrong while printing. Please check.");
//        }
//    }
//    public ViewRGPanel(ReportGeneration reportGeneration) {
//        initComponents();
//        this.reportGeneration = reportGeneration;
//    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        fnTxtFLd = new javax.swing.JTextField();
        lnTxtFLd = new javax.swing.JTextField();
        pnTxtFLd = new javax.swing.JTextField();
        dobTxtFLd = new javax.swing.JTextField();
        ageTxtFLd = new javax.swing.JTextField();
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
        hghtTxtFLd = new javax.swing.JTextField();
        addrLn1Fld = new javax.swing.JTextField();
        addrLn2Fld = new javax.swing.JTextField();
        cityFld = new javax.swing.JTextField();
        zipcodeFld = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        stateFld = new javax.swing.JTextField();
        routingNmFld = new javax.swing.JTextField();
        bankNmFld = new javax.swing.JTextField();
        acctNmFld = new javax.swing.JTextField();
        acctBalFld = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        acctTypFld = new javax.swing.JTextField();
        dlNumFld = new javax.swing.JTextField();
        dtIssuedFld = new javax.swing.JTextField();
        dtExpiryFld = new javax.swing.JTextField();
        bloodTypFld = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        rcrdNumFld = new javax.swing.JTextField();
        alergy1Fld = new javax.swing.JTextField();
        alergy2Fld = new javax.swing.JTextField();
        alergy3Fld = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        imageUploadSpaceLbl = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 255));
        setPreferredSize(new java.awt.Dimension(855, 1171));
        setSize(new java.awt.Dimension(855, 1171));

        jScrollPane1.setBackground(new java.awt.Color(204, 255, 255));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(855, 1171));
        jScrollPane1.setSize(new java.awt.Dimension(855, 1171));

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(855, 1171));
        jPanel1.setSize(new java.awt.Dimension(855, 1171));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(fnTxtFLd, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 72, 200, -1));

        lnTxtFLd.setPreferredSize(new java.awt.Dimension(10, 200));
        lnTxtFLd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnTxtFLdActionPerformed(evt);
            }
        });
        jPanel1.add(lnTxtFLd, new org.netbeans.lib.awtextra.AbsoluteConstraints(557, 73, 212, 24));
        jPanel1.add(pnTxtFLd, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 200, -1));
        jPanel1.add(dobTxtFLd, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 154, 200, -1));
        jPanel1.add(ageTxtFLd, new org.netbeans.lib.awtextra.AbsoluteConstraints(557, 110, 40, -1));
        jPanel1.add(ssnTxtFLd, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 198, 200, -1));
        jPanel1.add(wghtTxtFLd, new org.netbeans.lib.awtextra.AbsoluteConstraints(557, 198, 200, -1));

        jLabel1.setText("First Name");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 77, 97, -1));

        jLabel2.setText("Last Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 77, 97, -1));

        jLabel3.setText("Phone Number");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 115, 97, -1));

        jLabel4.setText("Date of Birth");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 159, 97, -1));

        jLabel5.setText("SSN");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 203, 97, -1));

        jLabel6.setText("Age");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(436, 115, 97, -1));

        jLabel7.setText("Height");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(436, 159, 97, -1));

        jLabel8.setText("Weight");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(436, 198, 97, -1));
        jPanel1.add(hghtTxtFLd, new org.netbeans.lib.awtextra.AbsoluteConstraints(557, 154, 200, -1));
        jPanel1.add(addrLn1Fld, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 270, 202, -1));
        jPanel1.add(addrLn2Fld, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 314, 202, -1));
        jPanel1.add(cityFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 358, 202, -1));
        jPanel1.add(zipcodeFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 402, 202, -1));

        jLabel9.setText("Address Line 1");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 275, -1, -1));

        jLabel10.setText("Address Line 2");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 314, -1, -1));

        jLabel11.setText("City");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 358, -1, -1));

        jLabel12.setText("Zip Code");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 407, -1, -1));

        jLabel13.setText("State");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 451, -1, -1));
        jPanel1.add(stateFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 446, 202, -1));
        jPanel1.add(routingNmFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 588, 201, -1));
        jPanel1.add(bankNmFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 534, 201, -1));
        jPanel1.add(acctNmFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 637, 201, -1));
        jPanel1.add(acctBalFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(578, 578, 182, 47));

        jLabel14.setText("Bank Name");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 539, -1, -1));

        jLabel15.setText("Routing Number");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 593, -1, -1));

        jLabel16.setText("Account Number");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 642, -1, -1));

        jLabel17.setText("Account Type");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(436, 539, -1, -1));

        jLabel18.setText("Account Balance");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(436, 593, -1, -1));
        jPanel1.add(acctTypFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(568, 534, 201, -1));

        dlNumFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dlNumFldActionPerformed(evt);
            }
        });
        jPanel1.add(dlNumFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 715, 200, -1));

        dtIssuedFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dtIssuedFldActionPerformed(evt);
            }
        });
        jPanel1.add(dtIssuedFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 759, 200, -1));

        dtExpiryFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dtExpiryFldActionPerformed(evt);
            }
        });
        jPanel1.add(dtExpiryFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 803, 200, -1));

        bloodTypFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloodTypFldActionPerformed(evt);
            }
        });
        jPanel1.add(bloodTypFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 847, 200, -1));
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 715, -1, -1));

        jLabel20.setText("Date of Issue");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 764, -1, -1));

        jLabel21.setText("Date of Expiry");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 808, -1, -1));

        jLabel22.setText("Blood Type");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 852, -1, -1));
        jPanel1.add(rcrdNumFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 932, 200, -1));
        jPanel1.add(alergy1Fld, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 976, 399, -1));
        jPanel1.add(alergy2Fld, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 1020, 399, -1));
        jPanel1.add(alergy3Fld, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 1064, 399, -1));

        jLabel23.setText("Record Number");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 937, -1, -1));

        jLabel24.setText("Alergy 1");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 981, -1, -1));

        jLabel25.setText("Alergy 2");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 1025, -1, -1));

        jLabel26.setText("Alergy 3");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 1069, -1, -1));

        jLabel27.setFont(new java.awt.Font("Lucida Grande", 1, 20)); // NOI18N
        jLabel27.setText("Personal Information ");
        jLabel27.setAutoscrolls(true);
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 0, -1, 32));

        jLabel28.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel28.setText("Demographic Information");
        jLabel28.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 38, -1, -1));

        jLabel29.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel29.setText("Address Information");
        jLabel29.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, -1));

        jLabel30.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel30.setText("Account Information");
        jLabel30.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 500, -1, -1));

        jLabel31.setText("License No");
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 720, -1, -1));

        jLabel32.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel32.setText("Driving License Information");
        jLabel32.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 681, -1, -1));

        jLabel33.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel33.setText("Medical Records");
        jLabel33.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 892, -1, -1));

        imageUploadSpaceLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(imageUploadSpaceLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 740, 120, 120));

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1159, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void dlNumFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dlNumFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dlNumFldActionPerformed

    private void dtIssuedFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dtIssuedFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dtIssuedFldActionPerformed

    private void dtExpiryFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dtExpiryFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dtExpiryFldActionPerformed

    private void bloodTypFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bloodTypFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bloodTypFldActionPerformed

    private void lnTxtFLdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnTxtFLdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnTxtFLdActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField acctBalFld;
    private javax.swing.JTextField acctNmFld;
    private javax.swing.JTextField acctTypFld;
    private javax.swing.JTextField addrLn1Fld;
    private javax.swing.JTextField addrLn2Fld;
    private javax.swing.JTextField ageTxtFLd;
    private javax.swing.JTextField alergy1Fld;
    private javax.swing.JTextField alergy2Fld;
    private javax.swing.JTextField alergy3Fld;
    private javax.swing.JTextField bankNmFld;
    private javax.swing.JTextField bloodTypFld;
    private javax.swing.JTextField cityFld;
    private javax.swing.JTextField dlNumFld;
    private javax.swing.JTextField dobTxtFLd;
    private javax.swing.JTextField dtExpiryFld;
    private javax.swing.JTextField dtIssuedFld;
    private javax.swing.JTextField fnTxtFLd;
    private javax.swing.JTextField hghtTxtFLd;
    private javax.swing.JLabel imageUploadSpaceLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lnTxtFLd;
    private javax.swing.JTextField pnTxtFLd;
    private javax.swing.JTextField rcrdNumFld;
    private javax.swing.JTextField routingNmFld;
    private javax.swing.JTextField ssnTxtFLd;
    private javax.swing.JTextField stateFld;
    private javax.swing.JTextField wghtTxtFLd;
    private javax.swing.JTextField zipcodeFld;
    // End of variables declaration//GEN-END:variables
}
