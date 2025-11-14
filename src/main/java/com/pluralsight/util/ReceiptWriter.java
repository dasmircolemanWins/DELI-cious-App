package com.pluralsight.util;

import com.pluralsight.models.MenuItem;
import com.pluralsight.models.Order;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;

public class ReceiptWriter {
    LocalDate todayDate = LocalDate.now();
    //LocalTime todayTime = LocalTime.now();

    public void printReceipt(Order order, String name ){
        try {

            String filename = "src/main/resources/" + todayDate + name + ".txt";
            //System.out.println(filename);
            BufferedWriter csvToWriteTo = new BufferedWriter(new FileWriter(filename));
            //add to a new line
            for(MenuItem item: order.getItems()){
//                System.out.println(item.getBasePrice());
                csvToWriteTo.write(item.toString());
                csvToWriteTo.newLine();
            }
//            System.out.println(order.getTotalPrice());
//            csvToWriteTo.write((int) order.getTotalPrice());
            csvToWriteTo.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Order Received, Thank you ❤️💰");
        //this is where we can print the receipt to the folder
    }
}
