import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.example.*;

import static org.junit.jupiter.api.Assertions.*;

class AddOrderTest {
    Product first;
    Product second;
    Product third ;
    Cart firstCart = new Cart();

    Order firstOrder = new Order();

    @BeforeEach
    public void init() {

        first = new Product("Egg", 3.2f);
        second = new Product("Milk", 32.9f);
        third = new Product("Bread", 15f);

        firstCart.AddProductToCart(first);
        firstCart.AddProductToCart(second);
        firstCart.AddProductToCart(third);
    }

    @Test
    void checkForIncludingAllElements() {

        firstOrder.AddOrder(firstCart);

        assertTrue(firstOrder.orderItems.contains(first) &&
                firstOrder.orderItems.contains(second) &&
                firstOrder.orderItems.contains(third));
    }

    @Test
    void isFunctionComplete() {
        firstOrder.AddOrder(firstCart);
        assertEquals("Complete", firstOrder.status);
    }

    @Test
    void isFunctionInProgress() {
        assertEquals("In progress", firstOrder.status);
    }
}