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


}