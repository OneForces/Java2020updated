package Laba7;

import java.util.Arrays;

public class FurnitureShop {
    private int num=0;
    private int priceOfCupboard = 50;
    private int priceOfChair = 50;
    private Cupboard furnitureCupboard[] = new Cupboard[0];
    private Chair furnitureChair[] = new Chair[0];

    public void newCupboard(boolean isFilled, String color, double height, double wight, boolean isWheel, boolean isСompartment) {
        furnitureCupboard[num] = new Cupboard(isFilled, color, height, wight, isWheel, isСompartment);
        num++;
    }

    public int newPriceOfCupboard() {
        return num+priceOfCupboard;
    }


    public void newChair(boolean isFilled, String color, double height, double wight, int nojki) {
        furnitureChair[num] = new Chair(isFilled, color, height, wight, nojki);
        num++;
    }

    public int newPriceOfChair() {
        return num+priceOfChair+100;
    }

    @Override
    public String toString() {
        return "FurnitureShop: \n" + Arrays.toString(furnitureCupboard) + "\n" + Arrays.toString(furnitureChair) +
                '}';
    }
}
