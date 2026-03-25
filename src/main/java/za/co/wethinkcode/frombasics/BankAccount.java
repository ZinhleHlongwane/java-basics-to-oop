package za.co.wethinkcode.frombasics;

public class BankAccount {

    private double balance;
    private String status;

    public BankAccount(double balance) {
        this.balance = balance;
        this.status = "Account opened";
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }

    public boolean withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            return true;
        } else {
            return false;
        }
    }

    public double getBalance() {
        return this.balance;
    }
}
