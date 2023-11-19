package org.example;

import java.util.ArrayList;
import java.util.List;

public class Order {
    public final List<Product> orderItems;
    private static int initialID = 0;
    private final int id;
    public String status;
    public Order() {
        initialID++;
        this.id = initialID;
        this.orderItems = new ArrayList<>();
        this.status = "In progress";
    }

    public void AddOrder(Cart cart) {
        status = "Complete";
        orderItems.addAll(cart.getListOfProducts());
        cart.getListOfProducts().clear();
    }

    public void GetStatus() {
        System.out.println(status);
    }

    public int getId() {
        return id;
    }
}