import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class ShoppingCartTest {

    @Test
    public void testAddItem() {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Laptop");
        cart.addItem("Mouse");
        
        List<String> expectedItems = Arrays.asList("Laptop", "Mouse");
        assertEquals(expectedItems, cart.getCartItems());
    }

    @Test
    public void testRemoveItem() {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Laptop");
        cart.addItem("Mouse");
        cart.removeItem("Laptop");

        List<String> expectedItems = Collections.singletonList("Mouse");
        assertEquals(expectedItems, cart.getCartItems());
    }

    @Test
    public void testItemQuantities() {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Laptop");
        cart.addItem("Laptop");
        cart.addItem("Mouse");

        Map<String, Integer> expectedQuantities = new HashMap<>();
        expectedQuantities.put("Laptop", 2);
        expectedQuantities.put("Mouse", 1);
        
        assertEquals(expectedQuantities, cart.getItemQuantities());
    }
}
