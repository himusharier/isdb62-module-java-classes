package ClassWork.CW_04_02_2025;

import java.util.Scanner;

public class NextInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int number = input.nextInt();

        System.out.println("return: " + ++number);
    }
}
