package PracticeProjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class PhoneBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> contacts = new ArrayList<>();
        int menuNumber = 0;
        while (menuNumber != 5) {
            //System.out.println("-------------------------------------");
            showMenu();
            System.out.print("Enter menu number: ");
            menuNumber = Integer.parseInt(inputValidation(scanner));
            phonebookController(scanner, menuNumber, contacts);
            System.out.println("-------------------------------------");
        }
    }

    private static void phonebookController(Scanner scanner, int menuNumber, List<String> contacts) {
        switch (menuNumber) {
            case 1:
                addNumber(scanner, contacts);
                break;
            case 2:
                removeNumber(scanner, contacts);
                break;
            case 3:
                viewContacts(contacts);
                break;
            case 4:
                searchNumber(scanner, contacts);
                break;
            case 5:
                System.out.println("\u001B[31m>>Exited!\u001B[0m");
                break;
            default:
                System.out.println("\u001B[31m>> Error: Invalid input!\u001B[0m");
        }
    }

    public static void showMenu() {
        System.out.println("\u001B[34m\u001B[4m>> Phone Menu:\u001B[0m");
        System.out.println("\u001B[34m  1. Add Number\u001B[0m");
        System.out.println("\u001B[34m  2. Remove Number\u001B[0m");
        System.out.println("\u001B[34m  3. View Contacts\u001B[0m");
        System.out.println("\u001B[34m  4. Search Number\u001B[0m");
        //System.out.println("\u001B[32m   0. Back\u001B[0m");
        //System.out.println("\u001B[32m   00. Menu\u001B[0m");
        System.out.println("\u001B[31m  5. Exit\u001B[0m");
    }

    public static void addNumber(Scanner scanner, List<String> contacts) {
        // take number scanner.
        // check number if existed.
        // add number into ArrayList.
        System.out.print("Enter new number: ");
        String  number = phoneNumberValidation(scanner);
        if (number.equals("0")) {
            System.out.println("\u001B[31m>> Error: Invalid phone number!\u001B[0m");
        } else if (contacts.contains(number)) {
            System.out.println("\u001B[31m>> Error: Number saved before!\u001B[0m");
        } else {
            contacts.add(number);
            System.out.println("\u001B[32m>> Number saved successfully!\u001B[0m");
        }
    }

    public static void removeNumber(Scanner scanner, List<String> contacts) {
        // take number scanner.
        // check if number present in the contacts.
        // remove number from ArrayList.
        System.out.print("Enter a number: ");
        String  number = phoneNumberValidation(scanner);
        if (number.equals("0")) {
            System.out.println("\u001B[31m>> Error: Invalid phone number!\u001B[0m");
        } else if (contacts.contains(number)) {
            System.out.println("\u001B[32m>> Number removed successfully!\u001B[0m");
            contacts.remove(number);
        } else {
            System.out.println("\u001B[31m>> Error: Number not found in contacts!\u001B[0m");
        }
    }

    public static void viewContacts(List<String> contacts) {
        // show all the contacts.
        System.out.println("\u001B[34m>> Your contact list:\u001B[0m");
        if (contacts.isEmpty()) {
            System.out.println("\u001B[31m|     <empty>     |\u001B[0m");
        } else {
            for (String contact : contacts) {
                System.out.println("\u001B[34m|     " + contact + "     |\u001B[0m");
            }
        }
    }

    public static void searchNumber(Scanner scanner, List<String> contacts) {
        // take number scanner.
        // search number in contacts.
        System.out.print("Enter number: ");
        String number = inputValidation(scanner);
        if (number.equals("0")) {
            System.out.println("\u001B[31m>> Error: Invalid input!\u001B[0m");
        } else if (contacts.contains(number)) {
            System.out.println("\u001B[32m>> Number found in contacts!\u001B[0m");
        } else {
            System.out.println("\u001B[31m>> Error: Number not found in contacts!\u001B[0m");
        }
    }

    public static String inputValidation(Scanner scanner) {
        String regex = "^[0-9]+$";
        String input = "";
        while (true) {
            input = scanner.next();
            if (Pattern.matches(regex, input)) {
                return input;
            } else {
                return "0";
            }
        }
    }
    public static String phoneNumberValidation(Scanner scanner) {
        String regex = "^\\+?\\d{1,3}?\\s?\\d{10}$";
        String input = "";
        while (true) {
            input = scanner.next();
            if (Pattern.matches(regex, input)) {
                return input;
            } else {
                return "0";
            }
        }
    }

}
