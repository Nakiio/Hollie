package fr.hollie.main;

import fr.hollie.Methodes.Guis.GuiHome;
import fr.hollie.player.Player;
import fr.hollie.render.DisplayManager;
import fr.hollie.render.Forms;
import fr.hollie.swing.Frame;
import org.lwjgl.glfw.GLFW;

import javax.swing.*;

public class Main extends JPanel {
    public static Player player = new Player();
    public static JFrame frame = new JFrame();

    public void run() {
        GuiHome.GuiHome();
        Frame.Frame(Main.frame,0,0,1048,640,"Menu", true, false, null);


    }

    public static void loop() {
        while(!GLFW.glfwWindowShouldClose(DisplayManager.window)) {
            GLFW.glfwPollEvents();
            DisplayManager.clearBuffers();

            //FPS & rendering
            DisplayManager.update();

            player.initPlayer();
            Forms.createQuad(0.4f, 0.6f,"assets/images/ButtonTexture.png");
            GLFW.glfwSwapBuffers(DisplayManager.window);
        }
        GLFW.glfwTerminate(); // Close window
    }

    public static void main(String[] args) {
        new Main().run();

    }



}

