package com.pluralsight.models;

import java.util.*;

public class Sandwich {
    private String breadType;
    private int size;
    private boolean toasted;
    private List<Toppings> meats = new ArrayList<>();
    private List<Toppings> cheeses = new ArrayList<>();
    private List<Toppings> regularToppings = new ArrayList<>();
    private List<Toppings> sauces = new ArrayList<>();
    private double price;
    // Constructor initializes bread, size, toasted, and sets base price
    // Methods:
    // - addMeat(Meat meat)
    // - addCheese(Cheese cheese)
    // - addRegularTopping(String topping)
    // - addSauce(String sauce)
    // - calculateTotalPrice()
    // - getSummary()


    public void addMeat(Toppings meat){
        this.meats.add(meat);
    }

    public void addCheese(Toppings cheese){
        this.cheeses.add(cheese);
    }
    public void addtopping(Toppings regularToppings){
        this.regularToppings.add(regularToppings);
    }
    public void addSauce(Toppings sauces){
        this.sauces.add(sauces);
    }
    public Sandwich(String breadType, int size, boolean toasted) {
        this.breadType = breadType;
        this.size = size;
        this.toasted = toasted;
        this.price = price;
    }

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

    public class Cheese {
        private String type; // American, Swiss, etc.
        private boolean isExtra;
        private int size;
        private double price;

        public Cheese(String type, boolean isExtra, int size, double price) {
            this.type = type;
            this.isExtra = isExtra;
            this.size = size;
            this.price = price;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public boolean isExtra() {
            return isExtra;
        }

        public void setExtra(boolean extra) {
            isExtra = extra;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }
        // Constructor sets type, extra flag, size, and calculates price
        // Method: getPrice()
    }
   // private double startingPrice(int size) {}

    public class Meat {
        private String type; // Steak, Ham, etc.
        private boolean isExtra;
        private int size;
        private double price;

        public Meat(String type, boolean isExtra, int size, double price) {
            this.type = type;
            this.isExtra = isExtra;
            this.size = size;
            this.price = price;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public boolean isExtra() {
            return isExtra;
        }

        public void setExtra(boolean extra) {
            isExtra = extra;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }
        // Constructor sets type, extra flag, size, and calculates price
        // Method: getPrice()
    }

    }
