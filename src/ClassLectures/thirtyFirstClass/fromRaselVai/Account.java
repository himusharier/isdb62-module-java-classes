package ClassLectures.thirtyFirstClass.fromRaselVai;

import java.text.DecimalFormat;
import java.util.Scanner;

@SuppressWarnings("unused")
public class Account {
    private int customerNumber;
    private int pinNumber;
    private double checkingBalance = 0;
    private double savingBalance = 0;

    Scanner input = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'&'###,##0.00");

    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public double getSavingBalance() {
        return savingBalance;
    }


    public void checkingWithdraw(double amount) {
        checkingBalance = (checkingBalance - amount);
    }

    public void savingWithdraw(double amount) {
        savingBalance = (savingBalance - amount);
    }

    public void checkingDeposit(double amount) {
        checkingBalance = (checkingBalance + amount);
    }

    public void savingDeposit(double amount) {
        savingBalance = (savingBalance + amount);
    }

    public void checkingWithdrawInput() {
        System.out.println("Checking Account balance" + moneyFormat.format(checkingBalance));
        System.out.println("Amount you want to withdraw from checking account : ");
        double amount = input.nextDouble();

        if (checkingBalance - amount >= 0) {
            checkingWithdraw(amount);
            System.out.println("New checking account balance : " + moneyFormat.format(checkingBalance));
        } else {
            System.out.println("Not enough money to withdraw");
        }
    }

    public void savingWithdrawInput() {
        System.out.println("Saving account balance : " + moneyFormat.format(savingBalance));
        System.out.println(("Amount you want to withdraw from saving withdrew"));
        double amount = input.nextDouble();

        if (savingBalance - amount >= 0) {
            savingWithdraw(amount);
            System.out.println("New saving account balance : " + moneyFormat.format(savingBalance));
        } else {
            System.out.println("Not enough money to withdrew");
        }
    }

    public void checkingDepositInput() {
        System.out.println("Checking deposit account balance : " + moneyFormat.format(checkingBalance));
        System.out.println("Amount you want to deposit from checking account");
        double amount = input.nextDouble();

        if (checkingBalance - amount >= 0) {
            checkingDeposit(amount);
            System.out.println("New checking account balance : " + moneyFormat.format(checkingBalance));
        } else {
            System.out.println("No money to deposit");
        }
    }

    public void savingDepositInput() {
        System.out.println("New saving deposit account balance :" + moneyFormat.format(savingBalance));
        System.out.println("Amount you want to deposit from saving account");
        double amount = input.nextDouble();

        if (savingBalance + amount >= 0) {
            savingDeposit(amount);
            System.out.println("New saving saving deposit balance : " + moneyFormat.format(savingBalance));
        } else {
            System.out.println("No saving deposit balance");
        }
    }
}
