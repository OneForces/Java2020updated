package Laba7;


public class Main {

    public static void main(String[] args) {
        Cupboard c = new Cupboard(true, "red", 44, 33, true, true);
        System.out.println(c);
        Chair cha = new Chair(true, "green", 44, 33, 5);
        System.out.println(cha);
        FurnitureShop furn = new FurnitureShop(); // магазин
        furn.newChair(true,"black", 44,22,1);
        furn.newCupboard(true,"yellow", 44,22,true,true);
        System.out.println(furn); // добавленная мебель
        Person pers = new Person();
        pers.getInfoAboutPrices();
    }
}
