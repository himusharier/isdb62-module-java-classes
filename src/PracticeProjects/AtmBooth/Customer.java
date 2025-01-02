package PracticeProjects.AtmBooth;

public class Customer {
    public String name;
    public String accountNumber;
    private Integer pin;
    private Account account;

    public Customer(String accountNumber, String name, Integer pin, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.pin = pin;
        this.account = new Account(balance);
    }

    public Account getAccount() {
        return account;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public boolean validatePin(Integer pin) {
       return this.pin.equals(pin);
    }
}
