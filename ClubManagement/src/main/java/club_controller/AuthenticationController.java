
package club_controller;

import club_model.AuthenticationModel;
import club_view.FrmAdminDash;
import club_view.FrmLogin;
import club_view.FrmRegister2;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class AuthenticationController {
         private static Connection conn = null;
         private AuthenticationModel Authenticater = null;
         public static String role = "";
         
         public AuthenticationController ( ){                         
                  try {
                           conn = DBConnection.get_connection();
                  } catch (ClassNotFoundException ex) {
                           System.err.println(ex.toString());
                  }                   
         }
    
         public AuthenticationController ( AuthenticationModel Authenticater){               
                  this.Authenticater = Authenticater;
             
                  try {
                           conn = DBConnection.get_connection();
                  } catch (ClassNotFoundException ex) {
                           System.err.println(ex.toString());
                  }                   
         }
         
         public void registerMember (AuthenticationModel Authenticater) throws SQLException {

                String query = "INSERT INTO member ( M_Fname,M_Lname,M_email,M_password,M_age,M_Mobile,admin_id) VALUES (?, ?, ?, ?, ?, ?,?)";
                PreparedStatement ps = conn.prepareStatement(query);
                ps.setString(1, Authenticater.getFname());
                ps.setString(2, Authenticater.getLname());
                ps.setString(3, Authenticater.getEmail());
                ps.setString(4, Authenticater.getPassword());
                ps.setInt(5, Authenticater.getAge());
                ps.setString(6, Authenticater.getMobile());
                ps.setInt(7, 1);
                
                
                  int status = ps.executeUpdate();
                  if (status == 1) {
                           JOptionPane.showMessageDialog(null,"save member Successfull");
                  } else {
                           JOptionPane.showMessageDialog(null,"save member failed");
                  }
         }
                 
         
       
         
         public void registerStaffMember (AuthenticationModel Authenticater) throws SQLException {
                 String query = "INSERT INTO staff ( Staff_role,Staff_Fname,Staff_Lname,Staff_age,Staff_email,Staff_Password,admin_id) VALUES (?, ?, ?, ?, ?, ?, ?)";
                 PreparedStatement ps = conn.prepareStatement(query);
                 
                  ps.setString(1, Authenticater.getStaff_role());
                  ps.setString(2, Authenticater.getFname());
                  ps.setString(3, Authenticater.getLname());
                  ps.setInt(4, Authenticater.getAge());
                  ps.setString(5, Authenticater.getEmail());
                  ps.setString(6, Authenticater.getPassword());
                  ps.setInt(7, Authenticater.getAdmin_id());
                
                  int status = ps.executeUpdate();
                  if (status == 1) {
                           JOptionPane.showMessageDialog(null,"Saved Staff member Successfull");
                  } else {
                           JOptionPane.showMessageDialog(null,"saved Staff member Failed");
                  }                               
         }    
         
         
         public int loginMember (AuthenticationModel Authenticater) throws SQLException {   
                  int x = 0;
                  try {
                        String query = "SELECT * FROM member WHERE M_email =? AND M_password=?";
                        PreparedStatement ps = conn.prepareStatement(query);
                        ps.setString(1, Authenticater.getEmail());
                        ps.setString(2, Authenticater.getPassword());
                        
                        ResultSet rs =  ps.executeQuery();
                        if(rs.next()) {
                                x = 1;
                        }
                  } catch (SQLException e) {
                         System.err.println("SQL error: " + e.getMessage());
                  }
             return x;
         }        
         
         
         public int loginStaffMember (AuthenticationModel Authenticater) throws SQLException {   
                  int x = 0 ;
                  try {
                        String query = "SELECT * FROM staff WHERE Staff_email =? AND Staff_password=?";
                        PreparedStatement ps = conn.prepareStatement(query);
                        ps.setString(1, Authenticater.getEmail());
                        ps.setString(2, Authenticater.getPassword());
                        
                        ResultSet rs =  ps.executeQuery();
                        if(rs.next()) {
                           x =1 ;
                        }
                  } catch (SQLException e) {
                         System.err.println("SQL error: " + e.getMessage());
                  }                                 
             return x;
         } 
         
         
         public int loginAdmin (AuthenticationModel Authenticater) throws SQLException {   
                  int x = 0 ;
                  try {
                        String query = "SELECT * FROM admin WHERE admin_email =? AND admin_password=?";
                        PreparedStatement ps = conn.prepareStatement(query);
                        ps.setString(1, Authenticater.getEmail());
                        ps.setString(2, Authenticater.getPassword());
                        
                        ResultSet rs =  ps.executeQuery();
                        if(rs.next()) {
                           x =1 ;
                        }
                  } catch (SQLException e) {
                         System.err.println("SQL error: " + e.getMessage());
                  }                              
             return x;
         }   
         
         
         public static void getEmail (AuthenticationModel roleModel) {  
             role =  roleModel.getRole();  
         }

         
         
         public static void findRole (AuthenticationModel roleModel) {  
             role =  roleModel.getRole();  
         }
         

}
