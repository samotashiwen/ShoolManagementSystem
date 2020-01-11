/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapping;

import MainApp.Utility;
import dbconnect.DB_OPS;
import java.sql.ResultSet;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author sogobanjo
 */
public class TeacherToClass extends javax.swing.JDialog {

    /**
     * Creates new form TeacherToClass
     */
    public TeacherToClass(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        
        DB_OPS ops = new DB_OPS();
        ops.createConnection();
        
        
        
        // ACADEMIC SESSION DROP DOWN
        String stmt ="select name from academic_session";
        ResultSet Rset = ops.sel_data(stmt);
        comboAcademicSession.removeAllItems();
        fill_list(comboAcademicSession,Rset);
  
        
        
        // POPULATING THE LIST BOX FOR TEACHERS
        
        refreshTeachersList();
        
        
        
        
//        String stmt ="select concat(staff_id,' ', first_name,' ',  middle_name, ' ', last_name) AS TeacherName " +
//                     " from register_teacher  " +
//                     " where id not in (select teacher_id from teacher_to_class where academic_session_id = " +
//               "(select id from academic_session where name = " + comboAcademicSession.getSelectedItem() + "))" ;
        

//        //ResultSet Rset = ops.sel_data(stmt);
//        Utility myutil = new Utility();
//        myutil.fill_list(listTeachers, stmt);
        
        
        
                
        // POPULATING THE LIST BOX FOR CLASSES
        
        refreshClassList();
        
        
        
//        String stmt ="select name from class";
//        //ResultSet Rset = ops.sel_data(stmt);
//        Utility myutil2 = new Utility();
//        myutil2.fill_list(listClasses, stmt);
        
        
        
         ops.close_conn();
        
        
              
        
    }
    
    
         private void fill_list(javax.swing.JComboBox JBox, ResultSet Rset)
    {
        try
        {
            
            while (Rset.next())
           {
               JBox.addItem(Rset.getString(1));
           }

        }
        catch(Exception ex)
        {
            
        }
    }
    
    
    
    private void refreshTeachersList()
    {
        String stmt ="select concat(staff_id,' ', first_name,' ',  middle_name, ' ', last_name) AS TeacherName " +
                     " from register_teacher  " +
                     " where id not in (select teacher_id from teacher_to_class2 where academic_session_id = " +
               "(select id from academic_session where name = '" + comboAcademicSession.getSelectedItem() + "'))" ;
     //        ResultSet Rset = ops.sel_data(stmt);
             System.out.println(stmt);

             Utility myutil = new Utility();
             myutil.fill_list(listTeachers, stmt);
             listTeachers.setEnabled(true);
        
    }
    
    
    
        private void refreshClassList()
    {
        String stmt ="select name " +
                     " from class  " +
                     " where id not in (select class_id from teacher_to_class2 where academic_session_id = " +
               "(select id from academic_session where name = '" + comboAcademicSession.getSelectedItem() + "'))" ;
     //        ResultSet Rset = ops.sel_data(stmt);
             System.out.println(stmt);

             Utility myutil = new Utility();
             myutil.fill_list(listClasses, stmt);
             listClasses.setEnabled(true);
        
    }
    
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listTeachers = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        listClasses = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        comboAcademicSession = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Map Teacher To Class");

        listTeachers.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listTeachers);

        listClasses.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(listClasses);

        jButton1.setText("Map");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Teachers");

        jLabel3.setText("Classes");

        comboAcademicSession.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setText("Session");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(comboAcademicSession, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(153, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comboAcademicSession, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
             
        
        if( ( listTeachers.getSelectedIndex() == -1) && (listClasses.getSelectedIndex() == -1) )
        {

//            app_util.MsgBox("Please Select at least a Table", "Configuration",this);
            JOptionPane.showMessageDialog(this, "Please Select a Teacher and a Class");
        }
        else
        {
            DB_OPS dbops = new DB_OPS();
        dbops.createConnection();

            DefaultListModel listModel = new DefaultListModel();
            
         String stmt = "insert into teacher_to_class2 (academic_session_id, teacher_id, class_id) " +
                " values ("
                 + "(select id from academic_session where name = '" + comboAcademicSession.getSelectedItem() + "'),"
                 + "(select id from register_teacher where staff_id = '" + listTeachers.getSelectedValue().split(" ")[0] + "'),"
                 + "(select id from class where name = '" + listClasses.getSelectedValue() + "')"
                 + ")";
           
            
           // System.out.println(stmt);   // Print the SQL statement for debugging purpose
            dbops.in_data(stmt);      
            if(dbops.error_msg.trim().length()==0)
                JOptionPane.showMessageDialog(this,  " Successfuly Mapped");
            else
                JOptionPane.showMessageDialog(this, "Error OCcured While Inserting "  + dbops.error_msg);
               dbops.close_conn();
           
         }

        refreshTeachersList();
        refreshClassList();
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(TeacherToClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TeacherToClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TeacherToClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeacherToClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TeacherToClass dialog = new TeacherToClass(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboAcademicSession;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listClasses;
    private javax.swing.JList<String> listTeachers;
    // End of variables declaration//GEN-END:variables
}
