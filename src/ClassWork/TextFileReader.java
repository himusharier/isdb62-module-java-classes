package ClassWork;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextFileReader {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter file url: ");
        String url = input.nextLine();

        Scanner readFile = new Scanner(new File(url));

        while (readFile.hasNext()) {
            System.out.println(readFile.nextLine());
        }
    }
}
