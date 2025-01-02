package PracticeProjects.AtmBooth;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private Double balance;
    private List<AccountLog> logs = new ArrayList<>();


    public Account(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
        this.logs.add(new AccountLog(amount,"deposit"));
    }

    public void withdraw(double amount) {
        if (amount > this.balance) {
            System.out.println("Insufficient Balance!");
        } else {
            this.balance -= amount;
            this.logs.add(new AccountLog(amount,"withDraw"));
        }
    }

    public Double getBalance() {
        return balance;
    }

    public List<AccountLog> getLogs() {
        return logs;
    }

    public void showBalance() {
        System.out.println("your balance is: " + this.balance);
    }

}



