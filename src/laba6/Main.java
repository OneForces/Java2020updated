package laba6;

public class Main {

    public static void main(String[] args) {
        MovableCircle circle = new MovableCircle(88);
        MovableRectangle rectangle = new MovableRectangle(14, 35);
        circle.setCoords(5,21);
        circle.move(55,1);
        circle.allInfo();
        rectangle.setCoords(15,210);
        rectangle.move(550,10);
        rectangle.allInfo();

    }
}
