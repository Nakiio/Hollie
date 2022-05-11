package fr.hollie.swing;

import fr.hollie.Methodes.Game.Levels.*;
import fr.hollie.Methodes.Guis.GuiHome;
import fr.hollie.Methodes.Guis.GuiLevel;
import fr.hollie.Methodes.Guis.GuiSettings;
import fr.hollie.Methodes.RemoveAllItems;
import fr.hollie.main.Main;
import org.omg.CORBA.FREE_MEM;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class Button {


    //Method for create a button in a PANEL
    public static void Button(JPanel pan, JFrame frame, int LocX, int LocY, int SizeX, int SizeY, Color Border, Color Back, String Name,
                              boolean image, String path, int FontSize, boolean FrameOrPanel){
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
                    GuiLevel.GuiLevel("");
                }else if(button.getText().equalsIgnoreCase("Settings")){
                    Panel.ColseAllPanels();
                    GuiSettings.GuiSettings();
                }else if(button.getText().equalsIgnoreCase("Leave")){
                    Frame.CloseAllFrames();
                    System.exit(0);
                }else if(button.getText().equalsIgnoreCase("Return")){
                    Panel.ColseAllPanels();
                    GuiHome.GuiHome();
                }else if(button.getText().equalsIgnoreCase("(1)")){
                    Level1 level1 = new Level1(frame.getX(), frame.getY(), (int) frame.getSize().getWidth(), (int) frame.getSize().getHeight());
                    frame.setVisible(false);

                }else if(button.getText().equalsIgnoreCase("(2)")){
                    if(Main.LevelPLayer >= 2){
                        Level2 level2 = new Level2(frame.getX(), frame.getY(), (int) frame.getSize().getWidth(), (int) frame.getSize().getHeight());
                        frame.setVisible(false);
                    }else{
                        Panel.ColseAllPanels();
                        GuiLevel.GuiLevel("You don't have unlock this level!");
                    }
                }else if(button.getText().equalsIgnoreCase("(3)")){
                    if(Main.LevelPLayer >= 3){
                        Level3 level3 = new Level3(frame.getX(), frame.getY(), (int) frame.getSize().getWidth(), (int) frame.getSize().getHeight());
                        frame.setVisible(false);
                    }else{
                        Panel.ColseAllPanels();
                        GuiLevel.GuiLevel("You don't have unlock this level!");
                    }
                }else if(button.getText().equalsIgnoreCase("(4)")){
                    if(Main.LevelPLayer >= 4){
                        Level4 level4 = new Level4(frame.getX(), frame.getY(), (int) frame.getSize().getWidth(), (int) frame.getSize().getHeight());
                        frame.setVisible(false);
                    }else{
                        Panel.ColseAllPanels();
                        GuiLevel.GuiLevel("You don't have unlock this level!");
                    }
                }else if(button.getText().equalsIgnoreCase("(5)")){
                    if(Main.LevelPLayer >= 5){
                        Level5 level5 = new Level5(frame.getX(), frame.getY(), (int) frame.getSize().getWidth(), (int) frame.getSize().getHeight());
                        frame.setVisible(false);
                    }else{
                        Panel.ColseAllPanels();
                        GuiLevel.GuiLevel("You don't have unlock this level!");
                    }
                }
            });
        if(FrameOrPanel == false) {
            pan.add(button);
        }else {
            frame.add(button);
        }

    }
}
