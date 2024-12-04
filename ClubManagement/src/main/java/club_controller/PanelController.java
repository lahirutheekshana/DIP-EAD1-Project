package club_controller;

import club_model.PanelModel;

public class PanelController {
    private PanelModel model; 
    
    public PanelController () {
        this.model = null;

    }
    
    public PanelController (PanelModel model) {
        this.model = model;
    }
    
    public void switchPanels () {
        model.getLayeredPane().removeAll();
        model.getLayeredPane().add(model.getPanel());
        model.getLayeredPane().repaint();
        model.getLayeredPane().revalidate();        
    }
}
