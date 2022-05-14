package fr.hollie.Methodes.Game.Levels;

import fr.hollie.Methodes.Game.Box;
import fr.hollie.Methodes.Game.Button;
import fr.hollie.Methodes.Game.*;
import fr.hollie.Methodes.Guis.GuiLevel;
import fr.hollie.main.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Rectangle2D;

public class Level3 extends JPanel implements ActionListener, KeyListener, MouseListener {
    Box block1, block2, block3, block4, block5, block6, block7, block8;
    Player player;
    Background background;
    Button LevelGui, Restart;
    Item item;
    Timer timer;
    public int x, y, speed;
    JFrame f = new JFrame();
    public Level3(int LocX, int LocY, int SizeX, int SizeY) {
        Game.reset();
        f.setVisible(true);
        f.setSize(SizeX, SizeY);
        f.setLocation(LocX,LocY);
        f.addKeyListener(this);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.addMouseListener(this);
        f.add(this);
        background = new Background(50,75,980,450, "assets/images/BackgroundLevel2.png");
        player = new Player(50, 295, 50, 50, false);
        LevelGui = new Button(880,550,250,100,Color.GRAY,"Level Gui!");
        Restart = new Button(20,550,250,100,Color.GRAY,"Restart!");
        item = new Item(950, 300, 25, 40, false, "diamond");
        block1 = new Box(0, 0, 50, 700, Color.DARK_GRAY, "block1");
        block2 = new Box(100, 0, 50, 425, Color.DARK_GRAY, "block2");
        block3 = new Box(0, 500, 450, 300, Color.DARK_GRAY, "block3");
        block4 = new Box(0, 0, 1048, 290, Color.DARK_GRAY, "block4");
        block5 = new Box(225, 350, 50, 300, Color.DARK_GRAY, "block5");
        block6 = new Box(1030, 0, 50, 640, Color.DARK_GRAY, "block6");
        block7 = new Box(325, 200, 50, 245, Color.DARK_GRAY, "block7");
        block8 = new Box(450, 350, 1048, 640, Color.DARK_GRAY, "block8");
        this.setDoubleBuffered(true);
        this.setVisible(true);
        timer = new Timer(15, this);
        timer.start();
    }
    public void paint(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.black);
        g.drawRect(0,0,1048,640);
        background.draw(g);
        item.draw(g);
        player.draw(g);
        block1.draw(g);block2.draw(g);
        block3.draw(g);block4.draw(g);
        block5.draw(g);block6.draw(g);
        block7.draw(g);block8.draw(g);
        LevelGui.draw(g);
        Restart.draw(g);
        g.setColor(Color.GRAY);
        g.setFont(new Font("Mv Boli", Font.PLAIN, 30));
        g.drawString("Level 3", 20, 50);
        if (Collision.GameOver == true) {
            g.setColor(Color.RED);
            g.setFont(new Font("Mv Boli", Font.PLAIN, 75));
            g.drawString("Game Over !", 320, 200);
        }else if(Collision.GameWin == true){
            player.destroy();
            g.setColor(Color.GREEN);
            g.setFont(new Font("Mv Boli", Font.PLAIN, 75));
            g.drawString("Game Win!", 320, 200);
            g.setFont(new Font("Mv Boli", Font.PLAIN, 35));
            g.drawString("Go to the next level!", 340, 250);
            Main.LevelPLayer = 4;
        }


    }



    @Override
    public void keyPressed(KeyEvent e) {
        speed = 3;
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
                player.x = player.x - intersection.width * (int) Math.signum(x);
                player.y = player.y - intersection.height * (int) Math.signum(y);
                x = y = 0;
            } else if (intersection.width == intersection.height) { // en cas d'égalité, en arrête les 2
                player.x = player.x - intersection.width * (int) Math.signum(x);
                player.y = player.y - intersection.height * (int) Math.signum(y);
                x = y = 0;
            } else { // écart vertical supérieur à écart horizontal, arrêt déplacement horizontal
                player.x = player.x - intersection.width * (int) Math.signum(x);
                player.y = player.y - intersection.height * (int) Math.signum(y);
                x = y = 0;
            }

        }
        repaint();

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(LevelGui.contains(e.getPoint())){
            player.destroy();
            f.setVisible(false);
            GuiLevel.GuiLevel(" ");
        }else if(Restart.contains(e.getPoint())){
            player.destroy();
            Level3 level3 = new Level3(f.getX(), f.getY(), (int) f.getSize().getWidth(), (int) f.getSize().getHeight());
            repaint();
            f.dispose();
            this.setVisible(false);
        }
    }
    @Override
    public void mousePressed(MouseEvent e) {}
    @Override
    public void mouseReleased(MouseEvent e) {}
    @Override
    public void mouseEntered(MouseEvent e) {}
    @Override
    public void mouseExited(MouseEvent e) {}
}