package imageviewer_1.view.ui;

import imageviewer_1.control.LoadImageCommand;
import imageviewer_1.control.NextImageCommand;
import imageviewer_1.control.PrevImageCommand;
import imageviewer_1.view.ui.ImageDisplay;
import imageviewer_1.view.ui.PanelBrowser;
import imageviewer_1.view.ui.PanelOpen;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import javax.swing.JFrame;



public class MainFrame extends JFrame {
    
    private ImageDisplay imageDisplay;

    public MainFrame() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 500);
        setTitle("Image Viewer");
        setLayout(new BorderLayout());
        createComponents();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void createComponents() {
        getContentPane().add(createImageDisplay(), BorderLayout.CENTER);
        getContentPane().add(createMenuPanel(), BorderLayout.NORTH);
        getContentPane().add(createImageBrowsingMenu(), BorderLayout.SOUTH);
    }

    private ImageDisplay createImageDisplay() {
        imageDisplay = new ImageDisplay();
        return imageDisplay;
    }

    private PanelOpen createMenuPanel() {
        PanelOpen openMenu = new PanelOpen(createLoadImageCommand());
        return openMenu;
    }

    private PanelBrowser createImageBrowsingMenu() {
        PanelBrowser browsingPanel = new PanelBrowser(createButtonsCommands());
        return browsingPanel;
    }

    private ActionListener[] createButtonsCommands() {
        return new ActionListener[]{
            new PrevImageCommand(imageDisplay),
            new NextImageCommand(imageDisplay),
        };
    }

    private ActionListener[] createLoadImageCommand() {
        return new ActionListener[]{
            new LoadImageCommand(imageDisplay)
        };
    }
}
