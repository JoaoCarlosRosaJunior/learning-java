package Exercicio1.entities;

public class Account {
    private int number;
    private String holder;
    private double balance;

    // Constructor
    public Account(int number, String holder, double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    // Constructor
    public Account(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    // Get methods
    public int getNumber() {
        return number;
    }

    // Get methods
    public String getHolder() {
        return holder;
    }

    // Set methods
    public void setHolder(String holder) {
        this.holder = holder;
    }

    // Set methods
    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    };

    public void withdraw(double amout) {
        this.balance -= amout + 5.0;
    };

    public String toString() {
        return "Account: " + number + ", Holder: " + holder + ", Balance: $ " + String.format("%.2f", balance);
    }

}
