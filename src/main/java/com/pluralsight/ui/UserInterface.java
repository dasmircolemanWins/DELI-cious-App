package com.pluralsight.ui;

import com.pluralsight.models.*;

import java.util.*;

public class UserInterface {
    private Scanner scanner;

    public UserInterface() {
        scanner = new Scanner(System.in);
    }

    public int showHomeScreen() {
        System.out.println("\n🏠 Welcome to DELI-cious Sandwich Shop!");
        System.out.println("1) New Order");
        System.out.println("0) Exit");
        return getIntInput("Choose an option: ");
    }

    public int showOrderMenu() {
        System.out.println("\n🧺 Order Menu");
        System.out.println("1) Add Sandwich");
        System.out.println("2) Add Drink");
        System.out.println("3) Add Chips");
        System.out.println("4) Checkout");
        System.out.println("0) Cancel Order");
        return getIntInput("Choose an option: ");
    }

    public Sandwich buildSandwich() {
        String bread = promptForBreadType();
        int size = promptForSize();
        boolean toasted = promptForToasted();

        Sandwich sandwich = new Sandwich(bread, size, toasted);

        System.out.println("Add meats (type 'done' to finish):");
        while (true) {
            String meat = getStringInput("Meat: ");
            if (meat.equalsIgnoreCase("done")) break;
            boolean extra = getYesNo("Extra meat?");
            sandwich.addMeat(meat, extra);
        }

        System.out.println("Add cheeses (type 'done' to finish):");
        while (true) {
            String cheese = getStringInput("Cheese: ");
            if (cheese.equalsIgnoreCase("done")) break;
            boolean extra = getYesNo("Extra cheese?");
            sandwich.addCheese(cheese, extra);
        }

        System.out.println("Add regular toppings (type 'done' to finish):");
        while (true) {
            String topping = getStringInput("Topping: ");
            if (topping.equalsIgnoreCase("done")) break;
            sandwich.addRegularTopping(topping);
        }

        System.out.println("Add sauces (type 'done' to finish):");
        while (true) {
            String sauce = getStringInput("Sauce: ");
            if (sauce.equalsIgnoreCase("done")) break;
            sandwich.addSauce(sauce);
        }

        return sandwich;
    }

    public Drink buildDrink() {
        String flavor = getStringInput("Drink flavor: ");
        String size = getStringInput("Size (small, medium, large): ");
        return new Drink(flavor, size);
    }

    public Chips buildChips() {
        String type = getStringInput("Chip type: ");
        return new Chips(type);
    }

    public void showOrderSummary(Order order) {
        System.out.println("\n✅ Order Summary:");
        System.out.println(order.getOrderSummary());
    }

    public boolean confirmCheckout() {
        return getYesNo("Confirm checkout?");
    }

    private String promptForBreadType() {
        System.out.println("Bread types: white, wheat, rye, wrap");
        return getStringInput("Choose bread: ");
    }

    private int promptForSize() {
        return getIntInput("Size (4, 8, 12 inches): ");
    }

    private boolean promptForToasted() {
        return getYesNo("Toasted? (yes/no): ");
    }

    private boolean getYesNo(String prompt) {
        String input = getStringInput(prompt);
        return input.equalsIgnoreCase("yes");
    }

    private int getIntInput(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid number. Try again.");
            }
        }
    }

    private String getStringInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }
}