package fr.hollie.swing;

import fr.hollie.Methodes.Guis.GuiHome;
import fr.hollie.Methodes.RemoveAllItems;
import fr.hollie.main.Main;
import fr.hollie.swing.CreateRoundButton;
import fr.hollie.swing.Label;
import fr.hollie.swing.Panel;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class ButtonLevel {


    //Method for create a button in a FRAME
    public static void Button(JFrame frame, int LocX, int LocY, int SizeX, int SizeY, Color Border, Color Back, String Name,
                              boolean image, String path, int FontSize){
        JButton button = new CreateRoundButton(Name,SizeX,SizeY);
        button.setText(Name);
        RemoveAllItems.AllItems.add(button);
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
            if(button.getText().equalsIgnoreCase("Return")){
                Panel.ColseAllPanels();
                RemoveAllItems.RemoveAllItems();
                GuiHome.GuiHome();
            }
        });
        frame.add(button);

    }
}