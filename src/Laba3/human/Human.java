package Laba3.human;

public class Human {
    private int dlina;
    private int shirina;
    private String cvet_volos;
    private String cvet_glaz;

    Human(int d, int s, String cv, String cg) {
        setDlina(d);
        setShirina(s);
        setCvetvolos(cv);
        setCvetglaz(cg);
    }

    public void setDlina(int dlina) {
        this.dlina = dlina;
    }

    public int getDlina() {
        return dlina;
    }

    public void setShirina(int shirina) {
        this.shirina = shirina;
    }

    public int getShirina() {
        return shirina;
    }

    public void setCvetvolos(String cvet_volos) {
        this.cvet_volos = cvet_volos;
    }

    public String getCvetvolos() {
        return cvet_volos;
    }

    public void setCvetglaz(String cvet_glaz) {
        this.cvet_glaz = cvet_glaz;
    }

    public String getCvetglaz() {
        return cvet_glaz;
    }
}
