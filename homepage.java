/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homemanagementsystem.HomeRegistration;

import java.awt.print.PrinterException;
import java.sql.Connection;
import net.proteanit.sql.DbUtils;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


/**
 *
 * @author boker
 */
public class homepage extends javax.swing.JFrame {

    /**
     * Creates new form homepage
     */
    public homepage() {
        
       
        initComponents();
        ShowTableItem();
        
         jsum.setText(Integer.toString(getSum()));
        
    }
    
    public int getSum(){
        int rowcount=jTableitem.getRowCount();
        int sum=0;
        for(int i=0; i<rowcount; i++){ 
            sum=sum+Integer.parseInt(jTableitem.getValueAt(i, 4).toString());
        }
        return sum;
        
    }
    public static Connection getConnection(){
        Connection con=null;
        try {
            con=DriverManager.getConnection("jdbc:mysql://localhost/homemanagement","root", "");
           System.out.println("connected");
                    }
        
        catch (SQLException ex ){
            JOptionPane.showMessageDialog(null,ex);
        }
                
        return con;
    }
    
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtitemid = new javax.swing.JTextField();
        txtitemname = new javax.swing.JTextField();
        cbcategory = new javax.swing.JComboBox<>();
        txtitemdescription = new javax.swing.JTextField();
        txtitemprice = new javax.swing.JTextField();
        jadd = new javax.swing.JButton();
        jupdate = new javax.swing.JButton();
        jdelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableitem = new javax.swing.JTable();
        jButtotExit = new javax.swing.JButton();
        jButtonview = new javax.swing.JButton();
        jButtonrecord = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtsearch = new javax.swing.JTextField();
        jprint = new javax.swing.JButton();
        jsum = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        additem = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        selecteditem = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 0));

        jPanel2.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Item ID:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Item Name:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Item Category:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Item  Description:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Item  Price:");

        txtitemid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtitemidActionPerformed(evt);
            }
        });

        cbcategory.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbcategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kitchen Item", "Bedroom Item", "Washroom Item", "Sittingroom Item" }));
        cbcategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbcategoryActionPerformed(evt);
            }
        });

        txtitemprice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtitempriceKeyTyped(evt);
            }
        });

        jadd.setText("Add");
        jadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jaddActionPerformed(evt);
            }
        });

        jupdate.setText("Update");
        jupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jupdateActionPerformed(evt);
            }
        });

        jdelete.setText("delete");
        jdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jdeleteActionPerformed(evt);
            }
        });

        jTableitem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item ID", "Item Name", "Item Category", "Item Description", "Item Price"
            }
        ));
        jTableitem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableitemMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTableitemMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(jTableitem);

        jButtotExit.setText("Exit");
        jButtotExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtotExitMouseClicked(evt);
            }
        });
        jButtotExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtotExitActionPerformed(evt);
            }
        });

        jButtonview.setText("record");
        jButtonview.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonviewMouseClicked(evt);
            }
        });
        jButtonview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonviewActionPerformed(evt);
            }
        });

        jButtonrecord.setText("view");
        jButtonrecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonrecordActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("enter value to search");

        txtsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsearchKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtsearchKeyTyped(evt);
            }
        });

        jprint.setText("print");
        jprint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jprintActionPerformed(evt);
            }
        });

        jLabel7.setText("sum");

        jLabel8.setText("Add Item ");

        additem.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        additem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                additemActionPerformed(evt);
            }
        });

        jButton2.setText("Add");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jadd, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jdelete, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonrecord, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtotExit, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtitemdescription, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtitemname, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtitemid, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtitemprice, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(selecteditem)
                                            .addComponent(cbcategory, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(40, 40, 40)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(additem, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton2)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jButtonview, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(353, 353, 353)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jsum, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(24, 24, 24)
                                .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(108, 108, 108)
                                .addComponent(jprint))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtitemid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtitemname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbcategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(additem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(selecteditem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtitemdescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtitemprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jsum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jupdate)
                    .addComponent(jadd)
                    .addComponent(jdelete)
                    .addComponent(jButtonrecord)
                    .addComponent(jButtotExit)
                    .addComponent(jButtonview))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jprint))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
      public   boolean checkInput(){
      if(txtitemname.getText()==null
          ||cbcategory.getSelectedItem()==null
          ||txtitemdescription.getText()==null
            ||txtitemprice.getText()==null){
          
         return false; 
      }
      else{
          try{
              Integer.parseInt(txtitemprice.getText());
              return true;
              
          }catch(NumberFormatException  ex){
              
            return false;  
          }
          
      }}
    private void jaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jaddActionPerformed
        
        try {
            Connection con=getConnection();
            String query=" INSERT INTO `home_item`( `itemname`, `itemcategory`, `itemdescription`, `itemprice`) VALUES (?,?,?,?)";
            PreparedStatement ps=con.prepareStatement(query);
           
                  ps.setString(1, txtitemname.getText());
                  ps.setString(2, cbcategory.getSelectedItem().toString());
                  ps.setString(3,txtitemdescription.getText());
                 // ps.setString(4, txtitemprice.getText());
                  ps.setInt(4, Integer.parseInt(txtitemprice .getText()));
                  ps.executeUpdate();
                  //ShowTableItem();
                  System.out.println("inserted");
            
        } catch (SQLException ex) {
            Logger.getLogger(homepage.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }//GEN-LAST:event_jaddActionPerformed

    private void jupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jupdateActionPerformed
        try {
            // TODO add your handling code here:
            Connection con=getConnection();
            int row=jTableitem.getSelectedRow();
            String value=(jTableitem.getModel().getValueAt(row, 0).toString());
                   // value=(jTableitem.getModel().getValueAt(row, 1).toString());
            
            String updatequery=" UPDATE `home_item` SET `itemname`=?,`itemcategory`=?,`itemdescription`=?,`itemprice`=? WHERE `id`="+value;
            PreparedStatement ps=con.prepareStatement(updatequery);
                  ps.setString(1, txtitemname.getText());
                  ps.setString(2, cbcategory.getSelectedItem().toString());
                  ps.setString(3,txtitemdescription.getText());
                  ps.setString(4, txtitemprice.getText());
                 // ps.setInt(5, Integer.parseInt( txtitemid.getText()));
                  ps.executeUpdate(); 
                  DefaultTableModel mod=(DefaultTableModel)jTableitem.getModel();
                  
                  mod.setRowCount(0);
                  ShowTableItem();
                  JOptionPane.showMessageDialog(null, "updated sucessfully ");
                 
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            Logger.getLogger(homepage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
        
    }//GEN-LAST:event_jupdateActionPerformed
 
    private void jdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jdeleteActionPerformed
        try {
            Connection con=getConnection();
            PreparedStatement pst=con.prepareStatement("DELETE FROM `home_item` WHERE `id`=?");
            int id=Integer.parseInt( txtitemid.getText());
            pst.setInt(1, id);
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "row deleted");
        } catch (SQLException ex) {
            Logger.getLogger(homepage.class.getName()).log(Level.SEVERE, null, ex);
             JOptionPane.showMessageDialog(null, ex.getMessage());
        }
   
    }//GEN-LAST:event_jdeleteActionPerformed

    private void jButtotExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtotExitMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButtotExitMouseClicked

    private void jButtotExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtotExitActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButtotExitActionPerformed

    private void jButtonviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonviewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonviewActionPerformed

    private void jButtonviewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonviewMouseClicked
        homedemo home=new homedemo();
        home.setVisible(true);
        home.pack();
        home.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButtonviewMouseClicked

    private void jButtonrecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonrecordActionPerformed
        try {
            // TODO add your handling code here:
            
            Connection con=getConnection();
            String query=" SELECT *  FROM home_item";
            PreparedStatement ps=con.prepareStatement(query);
            ResultSet  rs=null;
            rs=ps.executeQuery(query);
            jTableitem.setModel(DbUtils.resultSetToTableModel(rs));
            jTableitem.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        } catch (SQLException ex) {
            Logger.getLogger(homepage.class.getName()).log(Level.SEVERE, null, ex);
        }
                    
    }//GEN-LAST:event_jButtonrecordActionPerformed

    private void jTableitemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableitemMouseClicked
        // TODO add your handling code here:
         int rowIndex= jTableitem.getSelectedRow();
        DefaultTableModel mode=(DefaultTableModel)jTableitem.getModel();
        txtitemid.setText(mode.getValueAt(rowIndex, 0).toString());
        txtitemname.setText(mode.getValueAt(rowIndex, 1).toString());
        cbcategory.setSelectedItem(mode.getValueAt(rowIndex, 2).toString());
        txtitemdescription.setText(mode.getValueAt(rowIndex, 3).toString());
        txtitemprice.setText(mode.getValueAt(rowIndex, 4).toString());
        
        
    }//GEN-LAST:event_jTableitemMouseClicked

    private void jTableitemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableitemMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableitemMouseEntered

    private void txtitemidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtitemidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtitemidActionPerformed

    private void txtsearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsearchKeyTyped
        // TODO add your handling code here:
        //homepage home=new homepage();
        //home.fill(jTableitem, txtsearch.getText());
       
        
    }//GEN-LAST:event_txtsearchKeyTyped

    private void txtitempriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtitempriceKeyTyped
        // TODO add your handling code here
        
        
    }//GEN-LAST:event_txtitempriceKeyTyped

    private void txtsearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsearchKeyReleased
        // TODO add your handling code here:
        DefaultTableModel  table=(DefaultTableModel)jTableitem.getModel();
        String search=txtsearch.getText().toLowerCase();
        TableRowSorter<DefaultTableModel>tr=new  TableRowSorter<DefaultTableModel>(table);
        jTableitem.setRowSorter(tr);
        
        tr.setRowFilter(RowFilter.regexFilter(search));
        
    }//GEN-LAST:event_txtsearchKeyReleased

    private void jprintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jprintActionPerformed
        try {
            boolean print=jTableitem.print();
            if(!print){
                JOptionPane.showMessageDialog(null, "unable to prin!!");
                
            }
                
            
        } catch (PrinterException ex) {
             JOptionPane.showMessageDialog(null, ex.getMessage());
             ex.printStackTrace();
            Logger.getLogger(homepage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jprintActionPerformed

    private void additemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_additemActionPerformed
        // TODO add your handling code here:
      
        
    }//GEN-LAST:event_additemActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         String addValue=additem.getText();
       cbcategory.addItem(addValue);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cbcategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbcategoryActionPerformed
          String selectValue =cbcategory.getSelectedItem().toString();
          selecteditem.setText(selectValue);
    }//GEN-LAST:event_cbcategoryActionPerformed

      public ArrayList<Item> getItemList(){
               
               ArrayList<Item>ItemList=new  ArrayList<>();
               Connection con=getConnection();
               String query= "SELECT * FROM home_item ";
               Statement st;
               ResultSet rs;
                   Item items =null;
               try{
                    st=con.createStatement();
                    rs=st.executeQuery(query);
                 
                    while(rs.next()){
                      
       items=new  Item( rs.getInt("id"),rs.getString("itemname"),rs.getString("itemcategory"),rs.getString("itemdescription"),rs.getInt("itemprice")); 
                    }
                 
                    ItemList.add(items);
                     System.out.println(items); 
               
                   }catch(SQLException ex){
                       JOptionPane.showMessageDialog(null, ex);
                   }
                  
                return ItemList;
      }
                
    
     public void  ShowTableItem(){
               
                  ArrayList<Item> list= getItemList();
                  DefaultTableModel mod=(DefaultTableModel)jTableitem.getModel();
                  Object[]row= new Object[5];
                  for(int i=0; i<list.size(); i++ ){
                   row[0]=list.get(i).getId();
                  row[1]=list.get(i).getName();
                  System.out.println("print row"+row[0].toString());
                  System.out.println("print row"+row[1].toString());
                  row[2]=list.get(i).getCategory();
                  row[3]=list.get(i).getDescription();
                  row[4]=list.get(i).getItemprice();
                   mod.addRow(row);
             }
             
           }
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new homepage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField additem;
    private javax.swing.JComboBox<String> cbcategory;
    private javax.persistence.EntityManager entityManager1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonrecord;
    private javax.swing.JButton jButtonview;
    private javax.swing.JButton jButtotExit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableitem;
    private javax.swing.JButton jadd;
    private javax.swing.JButton jdelete;
    private javax.swing.JButton jprint;
    private javax.swing.JTextField jsum;
    private javax.swing.JButton jupdate;
    private java.util.List list1;
    private javax.persistence.Query query1;
    private javax.persistence.Query query2;
    private javax.persistence.Query query3;
    private javax.swing.JTextField selecteditem;
    private javax.swing.JTextField txtitemdescription;
    private javax.swing.JTextField txtitemid;
    private javax.swing.JTextField txtitemname;
    private javax.swing.JTextField txtitemprice;
    private javax.swing.JTextField txtsearch;
    // End of variables declaration//GEN-END:variables

    private void fill(JTable jTableitem, String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
