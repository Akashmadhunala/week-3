# week-3

### File Structure:
  - App.java
  - ShoppingCart.java
  - ShoppingCartTest.java


# ShoppingCart Java Application

## Overview

This Java application demonstrates the usage of different Java collections such as `List`, `Set`, and `Map` through a simple shopping cart system. 

### Collections Used:

- List<String> : Stores all items added to the cart, including duplicates.
- Set<String> : Ensures that each item in the cart is unique.
- Map<String, Integer>: Tracks the quantity of each item in the cart.

## Features

- Add items to the shopping cart.
- Remove items from the shopping cart.
- View all items in the cart.
- View the quantity of each item.

## Project Structure

- **App.java**: The entry point of the application.
- **ShoppingCart.java**: Contains the shopping cart logic.
- **ShoppingCartTest.java**: Unit tests to verify the correctness of the shopping cart functionality.


### To run the tests:

you don't need to run ShoppingCart.java directly. You only need to run App.java because it acts as the main entry point of the application.
-Here's how the workflow goes:
App.java contains the main method, which runs the entire program. It interacts with the ShoppingCart.java class by calling its methods to add, remove, and display items.
ShoppingCart.java is a class that contains the logic for adding, removing, and managing the shopping cart items. It's used internally by App.java.
So, when you run App.java, it will automatically call the relevant methods from ShoppingCart.java.

If you haven't installed JUnit 5, you can add it using Maven or include JUnit JAR files in your project.
If you have JUnit installed, run the tests by executing the following command:

-bash
  mvn test
- 

## Example output:


Cart items: [Laptop, Mouse, Keyboard, Mouse] <br>
Cart items after removing Laptop: [Mouse, Keyboard, Mouse]<br>
Item quantities: {Mouse=2, Keyboard=1}

## Requirements

- Java 8+
- JUnit 5 (for unit testing)



### Instructions:

1. Save the above files in the correct structure.
2. If you haven't installed JUnit 5, you can add it using Maven or include JUnit JAR files in your project.
