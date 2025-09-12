/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.eryzaa;
import java.util.Scanner;
/**
 *
 * @author CL2~PC27
 */
public class cafeterialoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      Scanner input = new Scanner(System.in);

        // Prices for items
        int hanselPrice = 10;
        int skyFlakesPrice = 12;
        int colaPrice = 15;
        int royalPrice = 20;

        // Variables for price and item
        int price = 0;
        String item = "";

        // Asking for valid choice until input is correct
        System.out.println("Cafeteria");
        System.out.println("Menu:");
        System.out.println("Snacks:");
        System.out.println("[1] Hansel - P" + hanselPrice);
        System.out.println("[2] SkyFlakes - P" + skyFlakesPrice);
        System.out.println("Drinks:");
        System.out.println("[3] Cola - P" + colaPrice);
        System.out.println("[4] Royal - P" + royalPrice);

        int choice;
        // Loop until the user enters a valid choice
        while (true) {
            System.out.print("Choose your Option (1-4): ");
            choice = input.nextInt();

            // Set price and item based on valid choice
            if (choice == 1) {
                price = hanselPrice;
                item = "Hansel";
                break; // Exit the loop once a valid choice is made
            } else if (choice == 2) {
                price = skyFlakesPrice;
                item = "SkyFlakes";
                break; // Exit the loop once a valid choice is made
            } else if (choice == 3) {
                price = colaPrice;
                item = "Cola";
                break; // Exit the loop once a valid choice is made
            } else if (choice == 4) {
                price = royalPrice;
                item = "Royal";
                break; // Exit the loop once a valid choice is made
            } else {
                System.out.println("Please input a valid choice (1-4).");
            }
        }

        // Ask for quantity once the valid item is selected
        System.out.println("You chose " + item);
        System.out.print("Enter Quantity: ");
        int quantity = input.nextInt();

        // Calculate subtotal, VAT, and total
        int subtotal = quantity * price;
        double vat = subtotal * 0.12;
        double total = subtotal + vat;

        // Display subtotal, VAT, and total
        System.out.println("Subtotal: P" + subtotal);
        System.out.println("Tax (12%): P" + vat);
        System.out.println("Total amount: P" + total);

        // Cash and change calculation
        System.out.print("Enter your cash: P");
        int cashGiven = input.nextInt();

        // Check if the cash entered is less than the total
        while (cashGiven < total) {
            System.out.println("Insufficient cash! Please enter enough money.");
            System.out.print("Enter your cash: P");
            cashGiven = input.nextInt();  // Keep asking until enough cash is provided
        }

        // Calculate change and display it
        double change = cashGiven - total;
        System.out.println("Your change: P" + change);

        input.close();
    }
}
   
