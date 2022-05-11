package fr.hollie.main;

import fr.hollie.Methodes.Game.*;
import fr.hollie.Methodes.Game.Box;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Rectangle2D;

public class MyFrame extends JPanel implements ActionListener, KeyListener {
    Box block1, block2, block3, block4;
    Player player;
    Item item;
    Timer timer;
    public int x, y, speed;

    MyFrame() {
        player = new Player(100, 295, 50, 50, false);
        item = new Item(950, 300, 25, 40, false, "diamond");
        block1 = new Box(0, 0, 1080, 290, Color.RED, "block1");
        block2 = new Box(0, 350, 1080, 290, Color.RED, "block2");
        block3 = new Box(0, 0, 50, 600, Color.RED, "block3");
        block4 = new Box(1030, 0, 50, 600, Color.RED, "block4");
        this.setDoubleBuffered(true);
        this.setVisible(true);
        timer = new Timer(15, this);
        timer.start();
    }
    public void paint(Graphics g) {
        super.paintComponent(g);
        item.draw(g);
        player.draw(g);
        block1.draw(g);
        block2.draw(g);
        block3.draw(g);
        block4.draw(g);
        if (Collision.GameOver == true) {
            g.setColor(Color.yellow);
            g.setFont(new Font("Mv Boli", Font.PLAIN, 75));
            g.drawString("Game Over !", 450, 200);
        }else if(Collision.GameWin == true){
            g.setColor(Color.yellow);
            g.setFont(new Font("Mv Boli", Font.PLAIN, 35));
            g.drawString("Game Win !", 300, 75);
        }

    }



    @Override
    public void keyPressed(KeyEvent e) {
        speed = 5;
        if(Collision.GameOver == false && Collision.GameWin == false) {
            if (e.getKeyCode() == KeyEvent.VK_UP) {y = -speed;}
            if (e.getKeyCode() == KeyEvent.VK_DOWN) {y = +speed;}
            if (e.getKeyCode() == KeyEvent.VK_LEFT) {x = -speed;}
            if (e.getKeyCode() == KeyEvent.VK_RIGHT) {x = +speed;}
        }
    }
    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP) {y = 0;}
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {y = 0;}
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {x = 0;}
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {x = 0;}
    }

    @Override
    public void keyTyped(KeyEvent arg0) {
    }

    public void move() {
        player.x += x;
        player.y += y;

    }
    private final static Rectangle intersection = new Rectangle(); // o
    @Override
    public void actionPerformed(ActionEvent arg0) {
        move();
        Collision.ItemCollision(player);
        Collision.BlockCollision(player);
        if (Collision.collision ) {
                Rectangle2D.intersect(player.getBounds(), Box.MapBoxs.get(Collision.bc).getBounds(), intersection);
                if (intersection.width > intersection.height) { // si l'écart horizontal et plus grand que l'écart vertical, on arrête le déplacement vertical
                    player.y = player.y - intersection.height * (int) Math.signum(y);
                    y = 0;
                } else if (intersection.width == intersection.height) { // en cas d'égalité, en arrête les 2
                    player.x = player.x - intersection.width * (int) Math.signum(x);
                    player.y = player.y - intersection.height * (int) Math.signum(y);
                    x = y = 0;
                } else { // écart vertical supérieur à écart horizontal, arrêt déplacement horizontal
                    player.x = player.x - intersection.width * (int) Math.signum(x);
                    x = 0;
                }

        }
        repaint();

    }
}