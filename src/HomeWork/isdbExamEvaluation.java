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
        double midTotal = midMonMcq + midMonEvi;
        //calculate 20%
        double newMidMonMcq = midMonMcq * ((double) 20 /100);
        double newMidMonEvi = midMonEvi * ((double) 20/100);

        //monthly:
        System.out.print("Enter monthly mcq marks: ");
        int monMcq = input.nextInt();
        System.out.print("Enter monthly evidence marks: ");
        int monEvi = input.nextInt();
        double monthTotal = monMcq + monEvi;
        //calculate 80%
        double newMonMcq = monMcq * ((double) 80/100);
        double newMonEvi = monEvi * ((double) 80/100);

        //total: (mcq & evidence)
        double mcqTotal = newMidMonMcq + newMonMcq;
        double eviTotal = newMidMonEvi + newMonEvi;
        double grandTotal = mcqTotal + eviTotal;

        String status;
        if (mcqTotal >= 30 && eviTotal >= 30) {
            status = "Passed!";
        } else {
            status = "Failed!";
        }

        //output
        System.out.println("=======================================================");
        System.out.println("mid-monthly marks: " + midMonMcq + "(mcq)" + " " + midMonEvi + "(evidence)" + " = " + midTotal + "(total)");
        System.out.println("monthly marks: " + monMcq + "(mcq)" + " " + monEvi + "(evidence)" + " = " + monthTotal + "(total)");
        System.out.println("=======================================================");
        System.out.println("final score: "
                + Math.round(mcqTotal)
                + "(" + Math.round(newMidMonMcq) + "+" + Math.round(newMonMcq) + ")" + "(mcq)" + " + "
                + Math.round(eviTotal)
                + "(" + Math.round(newMidMonEvi) + "+" + Math.round(newMonEvi) + ")" + "(evidence)"
                + " = " + Math.round(grandTotal) + "(total)");
        System.out.println("status: " + status);
    }
}
