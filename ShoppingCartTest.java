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
        boolean isRemoved = cart.removeItem("Laptop");

        List<String> expectedItems = Collections.singletonList("Mouse");
        assertTrue(isRemoved);
        assertEquals(expectedItems, cart.getCartItems());
    }

    @Test
    public void testRemoveNonExistentItem() {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Laptop");
        boolean isRemoved = cart.removeItem("Mouse");  // Mouse is not in the cart
        assertFalse(isRemoved);
    }

    @Test
    public void testRemoveFromEmptyCart() {
        ShoppingCart cart = new ShoppingCart();
        boolean isRemoved = cart.removeItem("Laptop");
        assertFalse(isRemoved);
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

    @Test
    public void testIsCartEmpty() {
        ShoppingCart cart = new ShoppingCart();
        assertTrue(cart.isCartEmpty());

        cart.addItem("Laptop");
        assertFalse(cart.isCartEmpty());
    }
}
