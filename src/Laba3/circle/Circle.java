package Laba3.circle;

public class Circle {
private CircleProperties count[] = new CircleProperties[1];
private int counter = 0;

    public void newNumb(double a) {
        count[counter] = new CircleProperties(a);
    }

    public void allInfo() {
        System.out.println(String.format("%.2f",count[0].getPerimeter()));
        System.out.println(String.format("%.2f",count[0].getArea()));
    }

}
