package ClassWork.CW_09_01_2025;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HtmlFileReader {
    public static void main(String[] args) throws FileNotFoundException {
        String url = "C:\\Users\\Java Student PC-6\\Documents\\B. M. Sharier Kabir (ID 1285464)\\1285464\\Java\\isdb62-module-java-classes\\src\\ClassWork\\CW_09_01_2025\\contentFile.html";
        Scanner readFile = new Scanner(new File(url));

        StringBuilder fileContent = new StringBuilder();
        while (readFile.hasNext()) {
            fileContent.append(readFile.nextLine());
        }

        String regex = "<([a-zA-Z][a-zA-Z0-9]*)[^>]*>(.*?)</\\1>";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(fileContent);
        System.out.println(fileContent);
    }
}
