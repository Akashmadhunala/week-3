import java.util.*;

public class App {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Add items to the cart
        cart.addItem("Laptop");
        cart.addItem("Mouse");
        cart.addItem("Keyboard");
        cart.addItem("Mouse"); // Duplicate, testing Set behavior

        // Display cart items
        System.out.println("Cart items: " + cart.getCartItems());

        // Remove an item
        cart.removeItem("Laptop");

        // Display cart items after removal
        System.out.println("Cart items after removing Laptop: " + cart.getCartItems());

        // Display item quantities
        System.out.println("Item quantities: " + cart.getItemQuantities());
    }
}
