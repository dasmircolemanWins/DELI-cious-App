package com.pluralsight.ui;

import com.pluralsight.models.*;
import com.pluralsight.util.Menu;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface2 {
    public static Scanner myScanner = new Scanner(System.in);
    public static Menu menu = new Menu();

    public static String askUser(String question) {
        try {
            System.out.println(question);
            return myScanner.nextLine().trim();
        } catch (Exception e) { // usually only catches if there is something wrong with the scanner
            System.out.println("Error prompting for user input");
            return "";
        }
    }

    public static int askUserInt(String question) {
        try {
            System.out.println(question);
            return myScanner.nextInt();
        } catch (Exception e) { // usually only catches if there is something wrong with the scanner
            System.out.println("Error prompting for user input");
            return 0;
        }
    }

    // method for displaying the home screen
    public static void home() {
        // while loop to keep the screen up even if there are misinputs
        boolean isRunning = true;
        while (isRunning) {
            String response = askUser("""
                    
                    Welcome To Scottyy's Deli-cious Shop
                    
                    Select an option below:
                    A) new order
                    B) Exit
                    
                    """);
            // input validation for empty input
            if (response.isEmpty()) {
                System.out.println("not found, Please try again");
            } else {
                // control flow for user input
                switch (response.toLowerCase()) {
                    case "a": {
                        // invoke the new order method and pass in new order
                        orderScreen();
                        //new order screen
                        break;
                    }
                    case "b": {
                        // invoke the exit app loop to home screen method
                        isRunning = false;
                        break;
                    }
                    // exit the program by stopping the while look
                }
            }
        }
    }

    // method for displaying ledger screen
    public static void orderScreen() {
        // instance of Order class to save all items
        Order order = new Order();

        boolean isRunning = true;
        while (isRunning) { // keep display up even after misinput
            String response = askUser("""
                    
                    💰🥪Order Screen
                    A) Add Sandwich
                    B) Add Drink
                    C) Add Chips
                    D) Checkout
                    E) Cancel Order
                    
                    Please select an option:
                    """);


            //public static void sandwichBuilder(){
            if (response.isEmpty()) {
                System.out.println("not found, Please try again");
            } else {
                // control flow for user input
                switch (response.toLowerCase()) {
                    case "a": {
                        // invoke the sandwich method and pass in new order
                        //print out bread types for user to make selection
                        menu.displayMenuItems(menu.breadTypes);
                        String breadType = askUser("bread type?");

                        int sammySize = askUserInt("Sandwich size? 4, 8, 12");
                        myScanner.nextLine();


                        // while loop so the user can pick all the meats they want
                        ArrayList<Meats> meats = new ArrayList<>();
                        boolean meatsIsRunning = true;
                        while (meatsIsRunning) {
                            Meats meatChoice = new Meats();

                            menu.displayMenuItems(menu.meats);
                            String choice = askUser("Do you want to add meat? y/n");

                            if (choice.equalsIgnoreCase("y")) {
                                String choicem = askUser("What kind of meat do you want?");
                                boolean isExtra = Boolean.parseBoolean(askUser("do you want extra? true/false"));
                                double price = meatChoice.getPrice(sammySize);
                                meats.add(new Meats(choicem, isExtra, price));
                            } else {
                                meatsIsRunning = false;
                            }
                        }

                        // while loop so the user can pick all the meats they want
                        // String Cheeses = askUser("Cheeses");
                        ArrayList<Cheese> cheeses = new ArrayList<>();
                        boolean cheeseIsRunning = true;
                        while (cheeseIsRunning) {
                            Cheese cheeseChoice = new Cheese();
                            menu.displayMenuItems(menu.cheeses);
                            String choice = askUser("Do you want to add cheese? y/n");
                            if (choice.equalsIgnoreCase("y")) {
                                String choicec = askUser("What kind of Cheese do you want?");
                                boolean isExtra = Boolean.parseBoolean(askUser("do you want extra? true/false"));
                                double price = cheeseChoice.getPrice(sammySize);
                                cheeses.add(new Cheese(choicec, isExtra, price));
                            } else {
                                cheeseIsRunning = false;
                            }
                        }

                        StringBuilder toppingString = new StringBuilder();
                        menu.displayMenuItems(menu.toppings);
                        String toppingsResp = askUser("Would you like to add topping? y/n");
                        if (toppingsResp.equalsIgnoreCase("y")) {
                            System.out.println("Please indicate the toppings you want by it's number.");
                            System.out.println("Note: Separate using commas");
                            System.out.println("Ex: 1,2,3 = lettuce, tomatoes, peppers");

                            String toppingIntSelection = myScanner.nextLine();
                            String[] toppingsArr = toppingIntSelection.split(",");

                            for(String toppingIndex: toppingsArr){
                                toppingString.append(menu.toppings[Integer.parseInt(toppingIndex) - 1]).append(" ");
                            }


                        } else {
                            System.out.println("No toppings added");
                        }


                        String Sauces = askUser("sauces");
                        String toastedResponse = askUser("do you want your sandwich toasty?");
                        boolean isToasted;
                        if (toastedResponse.equalsIgnoreCase("yes")) {
                            System.out.println("bread toasted");
                            isToasted = true;
                        } else {
                            System.out.println("bread not toasted");
                            isToasted = false;
                        }
                        //build sandwich here using variables above.
                        Sandwich supersub = new Sandwich(breadType, sammySize, meats, cheeses, toppingString.toString().trim(), Sauces, isToasted);
                        // create toppings object using toppings constructor
                        //add topings to supersub sandwich object
                        //add completed sandwich to order object that we create
                        //calculate price from order object/sandwich object
                        order.addItem(supersub);
                        break;
                    }
                    case "b": {

                        // invoke the exit app loop to home screen method
                        String drinkResponse = askUser("do you want a drink?");
                        if (drinkResponse.equalsIgnoreCase("yes")) {
                            System.out.println("Add Drink");
                            boolean gotMilk = true;
                        } else {
                            System.out.println("bread not toasted");
                            boolean gotMilk = false;
                        }

                        Drink drink = new Drink("","");
                        order.addItem(drink);
                        break;

                    }
                    case "c": {
                        String chipResponse = askUser("do you want a drink?");
                        if (chipResponse.equalsIgnoreCase("yes")) {
                            System.out.println("Add Chips");
                            boolean hasChips = true;
                        } else {
                            System.out.println("no chips");
                            boolean hasChips = false;
                        }
                        Chips chips = new Chips("");
                        order.addItem(chips);
                        break;
                    }
                    case "d": {
                        String checkOutResponse = askUser("Would you like to checkout?");
                        if (checkOutResponse.equalsIgnoreCase("yes")) {
                            System.out.println("checkout");
                            boolean hasCheckedout = true;
                                order.getOrderSummary();
                            System.out.println("You're order total is: " + order.getTotalPrice()  );

                        } else {
                            System.out.println("no chips");
                            boolean hasChips = false;
                        }
                        // exit the program by stopping the while look
                    }
                }
            }
        }
    }


}

//    public static void sandwichBuilder() {
//
//        String response = askUser("")
//        if (response.isEmpty()) {
//            System.out.println("not found, Please try again");
//        } else {
//            // control flow for user input
//            switch (response.toLowerCase()) {
//                case "a": {
//                    // invoke the sandwich method and pass in new order
//
//                    break;
//                }
//                case "b": {
//                    // invoke the exit app loop to home screen method
//                    isRunning = false;
//                    break;
//                }
//                // exit the program by stopping the while look
//            }
//        }
//    }
//}

