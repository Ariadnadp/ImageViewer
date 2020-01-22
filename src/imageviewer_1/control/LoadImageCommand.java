package imageviewer_1.control;

import imageviewer_1.view.ui.DirectoryChooserDialog;
import imageviewer_1.view.ui.ImageDisplay;
import java.awt.event.ActionEvent;
import java.io.File;

public class LoadImageCommand implements Command{
    
    private final ImageDisplay imageDisplay;

    public LoadImageCommand(ImageDisplay imageDisplay) {
        this.imageDisplay = imageDisplay;
    }

    @Override
    public String name() {
        return "load";
    }
    
    @Override
    public void execute() {
        imageDisplay.load(getDirectory());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        execute();
    }

    private File getDirectory() {
        return new DirectoryChooserDialog().getDirectory();
    }

}
