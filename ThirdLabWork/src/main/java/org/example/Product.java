package org.example;

public class Product {
    private static int initialID = 0;
    private final int id;
    private String name;
    private float price;
    public Product(String name, float price){
        initialID++;
        this.id = initialID;
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }
}