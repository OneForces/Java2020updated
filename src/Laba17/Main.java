package Laba17;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Запуск игры...");
        JFrame window = new JFrame("Game");//наше главное окно
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//добавляем кнопку Х, закрывающая окно
        window.setSize(400,400); //размер окна
        window.setLayout(new BorderLayout());//менеджер компоновки
        window.setLocationRelativeTo(null);//Чтобы окно было по центру окна
        window.setVisible(true);//видимость окна
        Game game = new Game();//создаем объект нашего класса
        window.add(game);//добавляем его в окно
        System.out.println("Конец игры...");
    }
}