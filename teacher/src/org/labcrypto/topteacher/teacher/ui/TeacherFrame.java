package org.labcrypto.topteacher.teacher.ui;

import org.labcrypto.topteacher.ui.UiHelper;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TeacherFrame extends JFrame {

    private JMenuBar menuBar;
    private JMenu menuFile;
    private JMenuItem menuItemClose;
    private JMenuItem menuItemPreferences;

    public TeacherFrame() {
        setSize(700, 500);
        setTitle("Teacher - Top Teacher - Labcrypto");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        UiHelper.centerFrame(this);

        menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        {
            menuFile = new JMenu("File");
            {
                menuItemClose = new JMenuItem("Close");
                menuItemClose.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("Clicked");
                    }
                });

                menuItemPreferences = new JMenuItem("Preferences");

                menuFile.add(menuItemPreferences);
                menuFile.addSeparator();
                menuFile.add(menuItemClose);
            }
        }
        menuBar.add(menuFile);

        setVisible(true);
    }
}
