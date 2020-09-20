package laba6;

public class MovablePoint implements Movable {
    private int x;
    private int y;

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    @Override
    public void setCoords(int x, int y) {
    this.x=x;
    this.y=y;
    }

    @Override
    public void move(double right, double left) {
        x += right;
        y += right;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
