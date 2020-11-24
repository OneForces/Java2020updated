package Laba22;

import java.util.HashMap;

public class Shop {
    private HashMap<String, String> INNs = new HashMap<>();
    private final HashMap<Item, Double> items;
    private final HashMap<Integer, Item> idOfItems;
    private int currentId;

    public Shop(){
        items = new HashMap<>();
        idOfItems = new HashMap<>();
        currentId = 0;
    }

    public void addItem(Item item){
        items.put(item, item.getPrice());
        idOfItems.put(++currentId, item);
    }

    public Item removeItem(int id){
        items.remove(idOfItems.get(id), getPrice(id));
        return idOfItems.remove(id);
    }

    public double getPrice(int id){
        return items.get(idOfItems.get(id));
    }

    public void showItems(){
        for(int id : idOfItems.keySet()){
            System.out.println("ID: " + id + " Description: " + idOfItems.get(id).toString() + " Price: " + getPrice(id));
        }
    }

    public void makeOrder(Customer customer) throws Exception {
        if (!INNs.containsKey(customer.getName())) {
            errorHandling(customer);
        } else if (!customer.getINN().matches("[0-9]{9}") | !INNs.get(customer.getName()).equals(customer.getINN())) {
            errorHandling(customer);
        } else {
            for (Item i : customer.getShoppingBag()) {
                customer.setBalance(customer.getBalance() - i.getPrice());
            }
            System.out.println("Покупка прошла успешно");
        }
    }

    private void errorHandling(Customer customer) throws Exception {
        for (Item i : customer.getShoppingBag()) {
            this.addItem(i);
        }
        throw new Exception("Недействительный ИНН -> Покупка не удалась");
    }

    public void setINNs(HashMap<String, String> INNs) {
        this.INNs = INNs;
    }
}