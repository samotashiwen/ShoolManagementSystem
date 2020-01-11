/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Registration;

import MainApp.Utility;
import dbconnect.DB_OPS;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author sogobanjo
 */
public class RegisterTeachers extends javax.swing.JDialog {

    /**
     * Creates new form RegisterTeachers
     */
    
    DefaultListModel listModel = new DefaultListModel();
    DefaultListModel listModel2 = new DefaultListModel();
    DateFormat df = new SimpleDateFormat("dd-MM-yyyy");

    public RegisterTeachers(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        SimpleDateFormat thedate;
        
        comboYearObtained.removeAllItems();
        comboYearObtained.addItem("Select a Year");        
        for (int i = 1930; i <= LocalDate.now().getYear(); i++)
        {
            comboYearObtained.addItem("" + i);
        }
        
        DB_OPS ops = new DB_OPS();
        ops.createConnection();
        
        // MARITAL STATUS DROP DOWN
        String stmt ="select name from marital_status";
        ResultSet Rset = ops.sel_data(stmt);
        comboMaritalStatus.removeAllItems();
        comboMaritalStatus.addItem("Select a Marital Status");
        fill_list(comboMaritalStatus,Rset);
        
         // SEX DROP DOWN
        stmt ="select name from sex";
        Rset = ops.sel_data(stmt);
        comboSex.removeAllItems();
        comboSex.addItem("Select a Gender");
        fill_list(comboSex,Rset);
        
         // RELIGION DROP DOWN
        stmt ="select name from religion";
        Rset = ops.sel_data(stmt);
        comboReligion.removeAllItems();
        comboReligion.addItem("Select a Religion");
        fill_list(comboReligion,Rset);
        
        
        // STATE OF ORIGIN DROP DOWN
        stmt ="select name from state";
        Rset = ops.sel_data(stmt);
        comboStateOfOrigin.removeAllItems();
        comboStateOfOrigin.addItem("Select a State");
        fill_list(comboStateOfOrigin,Rset);
        
        
        // COUNTRY DROP DOWN
        stmt ="select name from country";
        Rset = ops.sel_data(stmt);
        comboNationality.removeAllItems();
        comboNationality.addItem("Select a Country");
        fill_list(comboNationality,Rset);
        
        
        
        // TEACHERS POSITION DROP DOWN
        stmt ="select name from teachers_position";
        Rset = ops.sel_data(stmt);
        comboPosition.removeAllItems();
        comboPosition.addItem("Select a Position");
        fill_list(comboPosition,Rset);
        
        
        // SPECIAL AILMENT DROP DOWN
        stmt ="select name from special_ailment";
        Rset = ops.sel_data(stmt);
        comboSpecialAilment.removeAllItems();
        comboSpecialAilment.addItem("Select Ailment");
        fill_list(comboSpecialAilment,Rset);
        
        
        
        // Tribal Group DROP DOWN
        stmt ="select name from tribal_group";
        Rset = ops.sel_data(stmt);
        comboTribalGroup.removeAllItems();
        comboTribalGroup.addItem("Select a Tribal Group");
        fill_list(comboTribalGroup,Rset);
        
        
        // Language DROP DOWN
        stmt ="select name from language";
        Rset = ops.sel_data(stmt);
        comboLanguage.removeAllItems();
        comboLanguage.addItem("Select a Language");
        fill_list(comboLanguage,Rset);
        
        // Level of Education DROP DOWN
        stmt ="select name from level_of_education";
        Rset = ops.sel_data(stmt);
        comboLevelOfEducation.removeAllItems();
        comboLevelOfEducation.addItem("Select Level of education");
        fill_list(comboLevelOfEducation,Rset);
        
        
         // Discipline DROP DOWN
        stmt ="select name from discipline";
        Rset = ops.sel_data(stmt);
        comboDiscipline.removeAllItems();
        comboDiscipline.addItem("Select Discipline");
        fill_list(comboDiscipline,Rset);
        
         // Grade Obtained DROP DOWN
        stmt ="select name from grade_obtained";
        Rset = ops.sel_data(stmt);
        comboGrade.removeAllItems();
        comboGrade.addItem("Select Grade");
        fill_list(comboGrade,Rset);
        
        
        // School Attended DROP DOWN
        stmt ="select name from school_attended";
        Rset = ops.sel_data(stmt);
        comboSchoolAttended.removeAllItems();
        comboSchoolAttended.addItem("Select School Attended");
        fill_list(comboSchoolAttended,Rset);
        
        
        listDisplayEducation.setModel(listModel);
        
        
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
        txtFirstName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtMiddleName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        comboMaritalStatus = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        comboTribalGroup = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        comboLanguage = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        comboSpecialAilment = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        comboPosition = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        date_joined = new org.jdesktop.swingx.JXDatePicker();
        jLabel12 = new javax.swing.JLabel();
        comboReligion = new javax.swing.JComboBox<>();
        buttonRegisterTeacher = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        comboSex = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jXDatePicker1 = new org.jdesktop.swingx.JXDatePicker();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        comboStateOfOrigin = new javax.swing.JComboBox<>();
        txtPhoneNumber = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        comboNationality = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtStaffID = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        comboLevelOfEducation = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        comboDiscipline = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listDisplayEducation = new javax.swing.JList<>();
        jLabel22 = new javax.swing.JLabel();
        comboGrade = new javax.swing.JComboBox<>();
        CGPA = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jLabel23 = new javax.swing.JLabel();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        comboSchoolAttended = new javax.swing.JComboBox<>();
        comboYearObtained = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listDisplayWorkExperience = new javax.swing.JList<>();
        jLabel27 = new javax.swing.JLabel();
        CGPA1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        txtPlaceOfWork = new javax.swing.JTextField();
        txtPositionAtWork = new javax.swing.JTextField();
        jXDatePicker2 = new org.jdesktop.swingx.JXDatePicker();
        jXDatePicker3 = new org.jdesktop.swingx.JXDatePicker();
        comboReason = new javax.swing.JComboBox<>();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        radioNo = new javax.swing.JRadioButton();
        radioYes = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("First Name");

        txtFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFirstNameActionPerformed(evt);
            }
        });

        jLabel2.setText("Middle Name");

        jLabel3.setText("Last Name");

        jLabel4.setText("Marital Status");

        comboMaritalStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel5.setText("Tribal Group");

        comboTribalGroup.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboTribalGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTribalGroupActionPerformed(evt);
            }
        });

        jLabel6.setText("Language");

        comboLanguage.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel9.setText("Special Ailment");

        comboSpecialAilment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel10.setText("Position");

        comboPosition.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel11.setText("Date Joined");

        jLabel12.setText("Religion");

        comboReligion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        buttonRegisterTeacher.setText("Register Teacher");
        buttonRegisterTeacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRegisterTeacherActionPerformed(evt);
            }
        });

        jLabel13.setText("Sex");

        comboSex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel15.setText("Address");

        jLabel16.setText("Date of Birth");

        jXDatePicker1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jXDatePicker1ActionPerformed(evt);
            }
        });

        jLabel17.setText("Phone No.");

        jLabel18.setText("State of Origin");

        comboStateOfOrigin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel19.setText("Nationality");

        comboNationality.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboNationality.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboNationalityActionPerformed(evt);
            }
        });

        jLabel20.setText("Disability");

        jLabel21.setText("Staff ID");

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        comboLevelOfEducation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel7.setText(" Level of Education");

        jLabel8.setText("Discipline");

        comboDiscipline.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel14.setText("Year Obtained");

        jScrollPane1.setViewportView(listDisplayEducation);

        jLabel22.setText("Grade Obtained");

        comboGrade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        CGPA.setText("CGPA");

        jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));

        jLabel23.setText("Out of");

        jButton1.setText("Remove");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Add");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel31.setText("School Attended");

        comboSchoolAttended.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        comboYearObtained.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel14)
                    .addComponent(jLabel22)
                    .addComponent(CGPA)
                    .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboDiscipline, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(comboSchoolAttended, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(comboLevelOfEducation, 0, 163, Short.MAX_VALUE))))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(comboYearObtained, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(comboGrade, javax.swing.GroupLayout.Alignment.LEADING, 0, 161, Short.MAX_VALUE)))
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(126, 126, 126)
                        .addComponent(jButton1)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboSchoolAttended, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboLevelOfEducation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboDiscipline, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(comboYearObtained, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboGrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CGPA)
                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel24.setText(" Level of Education");

        jLabel25.setText("Position");

        jLabel26.setText("Start Date");

        jScrollPane2.setViewportView(listDisplayWorkExperience);

        jLabel27.setText("End Date");

        CGPA1.setText("Reason For Leaving");

        jButton3.setText("Remove");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Add");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        comboReason.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a Reason", "Resigned", "Retired", "Retrenched", "Sacked", "Company Shut  Down", "Others" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24)
                    .addComponent(jLabel27)
                    .addComponent(CGPA1)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton4)
                    .addComponent(jXDatePicker3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPlaceOfWork)
                    .addComponent(txtPositionAtWork)
                    .addComponent(jXDatePicker2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comboReason, 0, 161, Short.MAX_VALUE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(jButton3)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPlaceOfWork, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPositionAtWork, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(jXDatePicker2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(jXDatePicker3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CGPA1)
                            .addComponent(comboReason, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addComponent(jButton4))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel29.setText("Work Experience");

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel30.setText("Education");

        radioNo.setText("No");
        radioNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioNoActionPerformed(evt);
            }
        });

        radioYes.setText("Yes");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel21)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtStaffID, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(jLabel2))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(comboMaritalStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel5)))
                                .addGap(54, 54, 54)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtMiddleName, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(comboTribalGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboLanguage, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(comboSex, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel17)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel18)
                                            .addComponent(jLabel16))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(comboNationality, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(comboStateOfOrigin, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(comboReligion, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtPhoneNumber)
                                            .addComponent(jXDatePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel13)
                                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(date_joined, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(comboPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel20))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboSpecialAilment, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(radioNo)
                                        .addGap(18, 18, 18)
                                        .addComponent(radioYes)))))
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(437, 437, 437)
                        .addComponent(buttonRegisterTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(comboSex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMiddleName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtStaffID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboLanguage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(comboTribalGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboMaritalStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboReligion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(comboStateOfOrigin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(jXDatePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(comboNationality, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboPosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(date_joined, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboSpecialAilment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(radioNo)
                            .addComponent(radioYes))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)))
                .addComponent(buttonRegisterTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFirstNameActionPerformed

    private void buttonRegisterTeacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRegisterTeacherActionPerformed
        // TODO add your handling code here:
        
        
//                DB_OPS dbops = new DB_OPS();
//        
//        dbops.createConnection();
//            String stmt = "insert into register_teacher (first_name, middle_name,last_name,marital_status, staff_id, active) values ('"  + txtFirstName.getText()
//                    + "','" + txtMiddleName.getText() + "','" + txtLastName.getText() + "','" + comboMaritalStatus.getSelectedItem() + "','" + txtStaffID.getText() + "','" + "Y"  + "')";
//            dbops.in_data(stmt);         
//        
//        
//                    if(dbops.error_msg.trim().length()==0)
//            JOptionPane.showMessageDialog(this, " Teacher's Registration Details Successfuly Inserted");
//        else
//            JOptionPane.showMessageDialog(this, "Error Occured While Inserting Teacher's Registration Details " + " : " + dbops.error_msg);
        if (txtStaffID.getText().trim().length() == 0)
        {
            JOptionPane.showMessageDialog(this, "Please Enter The Staff ID " );
            return;
        }
        save_data();
        
    }//GEN-LAST:event_buttonRegisterTeacherActionPerformed

    private void comboNationalityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboNationalityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboNationalityActionPerformed

    private void jXDatePicker1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jXDatePicker1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jXDatePicker1ActionPerformed

    private void save_education()
    {
//        if (!(jRadioCA.isSelected() || jRadioExam.isSelected()))
//        {
//            JOptionPane.showMessageDialog(this,  " Please Select Continuous Assessment OR Exam");
//            return;
//        }
                String stmt;
        String value, present_status, absent_status;
//        stmt = "insert into ca_exam (exam_date, academic_session_id, academic_term_id, class_id, student_id,subject_id, score, exam_type) values ";
        stmt = "insert into teachers_education (staff_id, school_attended,  level_of_education, discipline,year_obtained,grade_obtained,cgpa) values ";
       
       
        value="";
        
        for (int i = 0; i < listDisplayEducation.getModel().getSize(); i++)   
        {
//                value += " ( '" + txtStaffID.getText() + "', " +
//                         " (select id from school_attended where name = '" + comboSchoolAttended.getSelectedItem() + "'), " +
//                         " (select id from level_of_education where name = '" + comboLevelOfEducation.getSelectedItem() + "'), " +
//                        " (select id from discipline where name = '" + comboDiscipline.getSelectedItem() + "'), '" + jXDatePicker2.getDate() + "'," +
//                        " (select id from grade_obtained where name = '" + comboGrade.getSelectedItem() + "'), '" +   
//                        Double.parseDouble(jFormattedTextField1.getText()) + "/" + Double.parseDouble(jFormattedTextField2.getText()) + "'" +
//                            " ),";
                String test = listDisplayEducation.getModel().getElementAt(i);
                String[] itemsarray = test.split("!");
                System.out.println(test.split("!")[0]);
//                value += " ( '" + txtStaffID.getText() + "', " +
//                         " (select id from school_attended where name = '" + listDisplayEducation.getModel().getElementAt(i).split(":")[0] + "'), " +
//                         " (select id from level_of_education where name = '" + listDisplayEducation.getModel().getElementAt(i).split(":")[1] + "'), " +
//                        " (select id from discipline where name = '" + listDisplayEducation.getModel().getElementAt(i).split(":")[2] + "'), '" + 
//                        listDisplayEducation.getModel().getElementAt(i).split(":")[3] + "'," +
//                        " (select id from grade_obtained where name = '" + listDisplayEducation.getModel().getElementAt(i).split(":")[4] + "'), '" +   
//                        listDisplayEducation.getModel().getElementAt(i).split(":")[5] + "'" +
//                            " ),";

                value += " ( '" + txtStaffID.getText() + "', " +
                         " (select id from school_attended where name = '" + itemsarray[0] + "'), " +
                         " (select id from level_of_education where name = '" + itemsarray[1] + "'), " +
                        " (select id from discipline where name = '" + itemsarray[2] + "'), '" + 
                        itemsarray[3] + "'," +
                        " (select id from grade_obtained where name = '" + itemsarray[4] + "'), '" +   
                        itemsarray[5] + "'" +
                            " ),";

        }
            
        stmt += value.trim().substring(0, value.trim().length()- 1);
//        stmt += value;
        System.out.println(stmt);

         DB_OPS dbops = new DB_OPS();
        dbops.createConnection();

           // System.out.println(stmt);   // Print the SQL statement for debugging purpose
            dbops.in_data(stmt);      
            if(dbops.error_msg.trim().length()==0)
            {
//                JOptionPane.showMessageDialog(this,  " Score Successfuly Recorded");
//                Utility myutil = new Utility();
//                String itemtoadd = comboLevelOfEducation.getSelectedItem() + " " + comboDiscipline.getSelectedItem() + " " + comboGrade.getSelectedItem() ;
//                myutil.fill_list(itemtoadd, listDisplayEducation );

            }
            else
                JOptionPane.showMessageDialog(this, "Error Occured While Recording Score "  + dbops.error_msg);
               dbops.close_conn();
        
    }
    
    private void save_work_experience()
    {
//        if (!(jRadioCA.isSelected() || jRadioExam.isSelected()))
//        {
//            JOptionPane.showMessageDialog(this,  " Please Select Continuous Assessment OR Exam");
//            return;
//        }
                String stmt;
        String value, present_status, absent_status;
//        stmt = "insert into ca_exam (exam_date, academic_session_id, academic_term_id, class_id, student_id,subject_id, score, exam_type) values ";
        stmt = "insert into teachers_work_experience (staff_id, place_of_work,  position, start_date ,end_date, leaving_reason  ) values ";
       
       
        value="";
        
        for (int i = 0; i < listDisplayWorkExperience.getModel().getSize(); i++)   
        {
//                value += " ( '" + txtStaffID.getText() + "', " +
//                         " (select id from school_attended where name = '" + comboSchoolAttended.getSelectedItem() + "'), " +
//                         " (select id from level_of_education where name = '" + comboLevelOfEducation.getSelectedItem() + "'), " +
//                        " (select id from discipline where name = '" + comboDiscipline.getSelectedItem() + "'), '" + jXDatePicker2.getDate() + "'," +
//                        " (select id from grade_obtained where name = '" + comboGrade.getSelectedItem() + "'), '" +   
//                        Double.parseDouble(jFormattedTextField1.getText()) + "/" + Double.parseDouble(jFormattedTextField2.getText()) + "'" +
//                            " ),";
                String test = listDisplayWorkExperience.getModel().getElementAt(i);
                String[] itemsarray = test.split("!");
                System.out.println(test.split("!")[0]);
//                value += " ( '" + txtStaffID.getText() + "', " +
//                         " (select id from school_attended where name = '" + listDisplayEducation.getModel().getElementAt(i).split(":")[0] + "'), " +
//                         " (select id from level_of_education where name = '" + listDisplayEducation.getModel().getElementAt(i).split(":")[1] + "'), " +
//                        " (select id from discipline where name = '" + listDisplayEducation.getModel().getElementAt(i).split(":")[2] + "'), '" + 
//                        listDisplayEducation.getModel().getElementAt(i).split(":")[3] + "'," +
//                        " (select id from grade_obtained where name = '" + listDisplayEducation.getModel().getElementAt(i).split(":")[4] + "'), '" +   
//                        listDisplayEducation.getModel().getElementAt(i).split(":")[5] + "'" +
//                            " ),";

                value += " ( '" + txtStaffID.getText() + "', '" +
                            itemsarray[0] + "', '" +
                            itemsarray[1] + "', '" +
                            itemsarray[2] + "', '" +
                            itemsarray[3] + "', '" +
                            itemsarray[4] + "' " +
                            " ),";

        }
            
        stmt += value.trim().substring(0, value.trim().length()- 1);
//        stmt += value;
        System.out.println(stmt);

         DB_OPS dbops = new DB_OPS();
        dbops.createConnection();

           // System.out.println(stmt);   // Print the SQL statement for debugging purpose
            dbops.in_data(stmt);      
            if(dbops.error_msg.trim().length()==0)
            {
//                JOptionPane.showMessageDialog(this,  " Score Successfuly Recorded");
//                Utility myutil = new Utility();
//                String itemtoadd = comboLevelOfEducation.getSelectedItem() + " " + comboDiscipline.getSelectedItem() + " " + comboGrade.getSelectedItem() ;
//                myutil.fill_list(itemtoadd, listDisplayEducation );

            }
            else
                JOptionPane.showMessageDialog(this, "Error Occured While Recording Score "  + dbops.error_msg);
               dbops.close_conn();
        
    }
    
    
    
    
    private void save_teachers_details()
    {
        
                        DB_OPS dbops = new DB_OPS();
        
        dbops.createConnection();
            String stmt = "insert into register_teacher (first_name, middle_name,last_name,marital_status, staff_id,sex, tribal_group, active) values ('"  + txtFirstName.getText()
                    + "','" + txtMiddleName.getText() + "','" + txtLastName.getText() + "','" + comboMaritalStatus.getSelectedItem() + "','" + txtStaffID.getText() + "','" 
                    + comboSex.getSelectedItem() + "','" +  comboTribalGroup.getSelectedItem() + "','" + "Y"  + "')";
            dbops.in_data(stmt);         
        
        
                    if(dbops.error_msg.trim().length()==0)
            JOptionPane.showMessageDialog(this, " Teacher's Registration Details Successfuly Inserted");
        else
            JOptionPane.showMessageDialog(this, "Error Occured While Inserting Teacher's Registration Details " + " : " + dbops.error_msg);
        
        
        
        
        
    }
    
    
    
    
    
    
    
    
    private void save_data()
    {
//        save_education();
          save_work_experience();
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
//        save_data();

//            Utility myutil = new Utility();
            String itemtoadd = comboSchoolAttended.getSelectedItem() + "!" + comboLevelOfEducation.getSelectedItem() + "!" 
                    + comboDiscipline.getSelectedItem() + "!" + comboYearObtained.getSelectedItem() + "!" + comboGrade.getSelectedItem()  + "!" 
                    + Double.parseDouble(jFormattedTextField1.getText()) + "/" + Double.parseDouble(jFormattedTextField2.getText()) ;
            
            listModel.addElement(itemtoadd);
            listDisplayEducation.setModel(listModel);
//            myutil.fill_list(itemtoadd, listDisplayEducation , listModel);

            
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
//        System.out.println(listDisplayEducation.getSelectedIndex());
        listModel.remove(listDisplayEducation.getSelectedIndex());
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
            System.out.println("Start Date : " +df.format(jXDatePicker2.getDate()));
            System.out.println("End Date : " +df.format(jXDatePicker3.getDate()));

            String itemtoadd = txtPlaceOfWork.getText().trim() + "!" + txtPositionAtWork.getText().trim()+ "!" 
                    + df.format(jXDatePicker2.getDate()) + "!" + df.format(jXDatePicker3.getDate()) + "!" + comboReason.getSelectedItem()  ;
            
            listModel2.addElement(itemtoadd);
            listDisplayWorkExperience.setModel(listModel2);

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        listModel2.remove(listDisplayWorkExperience.getSelectedIndex());
    }//GEN-LAST:event_jButton3ActionPerformed

    private void radioNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioNoActionPerformed

    private void comboTribalGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTribalGroupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboTribalGroupActionPerformed

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
            java.util.logging.Logger.getLogger(RegisterTeachers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterTeachers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterTeachers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterTeachers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                RegisterTeachers dialog = new RegisterTeachers(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel CGPA;
    private javax.swing.JLabel CGPA1;
    private javax.swing.JButton buttonRegisterTeacher;
    private javax.swing.JComboBox<String> comboDiscipline;
    private javax.swing.JComboBox<String> comboGrade;
    private javax.swing.JComboBox<String> comboLanguage;
    private javax.swing.JComboBox<String> comboLevelOfEducation;
    private javax.swing.JComboBox<String> comboMaritalStatus;
    private javax.swing.JComboBox<String> comboNationality;
    private javax.swing.JComboBox<String> comboPosition;
    private javax.swing.JComboBox<String> comboReason;
    private javax.swing.JComboBox<String> comboReligion;
    private javax.swing.JComboBox<String> comboSchoolAttended;
    private javax.swing.JComboBox<String> comboSex;
    private javax.swing.JComboBox<String> comboSpecialAilment;
    private javax.swing.JComboBox<String> comboStateOfOrigin;
    private javax.swing.JComboBox<String> comboTribalGroup;
    private javax.swing.JComboBox<String> comboYearObtained;
    private org.jdesktop.swingx.JXDatePicker date_joined;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker1;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker2;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker3;
    private javax.swing.JList<String> listDisplayEducation;
    private javax.swing.JList<String> listDisplayWorkExperience;
    private javax.swing.JRadioButton radioNo;
    private javax.swing.JRadioButton radioYes;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtMiddleName;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtPlaceOfWork;
    private javax.swing.JTextField txtPositionAtWork;
    private javax.swing.JTextField txtStaffID;
    // End of variables declaration//GEN-END:variables
}
