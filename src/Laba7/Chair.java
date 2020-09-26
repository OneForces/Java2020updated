package Laba7;

public class Chair extends Furniture {
    private int nojki;

    public Chair(boolean isFilled, String color, double height, double wight, int nojki) {
        super(isFilled, color, height, wight);
        this.nojki = nojki;
    }

    public int getNojki() {
        return nojki;
    }

    public void setNojki(int nojki) {
        this.nojki = nojki;
    }

    public Chair(boolean isFilled, String color, double height, double wight) {
        super(isFilled, color, height, wight);
    }

    @Override
    public boolean isFilled() {
        return super.isFilled();
    }

    @Override
    public void setFilled(boolean filled) {
        super.setFilled(filled);
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public double getHeight() {
        return super.getHeight();
    }

    @Override
    public void setHeight(double height) {
        super.setHeight(height);
    }

    @Override
    public double getWight() {
        return super.getWight();
    }

    @Override
    public void setWight(double wight) {
        super.setWight(wight);
    }

    @Override
    public String toString() {
        return "Chair{" + " isFilled=" + isFilled() + " color=" + getColor() +
                " Height=" + getHeight() + " Wight=" + getWight() +
                " nojki=" + nojki +
                '}';
    }
}