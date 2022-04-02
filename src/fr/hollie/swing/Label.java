package fr.hollie.swing;

import fr.hollie.Methodes.RemoveAllItems;
import fr.hollie.main.Main;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class Label {


    //Method for create a Label
    public static void Label(JPanel panel, int LocX, int LocY,int SizeX, int SizeY ,int Size, String string, boolean action, boolean border, Color Border){
        JLabel label = new JLabel();
        RemoveAllItems.AllItems.add(label);
        label.setLocation(LocX,LocY);
        label.setSize(SizeX,SizeY);
        label.setText(string);
        label.setFont(new Font("Verdana", Font.BOLD, Size));
        label.setVisible(true);
        if(border == true) {
            label.setBorder(new LineBorder(Border));
        }
        if (action == true) {

            //Actions related to label
            label.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) { label.setForeground(Color.lightGray); }
                    public void mouseEntered(MouseEvent e) {label.setForeground(Color.GRAY);}
                    public void mouseExited(MouseEvent e) {label.setForeground(new Color(51, 51, 51));}
                    public void mousePressed(MouseEvent e) {label.setForeground(Color.LIGHT_GRAY);}
                    public void mouseReleased(MouseEvent e) {label.setForeground(Color.GRAY);}
                });
        }
        panel.add(label);



    }
}
