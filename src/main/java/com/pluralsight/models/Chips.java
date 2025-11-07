package com.pluralsight.models;

public class Chips {
    private String type;
    private final double price = 1.50;

    public Chips(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return type + " chips ($1.50)";
    }
}
