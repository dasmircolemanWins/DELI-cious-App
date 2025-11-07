package com.pluralsight.ui;

import java.util.Scanner;

public class UserInterface2 {
    public static Scanner myScanner = new Scanner(System.in);

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
                System.out.println("Response not valid. Please try again");
            } else {
                // control flow for user input
                switch (response.toLowerCase()) {
                    case "A": {
                        // invoke the makeTransaction() method and pass in deposit for tx type
                        makeTransaction("deposit");
                        break;
                    }

                    case "B": {
                        // invoke the makeTransaction() method and pass in charge for tx type
                        makeTransaction("charge");
                        break;
                    }
                        // exit the program by stopping the while loop
                        isRunning = false;
                        break;


                }
            }

        }
    }



    public static String askUser(String question) {
        try {
            System.out.println(question);
            return myScanner.nextLine().trim();
        } catch (Exception e) { // usually only catches if there is something wrong with the scanner
            System.out.println("Error prompting for user input");
            return "";
        }
    }


}
