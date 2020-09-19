package Laba5;

import sun.jvm.hotspot.memory.Space;

public class Main {

    public static void main(String[] args) {
    Circle c = new Circle("green",true,25);
    System.out.println(c);
    Rectangle r = new Rectangle("yellow", false, 54,43);
    System.out.println(r);
    Square s = new Square("black", true, 44);
    System.out.println(s);
    }
}
