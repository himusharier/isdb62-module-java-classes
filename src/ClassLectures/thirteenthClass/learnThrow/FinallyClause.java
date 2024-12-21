package ClassLectures.thirteenthClass.learnThrow;

import java.util.Scanner;

public class FinallyClause {
    public static void main(String[] args) {
        Scanner scanner = null;
        // simple try-catch-finally
        try {
            scanner = new Scanner(System.in);
            System.out.println(1 / 0);
        } catch (Exception e) {
            System.out.printf("Exception occurred exception is %s\n", e.getMessage());
        } finally {
            if (scanner != null)
                scanner.close();
            System.out.println("This block will always execute");
        }
    }
}
