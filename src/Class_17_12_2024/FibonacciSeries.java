package Class_17_12_2024;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter fibonacci item number: ");
        int itemNumber = input.nextInt();

        int firstValue = 0;
        int secondValue = 1;
        int total;

        for (int i = 3; i <= itemNumber; i++) {
            total = firstValue + secondValue;
            System.out.print(total + " ");
            firstValue = secondValue;
            secondValue = total;
        }
    }
}
