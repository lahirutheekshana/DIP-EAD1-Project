package club_controller;

import java.awt.Color;
import javax.swing.JPanel;

public class ButtonHoverController {
    
    private JPanel panel = null ;
    
    public ButtonHoverController () {
        this.panel = null  ;
    }
    
    public void setColor (JPanel panel) {
        panel.setBackground (new Color(50,50,50));
    }
    
    public void ResetColor (JPanel panel) {
        panel.setBackground (new Color(33,33,33));
    }
}
