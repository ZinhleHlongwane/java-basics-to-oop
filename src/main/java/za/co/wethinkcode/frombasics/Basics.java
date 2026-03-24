package za.co.wethinkcode.frombasics;

import java.util.Scanner; // 1. Always at the top
import java.util.List;

public class Basics {

    public static void main(String[] args) {
        // --- PART 1: The Scanner ---
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the product price: ");
        double userPrice = scanner.nextDouble(); // We get the price from the user

        // --- PART 2: Calling the Tax Method ---
        // We "send" the price to the method and "catch" the result in a variable
        double taxResult = calculateTax(userPrice);
        System.out.println("The tax for this item is: R" + taxResult);

        double[] prices = {100.0, 50.0, 20.0};

        // --- PART 3: The Energy Logic ---
        int energy = 80;
        String powerMessage = checkPower(energy);
        System.out.println("Power Status: " + powerMessage);

        for (double price : prices) {
            double tax = calculateTax(price);
            System.out.println("Tax: " + tax);
        }

        double discount = getDiscount(userPrice);
        System.out.println("Your discount is: R" + discount);
    }



    // --- THE RECIPES (Methods) ---

    public static String checkPower(int level) {
        // Logic fix: If level is LESS than 20, it's critical
        if (level < 20) {
            return "critical";
        } else {
            return "stable";
        }
    }

    public static double calculateTax(double price) {
        return price * 0.15; // 15% VAT calculation
    }

    public static double getDiscount(double totalAmount) {
        if (totalAmount > 100) {
            return 10.0;
        } else {
            return 0.0;
        }
    }
}