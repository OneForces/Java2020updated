package Laba22;

import java.util.ArrayList;

public class Customer {
    private final String INN;
    private double balance;
    private String name;
    private final ArrayList<Item> shoppingBag;

    public Customer(double balance, String name) {
        this.balance = balance;
        this.name = name;
        shoppingBag = new ArrayList<>();
        INN = randomINN();
    }

    public void addProduct(Shop shop, int id){
        shoppingBag.add(shop.removeItem(id));
    }

    public String getINN() {
        return INN;
    }

    public static String randomINN() {
        String[] digits = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 9; i++) {
            int index = (int) Math.floor(Math.random() * 10);
            result.append(digits[index]);
        }
        return result.toString();
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Item> getShoppingBag() {
        return shoppingBag;
    }
}
