/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homemanagementsystem.HomeRegistration;

import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory.Default;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author boker
 */
public class Home_Homepage extends javax.swing.JFrame {

    /**
     * Creates new form Home_Homepage
     */
    public Home_Homepage() {
        initComponents();
       //Show_Items_jTableItem();
          System.out.println("hell");
        
    }
    public static Connection getConnection(){
        Connection con=null;
        try {
            con=DriverManager.getConnection("jdbc:mysql://localhost/homemanagement","root", "");;
           // JOptionPane.showMessageDialog(null,"conneted to database");
        }
        
        catch (Exception ex ){
            JOptionPane.showMessageDialog(null,ex);
        }
                
        return con;
    }
    
    public   boolean checkInput(){
      if(txtitemname.getText()==null
          ||cbcategory.getSelectedItem()==null
          ||txtitemdescription.getText()==null
            ||txtitemprice.getText()==null){
          
         return false; 
      }
      else{
          try{
              Float.parseFloat(txtitemprice.getText());
              return true;
              
          }catch(Exception  ex){
              
            return false;  
          }
          
      }
      
          
    }
  
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jPasswordField1 = new javax.swing.JPasswordField();
        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("homemanagement?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        homeRegistrationQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT h FROM HomeRegistration h");
        homeRegistrationList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : homeRegistrationQuery.getResultList();
        homeItemQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT h FROM HomeItem h");
        homeItemList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : homeItemQuery.getResultList();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableItem = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbcategory = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtitemname = new javax.swing.JTextField();
        txtitemprice = new javax.swing.JTextField();
        txtitemdescription = new javax.swing.JTextField();
        jButtonAdd = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jButtonExit = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtitemid = new javax.swing.JTextField();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 51));

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText(" Welcome to Home Management System");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, homeItemList, jTableItem);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${id}"));
        columnBinding.setColumnName("Id");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${itemname}"));
        columnBinding.setColumnName("Itemname");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${itemcategory}"));
        columnBinding.setColumnName("Itemcategory");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${itemdescription}"));
        columnBinding.setColumnName("Itemdescription");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${itemprice}"));
        columnBinding.setColumnName("Itemprice");
        columnBinding.setColumnClass(Integer.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jButtonAdd, org.jdesktop.beansbinding.ELProperty.create("${}"), jTableItem, org.jdesktop.beansbinding.BeanProperty.create("selectedElement"));
        bindingGroup.addBinding(binding);

        jTableItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableItemMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableItem);

        jLabel2.setText("Category");

        jLabel4.setText("Item Price");

        jLabel5.setText("Item Description");

        cbcategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel3.setText("Item Name");

        jButtonAdd.setText("Add");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        jButtonUpdate.setText("Update");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });

        jButtonDelete.setText("Delete");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        jButtonExit.setText("Exit");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });

        jLabel6.setText("Item ID");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(jButtonAdd))
                                    .addComponent(jLabel4))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jButtonUpdate)
                                        .addGap(35, 35, 35)
                                        .addComponent(jButtonDelete))
                                    .addComponent(txtitemprice, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbcategory, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtitemdescription, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtitemid, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtitemname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)))))
                        .addGap(38, 38, 38)
                        .addComponent(jButtonExit)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtitemid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtitemname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbcategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtitemdescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtitemprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonUpdate)
                    .addComponent(jButtonAdd)
                    .addComponent(jButtonDelete)
                    .addComponent(jButtonExit))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model=(DefaultTableModel)jTableItem.getModel();
         if(!txtitemname.getText().trim().equals("")){
           model.addRow(new Object[]{ txtitemid.getText(),txtitemname.getText(),cbcategory.getSelectedItem().toString(),txtitemdescription.getText(),txtitemprice.getText()});  
         } else {
            JOptionPane.showMessageDialog(null, "required");

         }
           //txtitemid.getText()
             if (checkInput()){
         try{
                  PreparedStatement ps=null;
                  String query =null;
                  query=" INSERT INTO `home_item`( `itemname`, `itemcategory`, `itemdescription`, `itemprice`) VALUES (?,?,?,?)";
                  Connection  con= Home_Homepage.getConnection();
                  ps=con.prepareStatement(query);
                  //ps.setString(1, txtitemid.getText().toString());
                  
                  ps.setString(1, txtitemname.getText());
                  ps.setString(2, cbcategory.getSelectedItem().toString());
                  ps.setString(3,txtitemdescription.getText());
                  ps.setString(4, txtitemprice.getText());
                  ps.executeUpdate(); 
                  Show_Items_jTableItem();
                    
                  JOptionPane.showMessageDialog(null, "connected");
                  System.out.println(txtitemname.getText()+""+cbcategory.getSelectedItem().toString()+""+txtitemdescription.getText()+txtitemprice.getText() );
                 
             }catch (Exception ex){
                  JOptionPane.showMessageDialog(null, ex.getMessage());
                  ex.printStackTrace();
                 
             }
             }else{
                 JOptionPane.showMessageDialog(null, "field are required");
             }
                 
             
        
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model=(DefaultTableModel)jTableItem.getModel();
        int row=jTableItem.getSelectedRow();
         if (row==-1){
             JOptionPane.showMessageDialog(null, "cant happen");
         }else{
             
             //model.setValueAt(txtitemid.getText(), 0);
             model.setValueAt(txtitemname.getText(),row,1);
             model.setValueAt(cbcategory.getSelectedItem(),row,2);
             model.setValueAt(txtitemdescription.getText(),row,3);
             model.setValueAt(txtitemprice.getText(),row,4);
             
             if(checkInput()){
                 
              try{
                  PreparedStatement ps=null;
                  String Updatequery =null;
                  Updatequery=" UPDATE `home_item` SET `itemname`=?,`itemcategory`=?,`itemdescription`=?,`itemprice`=? WHERE `id`=?";
                Connection  con= Home_Homepage.getConnection();
                  ps=con.prepareStatement(Updatequery);
                  ps.setString(1, txtitemname.getText());
                  ps.setString(2, cbcategory.getSelectedItem().toString());
                  ps.setString(3,txtitemdescription.getText());
                  ps.setString(4, txtitemprice.getText());
                  ps.setInt(5, Integer.parseInt( txtitemid.getText()));
                  ps.executeUpdate();
                 
                  Show_Items_jTableItem();
                  
                  JOptionPane.showMessageDialog(null, "update");
                 
             }catch (Exception ex){
                  JOptionPane.showMessageDialog(null, ex.getMessage());
                  ex.printStackTrace();
                 
             }
             
             }else{
                  JOptionPane.showMessageDialog(null, "one more field is empty");
             }
             
            
             
             
         }
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model=(DefaultTableModel)jTableItem.getModel();
        int row=jTableItem.getSelectedRow();
         if (row==-1){
             JOptionPane.showMessageDialog(null, "select row to delete");
         }else{
             
             int status= JOptionPane.showConfirmDialog(null, "are your sure");
             if(status==JOptionPane.YES_OPTION){
               model.removeRow(row);   
             }
          
              try{
                  
                  Connection con=Home_Homepage.getConnection();
                  PreparedStatement pst=con.prepareStatement("DELETE FROM `home_item` WHERE `id`=?");
                  int id=Integer.parseInt( txtitemid.getText());
                  pst.setInt(1, id);
                   
                  pst.executeUpdate();
                  JOptionPane.showMessageDialog(null, "row deleted");
                  
              }catch(Exception ex) {
                   JOptionPane.showMessageDialog(null, ex.getMessage());
                  
              }
             
             
         }
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        
        // TODO add your handling code here:
        
        
        System.exit(0);
        
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jTableItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableItemMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableItemMouseClicked
    
           public ArrayList<Items> getItemList(){
               
               ArrayList<Items>ItemList=new  ArrayList<Items>();
               Connection con=Home_Homepage.getConnection();
               String query="SELECT * FROM home_item  ";
               Statement st;
               ResultSet rs;
                  Items items = null;
               try{
                    st=con.createStatement();
                    rs=st.executeQuery(query);
                 
                    while(rs.next()){
                      
                        items=new  Items(rs.getInt("id"),rs.getString("itemname"),rs.getString("itemcategory"),rs.getString("itemdescription"),rs.getInt("itemprice")); 
                    }
                    ItemList.add(items);
                        System.out.println(items); 
               
                   }catch(Exception ex){
                       ex.printStackTrace();
                   }
                  
                return ItemList;
           }
           public void Show_Items_jTableItem(){
               
               ArrayList<Items> list= getItemList();
               System.out.println("list"+list.size());
             DefaultTableModel model=(DefaultTableModel)jTableItem.getModel();
             Object[]row= new Object[5];
             for(int i=0; i<list.size(); i++ ){
                 row[0]=list.get(i).getId();
                 row[1]=list.get(i).getName();
                 System.out.println("print row"+row[0].toString());
             System.out.println("print row"+row[1].toString());
                 row[2]=list.get(i).getCategory();
                 row[3]=list.get(i).getDescription();
                 row[4]=list.get(i).getitemPrice();
                 model.addRow(row);
             }
             
           }
          
    
              public static void main(String args[]) {
        
           java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              new Home_Homepage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbcategory;
    private javax.persistence.EntityManager entityManager;
    private java.util.List<homemanagementsystem.HomeRegistration.HomeItem> homeItemList;
    private javax.persistence.Query homeItemQuery;
    private java.util.List<homemanagementsystem.HomeRegistration.HomeRegistration> homeRegistrationList;
    private javax.persistence.Query homeRegistrationQuery;
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableItem;
    private javax.swing.JTextField txtitemdescription;
    private javax.swing.JTextField txtitemid;
    private javax.swing.JTextField txtitemname;
    private javax.swing.JTextField txtitemprice;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
