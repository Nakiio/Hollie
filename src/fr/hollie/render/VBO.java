package fr.hollie.render;

import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL15;

import java.nio.FloatBuffer;

public class VBO {
    private int vbo_id;
    private int texture_id;
    private int draw_count;

    public VBO(float[] vertices, float[] texture){
        draw_count = vertices.length / 3;

        vbo_id = GL15.glGenBuffers();
        GL15.glBindBuffer(GL15.GL_ARRAY_BUFFER, vbo_id);
        GL15.glBufferData(GL15.GL_ARRAY_BUFFER, createBuffer(vertices),  GL15.GL_STATIC_DRAW);

        texture_id = GL15.glGenBuffers();
        GL15.glBindBuffer(GL15.GL_ARRAY_BUFFER, texture_id);
        GL15.glBufferData(GL15.GL_ARRAY_BUFFER, createBuffer(texture), GL15.GL_STATIC_DRAW);

        GL15.glBindBuffer(GL15.GL_ARRAY_BUFFER, 0);
    }

    public void render(){
        GL15.glEnable(GL11.GL_VERTEX_ARRAY);
        GL15.glEnable(GL11.GL_TEXTURE_COORD_ARRAY);
            GL15.glBindBuffer(GL15.GL_ARRAY_BUFFER, vbo_id);
            GL15.glVertexPointer(3, GL11.GL_FLOAT, 0, 0);
            GL15.glBindBuffer(GL15.GL_ARRAY_BUFFER, texture_id);
            GL15.glTexCoordPointer(2, GL11.GL_FLOAT, 0, 0);
            GL15.glDrawArrays(GL11.GL_TRIANGLES, 0, draw_count);
            GL15.glBindBuffer(GL15.GL_ARRAY_BUFFER, 0);
        GL15.glDisable(GL11.GL_VERTEX_ARRAY);
        GL15.glDisable(GL11.GL_TEXTURE_COORD_ARRAY);
    }

    private FloatBuffer createBuffer(float[] date) {
        FloatBuffer buffer = BufferUtils.createFloatBuffer(date.length);
        buffer.put(date);
        buffer.flip();
        return buffer;
    }
}
