package ClassLectures.twentyNineClass;

class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    public CurrentAccount(int accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Invalid deposit amount.");
        }
        setBalance(getBalance() + amount);
    }

    @Override
    public void withdraw(double amount) throws InsufficientFundsException, InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Invalid withdrawal amount.");
        }
        if (getBalance() - amount < -overdraftLimit) {
            throw new InsufficientFundsException("Withdrawal exceeds overdraft limit.");
        }
        setBalance(getBalance() - amount);
    }

    @Override
    public double calculateInterest() {
        return 0.0; // No interest on checking accounts
    }
}
