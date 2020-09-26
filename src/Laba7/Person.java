package Laba7;

public class Person {
    private FurnitureShop basket[] = new FurnitureShop[1];


    public void getInfoAboutPrices() {
        System.out.println(basket[0].newPriceOfCupboard());
        System.out.println(basket[1].newPriceOfChair());
    }
}
