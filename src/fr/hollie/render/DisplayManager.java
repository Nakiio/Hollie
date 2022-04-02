package fr.hollie.render;

import org.lwjgl.glfw.GLFW;
import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GL11;

public class DisplayManager {
        public static int frames;
        public static long time;
        public static long window;

        public static int width = 1048;
        public static int height = 640;

        public static void initWindow(String title) {
            if (!GLFW.glfwInit()) {
                System.err.println("Error: Can't init glfw");
                System.exit(1);
            }

            window = GLFW.glfwCreateWindow(width, height, title, 0L, 0L);
            GLFW.glfwShowWindow(window);
            GLFW.glfwMakeContextCurrent(window);
            //position
            GLFW.glfwSetWindowPos(window, 500, 250);

            GLFW.glfwSwapInterval(0); // Fps cap
            GL.createCapabilities();
        }

        public static void clearBuffers() {
            //GL11.glClear(16640);
            GL11.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);
            GL11.glClearColor(0.0F, 0.0F, 0.3F, 1.0F);
        }

        //Method for FPS
        public static void update() {
            GLFW.glfwPollEvents();
            frames++;
            if (System.currentTimeMillis() > time + 1000L) {
                GLFW.glfwSetWindowTitle(window, "Hollie | FPS: " + frames);
                time = System.currentTimeMillis();
                frames = 0;
            }
        }

}
