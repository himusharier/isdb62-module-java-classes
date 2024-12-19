package HomeWork;

import java.util.Scanner;

public class isdbExamEvaluation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //mid-monthly:
        System.out.print("Enter mid-monthly mcq marks: ");
        int midMonMcq = input.nextInt();
        System.out.print("Enter mid-monthly evidence marks: ");
        int midMonEvi = input.nextInt();
        //calculate 20%
        double newMidMonMcq = midMonMcq * ((double) 20 /100);
        double newMidMonEvi = midMonEvi * ((double) 20/100);

        //monthly:
        System.out.print("Enter monthly mcq marks: ");
        int monMcq = input.nextInt();
        System.out.print("Enter monthly evidence marks: ");
        int monEvi = input.nextInt();
        //calculate 80%
        double newMonMcq = monMcq * ((double) 80/100);
        double newMonEvi = monEvi * ((double) 80/100);

        //total: (mcq & evidence)
        double mcqTotal = newMidMonMcq + newMonMcq;
        double eviTotal = newMidMonEvi + newMonEvi;
        double grandTotal = mcqTotal + eviTotal;

        String status;
        if (mcqTotal >= 30 && eviTotal >= 30) {
            status = "Passed!❤️";
        } else {
            status = "Failed!💔";
        }

        //output
        System.out.println("==================================================");
        System.out.println("mid-monthly marks: " + midMonMcq + "(mcq)" + " " + midMonEvi + "(evidence)");
        System.out.println("monthly marks: " + monMcq + "(mcq)" + " " + monEvi + "(evidence)");
        System.out.println("==================================================");
        System.out.println("final score: "
                + Math.ceil(mcqTotal)
                + "(" + Math.ceil(newMidMonMcq) + "+" + Math.ceil(newMonMcq) + ")" + "(mcq)" + " + "
                + Math.ceil(eviTotal)
                + "(" + Math.ceil(newMidMonEvi) + "+" + Math.ceil(newMonEvi) + ")" + "(evidence)"
                + " = " + Math.ceil(grandTotal) + "(total)");
        System.out.println("status: " + status);
    }
}
