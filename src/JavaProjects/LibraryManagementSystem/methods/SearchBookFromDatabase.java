package JavaProjects.LibraryManagementSystem.methods;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SearchBookFromDatabase {
    public static StringBuilder searchBookFromDatabase(String bookOrAuthorName) throws FileNotFoundException {
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
                foundBook.append(++sl + "\t" + bookInfo[1] + "\t" + bookInfo[2]).append("\n");
            }
        }
        readingFile.close();

        if (foundBook.isEmpty()) {
            System.out.println(">> '" + bookOrAuthorName + "'" + " is not found!");
            System.out.println();
        } else {
            System.out.println(foundBook);
        }

        return foundBook;

    }
}
