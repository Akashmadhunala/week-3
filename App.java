import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1: Add item to cart");
            System.out.println("2: Remove item from cart");
            System.out.println("3: View cart items");
            System.out.println("4: View item quantities");
            System.out.println("5: Exit");
            System.out.print("Enter your choice: ");
            input = scanner.nextLine();

            switch (input) {
                case "1":
                    System.out.print("Enter item to add: ");
                    String addItem = scanner.nextLine();
                    cart.addItem(addItem);
                    System.out.println(addItem + " added to the cart.");
                    break;
                case "2":
                    if (cart.isCartEmpty()) {
                        System.out.println("Cart is empty. No items to remove.");
                    } else {
                        System.out.print("Enter item to remove: ");
                        String removeItem = scanner.nextLine();
                        if (cart.removeItem(removeItem)) {
                            System.out.println(removeItem + " removed from the cart.");
                        } else {
                            System.out.println(removeItem + " is not in the cart.");
                        }
                    }
                    break;
                case "3":
                    if (cart.isCartEmpty()) {
                        System.out.println("Cart is empty. No items to display.");
                    } else {
                        System.out.println("Cart items: " + cart.getCartItems());
                    }
                    break;
                case "4":
                    if (cart.isCartEmpty()) {
                        System.out.println("Cart is empty. No item quantities to display.");
                    } else {
                        System.out.println("Item quantities: " + cart.getItemQuantities());
                    }
                    break;
                case "5":
                    System.out.println("Exiting the program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}
