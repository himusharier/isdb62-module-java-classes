package ClassLectures.TwentyFirstClass.classTest;

import java.io.File;
import java.text.SimpleDateFormat;

public class LastModifiedDate {
    public static void main(String[] args) {

        String filePath = "scores.txt";


        File file = new File(filePath);


        if (file.exists()) {

            long lastModified = file.lastModified();


            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
            String formattedDate = dateFormat.format(lastModified);

            System.out.println("The last modified date of the file is: " + formattedDate);
        } else {
            System.out.println("The file does not exist at the specified path.");
        }
    }
}
