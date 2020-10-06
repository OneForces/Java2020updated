package Laba8.first;

import javax.swing.*;
import java.awt.*;

public abstract class Shape extends JComponent {
    private int x;
    private int y;
    private Color color;


    public Shape(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    @Override
    public void paint(Graphics g){
        super.paint(g);
    }

    public int getCX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getCY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

}