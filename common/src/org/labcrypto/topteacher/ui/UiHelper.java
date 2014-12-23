package org.labcrypto.topteacher.ui;

import javax.swing.*;
import java.awt.*;

public class UiHelper {
    public static void centerFrame(JFrame frame) {
        frame.setLocation(((int) (Toolkit.getDefaultToolkit().getScreenSize().getWidth() - frame.getWidth()) / 2),
                (int) ((Toolkit.getDefaultToolkit().getScreenSize().getHeight() - frame.getHeight()) / 2));
    }
}
