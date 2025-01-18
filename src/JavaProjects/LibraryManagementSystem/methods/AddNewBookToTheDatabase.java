package JavaProjects.LibraryManagementSystem.methods;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class AddNewBookToTheDatabase {
    public static void addNewBookToTheDatabase(String name, String author, int numberOfCopies) throws FileNotFoundException {

        // reading books-list database:
        String databaseFile = "src\\JavaProjects\\LibraryManagementSystem\\database\\books-list.csv";
        Scanner readingToWriteFile = new Scanner(new File(databaseFile));
        StringBuilder updatedBook = new StringBuilder();

        int bookId = 2000;
        while (readingToWriteFile.hasNext()) {
            String singleBook = readingToWriteFile.nextLine();
            String[] bookInfo = singleBook.split(",");

            updatedBook.append(singleBook).append("\n");

            bookId = Integer.parseInt(bookInfo[0]);
        }

        // id, name, membership, booklists
        updatedBook.append(++bookId + "," + name + "," + author + "," + numberOfCopies).append("\n");

        readingToWriteFile.close();

        // writing files:
        PrintWriter printWriter = new PrintWriter(databaseFile);
        printWriter.print(updatedBook);
        printWriter.close();

    }
}
