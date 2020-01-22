package imageviewer_1.control;

import imageviewer_1.view.ui.ImageDisplay;
import java.awt.event.ActionEvent;

public class PrevImageCommand implements Command {

    private final ImageDisplay imageDisplay;
    
    public PrevImageCommand(ImageDisplay imageDisplay) {
        this.imageDisplay = imageDisplay;
    }
    
    @Override
    public String name() {
        return "prev";
    }

    @Override
    public void execute() {
        imageDisplay.setImage(imageDisplay.getImage().getPrev());
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        execute();
    }
    
    
}
