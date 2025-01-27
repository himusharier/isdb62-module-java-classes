package ClassLectures.thirtyFirstClass.fromRaselVai;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class OptionMenu extends Account {
    Scanner menuInput = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'&'###,##0.00");

    HashMap<Integer, Integer> dummyDatabase = new HashMap<>();

    public void getLogin() {
        int x = 1;
        do {
            try {
                dummyDatabase.put(101, 123);
                dummyDatabase.put(102, 456);

                System.out.println("Welcome to ATM");
                System.out.println("Enter your customer Number");
                setCustomerNumber(menuInput.nextInt());

                System.out.println("Enter your PIN Number");
                setPinNumber(menuInput.nextInt());
            } catch (Exception e) {
                System.out.println("\nInvalid Characters Only Numbers Allowed\n" + e);
                x = 2;
            }

            int cn = getCustomerNumber();
            int pn = getPinNumber();

            if (dummyDatabase.containsKey(cn) && dummyDatabase.get(cn) == pn)
                getAccountType();
            else
                System.out.println("\nWrong Customer Number or Wrong PIN Number\n\n");
        } while (x == 1);
    }

    private void getAccountType() {
        System.out.println("Select Account Type you want to Access");
        System.out.println("Type 1 - Checking Account");
        System.out.println("Type 2 - Saving Account");
        System.out.println("Type 3 - Exit");

        int selection = menuInput.nextInt();

        switch (selection) {
            case 1 -> getChecking();
            case 2 -> getSaving();
            case 3 -> System.out.println("Thank you for using ATM, BYE\n");
            default -> System.out.println("\nInvalid Choice\n");
        }
    }

    private void getSaving() {
        System.out.println("Checking Account");
        System.out.println("Type 1 - View Balance");
        System.out.println("Type 2 - Withdraw Money");
        System.out.println("Type 3 - Deposit Funds");
        System.out.println("Type 4 - Exit");

        int selection = menuInput.nextInt();

        switch (selection) {
            case 1: {
                System.out.println("Checking Account Balance : " + moneyFormat.format(getCheckingBalance()));
                getAccountType();
            }
            case 2: {
                checkingWithdraw(2);
                getAccountType();
            }
            case 3: {
                checkingDeposit(5);
                getAccountType();
            }
            case 4:
                System.out.println("Thank you for using ATM, Bye");
            default: {
                System.out.println("\nInvalid Choice\n");
                getChecking();
            }
        }
    }

    private void getChecking() {
        System.out.println("Checking Account");
        System.out.println("Type 1 - View Balance");
        System.out.println("Type 2 - Withdraw Money");
        System.out.println("Type 3 - Deposit Funds");
        System.out.println("Type 4 - Exit");
        System.out.println("Choice : ");

        int selection = menuInput.nextInt();

        switch (selection) {
            case 1 -> {
                System.out.println("Saving Account Balance : " + moneyFormat.format(getCheckingBalance()));
                getAccountType();
            }
            case 2 -> {
                savingWithdraw(2);
                getAccountType();
            }
            case 3 -> {
                savingDeposit(5);
                getAccountType();
            }
            case 4 -> System.out.println("Thank you for using ATM, Bye");
            default -> {
                System.out.println("\nInvalid Choice\n");
                getChecking();
            }
        }
    }
}
