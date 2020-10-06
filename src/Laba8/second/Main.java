package Laba8.second;

import javax.swing.*;


public class Main extends JFrame {
    public Main(String[] args){
        super("Task 2");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setDefaultLookAndFeelDecorated(true);
        setSize(800, 600);
        setVisible(true);
        ImageComp img = new ImageComp(args[0]);
        add(img);
        validate();
        repaint();
    }

    public static void main(String[] args) {
        new Main(args);
    }


}