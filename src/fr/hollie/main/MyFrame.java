package fr.hollie.main;

import fr.hollie.Methodes.Game.Background;
import fr.hollie.Methodes.Game.Player;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MyFrame extends JPanel {

    Image image;
    Graphics graphics;
    Box block1, block2;
    Player player;
    Background Background;
    public static int LastX, LastY, x, y, FutureX, FutureY;

    MyFrame(){
        JFrame f = new JFrame();
        f.setVisible(true);
        f.setSize(1080,640);
        f.setLocation(2080,0);
        f.add(this);
        player = new Player(100,300,70,80);
        block1 = new Box(20,470,139,200,Color.RED);
        block2 = new Box(236,428,240,200,Color.RED);
        Background = new Background(0,600,600,600, Color.RED);
        this.setDoubleBuffered(true);
        this.setVisible(true);
        f.addKeyListener(new AL());
    }

    public void paint(Graphics g){
        image = createImage(this.getWidth() ,this.getHeight());
        graphics = image.getGraphics();
        g.drawImage(image,0,0,this);
        Background.draw(g);
        player.draw(g);
        block1.draw(g);
        block2.draw(g);
    }
    public void checkCollision(){
        System.out.println(x + " -> " + FutureX + " - " + y + " -> " + FutureY);
        player.setLocation(FutureX, FutureY);
        if(player.intersects(block1) || player.intersects(block2)){
            player.setLocation(LastX,LastY);

        }else {
            player.setLocation(x,y);
        }
    }

    public class AL extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e){
            player.keyPressed(e);
            LastX = (int)player.getX();
            LastY = (int)player.getY();
            if (e.getKeyCode() == KeyEvent.VK_UP) {
                FutureY = LastY - 10;FutureX = x;
                y = LastY - 10;x = LastX;
            }else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                FutureY = LastY + 10;FutureX = x;
                y = LastY + 10;x = LastX;
            }else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                FutureX = LastX - 10;FutureY = y;
                x = LastX - 10;y = LastY;
            }else if(e.getKeyCode()== KeyEvent.VK_RIGHT) {
                FutureX = LastX + 10;FutureY = y;
                x = LastX + 10;y = LastY;
            }
            checkCollision();
            repaint();


        }


    }

}
