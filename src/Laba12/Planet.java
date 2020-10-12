package Laba12;

public enum Planet {
    MERCURY(1.3, 2439.7),
    VENUS(50.7, 3000.8),
    EARTH(60.8, 1270),
    MARS(8.4, 4000);

    private double mass, radius;
    Planet(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
    }

    public double getMass() {
        return mass;
    }

    public double getRadius() {
        return radius;
    }
}