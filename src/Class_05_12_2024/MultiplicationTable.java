package Class_05_12_2024;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (0 < 1) {
            System.out.print("Enter number to show multiplication table: ");
            int number = input.nextInt();

            for (int i = 1; i <= 10; i++) {
                System.out.println(i + " x " + number + " = " + i * number);
            }
            System.out.println("------------------------------");
        }
    }
}
