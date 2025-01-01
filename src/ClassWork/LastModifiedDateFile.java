package ClassWork;

import java.io.File;
import java.util.Date;
import java.util.Scanner;

public class LastModifiedDateFile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter file url: ");
        String url = input.nextLine();

        File fileDetails = new File(url);
        System.out.println("-----------------------------------------------------");
        System.out.println("File name: " + fileDetails.getName());
        System.out.println("Last modified date: " + new Date(fileDetails.lastModified()));
    }
}
