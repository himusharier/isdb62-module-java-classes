package ClassWork.CW_13_01_2025;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter account number: ");
        String accountNum = scanner.nextLine();

        // bank database:
        String fileUrl = "src\\ClassWork\\CW_13_01_2025\\database.csv";
        Scanner readFile = new Scanner(new File(fileUrl));
        //StringBuilder fileContent = new StringBuilder();

        BankAccount bankAccount = null;
        while (readFile.hasNext()) {
            //System.out.println(readFile.nextLine());
            String singleAccount = readFile.nextLine();
            String[] accInfo = singleAccount.split(",");
            if (accInfo[0].equals(accountNum)) {
                bankAccount = new BankAccount(accInfo[0], accInfo[1], accInfo[2], accInfo[3]);
                //System.out.println(bankAccount.toString());
                break;
            }
        }
        System.out.println(bankAccount.toString());


        // options:
        System.out.println("""
                -----------------------------
                1. Deposit Money
                2. Withdraw money
                -----------------------------""");
        System.out.print("Enter menu option: ");
        int chooseOption = scanner.nextInt();

        // 1. deposit money:
        switch (chooseOption) {
            case 1:
                System.out.print("enter amount: ");
                int deposit = scanner.nextInt();
                bankAccount.setBalance(deposit);
            case 2:

        }

        System.out.println(bankAccount.toString());

        // writing file:
        PrintWriter printWriter = new PrintWriter(fileUrl);
        while (readFile.hasNext()) {
            //System.out.println(readFile.nextLine());
            String singleAccount = readFile.nextLine();

            printWriter.println(readFile.nextLine());

            String[] accInfo = singleAccount.split(",");
            if (accInfo[0].equals(accountNum)) {
                bankAccount = new BankAccount(accInfo[0], accInfo[1], accInfo[2], accInfo[3]);
                //System.out.println(bankAccount.toString());
                break;
            }
        }
    }
}