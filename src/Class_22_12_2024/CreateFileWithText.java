package Class_22_12_2024;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class CreateFileWithText {
    public static void main(String[] args) throws IOException {
        /*File file = new File("src/Class_22_12_2024/notes.txt");

        if (file.exists()) {
            System.out.println("file already exists!");
            System.exit(1);
        }*/

        PrintWriter printWriter = new PrintWriter("src/Class_22_12_2024/testText.txt");
        printWriter.print("Hello");
        printWriter.println(" World");
        printWriter.println("Welcome Home...");
        printWriter.close();
    }
}
