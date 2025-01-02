package ClassLectures.eighteenthClass;

import java.util.Scanner;

public class ExceptionRasel {
    public static void main(String[] args) {
        while (true) {
            try {
                Scanner input = new Scanner(System.in);
                System.out.print("Enter your first number :");
                int num = input.nextInt();

                System.out.print("Enter your second number :");
                int num2 = input.nextInt();

                int result = num / num2;

                System.out.println("Result : " + num + " / " + num2 + " = " + result);
            } catch (Exception e) {
                System.out.println("Exception :" + e);
                System.out.println("you must enter integer. Please try again");
            }
        }
    }
}