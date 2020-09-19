package test;

public class Main {

    public static void main(String[] args) {
        Rectangle rect = new Rectangle("red", 55, 78);
        refactor(rect, 200);
        System.out.println(rect);
    }

    static void refactor(Rectangle rect, double newSize) {
        rect.setHeight(newSize);
        rect.setWidth(newSize*2);
    }
}
