package Laba3.human;

public class HumanOut {
    private Human counter[] = new Human[1];
    private int count = 0;

    public void addParameter(int dlina, int shirina, String cvetvolos, String svetglaz) {
        counter[count] = new Human(dlina,shirina,cvetvolos,svetglaz);
        count++;
    }

    public void allInfo() {
        System.out.println(counter[0].getDlina());
        System.out.println(counter[0].getShirina());
        System.out.println(counter[0].getCvetvolos());
        System.out.println(counter[0].getCvetglaz());
    }
}
