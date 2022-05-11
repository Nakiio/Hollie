package fr.hollie.Methodes.Guis;

import fr.hollie.main.Main;
import fr.hollie.swing.Button;
import fr.hollie.swing.Label;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class GuiLevel {


    //Method for create the level gui
    public static void GuiLevel(String level){
        try {
            Main.frame.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("assets/images/BackgroundLevel.png")))));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Button.Button(null,Main.frame,20, 500,210,60, null, null, "Return",
                true, "assets/images/Button.png", 30, true);
        Button.Button(null,Main.frame, 0, 165,146,146, null, null, "(1)",
                true, "assets/images/ButtonLevel.png", 30, true);
        Button.Button(null,Main.frame,180, 320,146,146, null, null, "(2)",
                true, "assets/images/ButtonLevel.png", 30, true);
        Button.Button(null,Main.frame,550, 380,146,146, null, null, "(3)",
                true, "assets/images/ButtonLevel.png", 30, true);
        Button.Button(null,Main.frame,880, 35,146,146, null, null, "(4)",
                true, "assets/images/ButtonLevel.png", 30, true);
        Button.Button(null,Main.frame,720, 197,146,146, null, null, "(5)",
                true, "assets/images/ButtonLevel.png", 30, true);
        Label.Label(null,Main.frame,250,200,500,100,20,level,false,false,null,true, Color.RED);
        Main.frame.setVisible(true);
    }
}
