package com.pluralsight.models;

public class Cheese {
    private String type; // American, Swiss, etc.
    private boolean isExtra;
    private double price;

    public Cheese(String type, boolean isExtra, double price) {
        this.type = type;
        this.isExtra = isExtra;
        this.price = price;
    }

    public Cheese() {
    }

    ;

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

    public double getPrice(int size) {
        switch (size) {
            case 4:
                if (isExtra) {
                    return 1.05f;
                } else {
                    return 0.75f;
                }
            case 8:
                if (isExtra) {
                    return 2.10f;
                } else {
                    return 1.50f;
                }
            case 12:
                if (isExtra) {
                    return 3.15f;
                } else {
                    return 2.25f;
                }
            default:
                return 0;
        }
    }

    public void setPrice(double price) {
        this.price = price;
    }
    // Constructor sets type, extra flag, size, and calculates price
    // Method: getPrice()
}
