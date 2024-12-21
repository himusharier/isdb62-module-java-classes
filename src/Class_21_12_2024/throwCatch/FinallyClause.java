package Class_21_12_2024.throwCatch;

import java.util.Scanner;

public class FinallyClause {
    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);
            System.out.println(1/0);

        } catch (Exception e) {
            System.out.printf("exception occurred. exception is: %s\n", e.getMessage());

        } finally {
            if (scanner != null) {
                scanner.close();
            }
            System.out.println("this block always executes");

        }
    }
}
