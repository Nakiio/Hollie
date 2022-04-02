package fr.hollie.swing;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Frame {
    public static ArrayList<JFrame> AllFrames = new ArrayList<>();

    //Method for create a frame
    public static void Frame(JFrame frame, int LocX, int LocY, int SizeX, int SizeY,
                             String name, boolean allFrames, boolean Background, String FileName){
        frame.setVisible(true);
        frame.setLocation(LocX,LocY);
        frame.setSize(SizeX, SizeY);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setName(name);
        if(Background == true) {

        }
        frame.setIconImage(new ImageIcon("Images/logo.png").getImage());//Icon of window
        if(allFrames == true) {
            AllFrames.add(frame);
        }

    }
    //Method for close all frames
    public static void CloseAllFrames(){
        for(JFrame frame : AllFrames){
            frame.setVisible(false);
        }
    }


}
