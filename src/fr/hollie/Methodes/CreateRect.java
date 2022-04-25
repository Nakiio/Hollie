package fr.hollie.Methodes;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class CreateRect extends JLabel {
    public static int X, Y;

    public CreateRect(int LocX, int LocY) {
        X = LocX;
        Y = LocY;
        setSize(95,95);
        setVisible(true);
        setLocation(X,Y);
    }

    protected void paintComponent(Graphics g) {

        g.setColor(Color.YELLOW);
        JPanel b = null;
        try {
            g.fillRect(getX(),getY(),getWidth(),getHeight());
            BufferedImage image = ImageIO.read(new File("assets/images/player.png"));
            g.drawImage(image,0,0,100,100,b);
        } catch (IOException e) {
            e.printStackTrace();
        }
       super.paintComponent(g);
    }

}