package fr.hollie.Methodes.Guis;

import fr.hollie.main.Main;
import fr.hollie.swing.ButtonLevel;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.io.File;
import java.io.IOException;

public class GuiLevel {


    //Method for create the level gui
    public static void GuiLevel(){
        try {
            Main.frame.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("assets/images/BackgroundLevel.png")))));
        } catch (IOException e) {
            e.printStackTrace();
        }
        ButtonLevel.Button(Main.frame, 20, 500,210,60, null, null, "Return",
                true, "assets/images/Button.png", 30);
        ButtonLevel.Button(Main.frame, 0, 165,146,146, null, null, "(1)",
                true, "assets/images/ButtonLevel.png", 30);
        ButtonLevel.Button(Main.frame, 180, 320,146,146, null, null, "(2)",
                true, "assets/images/ButtonLevel.png", 30);
        ButtonLevel.Button(Main.frame, 550, 380,146,146, null, null, "(3)",
                true, "assets/images/ButtonLevel.png", 30);
        ButtonLevel.Button(Main.frame, 880, 35,146,146, null, null, "(4)",
                true, "assets/images/ButtonLevel.png", 30);
        ButtonLevel.Button(Main.frame, 720, 197,146,146, null, null, "(5)",
                true, "assets/images/ButtonLevel.png", 30);
    }
}
