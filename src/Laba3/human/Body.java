package Laba3.human;

public class Body {
    private int hand;
    private int foot;

    public Body(int hand, int foot) {
        this.hand = hand;
        this.foot = foot;
    }

    public int getHand() {
        return hand;
    }

    public void setHand(int hand) {
        this.hand = hand;
    }

    public int getFoot() {
        return foot;
    }

    public void setFoot(int foot) {
        this.foot = foot;
    }

    @Override
    public String toString() {
        return "Body{" +
                "hand=" + hand +
                ", foot=" + foot +
                '}';
    }
}
