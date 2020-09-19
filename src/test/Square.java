package test;

public class Square extends Rectangle {

    public Square(String color, double width, double height) {
        super(color, width, height);
    }
    @Override
    public void setHeight(double height) {
        super.setHeight(height);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public String toString() {
        return "Square{"+ super.toString() +"}";
    }
}
