package fr.hollie.Methodes.Game;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Background extends Rectangle{
    String path;
    public Background(int x, int y, int width, int height, String path){
        this.x=x;
        this.y=y;
        this.width=width;
        this.height=height;
        this.path=path;
    }

    public void draw(Graphics g){
        JPanel b = null;
        try {
            BufferedImage image = ImageIO.read(new File(this.path));
            g.drawImage(image,this.x,this.y,this.width,this.height,b);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
