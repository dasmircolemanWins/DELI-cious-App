package com.pluralsight.models;

public class Drink extends MenuItem {
    private String flavor;
    private String size; // Small, Medium, Large


    public Drink(String flavor, String size, double basePrice) {
        super(basePrice);
        this.flavor = flavor;
        this.size = size;
    }
    // Constructor sets flavor and size, calculates price
    // Method: getPrice()

    public String getFlavor(){
        return this.flavor;
    }
    public void setFlavor(String flavor){
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

}
