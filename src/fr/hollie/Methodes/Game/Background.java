package fr.hollie.Methodes.Game;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Background extends Rectangle{
    Color color;
    public Background(int x, int y, int width, int height, Color color){
        this.x=x;
        this.y=y;
        this.width=width;
        this.height=height;
        this.color=color;

    }

    public void draw(Graphics g){
        g.setColor(this.color);
        JPanel b = null;
        try {
            BufferedImage image = ImageIO.read(new File("assets/images/img.png"));
            g.drawImage(image,0,0,1080,640,b);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
