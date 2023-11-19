import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.example.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class GetStatusTest {
    Product first;
    Product second;
    Cart firstCart = new Cart();

    Order firstOrder = new Order();

    @BeforeEach
    public void init() {

        first = new Product("Egg", 3.2f);
        second = new Product("Milk", 32.9f);

        firstCart.AddProductToCart(first);
        firstCart.AddProductToCart(second);
    }

    @Test
    void getInProgressStatus() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        firstOrder.GetStatus();

        System.setOut(System.out);

        assertEquals("In progress", outputStream.toString().trim());
    }

    @Test
    void getCompleteStatus() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        firstOrder.AddOrder(firstCart);


        firstOrder.GetStatus();

        System.setOut(System.out);

        assertEquals("Complete", outputStream.toString().trim());
    }
}