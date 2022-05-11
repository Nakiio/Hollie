package fr.hollie.main;

import fr.hollie.Methodes.Game.Levels.Level2;
import fr.hollie.Methodes.Game.Levels.Level3;
import fr.hollie.Methodes.Game.Levels.Level4;
import fr.hollie.Methodes.Game.Levels.Level5;
import fr.hollie.Methodes.Guis.GuiHome;
import fr.hollie.swing.Frame;
import javax.swing.JFrame;

public class Main extends JFrame{
    public static Main frame = new Main();
    public static int LevelPLayer = 1;

    public static void main(String[] args) {
        GuiHome.GuiHome();
        Frame.Frame(frame,0,0,1048,640,"Gui", true, false, null);
    }
}

