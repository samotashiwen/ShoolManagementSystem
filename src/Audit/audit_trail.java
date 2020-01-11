/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Audit;

import dbconnect.DB_OPS;
import javax.swing.JOptionPane;

/**
 *
 * @author sogobanjo
 */
public class audit_trail {
   
    
    public String operation_performed;
    
    public String current_date;
    
    public String current_time;
    
    
    public void audit_values(String operation_performed, String current_date, String current_time)
      
    {
        
        
        
        
    DB_OPS ops = new DB_OPS();
    ops.createConnection();
        
            String stmt = "insert into audit_trail(staff_id,operation_performed, captured_date, captured_time) value()";
            ops.in_data(stmt);         
        
        
                   // if(ops.error_msg.trim().length()==0)
            //JOptionPane.showMessageDialog(this, " Audit Values Successfuly Inserted");
       // else
            //JOptionPane.showMessageDialog(this, "Error Occured While Inserting Audit Details " + " : " + dbops.error_msg);
        
        
            
        
        
    }
    

    
    
    
    
    
}
