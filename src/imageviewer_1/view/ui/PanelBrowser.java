package imageviewer_1.view.ui;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class PanelBrowser extends JPanel{

    
    private int index = 0;
    private final ActionListener[] commands;

    public PanelBrowser(ActionListener[] commands) {
        this.commands = commands;

        setBackground(Color.ORANGE);
        setLayout(new java.awt.GridBagLayout());

        createComponents();
    }

    private void createComponents() {
        add(createButton("<"));
        add(createButton(">"));
    }

    private JButton createButton(String text) {
        JButton button = new JButton(text);

        button.setFont(new java.awt.Font("Arial", 1, 18));
        button.setForeground(new java.awt.Color(255, 255, 255));
        button.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 1, 10));
        button.setBorderPainted(false);

        button.addActionListener(commands[index++]);

        return button;
    }
}
