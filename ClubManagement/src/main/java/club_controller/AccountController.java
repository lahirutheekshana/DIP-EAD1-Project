
package club_controller;

import club_model.AccountModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class AccountController {
         private static Connection conn = null ;
    
         public AccountController () {
               try {
                   conn = DBConnection.get_connection();
               } catch (ClassNotFoundException ex) {
                   Logger.getLogger(AccountController.class.getName()).log(Level.SEVERE, null, ex);
               }          
         }
    
         public void GetResultsOfStaff (JTable table) {
                  try {           
                           String query = "SELECT * FROM staff" ;
                           PreparedStatement ps = conn.prepareStatement(query);
                           ResultSet rs = ps.executeQuery(); 
               
                           DefaultTableModel Model = (DefaultTableModel) table.getModel();            
                           Model.setRowCount(0);
               
                           while (rs.next()) {
                                    Object[] rowData = {
                                          rs.getInt(1), 
                                          rs.getString(2), 
                                          rs.getString(3), 
                                          rs.getString(4), 
                                          rs.getInt(5), 
                                          rs.getString(6),  
                                          rs.getString(7),
                                          rs.getInt(8),
                                    };
                                    Model.addRow(rowData);
                           }                               
                  } catch (SQLException ex) {
                           JOptionPane.showMessageDialog(null,ex.getMessage());
                  }
         }
         
         
         
         public void GetResultsOfMember (JTable table) {
                  try {           
                           String query = "SELECT * FROM member" ;
                           PreparedStatement ps = conn.prepareStatement(query);
                           ResultSet rs = ps.executeQuery(); 
               
                           DefaultTableModel Model = (DefaultTableModel) table.getModel();            
                           Model.setRowCount(0);
               
                           while (rs.next()) {
                                    Object[] rowData = {
                                          rs.getInt(1), 
                                          rs.getString(2), 
                                          rs.getString(3), 
                                          rs.getString(4), 
                                          rs.getString(5), 
                                          rs.getInt(6),  
                                          rs.getString(7),
                                          rs.getInt(8),
                                    };
                                    Model.addRow(rowData);
                           }                               
                  } catch (SQLException ex) {
                           JOptionPane.showMessageDialog(null,ex.getMessage());
                  }
         }
         
         
         public void GetResultsOfSalary (JTable table) {
                  try {           
                           String query = "SELECT * FROM works" ;
                           PreparedStatement ps = conn.prepareStatement(query);
                           ResultSet rs = ps.executeQuery(); 
               
                           DefaultTableModel Model = (DefaultTableModel) table.getModel();            
                           Model.setRowCount(0);
               
                           while (rs.next()) {
                                    Object[] rowData = {
                                         rs.getInt(1),
                                          rs.getDate(2), 
                                          rs.getInt(3), 
                                          rs.getDouble(4), 
                                          rs.getInt(5), 
                                          rs.getInt(6), 
                                          rs.getInt(7),  
                                    };
                                    Model.addRow(rowData);
                           }                               
                  } catch (SQLException ex) {
                           JOptionPane.showMessageDialog(null,ex.getMessage());
                  }
         }
         
         public void updateStaffAccount (AccountModel model) {
                  try {           
                           String query = "UPDATE staff SET Staff_role = ?, Staff_Fname = ?, Staff_Lname = ?, Staff_age = ?, Staff_email = ?, Staff_password = ?, admin_id = ? WHERE Staff_id = ?" ;
                           PreparedStatement ps = conn.prepareStatement(query);
                           ps.setString(1, model.getStaffRole());
                           ps.setString(2, model.getStaffFname());
                           ps.setString(3, model.getStaffLname());
                           ps.setInt(4, model.getAge());
                           ps.setString(5, model.getStaffEmail());
                           ps.setString(6, model.getStaffPassword());
                           ps.setInt(7, model.getAdminId());
                           ps.setInt(8, model.getStaffId());
                           
                           int status = ps.executeUpdate();
                           if (status == 1) {            
                                    JOptionPane.showMessageDialog(null,"Data has been Updated");
                           } else {
                                    JOptionPane.showMessageDialog(null,"Data Not Updated,Try Again");
                           }
                                                                
                  } catch (SQLException ex) {
                           JOptionPane.showMessageDialog(null,ex.getMessage());
                  } 
         }
         
         
         public void updateMemberAccount (AccountModel model) {
                  try {           
                           String query = "UPDATE member SET M_Fname = ?, M_Lname =  ?, M_email = ?, M_password = ?, M_age = ?, M_Mobile = ?, admin_id = ? WHERE M_id = ?" ;
                           PreparedStatement ps = conn.prepareStatement(query);
                           ps.setString(1, model.getMemberFname());
                           ps.setString(2, model.getMemberLname());
                           ps.setString(3, model.getMemberEmail());
                           ps.setString(4, model.getMemberPassword());
                           ps.setInt(5, model.getMemberAge());
                           ps.setString(6, model.getMemberMobile());
                           ps.setInt(7, model.getAdminId());
                           ps.setInt(8, model.getMemberId());
                           
                           int status = ps.executeUpdate();
                           if (status == 1) {            
                                    JOptionPane.showMessageDialog(null,"Data has been Updated");
                           } else {
                                    JOptionPane.showMessageDialog(null,"Data Not Updated,Try Again");
                           }
                                                                
                  } catch (SQLException ex) {
                           JOptionPane.showMessageDialog(null,ex.getMessage());
                  } 
         }
         
         public void updateSalaryAccount (AccountModel model) {
                  try {           
                           String query = "UPDATE works SET working_date = ?, working_hours =  ?, staff_salary = ?, staff_ot  = ?, admin_id = ? WHERE id = ?" ;
                           PreparedStatement ps = conn.prepareStatement(query);
                           ps.setString(1, model.getWorkingDate());
                           ps.setInt(2, model.getWorkingHours());
                           ps.setDouble(3, model.getStaffSalary());
                           ps.setInt(4, model.getStaffOT());
                           ps.setInt(5, model.getAdminId());
                           ps.setInt(6, model.getStaffId());
                           
                           int status = ps.executeUpdate();
                           if (status == 1) {            
                                    JOptionPane.showMessageDialog(null,"Data has been Updated");
                           } else {
                                    JOptionPane.showMessageDialog(null,"Data Not Updated,Try Again");
                           }
                                                                
                  } catch (SQLException ex) {
                           JOptionPane.showMessageDialog(null,ex.getMessage());
                  } 
         }
    
         public void deleteStaffRow (AccountModel model) {
                  try {           
                           String query = "DELETE FROM staff WHERE Staff_id = ?" ;
                           PreparedStatement ps = conn.prepareStatement(query);
                           ps.setInt(1, model.getStaffId());
                           
                           int status = ps.executeUpdate();
                           if (status == 1) {            
                                    JOptionPane.showMessageDialog(null,"Deleted Successfully");
                           } else {
                                    JOptionPane.showMessageDialog(null,"Try Again !");
                           }
                                                                
                  } catch (SQLException ex) {
                           JOptionPane.showMessageDialog(null,ex.getMessage());
                  } 
         }
         
         public void deleteMemberRow (AccountModel model) {
                  try {           
                           String query = "DELETE FROM member WHERE M_id = ?" ;
                           PreparedStatement ps = conn.prepareStatement(query);
                           ps.setInt(1, model.getMemberId());
                           
                           int status = ps.executeUpdate();
                           if (status == 1) {            
                                    JOptionPane.showMessageDialog(null,"Deleted Successfully");
                           } else {
                                    JOptionPane.showMessageDialog(null,"Try Again !");
                           }
                                                                
                  } catch (SQLException ex) {
                           JOptionPane.showMessageDialog(null,ex.getMessage());
                  } 
         }
         
         
         public void deleteSalaryRow (AccountModel model) {
                  try {           
                           String query = "DELETE FROM works WHERE id = ?" ;
                           PreparedStatement ps = conn.prepareStatement(query);
                           ps.setInt(1, model.getStaffId());
                           
                           int status = ps.executeUpdate();
                           if (status == 1) {            
                                    JOptionPane.showMessageDialog(null,"Deleted Successfully");
                           } else {
                                    JOptionPane.showMessageDialog(null,"Try Again !");
                           }
                                                                
                  } catch (SQLException ex) {
                           JOptionPane.showMessageDialog(null,ex.getMessage());
                  } 
         }
}
