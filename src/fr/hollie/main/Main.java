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
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                //Level5 level2 = new Level5(2080,0,1048,640);
                GuiHome.GuiHome();
                Frame.Frame(frame,0,0,1048,640,"Menu", true, false, null);

            }
        });
    }
}

