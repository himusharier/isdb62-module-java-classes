package ClassLectures.secondClass;

import java.util.Scanner;

public class IfElseLogic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number: ");
        int mark = sc.nextInt();
        sc.nextLine();

        if (mark >= 0 && mark <= 100) {
            if (mark >= 80) {
                System.out.println("You got A+");
            } else if (mark >= 70) {
                System.out.println("You got A");
            } else if (mark >= 60) {
                System.out.println("You got A-");
            } else if (mark >= 40) {
                System.out.println("You got B");
            } else {
                System.out.println("You Failed");
            }
        } else {
            System.out.println("Invalid Number Provided");
        }

    }
}
