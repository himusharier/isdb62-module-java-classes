package ClassWork.CW_13_01_2025_copy;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your account number: ");
        String inputAccount = scanner.nextLine();

        // reading bank database:
        String databaseFile = "src\\ClassWork\\CW_13_01_2025\\database.csv";
        Scanner readingFile = new Scanner(new File(databaseFile));

        BankAccount bankAccount = null;
        while (readingFile.hasNext()) {
            String singleAccount = readingFile.nextLine(); // getting a single account.
            String[] accInfo = singleAccount.split(","); // splitting each element and make an array.
            String accNum = accInfo[0];
            String accType = accInfo[1];
            double accBal = Double.parseDouble(accInfo[2]);
            double accInt = Double.parseDouble(accInfo[3]);

            if (accInfo[0].equals(inputAccount)) {
                // creating matched account constructor.
                bankAccount = new SavingsAccount(accNum, accType, accBal, accInt);
                break; // exit loop, no need to match further.
            }
        }
        readingFile.close();

        if (bankAccount == null) {
            System.out.println("Account not found.");
            System.exit(404); // Exit if no account is found.
        }

        System.out.println(bankAccount.toString());

        // option menu:
        System.out.println("""
                -----------------------------
                1. Deposit Money
                2. Withdraw money
                -----------------------------""");
        System.out.print("Enter menu option: ");
        int chosenOption = scanner.nextInt();

        // 1. deposit money:
        switch (chosenOption) {
            case 1: // deposit money into account.
                System.out.print("Enter deposit amount: ");
                int depositMoney = scanner.nextInt();
                bankAccount.deposit(depositMoney);
            //case 2:
        }

        System.out.println(bankAccount.toString());

        // updating database file:
        Scanner readingToWriteFile = new Scanner(new File(databaseFile));
        //PrintWriter printWriter = new PrintWriter(databaseFile);
        StringBuilder updatedContent = new StringBuilder();

        while (readingToWriteFile.hasNext()) {
            String singleAccount = readingToWriteFile.nextLine();
            String[] accInfo = singleAccount.split(",");

            /*if (accInfo[0].equals(inputAccount)) {
                //bankAccount = new BankAccount(accInfo[0], accInfo[1], accInfo[2], accInfo[3]);
                String accNum = bankAccount.getAccountNumber();
                String accType = bankAccount.getType();
                double accBal = bankAccount.getBalance();
                double accInt = bankAccount.getInterest();
                printWriter.print(accNum);
                printWriter.print(accType);
                printWriter.print(accBal);
                printWriter.print(accInt);

                //printWriter.println("hello");
            }*/
            //printWriter.println(singleAccount);

            if (accInfo[0].equals(inputAccount)) {
                // Replace the current account's line with updated data.
                //updatedContent.append(bankAccount.toCsv()).append("\n");
            } else {
                // Append the unchanged account's data.
                updatedContent.append(singleAccount).append("\n");
            }

        }
        readingToWriteFile.close();

        PrintWriter printWriter = new PrintWriter(databaseFile);
        printWriter.print(updatedContent.toString());
        printWriter.close();

    }
}

