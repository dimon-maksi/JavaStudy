import static org.junit.jupiter.api.Assertions.*;

import org.example.*;
import org.junit.jupiter.api.Test;

class AddAndRemoveProductsFromCart {
    Cart testCart = new Cart();

    @Test
    void addEggToCart() {
        Product test = new Product("Bread", 0.2f);
        testCart.AddProductToCart(test);

        assertTrue(testCart.getListOfProducts().contains(test));
    }

    @Test
    void removeEggFromCart() {
        Product test = new Product("Milk", 13.2f);

        testCart.AddProductToCart(test);
        testCart.RemoveProductFromCart(test);

        assertFalse(testCart.getListOfProducts().contains(test));
    }
}