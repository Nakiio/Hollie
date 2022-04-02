package fr.hollie.player;

import fr.hollie.render.Texture;
import fr.hollie.render.VBO;
import org.lwjgl.opengl.GL11;

public class Player {

    Keyboard keyboard = new Keyboard();
    static float x;
    static float y;

    public void initPlayer() {
        keyboard.initKeyBoard();
        initModel();
    }

    public void initModel() {
        float[] vertices = new float[] {
                -0.1f + x, 0.1f + y, 0,
                0.1f + x, 0.1f + y, 0,
                -0.1f + x, -0.1f + y, 0,

                0.1f + x, -0.1f + y, 0,
                -0.1f + x, -0.1f + y, 0,
                0.1f + x, 0.1f + y, 0
        };

        float[] texture = new float[] {
                1, 0,
                0, 0,
                1, 1,

                0, 1,
                1, 1,
                0, 0
        };

        GL11.glEnable(GL11.GL_TEXTURE_2D);
        Texture tex_file = new Texture("assets/images/player.png");
        tex_file.bind();
        VBO vbo = new VBO(vertices, texture);
        vbo.render();
    }
}

/* Old model method
        GL11.glEnable(GL11.GL_TEXTURE_2D);
        Texture texture = new Texture("assets/images/player.png");
        texture.bind();
GL11.glBegin(GL11.GL_QUADS);
        GL11.glTexCoord2f(0, 0);
        GL11.glVertex2f(-0.1f + x, 0.1f + y);

        GL11.glTexCoord2f(1, 0);
        GL11.glVertex2f(0.1f + x, 0.1f + y);

        GL11.glTexCoord2f(1, 1);
        GL11.glVertex2f(0.1f + x, -0.1f + y);

        GL11.glTexCoord2f(0, 1);
        GL11.glVertex2f(-0.1f + x, -0.1f+ y);
GL11.glEnd();
*/
