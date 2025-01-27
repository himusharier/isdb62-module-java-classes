package ClassLectures.twentyNineClass;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankAccountManagement {
    public static void main(String[] args) {
        List<BankAccount> accounts = new ArrayList<>();

        try (Scanner scanner = new Scanner(new File("src/main/resources/accounts.csv"))) {
            while (scanner.hasNextLine()) {
                String[] data = scanner.nextLine().split(",");
                int accountNumber = Integer.parseInt(data[0]);
                String accountType = data[1];
                double balance = Double.parseDouble(data[2]);

                if (accountType.equals("Savings")) {
                    double interestRate = Double.parseDouble(data[3]);
                    accounts.add(new SavingsAccount(accountNumber, balance, interestRate));
                } else if (accountType.equals("Current")) {
                    double overdraftLimit = Double.parseDouble(data[3]);
                    accounts.add(new CurrentAccount(accountNumber, balance, overdraftLimit));
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("Accounts file not found.");
        }

        // Perform transactions and update accounts
        try (PrintWriter writer = new PrintWriter("src/main/resources/updated_accounts.csv")) {
            for (BankAccount account : accounts) {
                account.withdraw(1001);
                writer.println(account);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Error writing to file.");
        }
    }
}
