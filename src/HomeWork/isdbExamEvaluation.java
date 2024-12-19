package HomeWork;

import java.util.Scanner;

public class isdbExamEvaluation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter mid-monthly mcq marks: ");
        int midMonMcq = input.nextInt();
        System.out.print("Enter mid-monthly evidence marks: ");
        int midMonEvi = input.nextInt();
        //calculate 20%
        double newMidMonMcq = midMonMcq + (midMonMcq * (20/100));
        double newMidMonEvi = midMonEvi + (midMonEvi * (20/100));

        System.out.print("Enter monthly mcq marks: ");
        int monMcq = input.nextInt();
        System.out.print("Enter monthly evidence marks: ");
        int monEvi = input.nextInt();
        //calculate 80%
        double newMonMcq = monMcq + (monMcq * (80/100));
        double newMonEvi = monEvi + (monEvi * (80/100));

        double total = newMonMcq + newMonEvi;

        String status = "";
        if (newMonMcq >= 30 && newMonEvi >= 30) {
            status = "Passed";
        } else {
            status = "Failed";
        }

        //output
        System.out.print("mid-monthly marks: " + midMonMcq + " " + midMonEvi);
        System.out.print("monthly marks: " + monMcq + " " + monEvi);
        System.out.println("==================================================");
        System.out.println("final score: " + newMonMcq + " " + newMonEvi + " = " + total);
        System.out.println("status: " + status);
    }
}
