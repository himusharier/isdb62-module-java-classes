package ClassLectures.seventeenthClass;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileStream {
    public static void main(String[] args) throws IOException {
//        for (int i = 0; ; i++) {
//            System.out.println(i);
//        }

//        for (int i = 0; i < 1; i--) {
//
//        }

//        for ( ; ; ) {
//            System.out.println("iqram");
//        }

//        int i = 0;
//        for (; i < 4; i += 2) {
//            System.out.print(i + " ");
//        }
//        System.out.println(i);


        try (FileOutputStream outputStream =
                     new FileOutputStream("temp.dat", false)) {
            for (int i = 1; i <= 10; i++) {
                outputStream.write(i);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (FileInputStream inputStream = new FileInputStream("temp.dat")) {
            int value;
            while ((value = inputStream.read()) != -1) {
                System.out.print(value + " ");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream("temp.dat");
            int value;
            while ((value = inputStream.read()) != -1) {
                System.out.print(value + " ");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (inputStream != null)
                inputStream.close();
        }

        try {
            FileInputStream inputStream2 = new FileInputStream("temp.dat");
            int value;
            while ((value = inputStream2.read()) != -1) {
                System.out.print(value + " ");
            }
            inputStream2.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
