package Laba32;

public final class Drink extends MenuItem implements Alcoholable {
    private double alcoholVol;
    private DrinkType type;

    public Drink(double alcoholVol, DrinkType type) {
        this.alcoholVol = alcoholVol;
        this.type = type;
    }

    @Override
    public boolean isAlcoholicDrink() {
        return type.isAlcohol();
    }

    @Override
    public double getAlcoholVol() {
        return alcoholVol;
    }
}