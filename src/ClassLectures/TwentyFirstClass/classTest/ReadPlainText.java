package ClassLectures.TwentyFirstClass.classTest;

import java.io.*;
import java.util.Scanner;

public class ReadPlainText {
    public static void main(String[] args) {

        File file = new File("scores.txt");
        try (Scanner scanner = new Scanner(file)) {


            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                System.out.println(data);
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
        }
    }
}
