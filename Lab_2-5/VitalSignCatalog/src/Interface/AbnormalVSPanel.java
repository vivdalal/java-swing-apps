/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.VitalSignHistory;
import Business.VitalSigns;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vivekdalal
 */
public class AbnormalVSPanel extends javax.swing.JPanel {

    private VitalSignHistory vitalSignHistory;
    private double maxBP;
    private double minBP;

    /**
     * Creates new form ViewPanel
     */
    AbnormalVSPanel(VitalSignHistory vitalSignHistory, double maxBP, double minBP) {
        initComponents();
        this.vitalSignHistory = vitalSignHistory;
        this.maxBP = maxBP;
        this.minBP = minBP;
        populateTable();
    }

    public void populateTable() {
        DefaultTableModel defaultTableModel = (DefaultTableModel) tblVS.getModel();
        defaultTableModel.setRowCount(0);

        for (VitalSigns vs : vitalSignHistory.getAbnormalVSList(maxBP, minBP)) {

            Object[] row = new Object[2];
            row[0] = vs;
            row[1] = vs.getBloodPressure();
            defaultTableModel.addRow(row);

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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVS = new javax.swing.JTable();
        viewDtlsBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        dateTxtFld = new javax.swing.JTextField();
        tempTxtFld = new javax.swing.JTextField();
        bloodPressureTxtFld = new javax.swing.JTextField();
        pulseTxtFld = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 204));

        jLabel1.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel1.setText("View Vital Signs");

        tblVS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Blood Pressure"
            }
        ));
        jScrollPane1.setViewportView(tblVS);

        viewDtlsBtn.setText("View Details");
        viewDtlsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDtlsBtnActionPerformed(evt);
            }
        });

        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        jLabel2.setText("Date");

        jLabel3.setText("Temperature");

        jLabel4.setText("Blood Pressure");

        jLabel5.setText("Pulse");

        dateTxtFld.setEnabled(false);

        tempTxtFld.setEnabled(false);

        bloodPressureTxtFld.setEnabled(false);

        pulseTxtFld.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(169, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(91, 91, 91)
                            .addComponent(tempTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(78, 78, 78)
                            .addComponent(bloodPressureTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(137, 137, 137)
                            .addComponent(pulseTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(141, 141, 141)
                            .addComponent(dateTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(viewDtlsBtn)
                        .addGap(18, 18, 18)
                        .addComponent(deleteBtn)))
                .addGap(194, 194, 194))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewDtlsBtn)
                    .addComponent(deleteBtn))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(tempTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(bloodPressureTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(pulseTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(dateTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(126, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewDtlsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDtlsBtnActionPerformed
        // View Details button action code goes here
        int selectedRow = tblVS.getSelectedRow();
        if (selectedRow >= 0) {

            VitalSigns vitalSigns = (VitalSigns) tblVS.getValueAt(selectedRow, 0);
            tempTxtFld.setText(String.valueOf(vitalSigns.getTemperature()));
            bloodPressureTxtFld.setText(String.valueOf(vitalSigns.getBloodPressure()));
            pulseTxtFld.setText(String.valueOf(vitalSigns.getPulse()));
            dateTxtFld.setText(vitalSigns.getDate());

        } else {
            JOptionPane.showMessageDialog(null, "Please select any row.");
        }
    }//GEN-LAST:event_viewDtlsBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed

        // View Details button action code goes here
        int selectedRow = tblVS.getSelectedRow();
        if (selectedRow >= 0) {
            int dialogRes = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete the selected Vital Sign");
            if (dialogRes == JOptionPane.YES_OPTION) {
                VitalSigns vitalSigns = (VitalSigns) tblVS.getValueAt(selectedRow, 0);
                vitalSignHistory.deleteVitalSign(vitalSigns);
                JOptionPane.showMessageDialog(null, "Vital sign successfully deleted.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select any row.");
        }

        populateTable();
    }//GEN-LAST:event_deleteBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bloodPressureTxtFld;
    private javax.swing.JTextField dateTxtFld;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField pulseTxtFld;
    private javax.swing.JTable tblVS;
    private javax.swing.JTextField tempTxtFld;
    private javax.swing.JButton viewDtlsBtn;
    // End of variables declaration//GEN-END:variables
}