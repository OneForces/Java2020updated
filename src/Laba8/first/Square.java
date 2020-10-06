package Laba8.first;

import java.awt.*;

public class Square extends Shape{
    private int width;

    public Square(int x, int y, Color color, int width) {
        super(x, y, color);
        this.width = width;
    }

    @Override
    public void paint(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(getColor());
        g2d.fillRect(getCX(), getCY(), width, width);
    }
}
