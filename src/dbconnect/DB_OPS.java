package dbconnect;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//package DB;

//import App_Data.Utility;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

/**
 *
 * @author OOO
 */
public class DB_OPS {

//        private static String dbURL = "jdbc:derby://localhost:1527/emission_db";
//        private static String dbURL = "jdbc:derby:C:\\Users\\OOO\\.netbeans-derby\\emission_db";
//        public  static String dbURL = "jdbc:derby:C:\\Finger PRNT\\DB\\two_way_DB";
        public String dbURL ; //= "jdbc:sqlserver://localhost\\SQLEXPRESS:1433;databaseName=fingerdb;User=twoway;Password=myPass#1";
//        public static String tableName = "category_tab";
// jdbc Connection
        public  Connection conn = null;
        private static Statement stmt = null;
        private static Date thedate;
        
        public String error_msg;
        private  ResultSet Results;
        public  String DBdriverstring;
        public Integer conn_error_flag, db__error_flag;

    public void DB_OPS()
    {}
    
/*    public void DB_OPS(String dbdriver, String fordbURL)
    {
        dbURL = fordbURL; 
        DBdriverstring = dbdriver;
    }
*/       
        public  void  createConnection()
        {
//            Utility util_app = new Utility();
            try
            {
     //        Class.forName("org.apache.derby.jdbc.ClientDriver"); //.newInstance();
//            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
                DBdriverstring = App_Data.DBDRIVER;
                dbURL = App_Data.DBURL;
                

                Class.forName(DBdriverstring);
             //Get a connection
//                conn = DriverManager.getConnection(dbURL);
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/SchoolManagement","root","");   //dor mysal
                if (conn == null){
          //      for_error.setText(conn.toString());
//                   System.out.println("NULL");
          //      System.out.println(" NOT NULL");
                    error_msg = "CONNECTION FAILURE";
                    conn_error_flag = 1;
//                    return null;
                }
                else
                {
                    error_msg = "CONNECTION SUCCESS";
                    conn_error_flag = 0;
//                    return conn;
                }
               }
            catch (Exception except)
            {
              error_msg = " CREATE CONNECTION " + except.toString() ;
                conn_error_flag = 1;
//                util_app.write_log(util_app.general_tab_name,error_msg);
              System.out.println(except.toString());
              except.printStackTrace();
//              return null;
            }
        }

    public  void in_data(String tableName, String values)
    {
        error_msg = "";
        db__error_flag =0;
        try
        {
          //        for_error.setText("Yea Here b4 create stmt");
          
   System.out.println("Getting here");
            stmt = conn.createStatement();
//            System.out.println("insert into " + tableName + " values(" + 
//                    values + ");");
    System.out.println("Value = " + values);
            stmt.execute("insert into " + tableName + " values(" + 
                    values + ")");
 
           System.out.println("insert into " + tableName + " values(" + 
                    values + ")");
            
            stmt.close();           
        }
        catch (SQLException sqlExcept)
        {
            //sqlExcept.printStackTrace();
            db__error_flag =1;
            error_msg = "IN DATA " + sqlExcept.toString();
            System.out.println("ERROR : " + sqlExcept.toString());
        }
    }

    public  void in_data(String Insert_stmt)
    {
        error_msg = "";
        try
        {
          //        for_error.setText("Yea Here b4 create stmt");
          
            
            stmt = conn.createStatement();
//            System.out.println(Insert_stmt);

//System.out.println("IN DATA BEFORE EXECUTE");
            stmt.execute(Insert_stmt);
 
//System.out.println("IN DATA AFTER EXECUTE");            
            db__error_flag =0;
            
            stmt.close();           
        }
        catch (Exception sqlExcept)
        {
            //sqlExcept.printStackTrace();
            db__error_flag =1;
            error_msg = "IN DATA " +  sqlExcept.getMessage();
            System.out.println("ERROR : " + sqlExcept.toString());
        }
    }
    
    
    public  void in_data(String tableName, String fields, String values)
    {
        error_msg = "";
        try
        {
          //        for_error.setText("Yea Here b4 create stmt");
          
            
            stmt = conn.createStatement();
            System.out.println("insert into " + tableName + "(" + fields + ") values(" + 
                    values + ");");

//System.out.println("IN DATA BEFORE EXECUTE");
            stmt.execute("insert into " + tableName + "(" + fields + ") values(" + 
                    values + ")");
 
//System.out.println("IN DATA AFTER EXECUTE");            
            db__error_flag =0;
            
            stmt.close();           
        }
        catch (Exception sqlExcept)
        {
            //sqlExcept.printStackTrace();
            db__error_flag =1;
            error_msg = "IN DATA " + sqlExcept.toString();
            System.out.println("ERROR : " + sqlExcept.toString());
        }
    }
    
    public ResultSet sel_data (String stmt_str)
    {
          ResultSet results;
          results=null;
         error_msg = "";
          try
        {
          //        for_error.setText("Yea Here b4 create stmt");
            stmt = conn.createStatement();
            results = stmt.executeQuery(stmt_str); 
//                     + " where cat_code = " + upd_combo.getSelectedItem());
 
            db__error_flag = 0;
            return results;
            
 //           stmt.close();            
        }
        catch (SQLException sqlExcept)
        {
            db__error_flag = 1;
            error_msg = "SEL CATE " + sqlExcept.toString();
            System.out.println("Error " + error_msg);
            sqlExcept.printStackTrace();
        }    
           
           return results;
    }
    
    public void upd_data(String stmt_str)
    {
        error_msg = "";
        db__error_flag = 0;
        try
        {
          //        for_error.setText("Yea Here b4 create stmt");          
            stmt = conn.createStatement();
            stmt.execute(stmt_str);
            
            stmt.close();            
        }
        catch (SQLException sqlExcept)
        {
//            JSGD for_error = new JSGD(0);
            
             db__error_flag = 1;
           error_msg = sqlExcept.getMessage();
//            Utility app_util = new Utility();
//            app_util.write_log(app_util.general_tab_name, error_msg);
//            for_error.jLabelStatus.setText(error_msg);
//            sqlExcept.printStackTrace();
        }
    }
    
    public void del_data(String table, String where)
    {
        error_msg = "";
        try
        {
          //        for_error.setText("Yea Here b4 create stmt");
          
            stmt = conn.createStatement();
            stmt.execute("delete  from "  + table 
                    + where);
                    
                 System.out.println("delete  from "  + table 
                    + where);
 
                 stmt.close();
            
        }
        catch (SQLException sqlExcept)
        {
             error_msg = "SEL CATE " + sqlExcept.toString();
//            Utility app_util = new Utility();
//            app_util.write_log(app_util.general_tab_name, error_msg);
             sqlExcept.printStackTrace();
           //sqlExcept.printStackTrace();
        }    
    }
    
    public void close_conn()
    {
        try
        {
            conn.close(); 
        }
        catch (Exception except)
        {
            System.out.println(except.toString());
            except.printStackTrace();
        }

    }

}
