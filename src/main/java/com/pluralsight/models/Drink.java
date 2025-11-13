package com.pluralsight.models;

public class Drink extends MenuItem {
    private String flavor;
    private String size; // Small, Medium, Large


    public Drink(String flavor, String size) {
        super(switch(size.toLowerCase()){
            case "small" -> 2;
            case "medium" -> 2.50;
            case "large" -> 3;
                    default -> 3;
                });
        this.flavor = flavor;
        this.size = size;
    }
    // Constructor sets flavor and size, calculates price
    // Method: getPrice()

    public String getFlavor() {
        return this.flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return basePrice;
    }

    public void setPrice(double price) {
        this.basePrice = price;
    }

    @Override
    public double calculateTotalCost() {

        return switch (this.size.toLowerCase()) {
            case "small" -> 2;
            case "medium" -> 2.50;
            default -> 3;
        };

    }

    @Override
    public String toString() {
        return "Drink: \n" +
                "flavor='" + flavor + '\'' +
                ", size='" + size + '\'' +
                ", basePrice=" + basePrice +
                '}';
    }
}
