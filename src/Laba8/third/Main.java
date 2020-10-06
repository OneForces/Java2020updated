package Laba8.third;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Main {
    private static String path = "/Users/oneforce/IdeaProjects/java2020/src/ru/java2020/lab8/Gif/";
    String[] imgs = {"1.png", "2.png", "3.png", "4.png", "5.png", "6.png", "7.png", "8.png", };
    private static String filepath = "/Users/oneforce/IdeaProjects/java2020/src/ru/java2020/lab8/Gif/1.png";
    JFrame frame;


    public Main(){
        frame = new JFrame("Task 3");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setDefaultLookAndFeelDecorated(true);
        frame.setLayout(new BorderLayout());
        frame.setSize(800, 600);
        frame.add(new ImgPanel());
        frame.pack();
        frame.setVisible(true);
        gif();

    }
    public void gif(){
        int i = 0;
        while (true){
            filepath = path + imgs[i];
            i = (i + 1) % 8;
            System.out.println(i);
            try {

            } catch (Exception exc) {
                exc.printStackTrace();
            }
            frame.repaint();
        }
    }

    public static class ImgPanel extends JPanel{
        private Image img;

        public void paintComponent(Graphics g){
            Graphics2D g2d = (Graphics2D) g;
            try{
                img = ImageIO.read(new File(filepath));
            } catch (IOException e){
                e.printStackTrace();
            }
            g2d.drawImage(img, 50, 50, this);
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}