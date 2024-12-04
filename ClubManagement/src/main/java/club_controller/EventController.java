
package club_controller;

import club_model.EventModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class EventController {
    private static Connection conn = null;
    public String Date = "" ;
    public String Title = "";
    public String Type = "";
    
    public EventController () {
         try {
               conn = DBConnection.get_connection();
         } catch (ClassNotFoundException ex) {
               System.err.println(ex.toString());
         }  
    }
    
    public void inputDetails (EventModel model) {
         try {
                 String query = "INSERT INTO xevents (Event_title,Event_date,Event_time,Event_type,Event_Description,admin_id) VALUES (?, ?, ?, ?, ?, ?)";
                 PreparedStatement ps = conn.prepareStatement(query);
                 ps.setString(1, model.getTitle());
                 ps.setString(2, model.getDate());
                 ps.setString(3, model.getTime());
                 ps.setString(4, model.getEventType());
                 ps.setString(5, model.getDes());
                 ps.setInt(6, 1);
            
                 int status = ps.executeUpdate();
                 if (status == 1) {
                       JOptionPane.showMessageDialog(null,"Event Created");
                 } else {
                       JOptionPane.showMessageDialog(null,"Event Not Created");
                 }
         } catch (SQLException ex) {
                    Logger.getLogger(EventController.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
    
    
     public void GetEventResults (JTable table) {
                  try {           
                           String query = "SELECT * FROM xevents" ;
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
                                          rs.getString(6),  
                                          rs.getString(7),
                                          rs.getString(8),
                                          rs.getInt(9)
                                    };
                                    Model.addRow(rowData);
                           }                               
                  } catch (SQLException ex) {
                           JOptionPane.showMessageDialog(null,"Staff ID cannot be Verified");
                  }
    }
     
     
    public void getDataToVariable () {
                  try {           
                           String query = "SELECT * FROM xevents ORDER BY post_time DESC LIMIT 1; ";
                           PreparedStatement ps = conn.prepareStatement(query);
                           ResultSet rs = ps.executeQuery();     
                           
                           if (rs.next()) {
                                  Date = rs.getString("Event_date");
                                  Title = rs.getString("Event_title");
                                  Type = rs.getString("Event_type");
                           } 
                              
                  } catch (SQLException ex) {
                           JOptionPane.showMessageDialog(null,ex.getMessage());
                  }
    }
    
    
}
