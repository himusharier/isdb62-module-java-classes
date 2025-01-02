package PracticeProjects.AtmBooth;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class AtmMachine {

    private List<Customer> customerList = new ArrayList<>();
    private Account account;

    private void setAccount(Account account) {
        this.account = account;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }

    public void login(Scanner scanner) {
        while (account == null) {
            System.out.print("enter account number : ");
            String accountNumber = scanner.next();
            System.out.print("enter pin : ");
            Integer pin = scanner.nextInt();
            for (Customer customer : customerList) {
                if (customer.accountNumber.equals(accountNumber) && customer.validatePin(pin)) {
                    System.out.println("welcome :" + customer.name);
                    setAccount(customer.getAccount());
                    return;
                }
            }
            System.out.println("Incorrect information! ");
        }
    }

    public void printMenu() {
        System.out.println("1. Withdraw Money");
        System.out.println("2. Deposit Money");
        System.out.println("3. Balance Check");
        System.out.println("4. Transaction History");
        System.out.println("5. Logout");
    }

    public int menuInput(Scanner scanner) {
        System.out.print("Enter menu number: ");
        return scanner.nextInt();
    }

    public void processMenu(Scanner scanner) {
        login(scanner);
        int menuNumber = 0;
        while (menuNumber != 5) {
            System.out.println("------------------------------------");
            printMenu();
            menuNumber = menuInput(scanner);
            switch (menuNumber) {
                case 1:
                    withdrawMoney(scanner);
                    break;
                case 2:
                    depositMoney(scanner);
                    break;
                case 3:
                    balanceCheck();
                    break;
                case 4:
                    printHistory();
                    break;
                case 5:
                    setAccount(null);
                    processMenu(scanner);
                    break;
                default:
                    System.out.println("Invalid input");
            }
            System.out.println("------------------------------------");
        }
    }

    private void withdrawMoney(Scanner scanner) {
        System.out.print("Enter amount: ");
        double amount = validatedInput(scanner, "Enter amount: ");
        account.withdraw(amount);
    }

    private void depositMoney(Scanner scanner) {
        System.out.print("Deposit amount: ");
        double amount = validatedInput(scanner, "Deposit amount: ");
        account.deposit(amount);
    }

    private void balanceCheck() {
        account.showBalance();
    }

    public double validatedInput(Scanner scanner, String message) {
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

    public void printHistory() {
        System.out.println(account.getLogs());
    }

    public static void main(String[] args) {
        Customer a = new Customer("12", "Sajal", 1234, 100.0);
        Customer b = new Customer("13", "Razon", 1230, 200.0);
        List<Customer> customers = new ArrayList<>();
        customers.add(a);
        customers.add(b);


        AtmMachine atmMachine = new AtmMachine();
        atmMachine.setCustomerList(customers);
        Scanner scanner = new Scanner(System.in);
        atmMachine.processMenu(scanner);
    }

}
