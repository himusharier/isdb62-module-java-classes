package ClassLectures.twentyEighthClass;

import java.io.*;
import java.util.regex.*;
import java.util.Scanner;

public class TagContentExtractor {
    public static void main(String[] args) {
        // Prompt the user for the file path
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Enter the path to the HTML file: ");
        String filePath = inputScanner.nextLine(); // Take file path input

        // Read the file content into a StringBuilder
        StringBuilder fileContent = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                fileContent.append(line).append("\n"); // Append each line to fileContent
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage()); // Print error if reading fails
            return;
        }

        // Define the regex pattern to extract content inside HTML tags
        String regex = "<([a-zA-Z0-9]+)>([^<>]*)</\\1>";
        Pattern pattern = Pattern.compile(regex);

        // Create matcher for the content
        Matcher matcher = pattern.matcher(fileContent.toString());
        boolean found = false;

        // Search for matches and print the content inside the tags
        while (matcher.find()) {
            System.out.println(matcher.group(2)); // Print content inside the tag
            found = true;
        }

        // If no valid content found, print "None"
        if (!found) {
            System.out.println("None");
        }

        inputScanner.close(); // Close the scanner after use
    }
}
