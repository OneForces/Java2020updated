package Laba9;

import java.awt.*;

public class Rectangle extends Shape {

    private int width;
    private int height;

    public Rectangle(int x, int y, Color color, int width, int height) {
        super(x, y, color);
        this.width = width;
        this.height = height;
    }

    @Override
    public void paint(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(getColor());
        g2d.fillRect(getCX(), getCY(), width, height);

    }
}