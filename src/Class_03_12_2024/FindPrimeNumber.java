package Class_03_12_2024;

import java.util.Scanner;

public class FindPrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a natural number (starts from 2): ");
        int number = input.nextInt();

        if (number < 2) {
            System.out.println("Invalid input! Enter natural number starts from 2.");
        } else {
            if (chkPrime(number)) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }
        }
    }

    public static boolean chkPrime(int number) {
        boolean status = true;
        //for (int i = 2; i <= (number / 2); i++) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                status = false;
                break;
            } else {
                status = true;
            }
        }
        return status;
    }
}
