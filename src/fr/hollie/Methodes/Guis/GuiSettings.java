package fr.hollie.Methodes.Guis;

import fr.hollie.main.Main;
import fr.hollie.swing.ButtonLevel;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.io.File;
import java.io.IOException;

public class GuiSettings {


    //Method for create the settings gui
    public static void GuiSettings(){
        try {
            Main.frame.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("assets/images/BackgroundSettings.png")))));
        } catch (IOException e) {
            e.printStackTrace();
        }
        ButtonLevel.Button(Main.frame, 20, 500,210,60, null, null, "Return",
                true, "assets/images/Button.png", 30);
    }
}
