package imageviewer_1.view.ui;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class PanelOpen extends JPanel{

    private final ActionListener[] commands;

    public PanelOpen(ActionListener[] commands) {
        this.commands = commands;

        setBackground(Color.ORANGE);
        setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        createComponents();
    }

    private void createComponents() {
        add(createOpenItem());
    }

    private JButton createOpenItem() {
        JButton butOpen = new JButton();

        butOpen.setText("Click here to open the image you want...");
        butOpen.setForeground(Color.white);
        butOpen.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        butOpen.setBorderPainted(false);

        butOpen.addActionListener(commands[0]);

        return butOpen;
    }    
}
