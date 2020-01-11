/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Options;

import  global.GlobalVar;
import  dbconnect.DB_OPS;
import javax.swing.JOptionPane;
import MainApp.Utility;
import java.sql.ResultSet;
/**
 *
 * @author sogobanjo
 */
 
public class OptionsDialog extends javax.swing.JDialog {

    /**
     * Creates new form OptionsDialog
     */
    String tabname = new String();
    String stmt = new String();
    String thevalue = new String();
    String themesage = new String();
    
    public OptionsDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        jPanel_dynamic_load.setVisible(false);
        panelPeriod.setVisible(false);
                
        switch (GlobalVar.currentMenu)
        {
            case "BG":
                {
                    this.setTitle("Blood Group");
                    
                    tabname = "blood_group";
//                    stmt = "insert into " + tabname + " values ('" + txt_option_name.getText() + "')";
                    thevalue = txt_option_name.getText();
                    System.out.println("thevalue : " + thevalue);
                    break;
                }
              
                
            case "GT":
                {
                    this.setTitle("Genotype");
 
                    tabname = "genotype";
//                    stmt = "insert into " + tabname + " values ('" + txt_option_name.getText() + "')";
                    thevalue = txt_option_name.getText();
                    break;
                }    
                
                
            case "RG":
                {
                    this.setTitle("Religion");
                    
                    tabname = "religion";
//                    stmt = "insert into " + tabname + " values ('" + txt_option_name.getText() + "')";
                    thevalue = txt_option_name.getText();

                    
                    break;
                } 
                
                
            case "SX":
                {
                    this.setTitle("Sex");
                    
                    tabname = "sex";
//                    stmt = "insert into " + tabname + " values ('" + txt_option_name.getText() + "')";
                    thevalue = txt_option_name.getText();

                    
                    break;
                } 
                
                
            case "COTE":
                {
                    this.setTitle("Colour Of The Eyes");
                    
                    
                    tabname = "colour_of_the_eyes";
//                    stmt = "insert into " + tabname + " values ('" + txt_option_name.getText() + "')";
                    thevalue = txt_option_name.getText();

                    
                    break;
                } 
                
            case "ST":
                {
                    this.setTitle("State");
                    
                    tabname = "state";
//                    stmt = "insert into " + tabname + " values ('" + txt_option_name.getText() + "')";
                    thevalue = txt_option_name.getText();

                    
                    break;
                }     
                
            case "LG":
                {
                    this.setTitle("Local Government");
                    
                    
                    DB_OPS dbops = new DB_OPS();
                    ResultSet rset;
                    
                    dbops.createConnection();
                    rset = dbops.sel_data("select name from state");
                    
                    Utility util = new Utility();
                    cmb_dynamic_state.removeAllItems();
                   util.fill_list(cmb_dynamic_state, rset);
                   dbops.close_conn();
                    jPanel_dynamic_load.setVisible(true);

                    tabname = "local_government";
//                    stmt = "insert into " + tabname + " values (select id from state where name = '"  + cmb_dynamic_state.getSelectedItem() + "','" + txt_option_name.getText() + "')";
                    thevalue = txt_option_name.getText();

                    
                    break;
                }     
           
                
            case "CT":
                {
                    this.setTitle("Country");
                    
                    tabname = "country";
//                    stmt = "insert into " + tabname + " values ('" + txt_option_name.getText() + "')";
                    thevalue = txt_option_name.getText();

                    
                    break;
                }     
                
                
                
                                
            case "TPST":
                {
                    this.setTitle("Teachers Position");
                    
                    tabname = "teachers_position";
//                    stmt = "insert into " + tabname + " values ('" + txt_option_name.getText() + "')";
                    thevalue = txt_option_name.getText();

                    
                    break;
                }     
                
                
                
                
                            case "TPOST":
                {
                    this.setTitle("Teachers Position");
                    
                    tabname = "teachers_position";
//                    stmt = "insert into " + tabname + " values ('" + txt_option_name.getText() + "')";
                    thevalue = txt_option_name.getText();

                    
                    break;
                }     
                
                
                
                
                
                
                
                            case "SPALM":
                {
                    this.setTitle("Special Ailment");
                    
                    tabname = "special_ailment";
//                    stmt = "insert into " + tabname + " values ('" + txt_option_name.getText() + "')";
                    thevalue = txt_option_name.getText();

                    
                    break;
                }  
                
                
                
                
                   case "FEETYPE":
                {
                    this.setTitle("Fee Type");
                    
                    tabname = "fee_type";
//                    stmt = "insert into " + tabname + " values ('" + txt_option_name.getText() + "')";
                    thevalue = txt_option_name.getText();

                    
                    break;
                }  
                
                
                
                
                
                
                                
                            case "LOE":
                {
                    this.setTitle("Level Of Education");
                    
                    tabname = "level_of_education";
//                    stmt = "insert into " + tabname + " values ('" + txt_option_name.getText() + "')";
                    thevalue = txt_option_name.getText();

                    
                    break;
                }  
                
                
                
                
                
                                
                            case "DSP":
                {
                    this.setTitle("Discipline");
                    
                    tabname = "discipline";
//                    stmt = "insert into " + tabname + " values ('" + txt_option_name.getText() + "')";
                    thevalue = txt_option_name.getText();

                    
                    break;
                }  
                
                
                
                
                
                                
                            case "TRG":
                {
                    this.setTitle("Tribal Group");
                    
                    tabname = "tribal_group";
//                    stmt = "insert into " + tabname + " values ('" + txt_option_name.getText() + "')";
                    thevalue = txt_option_name.getText();

                    
                    break;
                }  
                
                
                
                
                
                
                                
                            case "GOBT":
                {
                    this.setTitle("Grade Obtained");
                    
                    tabname = "grade_obtained";
//                    stmt = "insert into " + tabname + " values ('" + txt_option_name.getText() + "')";
                    thevalue = txt_option_name.getText();

                    
                    break;
                }  
                

               
                
                           case "SCHATTD":
                {
                    this.setTitle("School Attended");
                    
                    tabname = "school_attended";
//                    stmt = "insert into " + tabname + " values ('" + txt_option_name.getText() + "')";
                    thevalue = txt_option_name.getText();

                    
                    break;
                }  
                
                
                
                
                
            case "CN":
                {
                    this.setTitle("Class Name");
                    
                    tabname = "class";
//                    stmt = "insert into " + tabname + " values ('" + txt_option_name.getText() + "')";
                    thevalue = txt_option_name.getText();

                    
                    break;
                }    
                
                
              case "SJ":
                {
                    this.setTitle("Subject");
                    
                    tabname = "subject";
//                  stmt = "insert into " + tabname + " values ('" + txt_option_name.getText() + "')";
                    thevalue = txt_option_name.getText();

                    
                    break;
                }  
                
                
               
                              case "AS":
                {
                    this.setTitle("Academic Session");
                    
                    tabname = "academic_session";
//                  stmt = "insert into " + tabname + " values ('" + txt_option_name.getText() + "')";
                    thevalue = txt_option_name.getText();

                    
                    break;
                }  
                
                
                
                                   case "MS":
                {
                    this.setTitle("Marital Status");
                    
                    tabname = "marital_status";
//                  stmt = "insert into " + tabname + " values ('" + txt_option_name.getText() + "')";
                    thevalue = txt_option_name.getText();

                    
                    break;
                }  
                
                
              
                case "ACATERM":
                {
                    this.setTitle("Academic Term");
                    
                    tabname = "term";
//                  stmt = "insert into " + tabname + " values ('" + txt_option_name.getText() + "')";
                    thevalue = txt_option_name.getText();

                    
                    break;
                }  
                
                
                
               
                              
                case "TTPERIOD":
                {
                    
                    
                    DB_OPS dbops = new DB_OPS();
                    ResultSet rset;
                    
                    dbops.createConnection();
                    rset = dbops.sel_data("select name from day_of_the_week");
                    
                    Utility util = new Utility();
                    comboDayOfTheWeek.removeAllItems();
                   util.fill_list(comboDayOfTheWeek, rset);
                   dbops.close_conn();
                    
                    
                    
                    this.setTitle("Time Table Period");
                    
                    tabname = "time_table_period";
//                  stmt = "insert into " + tabname + " values ('" + txt_option_name.getText() + "')";
                    thevalue = txt_option_name.getText();
                    
                    panelPeriod.setVisible(true);
                    panelDescription.setVisible(false);

                    
                    break;
                }  
                
                
                     case "DOTW":
                {
                    this.setTitle("Day Of The Week");
                    
                    tabname = "day_of_the_week";
//                  stmt = "insert into " + tabname + " values ('" + txt_option_name.getText() + "')";
                    thevalue = txt_option_name.getText();

                    
                    break;
                }  
                
                
                
                
                
                
            default: 
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

        jPanel_dynamic_load = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cmb_dynamic_state = new javax.swing.JComboBox<>();
        panelPeriod = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        comboDayOfTheWeek = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtFrom = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnClearForperiod = new javax.swing.JButton();
        btnCloseForPeriod = new javax.swing.JButton();
        panelDescription = new javax.swing.JPanel();
        txt_option_name = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        optionSubmit = new javax.swing.JButton();
        optionClear = new javax.swing.JButton();
        optionCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setText("State");

        cmb_dynamic_state.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel_dynamic_loadLayout = new javax.swing.GroupLayout(jPanel_dynamic_load);
        jPanel_dynamic_load.setLayout(jPanel_dynamic_loadLayout);
        jPanel_dynamic_loadLayout.setHorizontalGroup(
            jPanel_dynamic_loadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_dynamic_loadLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(43, 43, 43)
                .addComponent(cmb_dynamic_state, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(156, Short.MAX_VALUE))
        );
        jPanel_dynamic_loadLayout.setVerticalGroup(
            jPanel_dynamic_loadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_dynamic_loadLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_dynamic_loadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmb_dynamic_state, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setText("Day of The Week");

        comboDayOfTheWeek.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setText("From:");

        txtFrom.setText("E.g. 8:00am - 9:00am");
        txtFrom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFromActionPerformed(evt);
            }
        });

        jLabel5.setText("To:");

        txtTo.setText("E.g. 8:00am - 9:00am");

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnClearForperiod.setText("Clear");
        btnClearForperiod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearForperiodActionPerformed(evt);
            }
        });

        btnCloseForPeriod.setText("Close");
        btnCloseForPeriod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseForPeriodActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPeriodLayout = new javax.swing.GroupLayout(panelPeriod);
        panelPeriod.setLayout(panelPeriodLayout);
        panelPeriodLayout.setHorizontalGroup(
            panelPeriodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPeriodLayout.createSequentialGroup()
                .addGroup(panelPeriodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelPeriodLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelPeriodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelPeriodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comboDayOfTheWeek, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtFrom, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(txtTo)))
                    .addGroup(panelPeriodLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnClearForperiod, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCloseForPeriod, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        panelPeriodLayout.setVerticalGroup(
            panelPeriodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPeriodLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPeriodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboDayOfTheWeek, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelPeriodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelPeriodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPeriodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnClearForperiod, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCloseForPeriod, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setText("Description");
        jLabel1.setToolTipText("");

        optionSubmit.setText("Submit");
        optionSubmit.setToolTipText("");
        optionSubmit.setName("optionSubmit"); // NOI18N
        optionSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionSubmitActionPerformed(evt);
            }
        });

        optionClear.setText("Clear");
        optionClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionClearActionPerformed(evt);
            }
        });

        optionCancel.setText("Close");
        optionCancel.setName("optionCancel"); // NOI18N
        optionCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelDescriptionLayout = new javax.swing.GroupLayout(panelDescription);
        panelDescription.setLayout(panelDescriptionLayout);
        panelDescriptionLayout.setHorizontalGroup(
            panelDescriptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDescriptionLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(panelDescriptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDescriptionLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(optionSubmit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(optionClear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(optionCancel)
                        .addGap(7, 7, 7))
                    .addGroup(panelDescriptionLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_option_name, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        panelDescriptionLayout.setVerticalGroup(
            panelDescriptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDescriptionLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panelDescriptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_option_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDescriptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(optionSubmit)
                    .addComponent(optionCancel)
                    .addComponent(optionClear))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel_dynamic_load, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(330, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelPeriod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel_dynamic_load, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelPeriod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(86, 86, 86))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void optionSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionSubmitActionPerformed
        // TODO add your handling code here:
        try
        {
        DB_OPS dbops = new DB_OPS();
        
        dbops.createConnection();
        if (GlobalVar.currentMenu.equalsIgnoreCase("LG"))
        {
            stmt = "insert into " + tabname + " (state_id, name) values ((select id from state where name = '"  + cmb_dynamic_state.getSelectedItem() + "'),'" + txt_option_name.getText() + "')";
            dbops.in_data(stmt);         
        }
        
        else if(GlobalVar.currentMenu.equalsIgnoreCase("TTPERIOD"))
            
         {
            stmt = "insert into " + tabname + " (day_of_the_week, from_time. to_time) values ( '" + comboDayOfTheWeek.getSelectedItem() + "','" + txtFrom.getText()+ "','" + txtTo.getText() + "')";
            dbops.in_data(stmt);         
        }    
            
        
        else
            dbops.in_data(tabname, "name", "'" + txt_option_name.getText() + "'");
        
       
        dbops.close_conn();
        
        if(dbops.error_msg.trim().length()==0)
            JOptionPane.showMessageDialog(this, this.getTitle() + " Successfuly Inserted");
        else
            JOptionPane.showMessageDialog(this, "Error OCcured While Inserting " + this.getTitle() + " : " + dbops.error_msg);
            
        }
        catch(Exception ex)
        {
            System.out.println(ex.toString());
        }
//        DB_OPS dbops = new DB_OPS();
//        
//        dbops.createConnection();
//        dbops.in_data(tabname, thevalue);
//        
//        dbops.close_conn();
    }//GEN-LAST:event_optionSubmitActionPerformed

    private void optionCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionCancelActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_optionCancelActionPerformed

    private void optionClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionClearActionPerformed
        // TODO add your handling code here:
        txt_option_name.setText("");
    }//GEN-LAST:event_optionClearActionPerformed

    private void btnClearForperiodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearForperiodActionPerformed
        // TODO add your handling code here:
        
         //comboDayOfTheWeek.Remove
         txtFrom.setText("");
         txtTo.setText("");
        
    }//GEN-LAST:event_btnClearForperiodActionPerformed

    private void btnCloseForPeriodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseForPeriodActionPerformed
        // TODO add your handling code here:
        
        this.dispose();
        
    }//GEN-LAST:event_btnCloseForPeriodActionPerformed

    private void txtFromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFromActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFromActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        
         try
        {
        DB_OPS dbops = new DB_OPS();
        
        dbops.createConnection();

       // if(GlobalVar.currentMenu.equalsIgnoreCase("TTPERIOD"))
            
       //  {
            stmt = "insert into " + tabname + " (day_of_the_week, from_time, to_time) values ( '" + comboDayOfTheWeek.getSelectedItem() + "','" + txtFrom.getText()+ "','" + txtTo.getText() + "')";
            dbops.in_data(stmt);         
      //  }    
            

        
       
        dbops.close_conn();
        
        if(dbops.error_msg.trim().length()==0)
            JOptionPane.showMessageDialog(this, this.getTitle() + " Successfuly Inserted");
        else
            JOptionPane.showMessageDialog(this, "Error OCcured While Inserting " + this.getTitle() + " : " + dbops.error_msg);
            
        }
        catch(Exception ex)
        {
            System.out.println(ex.toString());
        }
        
        
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
            java.util.logging.Logger.getLogger(OptionsDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OptionsDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OptionsDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OptionsDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                OptionsDialog dialog = new OptionsDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnClearForperiod;
    private javax.swing.JButton btnCloseForPeriod;
    private javax.swing.JComboBox<String> cmb_dynamic_state;
    private javax.swing.JComboBox<String> comboDayOfTheWeek;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel_dynamic_load;
    private javax.swing.JButton optionCancel;
    private javax.swing.JButton optionClear;
    private javax.swing.JButton optionSubmit;
    private javax.swing.JPanel panelDescription;
    private javax.swing.JPanel panelPeriod;
    private javax.swing.JTextField txtFrom;
    private javax.swing.JTextField txtTo;
    private javax.swing.JTextField txt_option_name;
    // End of variables declaration//GEN-END:variables
}
