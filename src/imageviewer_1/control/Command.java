package imageviewer_1.control;

import java.awt.event.ActionListener;

public interface Command extends ActionListener {
    
    String name();
    public void execute();
    
}
