package com.pluralsight.models;

public class Chips extends MenuItem {
    private String type;

    public Chips(String type) {
        super(1.50);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return basePrice;
    }

    @Override
    public double calculateTotalCost() {
        return getPrice();
    }

    @Override
    public String toString() {
        return "Chips: " +
                "type='" + type + '\'' +
                ", basePrice=" + basePrice +
                '}';
    }
}

