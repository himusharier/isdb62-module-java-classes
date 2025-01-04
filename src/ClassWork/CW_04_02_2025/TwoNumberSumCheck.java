package ClassWork.CW_04_02_2025;

import java.util.Scanner;

public class TwoNumberSumCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.println("return: " + sumCheck(num1, num2));
    }

    static boolean sumCheck(int num1, int num2) {
        double sum = num1 + num2;
        boolean status = false;

        if (sum < 100) {
            status = true;
        }
        
        return status;
    }
}
