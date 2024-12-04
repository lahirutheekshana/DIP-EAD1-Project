package club_model;

import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class PanelModel {
    private JLayeredPane layeredPane = null;
    private JPanel panel = null;
    
    public PanelModel () {
        layeredPane = null;
        panel = null; 
    }

    public JLayeredPane getLayeredPane() {
        return layeredPane;
    }

    public void setLayeredPane(JLayeredPane layeredPane) {
        this.layeredPane = layeredPane;
    }

    public JPanel getPanel() {
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }
    
    
}
