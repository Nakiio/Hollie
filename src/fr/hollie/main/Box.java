package fr.hollie.main;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Box extends Rectangle implements KeyListener {
    Color color;
    Box(int x, int y, int width, int height, Color color){
        this.x=x;
        this.y=y;
        this.width=width;
        this.height=height;
        this.color=color;

    }
    public double getX() {
        return this.x;
    }

    public double getY() {
        return y;
    }
    public void draw(Graphics g){
        g.setColor(this.color);
        g.fillRect(this.x,this.y,this.width,this.height);

    }

    @Override
    public void keyTyped(KeyEvent e) {}
    @Override
    public void keyPressed(KeyEvent e) {}
    @Override
    public void keyReleased(KeyEvent e) {}


}
