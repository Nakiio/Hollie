package fr.hollie.swing;

import javax.swing.*;
import java.awt.*;

public class CheckBox {
    public static JCheckBox check = new JCheckBox();

    //Method for create a CheckBox
    public static void CheckBox(JPanel pane){
        check.setVisible(true);
        check.setForeground(Color.DARK_GRAY);
        check.setBackground(new Color(64,64,64));
        check.setSize(20,20);
        check.setLocation(350,190);
        pane.add(check);

    }


}
