/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Registration;

import MainApp.Utility;
import dbconnect.DB_OPS;
import java.sql.ResultSet;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author sogobanjo
 */
public class TimeTablePeriod extends javax.swing.JDialog {

    /**
     * Creates new form TimeTable
     */
    public TimeTablePeriod(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        
        DB_OPS ops = new DB_OPS();
        ops.createConnection();
        
        // ACADEMIC SESSION DROP DOWN
        String stmt ="select name from academic_session";
        ResultSet Rset = ops.sel_data(stmt);
        comboSession.removeAllItems();
        fill_list(comboSession,Rset);
        
        
        // ACADEMIC TERM DROP DOWN
        stmt ="select name from term";
        Rset = ops.sel_data(stmt);
        comboTerm.removeAllItems();
        fill_list(comboTerm,Rset);
        
        // DAYS OF THE WEEK DROP DOWN
        stmt ="select name from day_of_the_week";
        Rset = ops.sel_data(stmt);
        comboDayOfTheWeek1.removeAllItems();
        comboDayOfTheWeek1.addItem("Select Day of Week");
        fill_list(comboDayOfTheWeek1,Rset); 
        
        // CLASS DROP DOWN
        stmt ="select name from class";
        Rset = ops.sel_data(stmt);
        comboClass.removeAllItems();
        fill_list(comboClass,Rset);

        
        // SUBJECT DROP DOWN
        stmt ="select name from subject";
        Rset = ops.sel_data(stmt);
        comboSubject.removeAllItems();
        fill_list(comboSubject,Rset); 
         
              
        // TEACEHR DROP DOWN
        stmt ="select concat(staff_id,' ',first_name,' ',  middle_name, ' ', last_name) AS TeacherName from register_teacher";
        Rset = ops.sel_data(stmt);
        comboTeacher.removeAllItems();
        fill_list(comboTeacher,Rset);  
        
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        comboDayOfTheWeek = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        comboSession = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        comboTerm = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listPeriods = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();
        comboSubject = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        comboTeacher = new javax.swing.JComboBox<>();
        buttonSave = new javax.swing.JButton();
        comboClass = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        comboDayOfTheWeek1 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();

        comboDayOfTheWeek.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Time Table");

        jLabel2.setText("Session");

        comboSession.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboSession.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSessionActionPerformed(evt);
            }
        });

        jLabel3.setText("Term");

        comboTerm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setText("Period");

        listPeriods.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listPeriods.setToolTipText("");
        jScrollPane1.setViewportView(listPeriods);

        jLabel5.setText("Subject");

        comboSubject.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel6.setText("Teacher");

        comboTeacher.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        buttonSave.setText("Save");
        buttonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSaveActionPerformed(evt);
            }
        });

        comboClass.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboClassActionPerformed(evt);
            }
        });

        jLabel7.setText("Class");

        comboDayOfTheWeek1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Day Of The Week" }));
        comboDayOfTheWeek1.setName(""); // NOI18N
        comboDayOfTheWeek1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboDayOfTheWeek1ActionPerformed(evt);
            }
        });

        jLabel8.setText("Days");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(comboSession, 0, 122, Short.MAX_VALUE)
                                .addGap(145, 145, 145)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(comboTerm, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                                    .addComponent(comboClass, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(comboDayOfTheWeek1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(76, 76, 76))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addComponent(buttonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboSession, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboTerm, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboClass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboDayOfTheWeek1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(buttonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(141, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
        private void refreshPeriodList()
    {
        String stmt ="select concat(from_time,'-',to_time) AS Period " +
                     " from time_table_period where day_of_the_week = '" + comboDayOfTheWeek1.getSelectedItem() + "'" +
                     " and id not in (select period_id from time_table where " + 
                " academic_session_id = (select id from academic_session where name = '" + comboSession.getSelectedItem() + "')" +
               "and class_id = (select id from class where name = '" + comboClass.getSelectedItem() + "'))" ;
     //        ResultSet Rset = ops.sel_data(stmt);
             System.out.println(stmt);

             Utility myutil = new Utility();
             myutil.fill_list(listPeriods, stmt);
             listPeriods.setEnabled(true);
        
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
    
    
    private void buttonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSaveActionPerformed
        // TODO add your handling code here:
        
        
          if( listPeriods.getSelectedIndex() == -1 )
        {

//            app_util.MsgBox("Please Select at least a Table", "Configuration",this);
            JOptionPane.showMessageDialog(this, "Please Select a Period");
        }
        else
        {
            DB_OPS dbops = new DB_OPS();
        dbops.createConnection();

            DefaultListModel listModel = new DefaultListModel();
            
         String stmt = "insert into time_table (academic_session_id, academic_term_id, period_id, class_id, subject_id, teacher_id) " +
                " values ("
                 + "(select id from academic_session where name = '" + comboSession.getSelectedItem() + "'),"
                 + "(select id from term where name = '" + comboTerm.getSelectedItem() + "'),"
                 + "(select id from time_table_period where day_of_the_week = '" + comboDayOfTheWeek1.getSelectedItem() + "' " +
                 " and concat(from_time,'-',to_time) = '" + listPeriods.getSelectedValue() + "' ),"
                 + "(select id from class where name = '" + comboClass.getSelectedItem() + "'),"
                 + "(select id from subject where name = '" + comboSubject.getSelectedItem() + "'),"
                 + "(select id from register_teacher where staff_id = '" + comboTeacher.getSelectedItem().toString().split(" ")[0] + "')"
                 + ")";
           
            
           // System.out.println(stmt);   // Print the SQL statement for debugging purpose
            dbops.in_data(stmt);      
            if(dbops.error_msg.trim().length()==0)
                JOptionPane.showMessageDialog(this,  " Time Table Successfuly Created");
            else
                JOptionPane.showMessageDialog(this, "Error OCcured While Creating Time Table "  + dbops.error_msg);
               dbops.close_conn();
           
         }

        refreshPeriodList();
        
        
        
        
        
        
    }//GEN-LAST:event_buttonSaveActionPerformed

    private void comboClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboClassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboClassActionPerformed

    private void comboSessionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSessionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboSessionActionPerformed

    private void comboDayOfTheWeek1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboDayOfTheWeek1ActionPerformed
        // TODO add your handling code here:
        
         refreshPeriodList();
        
        
        
    }//GEN-LAST:event_comboDayOfTheWeek1ActionPerformed

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
            java.util.logging.Logger.getLogger(TimeTablePeriod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TimeTablePeriod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TimeTablePeriod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TimeTablePeriod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TimeTablePeriod dialog = new TimeTablePeriod(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton buttonSave;
    private javax.swing.JComboBox<String> comboClass;
    private javax.swing.JComboBox<String> comboDayOfTheWeek;
    private javax.swing.JComboBox<String> comboDayOfTheWeek1;
    private javax.swing.JComboBox<String> comboSession;
    private javax.swing.JComboBox<String> comboSubject;
    private javax.swing.JComboBox<String> comboTeacher;
    private javax.swing.JComboBox<String> comboTerm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listPeriods;
    // End of variables declaration//GEN-END:variables
}
