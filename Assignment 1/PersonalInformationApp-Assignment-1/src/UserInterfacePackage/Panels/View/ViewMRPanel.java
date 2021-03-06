/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterfacePackage.Panels.View;

import BusinessPackage.MedicalRecord;

/**
 *
 * @author vivekdalal
 */
public class ViewMRPanel extends javax.swing.JPanel {

    private MedicalRecord medicalRecord;

    /**
     * Creates new form ViewMRPanel
     */
    public ViewMRPanel() {
        initComponents();

        updateView();
    }

    public ViewMRPanel(MedicalRecord medicalRecord) {
        initComponents();
        this.medicalRecord = medicalRecord;
    }

    private void updateView() {
        rcrdNumFld.setText(medicalRecord.getRecordNum());
        rcrdNumFld.setEditable(false);
        alergy1Fld.setText(medicalRecord.getAlergy1());
        rcrdNumFld.setEditable(false);
        alergy2Fld.setText(medicalRecord.getAlergy2());
        rcrdNumFld.setEditable(false);
        alergy3Fld.setText(medicalRecord.getAlergy3());
        rcrdNumFld.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rcrdNumFld = new javax.swing.JTextField();
        alergy1Fld = new javax.swing.JTextField();
        alergy2Fld = new javax.swing.JTextField();
        alergy3Fld = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jLabel1.setText("Record Number");

        jLabel2.setText("Alergy 1");

        jLabel3.setText("Alergy 2");

        jLabel4.setText("Alergy 3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 742, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(alergy1Fld)
                        .addComponent(rcrdNumFld, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(alergy2Fld)
                        .addComponent(alergy3Fld, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE))
                    .addContainerGap(222, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 478, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(71, 71, 71)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rcrdNumFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(alergy1Fld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(alergy2Fld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(alergy3Fld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addContainerGap(249, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alergy1Fld;
    private javax.swing.JTextField alergy2Fld;
    private javax.swing.JTextField alergy3Fld;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField rcrdNumFld;
    // End of variables declaration//GEN-END:variables
}
