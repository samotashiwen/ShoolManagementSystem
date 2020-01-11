package dbconnect;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package App_Data;

/**
 *
 * @author IETECH
 */
  public  class App_Data {
    static Integer Number_of_Rows_Read;
    static Integer Number_of_Rows_Written;
    static String current_Database;
    static String current_Table;
    public static String app_DB;

//    public static String DBURL = "jdbc:postgresql://localhost/Archive?user=postgres&password=idsmpostadmin";
//    public static String DBDRIVER = "org.postgresql.Driver";

//    public static String DBURL = "jdbc:sqlserver://SOGOBANJO-PC\\SQLEXPRESS;databaseName=SchoolManagement;user=sa;password=Samo$123";
//    public static String DBURL = "jdbc:sqlserver://localhost;databaseName=SchoolManagement;user=schoolman;password=schoolman";
//    public static String DBDRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";

    public  static String DBURL = "jdbc:mysql://localhost:3306/SchoolManagement;User=root;Password=";
    public static String DBDRIVER = "com.mysql.jdbc.Driver";
    public static String Status ;
    public static String OP ;
    public static String user;
    public static Boolean null_pass;
    public static Integer app_err = 1;

    public static Integer inview = 0;
    //public static String SYBASE_DBURL = "jdbc:postgresql://localhost/Archive?user=postgres&password=idsmpostadmin";
//    public static String SYBASE_DBDRIVER = "com.sybase.jdbc4.jdbc.SybDriver";
 
    public static String sche_opd;
    
    public static Integer source_DB_id;
    public static Integer staging_DB_id;
    public static Integer dest_DB_id;
    public static Integer Curr_DB_id;
    public static Integer src;
    
    public static Integer chunk, num_of_processes;
    
    public static int query_result;
    
    public static String general_tab_name = ""; // = "Archive_log" +  df.format(dateobj) + dft.format(dateobj) + ".txt";
    public static String read_tab_name = ""; // = "Read_log" +  df.format(dateobj) + dft.format(dateobj) + ".txt";
    public static String written_tab_name = "";  // = "written_log" +  df.format(dateobj) +  dft.format(dateobj) + ".txt";
    public static String del_tab_name = "";  // = "delete_log" +  df.format(dateobj) +  dft.format(dateobj) + ".txt";
    
    public static int number_of_config;
    public static int number_of_servers;
    
    public static String[] menus =new String[100];

}
