package Laba3.human;

public class Head {
    private int teeth;
    private String color_hair;

    public Head(int teeth, String color_hair) {
        this.teeth = teeth;
        this.color_hair = color_hair;
    }

    public int getTeeth() {
        return teeth;
    }

    public void setTeeth(int teeth) {
        this.teeth = teeth;
    }

    public String getColor_hair() {
        return color_hair;
    }

    public void setColor_hair(String color_hair) {
        this.color_hair = color_hair;
    }


    @Override
    public String toString() {
        return "Head{" +
                "teeth=" + teeth +
                ", color_hair='" + color_hair + '\'' +
                '}';
    }
}
