package com.pluralsight.models;

public class Drink {
    private String flavor;
    private String size;
    private double price;

    public Drink(String flavor, String size) {
        this.flavor = flavor;
        this.size = size;
        this.price = switch (size.toLowerCase()) {
            case "small" -> 2.00;
            case "medium" -> 2.50;
            case "large" -> 3.00;
            default -> 0.0;
        };
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return size + " " + flavor + " drink ($" + String.format("%.2f", price) + ")";
    }
}