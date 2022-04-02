package fr.hollie.Methodes;

import javax.swing.*;
import java.util.ArrayList;

public class RemoveAllItems {
    public static ArrayList<JComponent> AllItems = new ArrayList<>();

    //Method for remove ALL items in all frames/panels
    public static void RemoveAllItems(){
        for(JComponent c : AllItems){
            c.setVisible(false);
        }
    }
}
