package com.pluralsight.models;

import java.util.*;

public class Sandwich {
    private String breadType;
    private int size;
    private boolean toasted;
    private List<Toppings> meats = new ArrayList<>();
    private List<Toppings> cheeses = new ArrayList<>();
    private List<String> regularToppings = new ArrayList<>();
    private List<String> sauces = new ArrayList<>();
    private double price;

    public Sandwich(String breadType, int size, boolean toasted) {
        this.breadType = breadType;
        this.size = size;
        this.toasted = toasted;
        this.price = basePrice(size);
    }

    private double basePrice(int size) {
        return switch (size) {
            case 4 -> 5.50;
            case 8 -> 7.00;
            case 12 -> 8.50;
            default -> 0.0;
        };
    }

    public void addMeat(String type, boolean extra) {
        double cost = switch (size) {
            case 4 -> 1.00;
            case 8 -> 2.00;
            case 12 -> 3.00;
            default -> 0.0;
        };
        if (extra) cost += switch (size) {
            case 4 -> 0.50;
            case 8 -> 1.00;
            case 12 -> 1.50;
            default -> 0.0;
        };
        meats.add(new Toppings(type, cost));
        price += cost;
    }

    public void addCheese(String type, boolean extra) {
        double cost = switch (size) {
            case 4 -> 0.75;
            case 8 -> 1.50;
            case 12 -> 2.25;
            default -> 0.0;
        };
        if (extra) cost += switch (size) {
            case 4 -> 0.30;
            case 8 -> 0.60;
            case 12 -> 0.90;
            default -> 0.0;
        };
        cheeses.add(new Toppings(type, cost));
        price += cost;
    }

    public void addRegularToppings(String toppings) {
        regularToppings.add(toppings);
    }

    public void addSauce(String sauce) {
        sauces.add(sauce);
    }

    public double getPrice() {
        return price;
    }

    public String getSummary() {
        return String.format("%d\" %s sandwich%s\nMeats: %s\nCheeses: %s\nToppings: %s\nSauces: %s\nPrice: $%.2f",
                size, breadType, toasted ? " (toasted)" : "",
                meats, cheeses, regularToppings, sauces, price);
    }
}
