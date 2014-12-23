package org.labcrypto.topteacher.teacher.ui;

import org.labcrypto.topteacher.teacher.ServiceLocator;
import org.labcrypto.topteacher.ui.UiHelper;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TeacherFrame extends JFrame {

    private JPanel panelStudents;
    private ServiceLocator serviceLocator;

    public TeacherFrame(ServiceLocator serviceLocator) {

        this.serviceLocator = serviceLocator;

        setSize(700, 500);
        setTitle("Teacher - Top Teacher - Labcrypto");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        UiHelper.centerFrame(this);

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        {
            JMenu menuFile = new JMenu("File");
            {
                JMenuItem menuItemClose = new JMenuItem("Close");
                menuItemClose.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("Clicked");
                    }
                });

                JMenuItem menuItemPreferences = new JMenuItem("Preferences");

                menuFile.add(menuItemPreferences);
                menuFile.addSeparator();
                menuFile.add(menuItemClose);
            }
            menuBar.add(menuFile);
        }

        JToolBar toolBar = new JToolBar();
        toolBar.setFloatable(false);
        toolBar.setAlignmentX(0);
        {
            JButton buttonRefresh = new JButton("Refresh", new ImageIcon(IconURLs.REFRESH_ICON_URL));
            buttonRefresh.setFocusable(false);
            toolBar.add(buttonRefresh);

            JButton buttonShowDesktop = new JButton("Show Desktop", new ImageIcon(IconURLs.DESKTOP_ICON_URL));
            buttonShowDesktop.setFocusable(false);
            toolBar.add(buttonShowDesktop);
        }

        panelStudents = new JPanel();
        JScrollPane scrollPaneStudentsPanel = new JScrollPane(panelStudents);
        panelStudents.setBackground(Color.WHITE);

        SpringLayout springLayout = new SpringLayout();
        setLayout(springLayout);

        getContentPane().add(toolBar);
        getContentPane().add(scrollPaneStudentsPanel);

        springLayout.putConstraint(SpringLayout.WEST, toolBar, 0, SpringLayout.WEST, getContentPane());
        springLayout.putConstraint(SpringLayout.EAST, toolBar, 0, SpringLayout.EAST, getContentPane());
        springLayout.putConstraint(SpringLayout.NORTH, toolBar, 0, SpringLayout.NORTH, getContentPane());

        springLayout.putConstraint(SpringLayout.WEST, scrollPaneStudentsPanel, 5, SpringLayout.WEST, getContentPane());
        springLayout.putConstraint(SpringLayout.SOUTH, scrollPaneStudentsPanel, -5, SpringLayout.SOUTH, getContentPane());
        springLayout.putConstraint(SpringLayout.EAST, scrollPaneStudentsPanel, -5, SpringLayout.EAST, getContentPane());
        springLayout.putConstraint(SpringLayout.NORTH, scrollPaneStudentsPanel, 5, SpringLayout.SOUTH, toolBar);

        setVisible(true);
    }
}
