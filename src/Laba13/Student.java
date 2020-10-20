package Laba13;


public class Student {
    private String name;
    private int id;
    private int factor;

    public Student(String name, int id, int factor) {
        this.name = name;
        this.id = id;
        this.factor = factor;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getFactor() {
        return factor;
    }
}