package za.co.wethinkcode.frombasics;

public class Invoice {
    // 1. THE MEMORY: The object "remembers" its price
    private double price;

    // 2. THE BIRTH: This sets the price when you say 'new Invoice(150.0)'
    public Invoice(double price) {
        this.price = price;
    }

    // 3. THE TOOLS: Notice NO 'static' here!
    public double calculateTax() {
        // We don't need a parameter anymore!
        // The method just looks at its own memory (this.price).
        return this.price * 0.15;
    }

    public double getDiscount() {
        if (this.price > 100.0) {
            return 10.0;
        } else {
            return 0.0;
        }
    }
}
