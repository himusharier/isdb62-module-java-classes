package JavaProjects.LibraryManagementSystem.methods;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ShowBookList {
    public static void showBookList() throws FileNotFoundException {

        // reading books-list database:
        String databaseFile = "src\\JavaProjects\\LibraryManagementSystem\\database\\books-list.csv";
        Scanner readingToWriteFile = new Scanner(new File(databaseFile));
        ArrayList<String> allBookList = new ArrayList<>();

        int sl = 0;
        while (readingToWriteFile.hasNext()) {
            String singleBook = readingToWriteFile.nextLine();
            String[] bookInfo = singleBook.split(",");

            allBookList.add("");
            allBookList.add(String.format("%-5d %-10d %-25s %-30s\n", ++sl, Integer.parseInt(bookInfo[0]), bookInfo[1], bookInfo[2]));
            //allBookList.add(singleBook);
        }

        readingToWriteFile.close();

        System.out.printf("%-5s %-10s %-25s %-30s\n", "Sl", "ID", "Book Title", "Author");
        System.out.printf("-------------------------------------------------------\n");
        for(int i = 1; i < allBookList.size(); i++) {
            System.out.print(allBookList.get(i));
        }
        System.out.println();
    }
}
