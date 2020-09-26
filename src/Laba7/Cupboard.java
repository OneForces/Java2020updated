package Laba7;

public class Cupboard extends Furniture {
    private boolean isWheel;
    private boolean isСompartment;

    public Cupboard(boolean isFilled, String color, double height, double wight, boolean isWheel, boolean isСompartment) {
        super(isFilled, color, height, wight);
        this.isWheel = isWheel;
        this.isСompartment = isСompartment;
    }



    public boolean isWheel() {
        return isWheel;
    }

    public void setWheel(boolean wheel) {
        isWheel = wheel;
    }

    public boolean isСompartment() {
        return isСompartment;
    }

    public void setСompartment(boolean сompartment) {
        isСompartment = сompartment;
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
        return "Cupboard{" +
                "isWheel=" + isWheel + " isFilled=" + isFilled() + " color=" + getColor() +
                " Height=" + getHeight() + " Wight=" + getWight() +
                ", isСompartment=" + isСompartment +
                '}';
    }
}
