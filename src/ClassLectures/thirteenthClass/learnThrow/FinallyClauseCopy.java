package ClassLectures.thirteenthClass.learnThrow;

import java.util.Scanner;

public class FinallyClauseCopy {
    public static void main(String[] args) {
        // try with resource
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println(1 / 0);
        } catch (Exception e) {
            System.out.printf("Exception occurred exception is %s\n", e.getMessage());
        } finally {
            System.out.println("This block will always execute");
        }
    }
}
