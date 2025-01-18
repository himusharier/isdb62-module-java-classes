package JavaProjects.LibraryManagementSystem.methods;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class RemoveBookFromDatabase {
    public static void removeBookFromDatabase(String removeBookName) throws FileNotFoundException {
        // reading members-list database:
        String databaseFile = "src\\JavaProjects\\LibraryManagementSystem\\database\\books-list.csv";
        Scanner readingToWriteFile = new Scanner(new File(databaseFile));
        StringBuilder updatedBook = new StringBuilder();

        if (!SearchBookFromDatabase.searchBookFromDatabase(removeBookName).isEmpty()) {
            while (readingToWriteFile.hasNext()) {
                String singleBook = readingToWriteFile.nextLine();
                String[] bookInfo = singleBook.split(",");

                if (bookInfo[1].equals(removeBookName)) {
                    continue;
                } else {
                    updatedBook.append(singleBook).append("\n");
                }
            }

            // writing files:
            PrintWriter printWriter = new PrintWriter(databaseFile);
            printWriter.print(updatedBook);
            printWriter.close();

            System.out.println("""
                >> A Book Removed successfully!
                ---------------------------------""");

        }

        readingToWriteFile.close();
    }
}
