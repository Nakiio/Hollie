package fr.hollie.swing;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Panel {
    public static ArrayList<JPanel> allPanels = new ArrayList<>();

    //Method for create a panel
    public static void Panal(JPanel panel, int LocX, int LocY, int SizeX, int SizeY, Color color, boolean Border, String Name){
        allPanels.add(panel);
        panel.setVisible(true);
        panel.setLocation(LocX,LocY);
        panel.setSize(SizeX, SizeY);
        panel.setBackground(color);
        panel.setLayout(null);
        panel.setName(Name);
        if(Border == true){
            panel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), Name));
        }
    }

        //Method for close all panels
        public static void ColseAllPanels(){
            for(JPanel panel : allPanels){
                panel.setVisible(false);
            }
        }

}
