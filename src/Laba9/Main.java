package Laba9;

import Laba8.first.Circle;
import Laba8.first.Rectangle;
import Laba8.first.Square;
import Laba8.first.Shape;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Main extends JFrame {

    private static final Random random = new Random();
    public static final int width = 800;
    public static final int height = 600;
    public static int x = 10;
    public static int y = 20;


    public static Color randomColor(){
        int r = random.nextInt(256);
        int g = random.nextInt(256);
        int b = random.nextInt(256);
        return new Color(r, g, b);
    }
    public static Shape randomShape(){
        Color color = randomColor();
        int nx = random.nextInt(800);
        int ny = random.nextInt(600);
        int w = random.nextInt(50) + 50;
        int h = random.nextInt(50) + 25;
        switch (random.nextInt(3)){
            case 0:
                return new Circle(nx, ny, color, w / 2);
            case 1:
                return new Rectangle(nx, ny, color, w, h);
            case 2:
                return  new Square(nx, ny, color, w);
        }
        return new Circle(10, 10, color, w * 2);
    }

    public void addShape(JLayeredPane pane){
        Shape shape = randomShape();
        shape.setBounds(0, 0, width, height);
        pane.add(shape);

    }
    public Main(){
        super("Task 1");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setDefaultLookAndFeelDecorated(true);
        JLayeredPane pane = getLayeredPane();
        JButton btn = new JButton("Click");
        btn.setBounds(10, 10, 100, 50);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addShape(pane);
                repaint();
            }
        });
        pane.add(btn);
        setSize(width, height);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Main();
    }
}