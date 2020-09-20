package test;

public class testclass {
    private int a;
    private String fr;
    private boolean ff;
    private char c;

    public testclass(int a, String fr, boolean ff, char c) {
        this.a = a;
        this.fr = fr;
        this.ff = ff;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getFr() {
        return fr;
    }

    public void setFr(String fr) {
        this.fr = fr;
    }

    public boolean isFf() {
        return ff;
    }

    public void setFf(boolean ff) {
        this.ff = ff;
    }

    public char getC() {
        return c;
    }

    public void setC(char c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "testclass{" +
                "a=" + a +
                ", fr='" + fr + '\'' +
                ", ff=" + ff +
                ", c=" + c +
                '}';
    }
}
