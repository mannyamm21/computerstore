/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java_project;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;

/**
 *
 * @author manyam
 */
public class Java_Project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("hello"+" ");
    }

    /**
     *
     * @author manyam
     */
    public static class Product extends javax.swing.JFrame {

        /**
         * Creates new form Product
         */
        public Product() {
            initComponents();
            Selectprod();

        }



    public void Selectprod(){
        try{
            Class.forName("java.sql.DriverManager");
            DefaultTableModel model = (DefaultTableModel)ProductTable.getModel();
            java.sql.Connection con=java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/computer_retailer","root","1234");
            java.sql.Statement stm=con.createStatement();
            String St="Select*from product_table";
            ResultSet Rs = stm.executeQuery(St);
            while (Rs.next()){
                model.addRow(new Object[]{Rs.getInt("Product_ID"),Rs.getString("Product_Name"),Rs.getString("Product_Discp"),Rs.getString("Product_Category"),Rs.getInt("Product_Qty")});
            }
        }catch(Exception e){
            e.printStackTrace();
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

            jPanel2 = new javax.swing.JPanel();
            jLabel5 = new javax.swing.JLabel();
            jTextField1 = new javax.swing.JTextField();
            jTextField2 = new javax.swing.JTextField();
            jLabel6 = new javax.swing.JLabel();
            jButton1 = new javax.swing.JButton();
            jPanel1 = new javax.swing.JPanel();
            jPanel3 = new javax.swing.JPanel();
            jLabel2 = new javax.swing.JLabel();
            jLabel1 = new javax.swing.JLabel();
            jLabel7 = new javax.swing.JLabel();
            Product_ID = new javax.swing.JTextField();
            Product_Name = new javax.swing.JTextField();
            jLabel8 = new javax.swing.JLabel();
            Product_Qty = new javax.swing.JTextField();
            Product_Discp = new javax.swing.JTextField();
            jLabel9 = new javax.swing.JLabel();
            jLabel10 = new javax.swing.JLabel();
            jLabel12 = new javax.swing.JLabel();
            Product_Category = new javax.swing.JComboBox<>();
            Edit_btn = new javax.swing.JButton();
            Add_btn = new javax.swing.JButton();
            Delete_btn = new javax.swing.JButton();
            Home_btn = new javax.swing.JButton();
            jScrollPane1 = new javax.swing.JScrollPane();
            ProductTable = new javax.swing.JTable();
            jPanel4 = new javax.swing.JPanel();
            jLabel11 = new javax.swing.JLabel();

            javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
            jPanel2.setLayout(jPanel2Layout);
            jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 100, Short.MAX_VALUE)
            );
            jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 100, Short.MAX_VALUE)
            );

            jLabel5.setBackground(new java.awt.Color(255, 255, 255));
            jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
            jLabel5.setForeground(new java.awt.Color(0, 255, 255));
            jLabel5.setText("UserID");

            jTextField1.setToolTipText("");

            jLabel6.setBackground(new java.awt.Color(255, 255, 255));
            jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
            jLabel6.setForeground(new java.awt.Color(0, 255, 255));
            jLabel6.setText("Password");

            jButton1.setBackground(new java.awt.Color(0, 255, 255));
            jButton1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
            jButton1.setText("Login");

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            setUndecorated(true);

            jPanel1.setBackground(new java.awt.Color(255, 255, 255));

            jPanel3.setBackground(new java.awt.Color(0, 255, 255));

            jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
            jLabel2.setForeground(new java.awt.Color(255, 255, 255));
            jLabel2.setText("CRSys Product Page");

            jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
            jLabel1.setForeground(new java.awt.Color(255, 255, 255));
            jLabel1.setText("X");
            jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel1MouseClicked(evt);
                }
            });

            javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
            jPanel3.setLayout(jPanel3Layout);
            jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(251, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addGap(180, 180, 180)
                    .addComponent(jLabel1)
                    .addContainerGap())
            );
            jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(19, 19, 19)
                    .addComponent(jLabel2)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(41, 41, 41))
            );

            jLabel7.setBackground(new java.awt.Color(255, 255, 255));
            jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
            jLabel7.setForeground(new java.awt.Color(0, 255, 255));
            jLabel7.setText("ProductID");

            Product_ID.setToolTipText("");

            jLabel8.setBackground(new java.awt.Color(255, 255, 255));
            jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
            jLabel8.setForeground(new java.awt.Color(0, 255, 255));
            jLabel8.setText("Name");

            Product_Qty.setToolTipText("");

            jLabel9.setBackground(new java.awt.Color(255, 255, 255));
            jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
            jLabel9.setForeground(new java.awt.Color(0, 255, 255));
            jLabel9.setText("Description");

            jLabel10.setBackground(new java.awt.Color(255, 255, 255));
            jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
            jLabel10.setForeground(new java.awt.Color(0, 255, 255));
            jLabel10.setText("Quantity");

            jLabel12.setBackground(new java.awt.Color(255, 255, 255));
            jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
            jLabel12.setForeground(new java.awt.Color(0, 255, 255));
            jLabel12.setText("Category");

            Product_Category.setBackground(new java.awt.Color(204, 204, 204));
            Product_Category.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
            Product_Category.setForeground(new java.awt.Color(0, 255, 255));
            Product_Category.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

            Edit_btn.setBackground(new java.awt.Color(0, 255, 255));
            Edit_btn.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
            Edit_btn.setText("Edit");
            Edit_btn.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    Edit_btnMouseClicked(evt);
                }
            });
            Edit_btn.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    Edit_btnActionPerformed(evt);
                }
            });

            Add_btn.setBackground(new java.awt.Color(0, 255, 255));
            Add_btn.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
            Add_btn.setText("Add");
            Add_btn.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    Add_btnMouseClicked(evt);
                }
            });
            Add_btn.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    Add_btnActionPerformed(evt);
                }
            });

            Delete_btn.setBackground(new java.awt.Color(0, 255, 255));
            Delete_btn.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
            Delete_btn.setText("Delete");
            Delete_btn.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    Delete_btnMouseClicked(evt);
                }
            });
            Delete_btn.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    Delete_btnActionPerformed(evt);
                }
            });

            Home_btn.setBackground(new java.awt.Color(0, 255, 255));
            Home_btn.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
            Home_btn.setText("Home");
            Home_btn.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    Home_btnMouseClicked(evt);
                }
            });
            Home_btn.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    Home_btnActionPerformed(evt);
                }
            });

            ProductTable.setModel(new DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                    "ProductId", "Name", "Quantity", "Description", "Category"
                }
            ));
            ProductTable.setRowHeight(25);
            ProductTable.setSelectionBackground(new java.awt.Color(0, 255, 255));
            ProductTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
            ProductTable.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    ProductTableMouseClicked(evt);
                }
            });
            jScrollPane1.setViewportView(ProductTable);

            jPanel4.setBackground(new java.awt.Color(0, 255, 255));

            javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
            jPanel4.setLayout(jPanel4Layout);
            jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 0, Short.MAX_VALUE)
            );
            jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 11, Short.MAX_VALUE)
            );

            jLabel11.setBackground(new java.awt.Color(255, 255, 255));
            jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
            jLabel11.setForeground(new java.awt.Color(0, 255, 255));
            jLabel11.setText("Products List");

            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(119, 119, 119)
                            .addComponent(Home_btn))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(21, 21, 21)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel8)
                                                .addComponent(jLabel7))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(Product_ID)
                                                .addComponent(Product_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel10)
                                                        .addComponent(jLabel9))
                                                    .addGap(81, 81, 81))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel12)
                                                    .addGap(101, 101, 101)))
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(Product_Qty)
                                                .addComponent(Product_Discp)
                                                .addComponent(Product_Category, 0, 192, Short.MAX_VALUE)))))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(35, 35, 35)
                                    .addComponent(Add_btn)
                                    .addGap(18, 18, 18)
                                    .addComponent(Edit_btn)
                                    .addGap(18, 18, 18)
                                    .addComponent(Delete_btn)))
                            .addGap(12, 12, 12)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(36, Short.MAX_VALUE))
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel11)
                    .addGap(185, 185, 185))
            );
            jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel11)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(Product_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(Product_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel10)
                                .addComponent(Product_Qty, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9)
                                .addComponent(Product_Discp, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel12)
                                .addComponent(Product_Category, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(37, 37, 37)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Edit_btn)
                                .addComponent(Delete_btn)
                                .addComponent(Add_btn)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addComponent(Home_btn)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            );

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

        private void Edit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Edit_btnActionPerformed
            // TODO add your handling code here:
        }//GEN-LAST:event_Edit_btnActionPerformed

        private void Add_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_btnActionPerformed
            // TODO add your handling code here:
        }//GEN-LAST:event_Add_btnActionPerformed

        private void Delete_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete_btnActionPerformed
            // TODO add your handling code here:
        }//GEN-LAST:event_Delete_btnActionPerformed

        private void Home_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Home_btnActionPerformed
            // TODO add your handling code here:
        }//GEN-LAST:event_Home_btnActionPerformed

        private void Add_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Add_btnMouseClicked
            try
              {
                  Class.forName("java.sql.DriverManager");
                  java.sql.Connection con=java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/computer_retailer","root","1234");
                  java.sql.Statement stm=con.createStatement();
                  int pID=Integer.parseInt(Product_ID.getText());
                  String pn = Product_Name.getText();
                  String dis = Product_Discp.getText();
                  String cat = Product_Category.getSelectedItem().toString();
                  int qty = Integer.parseInt(Product_Qty.getText());
                  String st = "insert into product_table values("+pID+",'"+pn+"','"+dis+"','"+cat+"','"+qty+"');";
                  stm.executeUpdate(st);
                  JOptionPane.showMessageDialog(this,"Data Saved");
                  con.close();
                  Selectprod();
                 }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(this,e.getMessage());
            }
        }//GEN-LAST:event_Add_btnMouseClicked

        private void Delete_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Delete_btnMouseClicked
            if(Product_ID.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "The table is empty");
            }
            else{
                try{
                    Class.forName("java.sql.DriverManager");
                    java.sql.Connection con=java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/computer_retailer","root","1234");
                    java.sql.Statement stm=con.createStatement();
                    String id = Product_ID.getText();
                    String Query = "delete from product_table where Product_ID="+id;
                    stm.executeUpdate(Query);
                    Selectprod();
                    JOptionPane.showMessageDialog(this,"Product Delected Successfully");
                }

                catch(Exception e){
                    e.printStackTrace();
                }
            }
        }//GEN-LAST:event_Delete_btnMouseClicked

        private void ProductTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductTableMouseClicked
            DefaultTableModel model = (DefaultTableModel) ProductTable.getModel();
            int Myindex = ProductTable.getSelectedRow();
            Product_ID.setText(model.getValueAt(Myindex,0).toString());
            Product_Name.setText(model.getValueAt(Myindex,1).toString());
            Product_Discp.setText(model.getValueAt(Myindex,1).toString());
            Product_Qty.setText(model.getValueAt(Myindex,1).toString());
        }//GEN-LAST:event_ProductTableMouseClicked

        private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
            System.exit(0);
        }//GEN-LAST:event_jLabel1MouseClicked

        private void Edit_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Edit_btnMouseClicked
            if(Product_ID.getText().isEmpty() || Product_Name.getText().isEmpty() || Product_Discp.getText().isEmpty() || Product_Qty.getText().isEmpty()){
                JOptionPane.showMessageDialog(this,"Missing Information");
            }
            else{
                try{
                    Class.forName("java.sql.DriverManager");
                    java.sql.Connection con=java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/computer_retailer","root","1234");
                    java.sql.Statement stm=con.createStatement();
                    String Query = "update product_table set Product_Name='"+Product_Name.getText()+"'"+",Product_Discp='"+Product_Discp.getText()+"'"+",Product_Qty='"+Product_Qty.getText()+"'"+",Product_Category='"+Product_Category.getSelectedItem().toString()+"'"+"where Product_ID="+Product_ID.getText();
                    stm.executeUpdate(Query);
                    Selectprod();
                    JOptionPane.showMessageDialog(this,"Product Updated Successfully");
                }

                catch(Exception e){
                    e.printStackTrace();
                }

            }
        }//GEN-LAST:event_Edit_btnMouseClicked

        private void Home_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Home_btnMouseClicked
            new Login().setVisible(true);
            this.dispose();
        }//GEN-LAST:event_Home_btnMouseClicked

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
                for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                    if ("Nimbus".equals(info.getName())) {
                        UIManager.setLookAndFeel(info.getClassName());
                        break;
                    }
                }
            } catch (ClassNotFoundException ex) {
                java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            //</editor-fold>

            /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new Product().setVisible(true);
                }
            });
        }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private JButton Add_btn;
        private JButton Delete_btn;
        private JButton Edit_btn;
        private JButton Home_btn;
        private JTable ProductTable;
        private JComboBox<String> Product_Category;
        private JTextField Product_Discp;
        private JTextField Product_ID;
        private JTextField Product_Name;
        private JTextField Product_Qty;
        private JButton jButton1;
        private JLabel jLabel1;
        private JLabel jLabel10;
        private JLabel jLabel11;
        private JLabel jLabel12;
        private JLabel jLabel2;
        private JLabel jLabel5;
        private JLabel jLabel6;
        private JLabel jLabel7;
        private JLabel jLabel8;
        private JLabel jLabel9;
        private JPanel jPanel1;
        private JPanel jPanel2;
        private JPanel jPanel3;
        private JPanel jPanel4;
        private JScrollPane jScrollPane1;
        private JTextField jTextField1;
        private JTextField jTextField2;
        // End of variables declaration//GEN-END:variables
    }
}
