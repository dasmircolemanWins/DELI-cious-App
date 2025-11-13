package com.pluralsight.models;

import java.util.*;

public class Order {
    //    private List<Sandwich> sandwiches;
//    private List<Drink> drinks;
//    private List<Chips> chips;
    private List<MenuItem> items = new ArrayList<>();
//    private List<Sandwich> sandwiches = new ArrayList<>();
//    private List<Drink> drinks = new ArrayList<>();
//    private List<Chips> chips = new ArrayList<>();

    //create constructors

    public Order(List<MenuItem> items) {
        this.items = items;


        //(List<Sandwich> sandwiches, List<Drink> drinks, List<Chips> chips) {
//        this.sandwiches = sandwiches;
//        this.drinks = drinks;
//        this.chips = chips;
    }

    public Order() {
    }

    ;

    // Methods:
    // - addSandwich(Sandwich s)
    // - addDrink(Drink d)
    // - addChips(Chips c)
    // - getTotalPrice()
    // - getOrderSummary()
    public void addSandwich(Sandwich sammy) {
        this.items.add(sammy);
    }

    public void addDrink(Drink drink) {
        this.items.add(drink);
    }

    public void addChips(Chips chip) {
        this.items.add(chip);
    }

    // loop through sandwich array , loop through drinks array and loop through chips array.
    public void getTotalPrice() {
//        while () {
//        }
// loop through items get the price of each items
    }

    public Void getOrderSummary() {
    }

    ;
}