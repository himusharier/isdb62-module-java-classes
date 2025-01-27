package ClassLectures.twentyNineClass;

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
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
        if (getBalance() - amount < 0) {
            throw new InsufficientFundsException("Insufficient funds.");
        }
        setBalance(getBalance() - amount);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate;
    }
}
