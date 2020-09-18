package Laba3.circle;

public class CircleProperties {
    private double radius;
    public double P;
    public double S;

    CircleProperties(double r) {
        setRadius(r);
    }

    public void setRadius(double radius) {
        this.radius=radius;
    }
    public double getRadius() {
        return radius;
    }

    public double getPerimeter() {
        return P=2*getRadius()*Math.PI;
    }

    public double getArea() {
        return S=Math.PI*getRadius();
    }
}