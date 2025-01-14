package ClassWork.CW_13_01_2025_copy;

public class CurrentAccount extends BankAccount {
    private String type = "current";
    private double interest;

    // constructors:
    public CurrentAccount(String accountNumber, String type, double balance, double interest) {
        super(accountNumber, balance);
        this.type = type;
        this.interest = interest;
    }

    // override deposit, withdrawal, calculateInterest:
    @Override
    public void deposit(double amount) {
        super.deposit(amount);
    }
    @Override
    public void withdrawal(double amount) {
        super.withdrawal(amount);
    }
    @Override
    public void calculateInterest(double amount, double interest) {
        super.calculateInterest(amount, interest);
    }

    // getters and setters:
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public double getInterest() {
        return interest;
    }
    public void setInterest(double interest) {
        this.interest = interest;
    }
}