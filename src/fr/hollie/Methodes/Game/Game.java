package fr.hollie.Methodes.Game;

public class Game {

    public static void reset(){
        Collision.collision = false;
        Collision.GameOver = false;
        Collision.GameWin = false;
        Box.ArrayBoxs.clear();
        Box.MapBoxs.clear();
    }
}
