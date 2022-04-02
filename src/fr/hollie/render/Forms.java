package fr.hollie.render;

import org.lwjgl.opengl.GL11;

public class Forms {
    public static void createQuad(float x, float y, String texture) {
        System.out.println("Quad created????");
        float[] vertices = new float[] {
                -0.1f + x, 0.1f + y, 0,
                0.1f + x, 0.1f + y, 0,
                -0.1f + x, -0.1f + y, 0,

                0.1f + x, -0.1f + y, 0,
                -0.1f + x, -0.1f + y, 0,
                0.1f + x, 0.1f + y, 0
        };

        float[] textures = new float[] {
                1, 0,
                0, 0,
                1, 1,

                0, 1,
                1, 1,
                0, 0
        };

        GL11.glEnable(GL11.GL_TEXTURE_2D);
        Texture tex_file = new Texture(texture);
        tex_file.bind();
        VBO vbo = new VBO(vertices, textures);
        vbo.render();
    }
}
