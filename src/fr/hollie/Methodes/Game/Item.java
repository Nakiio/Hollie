package fr.hollie.Methodes.Game;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Item extends Rectangle  {
    Color color;
    String Name;
    boolean entityVisible;
    public static HashMap<String,Item > MapItems = new HashMap<>();
    public static ArrayList<Item> ArrayItems = new ArrayList<>();
    public Item(int x, int y, int width, int height, boolean entityVisible, String Name){
        this.x=x;
        this.y=y;
        this.width=width;
        this.height=height;
        this.entityVisible=entityVisible;
        this.Name=Name;
        MapItems.put(this.Name, this);
        ArrayItems.add(this);

    }
    public double getX() {
        return this.x;
    }

    public double getY() {
        return y;
    }
    public String getName(){return this.Name;}

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
            BufferedImage image = ImageIO.read(new File("assets/images/diamond.png"));
            g.drawImage(image,this.x,this.y,this.width,this.height,b);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}