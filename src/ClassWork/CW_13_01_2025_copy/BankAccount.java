package ClassWork.CW_13_01_2025_copy;

public class BankAccount {
    private String accountNumber;
    private double balance;

    // constructor:
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // deposit, withdrawal, calculateInterest:
    public void deposit(double amount) {}
    public void withdrawal(double amount) {}
    public void calculateInterest(double amount, double interestRate) {}

    // getters and setters:
    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
}