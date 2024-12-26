package ClassPracticeFiles.Class_22_12_2024;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class ReadDataFromWeb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter URL: ");
        String userUrl = scanner.next();

        try {
            URL url = new URL(userUrl);
            int lineCount = 0;
            Scanner scanner1 = new Scanner(url.openStream());
            StringBuilder builder = new StringBuilder();

            while (scanner1.hasNext()) {
                String lines = scanner1.nextLine();
                lineCount += lines.length();
                builder.append(lines);
            }

            System.out.println("file character size is: " + lineCount);
            System.out.println("file content is: " + builder.toString());

        } catch (MalformedURLException e) {
            System.out.println("invalid url");

        } catch (IOException e) {
            System.out.println("i/o error! no such site!");

        }
    }
}
