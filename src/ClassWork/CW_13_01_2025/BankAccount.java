package ClassWork.CW_13_01_2025;

public class BankAccount {
    private String accountNumber;
    private String type;
    private double balance;
    private double interest;


    public BankAccount(String accountNumber, String type, double balance, double interest) {
        this.accountNumber = accountNumber;
        this.type = type;
        this.balance = balance;
        this.interest = interest;
    }

    public BankAccount(String accountNumber, String type, String balance, String interest) {
        this.accountNumber = accountNumber;
        this.type = type;
        this.balance = Double.parseDouble(balance);
        this.interest = Double.parseDouble(interest);
    }

    public BankAccount(){}

    private void deposit(double amount) {
        //balance += amount;
    }

    private void withdrawal(double amount) {

    }

    private void interest(double amount) {

    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", type='" + type + '\'' +
                ", balance=" + balance +
                ", interest=" + interest +
                '}';
    }

    // getter and setter:

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public double getInterest() {
        return interest;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance += balance;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }
}