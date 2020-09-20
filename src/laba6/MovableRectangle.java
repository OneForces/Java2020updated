package laba6;

public class MovableRectangle implements Movable {
    private double width;
    private double height;
    private MovablePoint rectangleCenter = new MovablePoint();

    public MovableRectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return height*width;
    }

    public double getPerimeter() {
        return 2*width+2*height;
    }

    public void allInfo() {
        System.out.println("Center is " + rectangleCenter.getX() + rectangleCenter.getY());
    }

    @Override
    public void setCoords(int x, int y) {
        rectangleCenter.setCoords(x,y);
    }

    @Override
    public void move(double right, double left) {
        rectangleCenter.move(right, left);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height + " Area " +getArea() + " Perimeter " + getPerimeter() +
                '}';
    }
}
