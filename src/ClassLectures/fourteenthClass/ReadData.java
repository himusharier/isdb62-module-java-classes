package ClassLectures.fourteenthClass;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadData {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(new File("scores.txt"));

        while (scanner1.hasNextLine()) {
            System.out.println(scanner1.nextLine());
        }
    }
}
