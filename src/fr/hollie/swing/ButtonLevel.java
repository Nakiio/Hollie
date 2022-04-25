package fr.hollie.swing;

import fr.hollie.Methodes.CreateRect;
import fr.hollie.Methodes.Guis.GuiHome;
import fr.hollie.Methodes.Guis.GuiSettings;
import fr.hollie.Methodes.RemoveAllItems;
import fr.hollie.main.Main;
import fr.hollie.main.mainDraw;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class ButtonLevel extends JFrame implements KeyListener{
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()== KeyEvent.VK_RIGHT)
            draw.moveRight();
        else if(e.getKeyCode()== KeyEvent.VK_LEFT)
            draw.moveLeft();
        else if(e.getKeyCode()== KeyEvent.VK_DOWN)
            draw.moveDown();
        else if(e.getKeyCode()== KeyEvent.VK_UP)
            draw.moveUp();
    }

    public void keyReleased(KeyEvent e) {}
    public void keyTyped(KeyEvent e) {}
    private mainDraw draw;
    public ButtonLevel(){
        setResizable(false);
        setLocation(Main.frame.getLocation());
        setTitle(Main.frame.getTitle());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.draw=new mainDraw();
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        pack();
        setVisible(true);
    }

    //Method for create a button in a FRAME
    public static void Button(JFrame frame, int LocX, int LocY, int SizeX, int SizeY, Color Border, Color Back, String Name,
                              boolean image, String path, int FontSize){
        JButton button = new CreateRoundButton(Name,SizeX,SizeY);
        button.setText(Name);
        RemoveAllItems.AllItems.add(button);
        button.setVisible(true);
        button.setLocation(LocX,LocY);
        button.setSize(SizeX,SizeY);
        button.setBorder(new LineBorder(Border));
        button.setBackground(Back);
        button.setFont(new Font("Verdana", Font.BOLD, FontSize));
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.CENTER);
        button.setForeground(new Color(25, 10, 20));
        if(image == true){
            button.setIcon(new ImageIcon(path));
        }
        //Actions related to buttons
        button.addActionListener((event) -> {
                    if (button.getText().equalsIgnoreCase("Return")) {
                        Panel.ColseAllPanels();
                        RemoveAllItems.RemoveAllItems();
                        GuiHome.GuiHome();
                    } else if (button.getText().equalsIgnoreCase("(1)")) {
                        ButtonLevel f = new ButtonLevel();
                        f.setSize(Main.frame.getWidth(), Main.frame.getHeight());
                        f.getContentPane().add(f.draw);
                        frame.setVisible(false);

                    }
                });
        frame.add(button);

    }
}