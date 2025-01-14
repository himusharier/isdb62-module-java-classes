package ClassWork.CW_13_01_2025_copy;

public class SavingsAccount extends BankAccount {
    private String type = "saving";
    private double interest;

    // constructors:
    public SavingsAccount(String accountNumber, String type, double balance, double interest) {
        super(accountNumber, balance);
        this.type = type;
        this.interest = interest;
    }

    // override deposit, withdrawal, calculateInterest:
    @Override
    public void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Enter valid amount!");
        }
        double updateBalance = getBalance() + amount;
        setBalance(updateBalance);
    }
    @Override
    public void withdrawal(double amount) throws InsufficientFundsException, InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Enter valid amount!");
        }
        if (amount > getBalance()) {
            throw new InsufficientFundsException("Insufficient balance!");
        }
        double updateBalance = getBalance() - amount;
        setBalance(updateBalance);
    }
    @Override
    public void calculateInterest(double amount, double interest) {
        super.calculateInterest(amount, interest);
    }

    // formatting data entry:
    public String toCsv() {
        return getAccountNumber() + "," + type + "," + getBalance() + "," + interest;
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
