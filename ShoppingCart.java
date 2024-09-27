import java.util.*;

public class ShoppingCart {
    private List<String> cartItems;
    private Set<String> uniqueItems;
    private Map<String, Integer> itemQuantities;

    public ShoppingCart() {
        cartItems = new ArrayList<>();
        uniqueItems = new HashSet<>();
        itemQuantities = new HashMap<>();
    }

    // Adds an item to the cart
    public void addItem(String item) {
        cartItems.add(item);
        if (uniqueItems.add(item)) {
            itemQuantities.put(item, 1);
        } else {
            itemQuantities.put(item, itemQuantities.get(item) + 1);
        }
    }

    // Removes an item from the cart
    // Returns true if the item was successfully removed, false if not
    public boolean removeItem(String item) {
        if (uniqueItems.contains(item)) {
            cartItems.remove(item);
            int currentQuantity = itemQuantities.get(item);
            if (currentQuantity > 1) {
                itemQuantities.put(item, currentQuantity - 1);
            } else {
                uniqueItems.remove(item);
                itemQuantities.remove(item);
            }
            return true;
        }
        return false;
    }

    // Returns the list of items in the cart
    public List<String> getCartItems() {
        return cartItems;
    }

    // Returns the quantity of each unique item in the cart
    public Map<String, Integer> getItemQuantities() {
        return itemQuantities;
    }

    // Check if the cart is empty
    public boolean isCartEmpty() {
        return cartItems.isEmpty();
    }
}
