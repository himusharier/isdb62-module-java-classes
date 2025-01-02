package PracticeProjects.atmMachine;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ATMBooth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 0;
        List<String> history = new ArrayList<>();
        int menuNumber = 0;
        while (menuNumber != 5) {
            System.out.println("------------------------------------");
            printMenu();
            menuNumber = menuInput(scanner);
            balance = processMenu(scanner, balance, menuNumber, history);
            System.out.println("------------------------------------");
        }
    }

    public static void printMenu() {
        System.out.println("1. Withdraw Money");
        System.out.println("2. Deposit Money");
        System.out.println("3. Balance Check");
        System.out.println("4. Transaction History");
        System.out.println("5. Exit");
    }

    public static int menuInput(Scanner scanner) {
        System.out.print("Enter menu number: ");
        return scanner.nextInt();
    }

    public static double withdrawMoney(Scanner scanner, double balance, List<String> history) {
        System.out.print("Enter amount: ");
        double amount = validatedInput(scanner, "Enter amount: ");
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawal successful!");
            history.add("-" + amount);
        } else {
            System.out.println("Insufficient money!");
        }
        return balance;
    }

    public static double depositMoney(Scanner scanner, double balance, List<String> history) {
        System.out.print("Deposit amount: ");
        double amount = validatedInput(scanner, "Deposit amount: ");
        System.out.println("Deposit successful!");
        history.add("+" + amount);
        return balance + amount;
    }

    public static void balanceCheck(double balance) {
        System.out.println("Your current balance is: " + balance);
    }

    public static double processMenu(Scanner scanner, double balance, int menuNumber, List<String> history) {
        switch (menuNumber) {
            case 1:
                balance = withdrawMoney(scanner, balance, history);
                break;
            case 2:
                balance = depositMoney(scanner, balance, history);
                break;
            case 3:
                balanceCheck(balance);
                break;
            case 4:
                printHistory(history);
                break;
            case 5:
                System.out.println("Exited!");
                break;
            default:
                System.out.println("Invalid input");
        }
        return balance;
    }

    public static double validatedInput(Scanner scanner, String message) {
        String regex = "^[0-9]+$";
        String input = "";
        while (true) {
            input = scanner.next();
            if (Pattern.matches(regex, input)) {
               return Double.parseDouble(input);
            } else {
                System.out.println("Invalid format!");
                System.out.print(message);
            }

        }
    }

    public static void printHistory(List<String> history) {
        System.out.println(history);
    }

}
