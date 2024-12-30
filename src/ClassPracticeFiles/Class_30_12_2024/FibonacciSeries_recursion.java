package ClassPracticeFiles.Class_30_12_2024;

import java.util.Scanner;

public class FibonacciSeries_recursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter fibonacci item number: ");
        int itemNumber = input.nextInt();

        //fibonacci_regular(itemNumber);
        System.out.println(fibonacci_recursion(itemNumber));
    }

    public static void fibonacci_regular(int itemNumber) {
        long firstValue = 0;
        long secondValue = 1;
        long total;

        System.out.print(firstValue + " " + secondValue + " ");
        for (int i = 2; i <= itemNumber; i++) {
            total = firstValue + secondValue;
            System.out.print(total + " ");
            firstValue = secondValue;
            secondValue = total;
        }
    }

    public static long fibonacci_recursion(long itemNumber) {
        if (itemNumber <= 1) {
           return itemNumber;
        }
        return fibonacci_recursion(itemNumber - 1) + fibonacci_recursion(itemNumber - 2);
    }

}
