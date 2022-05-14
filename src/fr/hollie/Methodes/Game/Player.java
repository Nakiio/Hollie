package fr.hollie.Methodes.Game;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Player extends Rectangle  {
    Color color;
    boolean entityVisible;
    public Player(int x, int y, int width, int height, boolean entityVisible){
        this.x=x;
        this.y=y;
        this.width=width;
        this.height=height;
        this.entityVisible=entityVisible;
    }
    public double getX() {
        return this.x;
    }

    public double getY() {
        return y;
    }

    public void destroy(){
        this.move(10000,10000);
    }

    public Rectangle getBounds() {
        return new Rectangle(x, y, width, height);
    }
    public void draw(Graphics g){
        g.setColor(this.color);
        JPanel b = null;
        try {
            if(this.entityVisible == true) {
                g.fillRect(this.x, this.y, this.width, this.height);
            }
            BufferedImage image = ImageIO.read(new File("assets/images/player.png"));
            g.drawImage(image,this.x,this.y,this.width,this.height,b);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
