package ClassLectures.fourteenthClass;

import java.io.File;
import java.util.Date;

public class TestFileClass {
    public static void main(String[] args) {

        // File file = new File("C:\\Users\\New Horizons\\Downloads\\Oacle Descriptive Question.docx");
        File file = new File("C:/Users/New Horizons/Downloads/zakaria/ashik/nahid");

        /*System.out.println("Does it exists? " + file.exists());
        System.out.println("The file has " + file.length() + " bytes");
        System.out.println("Can it be read? " + file.canRead());
        System.out.println("Can it be written? " + file.canWrite());
        System.out.println("Is it a directory? " + file.isDirectory());
        System.out.println("Is it a file? " + file.isFile());
        System.out.println("Is it absolute? " + file.isAbsolute());
        System.out.println("Is it hidden? " + file.isHidden());
        System.out.println("Absolute path is? " + file.getAbsolutePath());
        System.out.println("Last modified on? " + file.lastModified() + " "
                + new Date(file.lastModified()));*/

        boolean mkdir = file.mkdir();
        if (mkdir) {
            System.out.println("Folder created");
        } else {
            System.out.println("Folder exists or folder could not be created. Anything is possible");
        }

         file.mkdirs();
    }
}
