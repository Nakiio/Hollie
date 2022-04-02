package fr.hollie.swing;

import fr.hollie.Methodes.RemoveAllItems;
import fr.hollie.main.Main;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.util.ArrayList;

public class PopupMenu {
    public static ArrayList<JPopupMenu> popups = new ArrayList<>();

    //Method for create a Popups
    public static void PopupManu(JPanel panel, JPopupMenu pop, boolean location, int LocX, int LocY, int SizeX, int SizeY, Color color){
        popups.add(pop);
        RemoveAllItems.AllItems.add(pop);
        pop.setBorder(new LineBorder(color));
        pop.setSize(SizeX, SizeY);
        if(location == true) {
            pop.setLocation(LocX, LocY);
        }
        pop.setVisible(true);
        pop.add(panel);
    }

    //Method for close all Popups
    public static void CloseAllPopups(){
        for(JPopupMenu p : PopupMenu.popups){
            p.setVisible(false);
        }
    }
}
