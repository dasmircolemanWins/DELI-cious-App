package com.pluralsight.models;

public class Drink {
    private String flavor;
    private String size; // Small, Medium, Large
    private double price;


    public Drink(String flavor, String size, double price) {
        this.flavor = flavor;
        this.size = size;
        this.price = price;
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
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
