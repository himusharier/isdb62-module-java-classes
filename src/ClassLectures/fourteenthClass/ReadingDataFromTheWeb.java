package ClassLectures.fourteenthClass;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class ReadingDataFromTheWeb {
    public static void main(String[] args) {
//        System.out.println("Enter an URL");
//        String URLString = new Scanner(System.in).next();
        String URLString = "https://stackedit.io/app#";

        try {
            URL url = new URL(URLString);
            int count = 0;
            Scanner scanner = new Scanner(url.openStream());
            StringBuilder builder = new StringBuilder();

            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                count += line.length();
                builder.append(line);
            }

            System.out.println("The file size is " + count + " characters");
            System.out.println("File content is -> " + builder.toString());
        } catch (MalformedURLException e) {
            System.out.println("Invalid URL");
        } catch (IOException e) {
            System.out.println("I/O Errors: no such file");
        }
    }
}
