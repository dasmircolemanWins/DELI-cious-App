package com.pluralsight.models;

public class Toppings {
    private String name;
    private double price;

    public Toppings(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return name + " ($" + String.format("%.2f", price) + ")";
    }
}
