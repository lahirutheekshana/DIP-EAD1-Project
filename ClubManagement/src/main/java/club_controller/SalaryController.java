package club_controller;

import club_model.SalaryModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class SalaryController {
    private SalaryModel salaryModel = null ;
    private static Connection conn = null;
    private int ot = 0 ;
    private String currentUserEmail = null;
    
    public SalaryController (SalaryModel salaryModel) {
            currentUserEmail = CurrentUser.get_Email();
            this.salaryModel = salaryModel;             
            try {
                   conn = DBConnection.get_connection();
            } catch (ClassNotFoundException ex) {
                   System.err.println(ex.toString());
            }  
                    
    }
    
    public String getRole () {
        String role = "";
        try {           
            String query = "SELECT Staff_role FROM staff WHERE Staff_id = ? ";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, salaryModel.getStaffID());
            ResultSet resultSet = ps.executeQuery();
            
            while (resultSet.next()) {
                role = resultSet.getString("Staff_role");
            }     
        } catch (SQLException ex) {
            Logger.getLogger(SalaryController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return role;
    }
   
   
    
    public double CalSalary () { 
        double salary = 0.00;
        if (salaryModel.getW_hours() > 240) {
            ot  =  salaryModel.getW_hours() - 240;
        } else {
            ot  =  0;
        }
        if (getRole() == "Manager") {
            salary = 100000 + (ot * 500);
        } else if ("Chef".equals(getRole()) ) {
            salary = 80000 + (ot * 300);
        }else {
            salary = 50000 + (ot * 250);
        }
        return salary;
    }
    
       
    public void saveDetails () {
            try {          
                double salary  = CalSalary ();    
                String query = "INSERT INTO works (working_hours,staff_salary,staff_ot,admin_id,Staff_id) VALUES (?, ?, ?, ?, ?)";
                PreparedStatement ps = conn.prepareStatement(query);
                ps.setInt(1, salaryModel.getW_hours());
                ps.setDouble(2, salary);
                ps.setInt(3, 20);
                ps.setInt(4, 1);
                ps.setInt(5, salaryModel.getStaffID());
            
                int status = ps.executeUpdate();
                if (status == 1) {            
                    JOptionPane.showMessageDialog(null,"Detail save Successfull");
                } else {
                    JOptionPane.showMessageDialog(null,"Detail save failed");
               }
            } catch (SQLException ex) {
                   JOptionPane.showMessageDialog(null,"Staff ID cannot be Verified");
            }
       
    }
    
    
    public int getStaffId () {
                  int x = 0;
                  try {                                           
                           String query = "SELECT Staff_id FROM staff WHERE Staff_email = ? ";
                           PreparedStatement ps = conn.prepareStatement(query);
                           ps.setString(1, currentUserEmail);
                           ResultSet rs = ps.executeQuery();     
                           
                           if (rs.next()) {
                                   x = rs.getInt("Staff_id");
                           }   
                           else {
                               JOptionPane.showMessageDialog(null,"Staff ID Doesn't Exist in the Context");
                           }
                  } catch (SQLException ex) {
                           JOptionPane.showMessageDialog(null,ex.getMessage());
                  }
        return x ;
    }
    
       
    public void GetSalaryResults (JTable table) {
                  try {  
                           int x = getStaffId ();
                           String query = "SELECT * FROM works WHERE Staff_id = ? ";
                           PreparedStatement ps = conn.prepareStatement(query);
                           ps.setInt(1,getStaffId ());
                           ResultSet rs = ps.executeQuery(); 
               
                           DefaultTableModel Model = (DefaultTableModel) table.getModel();            
                           Model.setRowCount(0);
                
                           while (rs.next()) {
                                    Object[] rowData = {
                                          rs.getString(1), 
                                          rs.getDate(2), 
                                          rs.getDouble(3), 
                                          rs.getInt(4), 
                                          rs.getInt(5), 
                                          rs.getInt(6)  
                                    };
                                    Model.addRow(rowData);
                           }                               
                  } catch (SQLException ex) {
                           JOptionPane.showMessageDialog(null,"Something Went Wrong");
                  }
                  
    }
    
    
    
      public double getSalaryToLabel () {
                  double x = 0.00;
                  try {                                           
                           String query = "SELECT staff_salary FROM works WHERE Staff_id = ? ";
                           PreparedStatement ps = conn.prepareStatement(query);
                           ps.setInt(1, getStaffId ());
                           ResultSet rs = ps.executeQuery();     
                           
                           if (rs.next()) {
                                   x = rs.getDouble("staff_salary");
                           }   
                           else {
                               JOptionPane.showMessageDialog(null,"Staff ID Doesn't Exist in the Context");
                           }
                           
                  } catch (SQLException ex) {
                           JOptionPane.showMessageDialog(null,ex.getMessage());
                  }
        return x ;
    }
      
      
          public void GetSalaryResults2 (JTable table) {
                  try {  
                           String query = "SELECT * FROM works WHERE Staff_id = ? ";
                           PreparedStatement ps = conn.prepareStatement(query);
                           ps.setInt(1,  salaryModel.getStaffID());
                           ResultSet rs = ps.executeQuery(); 
               
                           DefaultTableModel Model = (DefaultTableModel) table.getModel();            
                           Model.setRowCount(0);
                
                           while (rs.next()) {
                                    Object[] rowData = {
                                          rs.getString(1), 
                                          rs.getDate(2), 
                                          rs.getInt(3), 
                                          rs.getDouble(4), 
                                          rs.getInt(5), 
                                          rs.getInt(6),
                                          rs.getInt(7)  
                                    };
                                    Model.addRow(rowData);
                           }                               
                  } catch (SQLException ex) {
                           JOptionPane.showMessageDialog(null,ex.getMessage());
                  }
                  
    }
       
}
