/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainApp;

import java.sql.ResultSet;
import dbconnect.DB_OPS;
import javax.swing.JList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author sogobanjo
 */
public class Utility {
    
    public Utility()
    {
        
    }
    
        public void fill_list(javax.swing.JComboBox JBox, ResultSet Rset)
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

        
        
            public void fill_list(JList thelist, String stmt_str)
    {
        DB_OPS for_dbops = new DB_OPS();
        try
        {
            DefaultListModel listModel = new DefaultListModel();
             ResultSet results;
        
//            for_dbops.DBdriverstring =App_Data.DBDRIVER;
//            for_dbops.dbURL = App_Data.DBURL;

            for_dbops.createConnection();
//            String tablename = "\"Archiver\".\"DB_pathname\"";  
//            String stmt_str = "select \"DB_Name\" from " + tablename ;
            results = for_dbops.sel_data(stmt_str);
//            System.out.println(" The Statement : " + stmt_str);
            listModel.removeAllElements();
            thelist.setModel(listModel);
            
            while (results.next())
            {
                listModel.addElement(results.getString(1));
            }
            
            thelist.setModel(listModel);
            
            for_dbops.close_conn();

        }
        catch (Exception except)
        {
            for_dbops.close_conn();
            Utility app_util = new Utility();
//            app_util.write_log(general_tab_name,except.getMessage());
//            app_util.MsgBox("Error Occured : \nPlease Check Log File", "Fill List", null);

            System.out.println(except.toString());
            except.printStackTrace();
        }

    }
            
    public void fill_list(String itemtoadd,  DefaultListModel listModel)
    {
//        DB_OPS for_dbops = new DB_OPS();
        try
        {
//             ResultSet results;
        
//            for_dbops.DBdriverstring =App_Data.DBDRIVER;
//            for_dbops.dbURL = App_Data.DBURL;

//            for_dbops.createConnection();
//            String tablename = "\"Archiver\".\"DB_pathname\"";  
//            String stmt_str = "select \"DB_Name\" from " + tablename ;
//            results = for_dbops.sel_data(stmt_str);
//            System.out.println(" The Statement : " + stmt_str);
//            listModel.removeAllElements();
//            thelist.setModel(listModel);
            
//            DefaultListModel listModel = new DefaultListModel();
//            while (results.next())
//            {
                listModel.addElement(itemtoadd);
//            }
//            
//            thelist.setModel(listModel);
            
//            for_dbops.close_conn();

        }
        catch (Exception except)
        {
//            for_dbops.close_conn();
            Utility app_util = new Utility();
//            app_util.write_log(general_tab_name,except.getMessage());
//            app_util.MsgBox("Error Occured : \nPlease Check Log File", "Fill List", null);

            System.out.println(except.toString());
            except.printStackTrace();
        }

    }
            

        
        
}
