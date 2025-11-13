package com.pluralsight.models;

public class Meats {
    private String type; // Steak, Ham, etc.
    private boolean isExtra;
    private double price;

    public Meats(String type, boolean isExtra, double price) {
        this.type = type;
        this.isExtra = isExtra;
        this.price = price;
    }

    public Meats(){};

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
       switch(size) {
           case 4:
               if(isExtra){
                   return 1.5f;
               } else{
                 return 1.0f;
               }
           case 8:
               if(isExtra){
                   return 3.0f;
               } else{
                   return 2.0f;
               }
           case 12:
               if(isExtra){
                   return 4.50f;
               } else{
                   return 3.00f;
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
