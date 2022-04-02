package fr.hollie.player;

import fr.hollie.render.DisplayManager;
import org.lwjgl.glfw.GLFW;

public class Keyboard {

    public void initKeyBoard() {
        if(GLFW.glfwGetKey(DisplayManager.window, GLFW.GLFW_KEY_D) == GLFW.GLFW_TRUE) {
            Player.x += 0.01f;
        } else if(GLFW.glfwGetKey(DisplayManager.window, GLFW.GLFW_KEY_A) == GLFW.GLFW_TRUE) {
            Player.x -= 0.01f;
        } else if(GLFW.glfwGetKey(DisplayManager.window, GLFW.GLFW_KEY_W) == GLFW.GLFW_TRUE) {
            Player.y += 0.01f;
        } else if(GLFW.glfwGetKey(DisplayManager.window, GLFW.GLFW_KEY_S) == GLFW.GLFW_TRUE) {
            Player.y -= 0.01f;
        }

        if(GLFW.glfwGetMouseButton(DisplayManager.window, 0) == GLFW.GLFW_TRUE) {
            GLFW.glfwDestroyWindow(DisplayManager.window);
            System.exit(1);
        }
    }
}
