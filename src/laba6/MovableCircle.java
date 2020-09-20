package laba6;

public class MovableCircle implements Movable{
    private double radius;
    private MovablePoint circleCenter = new MovablePoint();

    public MovableCircle(double radius) {
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

    public void allInfo() {
        System.out.println("Center is " + circleCenter.getX() + circleCenter.getY());
    }

    @Override
    public void setCoords(int x, int y) {
        circleCenter.setCoords(x, y);
    }

    @Override
    public void move(double right, double left) {
        circleCenter.move(right,left);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius + " Area " +getArea() + " Perimeter " + getPerimeter() +
                '}';
    }
}
