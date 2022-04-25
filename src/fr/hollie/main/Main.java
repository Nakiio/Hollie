package fr.hollie.main;

import fr.hollie.Methodes.Guis.GuiHome;
import fr.hollie.swing.Frame;
import javax.swing.JFrame;

public class Main extends JFrame{
    public static Main frame = new Main();


    public static void main(String[] args) {

        MyFrame myFrame = new MyFrame();


        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                GuiHome.GuiHome();
                Frame.Frame(frame,0,0,1048,640,"Menu", true, false, null);

            }
        });
    }
}

