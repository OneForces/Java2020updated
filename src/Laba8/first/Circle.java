package Laba8.first;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Circle extends Shape {
    public int radius;

    public Circle(int x, int y, Color color, int radius) {
        super(x, y, color);
        this.radius = radius;
    }
    @Override
    public void paint(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        Ellipse2D.Double circle = new Ellipse2D.Double(getCX(), getCY(), 2*radius, 2*radius);
        g2d.setColor(getColor());
        g2d.fill(circle);
    }

}