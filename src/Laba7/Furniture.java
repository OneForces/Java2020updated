package Laba7;

public abstract class Furniture {
    private boolean isFilled;
    private String color;
    private double height;
    private double wight;

    public Furniture(boolean isFilled, String color, double height, double wight) {
        this.isFilled = isFilled;
        this.color = color;
        this.height = height;
        this.wight = wight;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWight() {
        return wight;
    }

    public void setWight(double wight) {
        this.wight = wight;
    }

    @Override
    public String toString() {
        return "Furniture{" +
                "isFilled=" + isFilled +
                ", color='" + color + '\'' +
                ", height=" + height +
                ", wight=" + wight +
                '}';
    }
}
