package com.pluralsight.util;

public class Menu {
    public final String[] meats = {"Chicken", "Steak", "Bacon", "Pork", "salami", "Turkey", "pastrami"};
    public final String[] cheeses = {"American", "Swiss", "Provolone", "Cheddar"};
    public final String[] breadTypes = {"White", "Wheat", "Rye", "Wrap"};
    public final String[] drinkFlavors = {"Pepsi", "Coke", "Sprite", "Fanta"};
    public final String[] chipsType = {"Lays", "Doritos", "Cheetos", "Sun Chips"};
    public final String[] toppings = {"lettuce", "tomatoes", "peppers", "cucumbers"};
    public final String[] sauces = {"mayo", "Barbeque", "ketchup", "Mustard", "chipotle", "vinegrette"};
    public void displayMenuItems(String[] items){
        for(int i = 0; i < items.length; i++){
            System.out.println(i+1 +") " +items[i]);
        }
    }
}
