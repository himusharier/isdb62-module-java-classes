package ClassLectures.thirdClass;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOne = scanner.nextInt();
        scanner.nextLine();
        int numberTwo = scanner.nextInt();
        scanner.nextLine();
        int max;

        System.out.println("First num: " + numberOne);
        System.out.println("Second num: " + numberTwo);

        max = (numberOne > numberTwo) ? numberOne : numberTwo;

        System.out.println("Maximum is = " + max);
    }
}
