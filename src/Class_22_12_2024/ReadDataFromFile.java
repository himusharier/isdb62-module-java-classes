package Class_22_12_2024;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadDataFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);

        Scanner scanner1 = new Scanner(new File("src/Class_22_12_2024/testText.txt"));

        while (scanner1.hasNext()) {
            System.out.println(scanner1.nextLine());
        }
    }
}
