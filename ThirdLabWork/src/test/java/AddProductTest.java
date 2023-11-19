import static org.junit.jupiter.api.Assertions.*;

import org.example.Product;
import org.junit.jupiter.api.Test;

import java.util.Objects;

class AddProductTest {
    String name;
    float price;
    Product product;

    @Test
    void addEggToProducts() {
        name = "Egg";
        price = 3.2f;
        product = new Product(name, price);
        assertTrue(Objects.equals(name, product.getName()) && Objects.equals(price, product.getPrice()));
    }

    @Test
    void addMilkToProducts() {
        name = "Milk";
        price = 32.9f;
        product = new Product(name, price);
        assertTrue(Objects.equals(name, product.getName()) && Objects.equals(price, product.getPrice()));
    }

    @Test
    void addBreadToProducts() {
        name = "Bread";
        price = 15f;
        product = new Product(name, price);
        assertTrue(Objects.equals(name, product.getName()) && Objects.equals(price, product.getPrice()));
    }


}