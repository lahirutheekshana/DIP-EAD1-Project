package club_controller;

import club_model.MessageModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MessageController {
     private static Connection conn = null ;
     private static String currentUserEmail;
     
     public MessageController () {
         currentUserEmail = CurrentUser.get_Email();
         try {
             conn = DBConnection.get_connection();
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(MessageController.class.getName()).log(Level.SEVERE, null, ex);
         }
     }
     
     public int getId () {
                  int x = 0;
                  try {                                           
                           String query = "SELECT Staff_id FROM staff WHERE Staff_email = ? ";
                           PreparedStatement ps = conn.prepareStatement(query);
                           ps.setString(1, currentUserEmail);
                           ResultSet rs = ps.executeQuery();     
                           
                           if (rs.next()) {
                                   x = rs.getInt("Staff_id");
                           }   
                           
                  } catch (SQLException ex) {
                           JOptionPane.showMessageDialog(null,ex.getMessage());
                  }
        return x ;
    }
     
     
     public void InsertMessageToDataBase (MessageModel model) {
        try {          
            String query = "INSERT INTO messages (Message,Staff_id) VALUES (?, ?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, model.getMessage());
            ps.setInt(2, getId ());

            
            int status = ps.executeUpdate();
            if (status == 1) {            
                JOptionPane.showMessageDialog(null,"Message Send !!");
            } else {
                JOptionPane.showMessageDialog(null,"Error Sending Message !!");
            }
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,ex.getMessage());
        }
    }
     
     
     public void GetMessageToTable  (JTable table) {
                  try {           
                           String query = "SELECT * FROM messages ";
                           PreparedStatement ps = conn.prepareStatement(query);
                           ResultSet rs = ps.executeQuery(); 
               
                           DefaultTableModel Model = (DefaultTableModel) table.getModel();            
                           Model.setRowCount(0);
               
                           while (rs.next()) {
                                    Object[] rowData = {
                                          rs.getInt(1), 
                                          rs.getString(2), 
                                          rs.getInt(3), 
                                    };
                                    Model.addRow(rowData);
                           }                               
                  } catch (SQLException ex) {
                           JOptionPane.showMessageDialog(null,"Something Went Worng");
                  }
    }
     
     public String GetDescriptionToTextField (JTable table) {
             int x = table.getSelectedRow();
             String message =  (String) table.getModel().getValueAt(x, 1);
             return message;
    }  
     
    public int GetIDToTextField (JTable table) {
             int x = table.getSelectedRow();
             int ID =  (int) table.getModel().getValueAt(x, 0);
             return ID;
    } 
     
}
