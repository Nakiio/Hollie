package fr.hollie.Methodes.Game;

import java.awt.*;

public class Button extends Rectangle{
    Color color;
    String Name;
    public Button(int x, int y, int width, int height, Color color, String Name){
        this.x=x;
        this.y=y;
        this.width=width;
        this.height=height;
        this.color=color;
        this.Name=Name;

    }
    public String getName(){return this.Name;}
    public double getX() {return this.x;}
    public double getY() {return y;}
    public void draw(Graphics g){
        g.setColor(this.color);
        g.setFont(new Font("Mv Boli", Font.PLAIN, 30));
        g.drawString(this.Name, this.x,this.y);
    }


    public Rectangle getBounds() {
        return new Rectangle(x, y, width, height);
    }

}
