/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Registration;

import MainApp.Utility;
import dbconnect.DB_OPS;
import global.GlobalVar;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author sogobanjo
 */
public class ActivateDeactivateTeacher extends javax.swing.JDialog {

    /**
     * Creates new form ActivateDeactivateTeacher
     */
    
    
    String tabname = new String();
    String stmt = new String();
    String thevalue = new String();
    String themesage = new String();
     String current_status = new String();
    String updated_status = new String();
   
    public ActivateDeactivateTeacher(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
       
        
        
                switch (GlobalVar.currentActiveInactiveTeacher)
            {
           
           
                    case "ACTIVATE":
                {
                    this.setTitle("Activate Teacher");
                    
                    buttonActivateDeactivate.setText("ACTIVATE");
                    
                    current_status ="N";
                    updated_status = "Y";
                    tabname = "register_teacher";
////                    stmt = "insert into " + tabname + " values ('" + txt_option_name.getText() + "')";
//                    thevalue = txt_option_name.getText();
//                    System.out.println("thevalue : " + thevalue);
                    break;
                }
              
                   
                   
                    
                    case "DEACTIVATE":
                {
                    this.setTitle("Deactivate Teacher");
                    
                    buttonActivateDeactivate.setText("DE-ACTIVATE");
                   current_status ="Y";
                    updated_status = "N";
                    
                    tabname = "register_teacher";
//                    //stmt = "insert into " + tabname + " values ('" + txt_option_name.getText() + "')";
                   // thevalue = txt_option_name.getText();
                    //System.out.println("thevalue : " + thevalue);
                    break;
                }
                    
                                        
        
             }
        
            refreshTeachersList(current_status);       
        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        listTeachersStatus = new javax.swing.JList<>();
        buttonActivateDeactivate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        listTeachersStatus.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listTeachersStatus);

        buttonActivateDeactivate.setText("jButton1");
        buttonActivateDeactivate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActivateDeactivateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(buttonActivateDeactivate, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(118, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonActivateDeactivate, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonActivateDeactivateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActivateDeactivateActionPerformed
        // TODO add your handling code here:
        

         int sel_indices[];
        sel_indices = listTeachersStatus.getSelectedIndices();
        
        
        
        if ( sel_indices.length == 0)
        {

//            app_util.MsgBox("Please Select at least a Table", "Configuration",this);
            JOptionPane.showMessageDialog(this, "Please Select at least a Teacher");
        }
        else
        {
            DB_OPS dbops = new DB_OPS();
        dbops.createConnection();

//            DefaultListModel listModel = new DefaultListModel();
            
//         String stmt = "insert into subject_to_teacher (academic_session_id, subject_id, teacher_id) " +
//                " values ";
            for ( int i = 0; i < sel_indices.length; i++)
            {
                
//                listModel.addElement(listTeachersStatus.getModel().getElementAt(sel_indices[i]));
//         String stmt = "insert into subject_to_class (academic_session_id, subject_id, class_id) " +
//                " values (" +
//              stmt +=  "((select id from academic_session where name = '" + comboAcademicSession.getSelectedItem() + "')," +
//                "(select id from subject where name = '" + comboSubjectTeacher.getSelectedItem() + "')," +
//                "(select id from register_teacher where staff_id = '" + listTeachers.getModel().getElementAt(sel_indices[i]).split(" ")[0] + "')" +
//                 ")";

            stmt ="update register_teacher " +
                    " set active = '" + updated_status + "'" +
                     " where staff_id = '" + listTeachersStatus.getModel().getElementAt(sel_indices[i]).split(" ")[0] + "'" ;          

            System.out.println(stmt);   // Print the SQL statement for debugging purpose
            dbops.upd_data(stmt);      
            
            }
           
             if(dbops.error_msg.trim().length()==0)
            {
                System.out.println(dbops.error_msg);   // Print the SQL statement for debugging purpose
                JOptionPane.showMessageDialog(this,  " Successfuly " + GlobalVar.currentActiveInactiveTeacher + "D");
                refreshTeachersList(current_status);       
            }           
            else
            {
                System.out.println(dbops.error_msg);   // Print the SQL statement for debugging purpose
//                if (dbops.error_msg.trim().contains("PRIMARY"))
//                JOptionPane.showMessageDialog(this, "Duplicate Entry Not Allowed "  + dbops.error_msg);
//                else
//                 JOptionPane.showMessageDialog(this, "Error OCcured While Inserting "  + dbops.error_msg);
            }
           
              dbops.close_conn();
         }

        

        
        
    }//GEN-LAST:event_buttonActivateDeactivateActionPerformed

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
            java.util.logging.Logger.getLogger(ActivateDeactivateTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ActivateDeactivateTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ActivateDeactivateTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ActivateDeactivateTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ActivateDeactivateTeacher dialog = new ActivateDeactivateTeacher(new javax.swing.JFrame(), true);
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

    
        private void refreshTeachersList(String status)
    {
             stmt ="select concat(staff_id,' ', first_name,' ',  middle_name, ' ', last_name) AS TeacherName " +
                     " from register_teacher where active = '" + status + "'";
     //        ResultSet Rset = ops.sel_data(stmt);
             System.out.println(stmt);

             Utility myutil = new Utility();
             myutil.fill_list(listTeachersStatus, stmt);
//             listTeachersStatus.setEnabled(true);
        
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonActivateDeactivate;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listTeachersStatus;
    // End of variables declaration//GEN-END:variables
}
