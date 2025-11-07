package com.pluralsight.ui;

import com.pluralsight.models.Sandwich;

import java.util.Scanner;

public class UserInterface2 {
    public static Scanner myScanner = new Scanner(System.in);
    public static String askUser(String question) {
        try {
            System.out.println(question);
            return myScanner.nextLine().trim();
        } catch (Exception e) { // usually only catches if there is something wrong with the scanner
            System.out.println("Error prompting for user input");
            return "";
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
        }
    }

public static void sandwichBuilder(){





}












}

