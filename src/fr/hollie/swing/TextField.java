package fr.hollie.swing;

import fr.hollie.Methodes.RemoveAllItems;
import fr.hollie.main.Main;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class TextField {


    //Method for create a TextField
    public static void TextField(JPanel panel, int LocX, int LocY, int SizeX, int SizeY, Color Border,Color back){
        JTextField text = new JTextField(20);
        RemoveAllItems.AllItems.add(text);
        text.setVisible(true);
        text.setLocation(LocX, LocY);
        text.setSize(SizeX, SizeY);
        text.setBorder(new LineBorder(Border));
        text.setBackground(back);
        panel.add(text);
    }

}
