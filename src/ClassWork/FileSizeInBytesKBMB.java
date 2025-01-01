package ClassWork;

import java.io.File;
import java.util.Scanner;

public class FileSizeInBytesKBMB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter file url: ");
        String url = input.nextLine();

        File fileDetails = new File(url);
        System.out.println("-----------------------------------------------------");
        System.out.println("File name: " + fileDetails.getName());
        System.out.println("File size in bytes: " + fileDetails.length() + " bytes.");
        System.out.printf("File size in Kilobytes: %.2f KB\n", Math.ceil((float) fileDetails.length() /1024));
        System.out.printf("File size in Megabytes: %.2f MB\n", Math.ceil((float) fileDetails.length() / (1024 * 1024)));
    }
}
