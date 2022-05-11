package fr.hollie.Methodes.Game;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.HashMap;

public class Box extends Rectangle{
    public static HashMap<String,Box > MapBoxs = new HashMap<>();
    public static ArrayList<Box> ArrayBoxs = new ArrayList<>();

    Color color;
    String Name;
    public Box(int x, int y, int width, int height, Color color, String Name){
        this.x=x;
        this.y=y;
        this.width=width;
        this.height=height;
        this.color=color;
        this.Name=Name;
        MapBoxs.put(this.Name,this);
        ArrayBoxs.add(this);

    }
    public String getName(){return this.Name;}
    public double getX() {return this.x;}
    public double getY() {return y;}
    public void draw(Graphics g){
        g.setColor(this.color);
        g.fillRect(this.x,this.y,this.width,this.height);
    }
    public Rectangle getBounds() {
        return new Rectangle(x, y, width, height);
    }

}
