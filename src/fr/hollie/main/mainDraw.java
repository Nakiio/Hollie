package fr.hollie.main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class mainDraw extends JComponent {

    public int x = 50;
    public int y = 50;

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        try {
            JPanel b = null;
            g.fillRect(x,y,100,100);
            BufferedImage image = ImageIO.read(new File("assets/images/player.png"));
            g.drawImage(image,x,y,100,100,b);
        } catch (IOException e) {
            e.printStackTrace();
        }
        g.fillRect(400,0,640,640);
        g.setColor(Color.BLACK);
    }

    public void moveRight() {
        x = x + 5;
        repaint();
    }

    public void moveLeft() {
        x = x - 5;
        repaint();
    }

    public void moveDown() {
        y = y + 5;
        repaint();
    }

    public void moveUp() {
        y = y - 5;
        repaint();
    }
}