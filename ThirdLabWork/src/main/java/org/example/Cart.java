package org.example;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private final List<Product> listOfProducts;
    public Cart() {
        listOfProducts = new ArrayList<>();
    }

    public void AddProductToCart(Product product) {
        listOfProducts.add(product);
    }

    public void RemoveProductFromCart(Product product) {
        listOfProducts.remove(product);
    }

    public List<Product> getListOfProducts() {
        return listOfProducts;
    }
}