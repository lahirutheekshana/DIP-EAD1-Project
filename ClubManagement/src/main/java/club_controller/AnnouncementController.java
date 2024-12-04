package club_controller;

import club_model.AnnouncementModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class AnnouncementController {
     
    private static Connection conn = null ;
    
         public AnnouncementController () {
                  try {
                      conn = DBConnection.get_connection();
                  } catch (ClassNotFoundException ex) {
                      System.err.println(ex.toString());
                  }  
         }
         
         
      public void GetAnnToTable (JTable table) {
                  try {           
                           String query = "SELECT * FROM announcement " ;
                           PreparedStatement ps = conn.prepareStatement(query);
                           ResultSet rs = ps.executeQuery(); 
                           
                           DefaultTableModel Model = (DefaultTableModel) table.getModel();            
                           Model.setRowCount(0);    
               
                           while (rs.next()) {
                                    Object[] rowData = {
                                          rs.getInt(1), 
                                          rs.getTime(2), 
                                          rs.getDate(3), 
                                          rs.getString(4), 
                                          rs.getString(5), 
                                          rs.getInt(6)  
                                    };
                                    Model.addRow(rowData);
                           }                               
                  } catch (SQLException ex) {
                           JOptionPane.showMessageDialog(null,ex.getMessage());
                  }
    }
       
         
     public void InsertToAnn (AnnouncementModel model, JTable table) {
          try {           
                  String query = "INSERT INTO announcement (Ann_title,Ann_description,admin_id) VALUES (?, ?, ?)";
                  PreparedStatement ps = conn.prepareStatement(query);       
                  ps.setString(1, model.getTitle());
                  ps.setString(2, model.getDescription());
                  ps.setInt(3, model.getAdminID());
        
                  int status = ps.executeUpdate();
                  if (status == 1) {            
                      JOptionPane.showMessageDialog(null,"Delivered Successfully");
                      GetAnnToTable(table);
                  } else {
                      JOptionPane.showMessageDialog(null,"Delivered Failed");
                  }
             } catch (SQLException ex) {
                     JOptionPane.showMessageDialog(null,ex.getMessage());
             }
    }
    
     
     public String DataToTextField (JTable table) {
             int x = table.getSelectedRow();
             String description =  table.getModel().getValueAt(x, 4).toString();
             return description ;
    }
     
   public void DeleteFromAnn (JTable table) {
         try {
              String query = "DELETE FROM announcement WHERE Ann_id = ?; ";
              PreparedStatement ps = conn.prepareStatement(query);
              ps.setInt(1, GetIdentity (table));
                       
              int status = ps.executeUpdate();
              if (status == 1) {
                  JOptionPane.showMessageDialog(null,"Announcement Deleted");
              } else {
                  JOptionPane.showMessageDialog(null,"Announce Deletion Failed");
              }
        } catch (SQLException ex) {
              Logger.getLogger(ReservationsController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
    public int GetIdentity (JTable table) {
             int x = table.getSelectedRow();
             int Ann_id =  (int) table.getModel().getValueAt(x, 0);
             return Ann_id;
     }  
     
}
