package za.co.wethinkcode.frombasics;

public class Main {
    public static void main(String[] args) {
        // We create a specific Invoice object for R150.0
        Invoice myInvoice = new Invoice(150.0);

        // Now we just ask the object to do the work
        double tax = myInvoice.calculateTax();
        double discount = myInvoice.getDiscount();
        double totalAmount = myInvoice.getTotalAmount();

        System.out.println("Tax: R" + tax);
        System.out.println("Discount: R" + discount);
        System.out.println("Total Amount: R" + totalAmount);
    }
}
