package com.pluralsight.models;

public abstract class MenuItem {
    //price field
    protected double basePrice;

    //constructors generated
    public MenuItem(double price) {
        this.basePrice = price;
    }

    // getters and setters generated
    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double price) {
        this.basePrice = price;
    }

    public abstract double calculateTotalCost();

}
