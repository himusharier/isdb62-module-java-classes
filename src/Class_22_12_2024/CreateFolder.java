package Class_22_12_2024;

import java.io.File;
import java.util.Scanner;

public class CreateFolder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter folder name: ");
        String folderName = input.nextLine();

        File folder = new File("src/Class_22_12_2024/" + folderName);

        if (folder.mkdir()) {
            System.out.println("Folder '" + folderName + "' created successfully.");
        } else {
            System.out.println("Failed to create folder. It may already exist.");
        }
    }
}
