package fr.hollie.swing;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class CreateRoundButton extends JButton {

    public CreateRoundButton(String label, int SizeX, int SizeY) {
        super(label);
        Dimension size = getPreferredSize();

        size.height = SizeX;
        size.width = SizeY;

        setPreferredSize(size);

        setContentAreaFilled(false);
    }

    protected void paintComponent(Graphics g) {
        if (getModel().isArmed()) {
            g.setColor(Color.lightGray);
        } else {
            g.setColor(Color.lightGray);
        }
        g.drawRoundRect(0, 0, getSize().width - 1, getSize().height - 1, 15, 15);

        super.paintComponent(g);
    }

    protected void paintBorder(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawRoundRect(0, 0, getSize().width - 1, getSize().height - 1, 15, 15);
    }

    Shape shape;

    public boolean contains(int x, int y) {
        if (shape == null ||
                !shape.getBounds().equals(getBounds())) {
            shape = new Ellipse2D.Float(0, 0, getWidth(), getHeight());
        }
        return shape.contains(x, y);
    }
}
