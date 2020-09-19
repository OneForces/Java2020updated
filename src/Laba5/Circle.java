package Laba5;
import java.math.*;

public class Circle extends Shape {
    private double radius;

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    public double getArea() {
        return Math.PI*radius*radius;
    }

    public double getPerimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius + " Area " +getArea() + " Perimeter " + getPerimeter() +
                '}';
    }
}
