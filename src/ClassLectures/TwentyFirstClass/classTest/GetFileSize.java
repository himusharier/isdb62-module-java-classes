package ClassLectures.TwentyFirstClass.classTest;

import java.io.File;

public class GetFileSize {
    public static void main(String[] args) {

        File file = new File("scores.txt");


        if (file.exists()) {
            long fileSizeBytes = file.length();
            double fileSizeKB = fileSizeBytes / 1024.0;
            double fileSizeMB = fileSizeKB / 1024.0;


            System.out.println("File size:");
            System.out.println("Bytes: " + fileSizeBytes + " B");
            System.out.printf("Kilobytes: %.2f KB%n", fileSizeKB);
            System.out.printf("Megabytes: %.2f MB%n", fileSizeMB);
        } else {
            System.out.println("The file does not exist at the specified path.");
        }
    }
}
