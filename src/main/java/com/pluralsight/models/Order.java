package com.pluralsight.models;

import java.util.*;

public class Order {
    private List<MenuItem> items = new ArrayList<>();

    //create constructors
    public Order(List<MenuItem> items) {
        this.items = items;
    }

    public Order() {
    };
    // Methods:
    // - addSandwich(Sandwich s)
    // - addDrink(Drink d)
    // - addChips(Chips c)
    // - getTotalPrice()
    // - getOrderSummary()

    public void addItem(MenuItem item){
        this.items.add(item);
    }

    public List<MenuItem> getItems() {
        return items;
    }

    // loop through sandwich array , loop through drinks array and loop through chips array.
    public double getTotalPrice() {
        double orderTotal = 0;
        for (MenuItem item : items){
            orderTotal += item.calculateTotalCost();
        }
        return  orderTotal;
// loop through items get the price of each items
    }
    public void getOrderSummary() {

        //all we need to print the order summary
        for(MenuItem item: items){
            System.out.println(item);
        }
        System.out.println("Order total: " + this.getTotalPrice());

    }
}