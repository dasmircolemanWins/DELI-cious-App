package com.pluralsight.models;

import java.util.*;

public class Sandwich {
    private String breadType;
    private int size;
    private boolean toasted;
    private List<Toppings> meats = new ArrayList<>();
    private List<Toppings> cheeses = new ArrayList<>();
    private List<String> regularToppings = new ArrayList<>();
    private List<String> sauces = new ArrayList<>();
    private double price;

    public Sandwich(String breadType, int size, boolean toasted) {
        this.breadType = breadType;
        this.size = size;
        this.toasted = toasted;
        this.price = startingPrice(size);
    }

    private double startingPrice(int size) {