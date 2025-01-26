package JavaProjects.WithFile.LibraryManagementSystem.methods;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SearchBookFromDatabase {
    public static void searchBookFromDatabase(String bookOrAuthorName) throws FileNotFoundException {
        // reading books-list database:
        String databaseFile = "src\\JavaProjects\\LibraryManagementSystem\\database\\books-list.csv";
        Scanner readingFile = new Scanner(new File(databaseFile));
        StringBuilder foundBook = new StringBuilder();

        foundBook.append(String.format("%-5s %-10s %-25s %-30s\n", "Sl", "ID", "Book Title", "Author"));
        foundBook.append("-------------------------------------------------------\n");

        int sl = 0;
        while (readingFile.hasNext()) {
            String singleBook = readingFile.nextLine();
            String[] bookInfo = singleBook.split(",");

            if (bookInfo[1].contains(bookOrAuthorName) || bookInfo[2].contains(bookOrAuthorName)) {
                //foundBook.append(singleBook).append("\n");
                //foundBook.append(++sl + "\t" + bookInfo[1] + "\t" + bookInfo[2]).append("\n");
                foundBook.append(String.format("%-5d %-10d %-25s %-30s\n", ++sl, Integer.parseInt(bookInfo[0]), bookInfo[1], bookInfo[2]));
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
