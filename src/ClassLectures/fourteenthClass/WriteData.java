package ClassLectures.fourteenthClass;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

// Page number 476
public class WriteData {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("scores.txt");

        if(file.exists()) {
            System.out.println("File already exists");
            System.exit(1);
        }

        PrintWriter writer = new PrintWriter(file);

        writer.print("You guys have ");
        writer.println("no interest in coding");
        writer.println("Please try harder");

        writer.close();
    }
}
