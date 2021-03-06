/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Product;
import Business.Supplier;
import javax.swing.JOptionPane;

/**
 *
 * @author vivekdalal
 */
public class CreatePanel extends javax.swing.JPanel {

    /**
     * Creates new form CreatePanel
     */
    private Product product;

    public CreatePanel(Product product) {
        initComponents();

        //Assigning the product which has been created on the MainJFrame to the product object in the CreatePanel
        this.product = product;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        createBtn = new javax.swing.JButton();
        priceTextField = new javax.swing.JTextField();
        availNumTextField = new javax.swing.JTextField();
        descriptionTextField = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        supplierNameTxtFld = new javax.swing.JTextField();
        supplierAddrTxtFld = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(400, 500));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setText("Description:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 205, -1, -1));

        nameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextFieldActionPerformed(evt);
            }
        });
        add(nameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 68, 213, -1));

        jLabel1.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jLabel1.setText("Create Your Product");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        jLabel2.setText("Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 73, -1, -1));

        jLabel3.setText("Price:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 117, -1, -1));

        jLabel4.setText("Availabity Number:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 161, -1, -1));

        createBtn.setText("Create");
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });
        add(createBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 416, -1, -1));

        priceTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceTextFieldActionPerformed(evt);
            }
        });
        add(priceTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 112, 213, -1));

        availNumTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                availNumTextFieldActionPerformed(evt);
            }
        });
        add(availNumTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 156, 213, -1));

        descriptionTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descriptionTextFieldActionPerformed(evt);
            }
        });
        add(descriptionTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 200, 213, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 295, 408, -1));

        jLabel6.setText("Name");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 330, -1, -1));

        jLabel7.setText("Address");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 373, -1, -1));

        supplierNameTxtFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplierNameTxtFldActionPerformed(evt);
            }
        });
        add(supplierNameTxtFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 325, 217, -1));

        supplierAddrTxtFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplierAddrTxtFldActionPerformed(evt);
            }
        });
        add(supplierAddrTxtFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 368, 217, -1));

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        jLabel8.setText("Supplier Infomation");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 257, 201, 32));
    }// </editor-fold>//GEN-END:initComponents

    private void nameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextFieldActionPerformed

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        //Setting the product related information entered by User on the screen
        //Validations have not been added. So, if you open the View Panel before
        //filling in all the details on the Create Panel, it will give a NullPointerException
        //while fetching the fields for displaying.
        product.setName(nameTextField.getText());
        product.setPrice(priceTextField.getText());
        product.setAvailNum(availNumTextField.getText());
        product.setDescription(descriptionTextField.getText());
        // prompt user that product was successfully ceated

        //Setting the supplier information entered by User on the screen
        Supplier supplier = new Supplier();
        supplier.setName(supplierNameTxtFld.getText());
        supplier.setAddress(supplierAddrTxtFld.getText());
        product.setSupplier(supplier);

        //Showing Pop-up with Product created message
        JOptionPane.showMessageDialog(null, "Product successfully ceated");
    }//GEN-LAST:event_createBtnActionPerformed

    private void priceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceTextFieldActionPerformed

    private void availNumTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_availNumTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_availNumTextFieldActionPerformed

    private void descriptionTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descriptionTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descriptionTextFieldActionPerformed

    private void supplierNameTxtFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplierNameTxtFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_supplierNameTxtFldActionPerformed

    private void supplierAddrTxtFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplierAddrTxtFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_supplierAddrTxtFldActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField availNumTextField;
    private javax.swing.JButton createBtn;
    private javax.swing.JTextField descriptionTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JTextField priceTextField;
    private javax.swing.JTextField supplierAddrTxtFld;
    private javax.swing.JTextField supplierNameTxtFld;
    // End of variables declaration//GEN-END:variables
}
