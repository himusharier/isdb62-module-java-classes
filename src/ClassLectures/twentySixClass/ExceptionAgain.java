package ClassLectures.twentySixClass;

import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ExceptionAgain {
    public static void main(String[] args) {
        try {
            File file = new File("iqram.txt");
            tryCatchFinally(file, "hemel");
            // tryWithResource(file);
        } catch (Exception e) {
            System.out.println("Exception " + e.getMessage());
        }
    }

//    private static void tryWithResource(File file) {
//        try (Scanner scanner = new Scanner(file)) { // try with resource
//            if (scanner.hasNextLine()) {
//                String s = scanner.nextLine();
//                System.out.println(s);
//            }
//        } catch (IOException e) {
//            System.out.println("Exception " + e.getMessage());
//        }
//    }

    private static void tryCatchFinally(File file, String name) {
        Scanner hemel = null;
        try { // try catch finally

//            if ("hemel".equals(name))
//                throw new EOFException();

            if ("hemel".equals(name))
                throw new ArithmeticException();

            hemel = new Scanner(file);

            if (hemel.hasNextLine()) {
                String s = hemel.nextLine();
                System.out.println(s);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Exception for FileNotFound" + e.getMessage());
        } catch (IOException e) {
            System.out.println("Exception " + e.getMessage());
        } finally {
            if (hemel != null)
                hemel.close();
        }
    }
}
