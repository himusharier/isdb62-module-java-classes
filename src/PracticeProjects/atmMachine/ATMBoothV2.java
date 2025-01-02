package PracticeProjects.atmMachine;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ATMBoothV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> history = new ArrayList<>();
        int menuNumber = 0;
        loppMenu(menuNumber, scanner, history);
//        Double a = 10.0;
//        a.compareTo(20.0);
//        Double.compare(5.0,5.5);
    }

    private static void loppMenu(int menuNumber, Scanner scanner, List<String> history) {
        while (menuNumber != 5) {
            System.out.println("------------------------------------");
            printMenu();
            menuNumber = menuInput(scanner);
            processMenu(scanner, menuNumber, history);
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

    public static void withdrawMoney(Scanner scanner, List<String> history) {
        System.out.print("Enter amount: ");
        double amount = validatedInput(scanner, "Enter amount: ");
        if (amount <= balanceCheck(history)) {
            System.out.println("Withdrawal successful!");
            history.add("- " + amount);
        } else {
            System.out.println("Insufficient money!");
        }
    }

    public static void depositMoney(Scanner scanner, List<String> history) {
        System.out.print("Deposit amount: ");
        double amount = validatedInput(scanner, "Deposit amount: ");
        System.out.println("Deposit successful!");
        history.add("+ " + amount);
    }

    public static double balanceCheck(List<String> history) {
        double sum = 0;
        for (String amount : history) {
//            if (amount.startsWith("+")) {
//                sum += decodeString(amount);
//            } else {
//                sum -= decodeString(amount);
//            }
            String[] arr = amount.split(" ");
            double doubleValue = Double.parseDouble(arr[1]);
            if(arr[0].equals("+")){
                sum += doubleValue;
            }
            if(arr[0].equals("-")){
                sum -= doubleValue;
            }

        }
        return sum;
    }

    public static void processMenu(Scanner scanner, int menuNumber, List<String> history) {
        switch (menuNumber) {
            case 1:
                withdrawMoney(scanner, history);
                break;
            case 2:
                depositMoney(scanner, history);
                break;
            case 3:
                System.out.println("Your current balance is: " + balanceCheck(history));
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

    public static double decodeString(String value) {
        String[] arr = value.split(" ");
        return Double.parseDouble(arr[1]);
    }


}
