package fr.hollie.swing;

import fr.hollie.Methodes.Guis.GuiLevel;
import fr.hollie.Methodes.Guis.GuiSettings;
import fr.hollie.Methodes.RemoveAllItems;
import fr.hollie.main.Main;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class Button {


    //Method for create a button in a PANEL
    public static void Button(JPanel pan, int LocX, int LocY, int SizeX, int SizeY, Color Border, Color Back, String Name,
                              boolean image, String path, int FontSize){
        JButton button = new CreateRoundButton(Name,SizeX,SizeY);
        RemoveAllItems.AllItems.add(button);
        button.setText(Name);
        button.setVisible(true);
        button.setLocation(LocX,LocY);
        button.setSize(SizeX,SizeY);
        button.setBorder(new LineBorder(Border));
        button.setBackground(Back);
        button.setFont(new Font("Verdana", Font.BOLD, FontSize));
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.CENTER);
        button.setForeground(new Color(25, 10, 20));
        if(image == true){
            button.setIcon(new ImageIcon(path));
        }
            //Actions related to buttons
            button.addActionListener((event) -> {
                if(button.getText().equalsIgnoreCase("Play")){
                    Panel.ColseAllPanels();
                    GuiLevel.GuiLevel();
                }else if(button.getText().equalsIgnoreCase("Settings")){
                    Panel.ColseAllPanels();
                    GuiSettings.GuiSettings();
                }else if(button.getText().equalsIgnoreCase("Leave")){
                    Frame.CloseAllFrames();
                    System.exit(0);
                }
            });
        pan.add(button);

    }
}
