package com.pluralsight.models;

import java.util.*;

public class Sandwich extends MenuItem {
    private String breadType;
    private int size;
    private boolean toasted;
    private List<Meats> meats = new ArrayList<>();
    private List<Cheese> cheeses = new ArrayList<>();
    private String regularToppings; //can be changed to an array
    private String sauces;
    //    private List<Toppings> regularToppings = new ArrayList<>();
//    private List<Toppings> sauces = new ArrayList<>();
    private double price;

    // Constructor initializes bread, size, toasted, and sets base price
    public Sandwich(String breadType, int size, List<Meats> meats,
                    List<Cheese> cheeses, String regularToppings, String sauces, boolean toasted) {

        super(switch (size) {
            case 4 ->  5.50;
            case 8 -> 7.00;
            case 12 -> 8.50;
            default -> 8.50;
        });

        this.breadType = breadType;
        this.size = size;
        this.meats = meats;
        this.cheeses = cheeses;
        this.regularToppings = regularToppings;
        this.sauces = sauces;
        this.toasted = toasted;
        this.price = basePrice;
    }


    // Methods:

    // - addMeat(Meat meat)
    // - addCheese(Cheese cheese)
    // - addRegularTopping(String topping)
    // - addSauce(String sauce)
    // - calculateTotalPrice()
    // - getSummary()


//    public void addMeat(Toppings meat){
//        this.meats.add(meat);
//    }
//
//    public void addCheese(Toppings cheese){
//        this.cheeses.add(cheese);
//    }
//    public void addtopping(Toppings regularToppings){
//        this.regularToppings.add(regularToppings);
//    }
//    public void addSauce(Toppings sauces){
//        this.sauces.add(sauces);
//    }


    public String getBreadType() {
        return breadType;
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isToasted() {
        return toasted;
    }

    public void setToasted(boolean toasted) {
        this.toasted = toasted;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    //calculate proce for sandwich

    @Override
    public double calculateTotalCost() {
        //start with the base price of the sandwich
       //add all  the meats and cheese
        //set price = to the total we calculate
        return 0.0;
    }


    // private double startingPrice(int size) {}


    @Override
    public String toString() {
        return " Sandwich: \n" +
                "breadType='" + breadType + '\'' +
                ", size=" + size +
                ", toasted=" + toasted +
                ", meats=" + meats +
                ", cheeses=" + cheeses +
                ", regularToppings='" + regularToppings + '\'' +
                ", sauces='" + sauces + '\'' +
                ", price=" + price +
                '}';
    }
}
