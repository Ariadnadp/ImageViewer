package imageviewer_1.control;

import imageviewer_1.view.ui.ImageDisplay;
import java.awt.event.ActionEvent;

public class NextImageCommand implements Command {

    private final ImageDisplay imageDisplay;
    
    public NextImageCommand(ImageDisplay imageDisplay) {
        this.imageDisplay = imageDisplay;
    }
    
    @Override
    public String name() {
        return "next";
    }

    @Override
    public void execute() {
        imageDisplay.setImage(imageDisplay.getImage().getNext());
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        execute();
    }
}
