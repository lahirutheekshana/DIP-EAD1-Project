
package club_controller;
import club_view.FrmAdminDash;
import club_view.FrmAdminMessage;
import club_view.FrmLogin;
import club_view.FrmMemMessage;
import club_view.FrmMemberDash;
import club_view.FrmRegister1;
import club_view.FrmRegister2;
import club_view.FrmRegister3;
import club_view.FrmStaffDash;
import javax.swing.JFrame;

public class NavigationController {
    private final JFrame frame;
    
     public NavigationController () {
          this.frame = null;
    }
   
   public NavigationController (JFrame frame) {
          this.frame = frame;
    }
   
    public void navigateToRegister1(FrmRegister1 register1) {
                  frame.setVisible(false);
                  register1.setVisible(true);
                  frame.revalidate();
                  frame.repaint();
    }
    
    public void navigateToRegister2(FrmRegister2 register2) {
                  frame.setVisible(false);
                  register2.setVisible(true);
                  frame.revalidate();
                  frame.repaint();
    }  
     
     public void navigateToLogin (FrmLogin login) {
                  frame.setVisible(false);
                  login.setVisible(true);
                  frame.revalidate();
                  frame.repaint();
    }
     
    public void navigateToRegister3(FrmRegister3 register3) {
                  frame.setVisible(false);
                  register3.setVisible(true);
                  frame.revalidate();
                  frame.repaint();
    }  
    
    public void navigateToFrmAdminDash(FrmAdminDash frmAdminDash) {
                  frame.setVisible(false);
                  frmAdminDash.setVisible(true);
                  frame.revalidate();
                  frame.repaint();
    } 
        
    public void navigateToFrmMemberDash(FrmMemberDash frmMemberDash) {
                  frame.setVisible(false);
                  frmMemberDash.setVisible(true);
                  frame.revalidate();
                  frame.repaint();
    }  
    
    public void navigateToFrmStaffDash(FrmStaffDash frmStaffDash) {
                  frame.setVisible(false);
                  frmStaffDash.setVisible(true);
                  frame.revalidate();
                  frame.repaint();
    }  
    
    public void navigateToFrmAdminMessage(FrmAdminMessage adminMessage) {
                  frame.setVisible(true);
                  adminMessage.setVisible(true);
                  frame.revalidate();
                  frame.repaint();
    }  
    
    public void navigateToFrmMemMessage(FrmMemMessage MemMessage) {
                  frame.setVisible(true);
                  MemMessage.setVisible(true);
                  frame.revalidate();
                  frame.repaint();
    }  
     
}
