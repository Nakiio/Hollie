package fr.hollie.Methodes.Guis;

import fr.hollie.main.Main;
import fr.hollie.swing.Button;
import fr.hollie.swing.Label;
import fr.hollie.swing.Panel;
import javax.swing.*;
import java.awt.*;

public class GuiHome {


    //Method for create the home gui
    public static void GuiHome(){
        JPanel panel = new JPanel();
        Main.frame.setContentPane(panel);
        Button.Button(panel,Main.frame,300,300,430,60,null,
                null, "Play", true, "assets/images/ButtonPlayTexture.png", 30, true);
        Button.Button(panel,Main.frame,300,370,210,60,null,
                null, "Settings", true, "assets/images/Button.png", 30,true );
        Button.Button(panel,Main.frame,520,370,210,60,null,
                null, "Leave", true, "assets/images/Button.png", 30, true);
        Label.Label(panel, 815, 480,250,50, 20, "Name : Hollie !", false, false, null);
        Label.Label(panel, 740, 505,350,50, 20, "Version : 0.0.1 (Beta)", false, false, null);
        Label.Label(panel, 635, 530,450,50, 20, "Developed by : Nakiio & Ficello !", false, false, null);
        Panel.Panal(panel,0,0,1000,600, Color.DARK_GRAY,true,"Menu");

    }
}
