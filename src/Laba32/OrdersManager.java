package Laba32;

public interface OrdersManager {
    int itemsQuantity(String itemName);

    int itemsQuantity(MenuItem item);

    Orderable[] getOrders();

    int ordersCostSummary();

    int ordersQuantity();
}