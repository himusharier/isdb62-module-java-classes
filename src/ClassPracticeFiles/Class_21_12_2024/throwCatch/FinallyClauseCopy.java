package ClassPracticeFiles.Class_21_12_2024.throwCatch;

import java.util.Scanner;

public class FinallyClauseCopy {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println(1 / 0);

        } catch (Exception e) {
            System.out.printf("exception occurred. exception is: %s\n", e.getMessage());

        } finally {
            System.out.println("this block always executes");

        }
    }
}
