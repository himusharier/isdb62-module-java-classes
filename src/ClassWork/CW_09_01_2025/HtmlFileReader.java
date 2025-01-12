package ClassWork.CW_09_01_2025;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HtmlFileReader {
    public static void main(String[] args) throws FileNotFoundException {
        String fileUrl = "src\\ClassWork\\CW_09_01_2025\\contentFile.html";
        Scanner readFile = new Scanner(new File(fileUrl));

        StringBuilder fileContent = new StringBuilder();
        while (readFile.hasNext()) {
            fileContent.append(readFile.nextLine().trim());
        }

        String regex = "<(\\w+)[^>]*>([^<>]+)</\\1>";  /* "<(\\w+)[^>]*>([^<>]+)</\\1>"  <([a-zA-Z][a-zA-Z0-9]*)[^>]*>(.*?)</\\1> */
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(fileContent);
        //System.out.println(fileContent);

        while (matcher.find()) {
            System.out.println(matcher.group(2));
        }
    }
}
