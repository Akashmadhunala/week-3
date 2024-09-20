# week-3

### File Structure:
  - App.java
  - ShoppingCart.java
  - ShoppingCartTest.java


# ShoppingCart Java Application

## Overview

This Java application demonstrates the usage of different Java collections such as `List`, `Set`, and `Map` through a simple shopping cart system. 

### Collections Used:

- List<String>`: Stores all items added to the cart, including duplicates.
- Set<String>`: Ensures that each item in the cart is unique.
- Map<String, Integer>`: Tracks the quantity of each item in the cart.

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

If you have JUnit installed, run the tests by executing the following command:

-bash
  mvn test
- 

## Example output:

--java
Cart items: [Laptop, Mouse, Keyboard, Mouse]
Cart items after removing Laptop: [Mouse, Keyboard, Mouse]
Item quantities: {Mouse=2, Keyboard=1}
--

## Requirements

- Java 8+
- JUnit 5 (for unit testing)



### Instructions:

1. Save the above files in the correct structure.
2. If you haven't installed JUnit 5, you can add it using Maven or include JUnit JAR files in your project.
