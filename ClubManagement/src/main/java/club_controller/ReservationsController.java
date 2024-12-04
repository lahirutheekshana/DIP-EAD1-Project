package club_controller;

import club_model.ReservationsModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ReservationsController {
    private static Connection conn = null;
    private static String currentUserEmail;
    
    public ReservationsController () {
        currentUserEmail = CurrentUser.get_Email();
        try {
            conn = DBConnection.get_connection();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ReservationsController.class.getName()).log(Level.SEVERE, null, ex);
        }      
    }
    
     public int getAvailableRoom () {
                  int x = 0;
                  try {                                           
                           String query = "SELECT room_num FROM room WHERE statuss = 1 ORDER BY room_num LIMIT 1;";
                           PreparedStatement ps = conn.prepareStatement(query);
                           ResultSet rs = ps.executeQuery();     
                           
                           if (rs.next()) {
                                   x = rs.getInt("room_num");                                  
                           }   
                           
                  } catch (SQLException ex) {
                           JOptionPane.showMessageDialog(null,ex.getMessage());
                  }
        return x ;
    }
         
   public void chageRoomStatuss () {
        try {          
            String query = "UPDATE room SET statuss = 0 WHERE room_num = ?;";
            PreparedStatement ps = conn.prepareStatement(query);   
            ps.setInt(1,getAvailableRoom ());
            ps.executeUpdate();
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,ex.getMessage());
        }
   }
       
     
    public int getAvailableHall () { 
                  int x = 0;
                  try {                                           
                           String query = "SELECT hall_num FROM hall WHERE statuss = 1 ORDER BY hall_num LIMIT 1;";
                           PreparedStatement ps = conn.prepareStatement(query);
                           ResultSet rs = ps.executeQuery();     
                           
                           if (rs.next()) {
                                   x = rs.getInt("hall_num");             
                           }   
                           
                  } catch (SQLException ex) {
                           JOptionPane.showMessageDialog(null,ex.getMessage());
                  }
        return x;              
    }
    
   public void chageHallStatuss  () {
        try {          
            String query = "UPDATE hall SET statuss = 0 WHERE hall_num = ?;";
            PreparedStatement ps = conn.prepareStatement(query);          
            ps.setInt(1,getAvailableHall ());
            
            ps.executeUpdate();
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,ex.getMessage());
        }
   }
     
   
    public void saveRoomResDetails  (ReservationsModel model) {
        try {
            String query = "INSERT INTO room_reservation (R_date,R_hours, R_time ,M_id,admin_id,Room_num) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, model.getDate());
            ps.setInt(2,model.getHours());
            ps.setString(3, model.getTime());
            ps.setInt(4, getId());
            ps.setInt(5, 1);
            ps.setInt(6, getAvailableRoom ());
            
            
            int status = ps.executeUpdate();
            if (status == 1) {
                JOptionPane.showMessageDialog(null,"Reservation On Pending");
                chageRoomStatuss ();
            } else {
                JOptionPane.showMessageDialog(null,"Reservation Not Accepted");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"No Rooms Available");
        }
    }
    
    
    public void saveHallResDetails  (ReservationsModel model) {
        try {
            String query = "INSERT INTO hall_reservation (R_date,R_hours, R_time ,M_id,admin_id,Hall_num) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, model.getDate());
            ps.setInt(2,model.getHours());
            ps.setString(3, model.getTime());
            ps.setInt(4, getId());
            ps.setInt(5, 1);
            ps.setInt(6,getAvailableHall ());
                       
            int status = ps.executeUpdate();
            if (status == 1) {
                JOptionPane.showMessageDialog(null,"Hall Reservation On Pending");
                chageHallStatuss  ();
            } else {
                JOptionPane.showMessageDialog(null,"Reservation Not Accepted");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
    }
    
    public int getId () {
                  int x = 0;
                  try {                                           
                           String query = "SELECT M_id FROM member WHERE M_email = ? ";
                           PreparedStatement ps = conn.prepareStatement(query);
                           ps.setString(1, currentUserEmail);
                           ResultSet rs = ps.executeQuery();     
                           
                           if (rs.next()) {
                                   x = rs.getInt("M_id");
                           }   
                           
                  } catch (SQLException ex) {
                           JOptionPane.showMessageDialog(null,ex.getMessage());
                  }
        return x ;
    }
    
    
     public void GetRoomResResults (JTable table) {
                  try {           
                           String query = "SELECT * FROM room_reservation" ;
                           PreparedStatement ps = conn.prepareStatement(query);
                           ResultSet rs = ps.executeQuery(); 
               
                           DefaultTableModel Model = (DefaultTableModel) table.getModel();            
                           Model.setRowCount(0);
               
                           while (rs.next()) {
                                    Object[] rowData = {
                                          rs.getInt(1), 
                                          rs.getString(2), 
                                          rs.getString(3), 
                                          rs.getInt(4), 
                                          rs.getString(5), 
                                          rs.getString(6),  
                                          rs.getInt(7),  
                                          rs.getInt(8),  
                                          rs.getInt(9),  
                                          rs.getString(10),  
                                    };
                                    Model.addRow(rowData);
                           }                               
                  } catch (SQLException ex) {
                           JOptionPane.showMessageDialog(null,ex.getMessage());
                  }
    }
     
     
    public void GetHallResResults (JTable table) {
                  try {           
                           String query = "SELECT * FROM hall_reservation" ;
                           PreparedStatement ps = conn.prepareStatement(query);
                           ResultSet rs = ps.executeQuery(); 
               
                           DefaultTableModel Model = (DefaultTableModel) table.getModel();            
                           Model.setRowCount(0);
               
                           while (rs.next()) {
                                    Object[] rowData = {
                                          rs.getInt(1), 
                                          rs.getString(2), 
                                          rs.getString(3), 
                                          rs.getInt(4), 
                                          rs.getString(5), 
                                          rs.getString(6),  
                                          rs.getInt(7),  
                                          rs.getInt(8),  
                                          rs.getInt(9),  
                                          rs.getString(10),  
                                    };
                                    Model.addRow(rowData);
                           }                               
                  } catch (SQLException ex) {
                           JOptionPane.showMessageDialog(null,"Staff ID cannot be Verified");
                  }
    }
    
    public void addHalls (ReservationsModel model) {
         try {
            String query = "INSERT INTO hall (hall_num,hall_size,hall_type,statuss) VALUES (?, ?, ?,?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, model.getHallNum());
            ps.setDouble(2,model.getHallSize());
            ps.setString(3, model.getHallType());
            ps.setInt(4, 1);
                       
            int status = ps.executeUpdate();
            if (status == 1) {
                JOptionPane.showMessageDialog(null,"Hall Details Added Successfully");
            } else {
                JOptionPane.showMessageDialog(null,"Hall Details Add Failed");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ReservationsController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void addRooms (ReservationsModel model) {
         try {
            String query = "INSERT INTO room (room_num,room_size,room_type,statuss) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, model.getRoomNum());
            ps.setDouble(2,model.getRoomSize());
            ps.setString(3, model.getRoomType());
            ps.setInt(4, 1);
                       
            int status = ps.executeUpdate();
            if (status == 1) {
                JOptionPane.showMessageDialog(null,"Room Details Added Successfully");
            } else {
                JOptionPane.showMessageDialog(null,"Room Details Add Failed");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ReservationsController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
     public void ShowRoomInTable (JTable table) {
                  try {           
                           String query = "SELECT * FROM room ";
                           PreparedStatement ps = conn.prepareStatement(query);
                           ResultSet rs = ps.executeQuery(); 
               
                           DefaultTableModel Model = (DefaultTableModel) table.getModel();            
                           Model.setRowCount(0);
               
                           while (rs.next()) {
                                    Object[] rowData = {                                       
                                          rs.getInt(1), 
                                          rs.getDouble(2), 
                                          rs.getString(3), 
                                    };
                                    Model.addRow(rowData);
                           }                               
                  } catch (SQLException ex) {
                           JOptionPane.showMessageDialog(null,ex.getMessage());
                  }
    }
     
     
    public void ShowHallInTable (JTable table) {
                  try {           
                           String query = "SELECT * FROM hall ";
                           PreparedStatement ps = conn.prepareStatement(query);
                           ResultSet rs = ps.executeQuery(); 
               
                           DefaultTableModel Model = (DefaultTableModel) table.getModel();            
                           Model.setRowCount(0);
               
                           while (rs.next()) {
                                    Object[] rowData = {                                       
                                          rs.getInt(1), 
                                          rs.getDouble(2), 
                                          rs.getString(3), 
                                    };
                                    Model.addRow(rowData);
                           }                               
                  } catch (SQLException ex) {
                           JOptionPane.showMessageDialog(null,ex.getMessage());
                  }
    }
    
    
    public int getTotalRoom () {
                  int x = 0;
                  try {           
                           String query = "SELECT COUNT(*) FROM room;";
                           PreparedStatement ps = conn.prepareStatement(query);
                           ResultSet rs = ps.executeQuery();     
                           
                           if (rs.next()) {
                                   x = rs.getInt("COUNT(*)");
                           } 
                              
                  } catch (SQLException ex) {
                           JOptionPane.showMessageDialog(null,ex.getMessage());
                  }
        return x ;
    }
    
    public int getCurrentAvailableRoom () {
                  int x = 0;
                  try {           
                           String query = "SELECT COUNT(*) FROM room WHERE statuss = ?;";
                           PreparedStatement ps = conn.prepareStatement(query);
                           ps.setInt(1, 1);
                           ResultSet rs = ps.executeQuery();     
                           
                           if (rs.next()) {
                                   x = rs.getInt("COUNT(*)");
                           } 
                              
                  } catch (SQLException ex) {
                           JOptionPane.showMessageDialog(null,ex.getMessage());
                  }
        return x ;
    }
    
    
    public int getTotalHall () {
                  int x = 0;
                  try {           
                           String query = "SELECT COUNT(*) FROM hall;";
                           PreparedStatement ps = conn.prepareStatement(query);
                           ResultSet rs = ps.executeQuery();     
                           
                           if (rs.next()) {
                                   x = rs.getInt("COUNT(*)");
                           } 
                              
                  } catch (SQLException ex) {
                           JOptionPane.showMessageDialog(null,ex.getMessage());
                  }
        return x ;
    }  
    
    public int getCurrentAvailableHall () {
                  int x = 0;
                  try {           
                           String query = "SELECT COUNT(*) FROM hall WHERE statuss = ?;";
                           PreparedStatement ps = conn.prepareStatement(query);
                           ps.setInt(1, 1);
                           ResultSet rs = ps.executeQuery();     
                           
                           if (rs.next()) {
                                   x = rs.getInt("COUNT(*)");
                           } 
                              
                  } catch (SQLException ex) {
                           JOptionPane.showMessageDialog(null,ex.getMessage());
                  }
        return x ;
    }
    
    public void chageHallStatussToOne  (int hall_num) {
        try {          
            String query = "UPDATE hall SET statuss = 1 WHERE hall_num = ?;";
            PreparedStatement ps = conn.prepareStatement(query);          
            ps.setInt(1,hall_num);
            
            ps.executeUpdate();
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,ex.getMessage());
        }
   }
    
    
    public void DeleteFromHallRes (int R_id) {
         try {
              String query = "DELETE FROM hall_reservation WHERE R_id = ?; ";
              PreparedStatement ps = conn.prepareStatement(query);
              ps.setInt(1, R_id);
                       
              int status = ps.executeUpdate();
              if (status == 1) {
                  JOptionPane.showMessageDialog(null,"Hall Reservation Cancled");
              } else {
                  JOptionPane.showMessageDialog(null,"Hall Reservation cancle Failed");
              }
        } catch (SQLException ex) {
              Logger.getLogger(ReservationsController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
      
   public void CancleHallReservation (JTable table) {
             int x = table.getSelectedRow();
             int R_id =  (int) table.getModel().getValueAt(x, 0);
             int hall_num =  (int) table.getModel().getValueAt(x, 8);
             DeleteFromHallRes(R_id);
             chageHallStatussToOne  (hall_num);
    }  
   
   public void chageRoomStatussToOne  (int room_num) {
        try {          
            String query = "UPDATE room SET statuss = 1 WHERE room_num = ?;";
            PreparedStatement ps = conn.prepareStatement(query);          
            ps.setInt(1,room_num);
            
            ps.executeUpdate();
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,ex.getMessage());
        }
   }
   
   
    public void DeleteFromRoomRes (int R_id) {
         try {
              String query = "DELETE FROM room_reservation WHERE R_id = ?; ";
              PreparedStatement ps = conn.prepareStatement(query);
              ps.setInt(1, R_id);
                       
              int status = ps.executeUpdate();
              if (status == 1) {
                  JOptionPane.showMessageDialog(null,"Room Reservation Cancled");
              } else {
                  JOptionPane.showMessageDialog(null,"Room Reservation cancle Failed");
              }
        } catch (SQLException ex) {
              Logger.getLogger(ReservationsController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
   
      public void CancleRoomReservation (JTable table) {
             int x = table.getSelectedRow();
             int R_id =  (int) table.getModel().getValueAt(x, 0);
             int room_num =  (int) table.getModel().getValueAt(x, 8);
             DeleteFromRoomRes(R_id);
             chageRoomStatussToOne  (room_num);
    }  
       
     public int GetIdentity (JTable table) {
             int x = table.getSelectedRow();
             int id =  (int) table.getModel().getValueAt(x, 0);
             return id;
     }  
     
     public void UpdateHallDetails  (ReservationsModel model,int hall_num) {
        try {          
            String query = "UPDATE hall SET hall_size = ? , hall_type = ? WHERE hall_num = ?;";
            PreparedStatement ps = conn.prepareStatement(query);     
            ps.setDouble(1,model.getHallSize());
            ps.setString(2,model.getHallType());
            ps.setInt(3,hall_num);
            
            int status = ps.executeUpdate();
            if (status == 1) {
                  JOptionPane.showMessageDialog(null,"Hall Informations Updated");
            } else {
                  JOptionPane.showMessageDialog(null,"Hall Informations Update Failed");
            }
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,ex.getMessage());
        }
   }
     
   public void UpdateRoomDetails  (ReservationsModel model,int room_num) {
        try {          
            String query = "UPDATE room SET room_size = ? , room_type = ? WHERE room_num = ?;";
            PreparedStatement ps = conn.prepareStatement(query);     
            ps.setDouble(1,model.getRoomSize());
            ps.setString(2,model.getRoomType());
            ps.setInt(3,room_num);
            
            int status = ps.executeUpdate();
            if (status == 1) {
                  JOptionPane.showMessageDialog(null,"Room Informations Updated");
            } else {
                  JOptionPane.showMessageDialog(null,"Room Informations Update Failed");
            }
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,ex.getMessage());
        }
   }
   
   
   public void RemoveRoom (int room_num) {
         try {
              String query = "DELETE FROM room WHERE room_num = ?; ";
              PreparedStatement ps = conn.prepareStatement(query);
              ps.setInt(1, room_num);
                       
              int status = ps.executeUpdate();
              if (status == 1) {
                  JOptionPane.showMessageDialog(null,"Room Removed");
              } else {
                  JOptionPane.showMessageDialog(null,"Room Not Removed");
              }
        } catch (SQLException ex) {
              Logger.getLogger(ReservationsController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
    public void RemoveHall (int hall_num) {
         try {
              String query = "DELETE FROM hall WHERE hall_num = ?; ";
              PreparedStatement ps = conn.prepareStatement(query);
              ps.setInt(1, hall_num);
                       
              int status = ps.executeUpdate();
              if (status == 1) {
                  JOptionPane.showMessageDialog(null,"Hall Removed");
              } else {
                  JOptionPane.showMessageDialog(null,"Hall Not Removed");
              }
        } catch (SQLException ex) {
              Logger.getLogger(ReservationsController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public void UpdateRoomConfirmation  (int R_id) {
        try {          
            String query = "UPDATE room_reservation SET Confirmation = ? WHERE R_id = ?;";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1,"APPROVED");
            ps.setInt(2,R_id);
            
            int status = ps.executeUpdate();
            if (status == 1) {
                  JOptionPane.showMessageDialog(null,"Room Reservation Approved");
            }
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,ex.getMessage());
        }
   }
    
   public void UpdateHallConfirmation  (int R_id) {
        try {          
            String query = "UPDATE hall_reservation SET Confirmation = ? WHERE R_id = ?;";
            PreparedStatement ps = conn.prepareStatement(query);          
            ps.setString(1,"APPROVED");
            ps.setInt(2,R_id);
            
            int status = ps.executeUpdate();
            if (status == 1) {
                  JOptionPane.showMessageDialog(null,"Hall Reservation Approved");
            }
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,ex.getMessage());
        }
   }
    
   public void RemoveRoomReservation (int R_id) {
         try {
              String query = "DELETE FROM room_reservation WHERE R_id = ?; ";
              PreparedStatement ps = conn.prepareStatement(query);
              ps.setInt(1, R_id);
                       
              int status = ps.executeUpdate();
              if (status == 1) {
                  JOptionPane.showMessageDialog(null,"Room Reservation Declined");
              } else {
                  JOptionPane.showMessageDialog(null,"Decline Failed");
              }
        } catch (SQLException ex) {
              Logger.getLogger(ReservationsController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
      public void RemoveHallReservation (int R_id) {
         try {
              String query = "DELETE FROM hall_reservation WHERE R_id = ?; ";
              PreparedStatement ps = conn.prepareStatement(query);
              ps.setInt(1, R_id);
                       
              int status = ps.executeUpdate();
              if (status == 1) {
                  JOptionPane.showMessageDialog(null,"Hall Reservation Declined");
              } else {
                  JOptionPane.showMessageDialog(null,"Decline Failed");
              }
        } catch (SQLException ex) {
              Logger.getLogger(ReservationsController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
