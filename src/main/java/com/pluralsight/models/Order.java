package com.pluralsight.models;

import java.util.*;

public class Order {
    private List<Sandwich> sandwiches = new ArrayList<>();
    private List<Drink> drinks = new ArrayList<>();
    private List<Chips> chips = new ArrayList<>();

    public void addSandwich(Sandwich sandwich) {
        sandwiches.add(sandwich);
    }

    public void addDrink(Drink drink) {
        drinks.add(drink);
    }

    public void addChips(Chips chip) {
        chips.add(chip);
    }

    public double getTotal() {
        double total = 0;
        for (Sandwich s : sandwiches) total += s.getPrice();
        for (Drink d : drinks) total += d.getPrice();
        for (Chips c : chips) total += c.getPrice();
        return total;
    }

    public String getOrderSummary() {
        StringBuilder sb = new StringBuilder();
        for (Sandwich s : sandwiches) sb.append(s.getSummary()).append("\n\n");
        for (Drink d : drinks) sb.append(d.toString()).append("\n");
        for (Chips c : chips) sb.append(c.toString()).append("\n");
        sb.append("Total: $").append(String.format("%.2f", getTotal()));
        return sb.toString();
    }
}
