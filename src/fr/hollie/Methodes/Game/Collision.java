package fr.hollie.Methodes.Game;

import fr.hollie.main.MyFrame;

import java.awt.*;

public class Collision {
    public static String bc;
    public static boolean collision, GameOver, GameWin;
    public static void BlockCollision(Player player){
        for(Box block : Box.ArrayBoxs) {
            Rectangle rect1 = player.getBounds();
            Rectangle rect2 = block.getBounds();
            if (rect1.x < rect2.x + rect2.width &&
                    rect1.x + rect1.width > rect2.x &&
                    rect1.y < rect2.y + rect2.height &&
                    rect1.height + rect1.y > rect2.y) {
                System.out.println(block.getName());
                bc = block.getName();
                collision = true;
                GameOver = true;
                break;
            } else {
                collision = false;
            }
        }
    }
    public static void ItemCollision(Player player){
        if(GameWin != true)
        for(Item item : Item.ArrayItems) {
            Rectangle rect1 = player.getBounds();
            Rectangle rect2 = item.getBounds();
            if (rect1.x < rect2.x + rect2.width &&
                    rect1.x + rect1.width > rect2.x &&
                    rect1.y < rect2.y + rect2.height &&
                    rect1.height + rect1.y > rect2.y) {
                if(item.getName().equalsIgnoreCase("diamond")){
                    GameWin = true;
                    System.out.println(GameWin);
                    break;
                }
                break;
            }else {
                GameWin = false;
            }
        }
    }
}
