package JavaProjects.LibraryManagementSystem.methods;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SearchBookFromDatabase {
    public static void searchBookFromDatabase(String bookOrAuthorName) throws FileNotFoundException {
        // reading books-list database:
        String databaseFile = "src\\JavaProjects\\LibraryManagementSystem\\database\\books-list.csv";
        Scanner readingFile = new Scanner(new File(databaseFile));
        StringBuilder foundBook = new StringBuilder();

        int sl = 0;
        while (readingFile.hasNext()) {
            String singleBook = readingFile.nextLine();
            String[] bookInfo = singleBook.split(",");

            if (bookInfo[1].contains(bookOrAuthorName) || bookInfo[2].contains(bookOrAuthorName)) {
                //foundBook.append(singleBook).append("\n");
                foundBook.append(++sl + "\t\t" + bookInfo[1] + "\t\t\t" + bookInfo[2]).append("\n");
            }
        }
        readingFile.close();

        if (foundBook.isEmpty()) {
            System.out.println("\u001B[31m>> '" + bookOrAuthorName + "'" + " is not found!");
            System.out.println();
        } else {
            System.out.println(foundBook);
        }

    }
}
