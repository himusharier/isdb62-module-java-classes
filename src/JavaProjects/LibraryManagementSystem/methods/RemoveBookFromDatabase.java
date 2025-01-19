package JavaProjects.LibraryManagementSystem.methods;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class RemoveBookFromDatabase {
    public static void removeBookFromDatabase(String removeBookID) throws FileNotFoundException {
        // reading members-list database:
        String databaseFile = "src\\JavaProjects\\LibraryManagementSystem\\database\\books-list.csv";
        Scanner readingToWriteFile = new Scanner(new File(databaseFile));
        StringBuilder updatedBook = new StringBuilder();

        boolean searchStatus = false;
        while (readingToWriteFile.hasNext()) {
                String singleBook = readingToWriteFile.nextLine();
                String[] bookInfo = singleBook.split(",");

                if (bookInfo[0].equals(removeBookID)) {
                    searchStatus = true;
                    continue;
                } else {
                    updatedBook.append(singleBook).append("\n");
                }
            }

            // writing files:
            PrintWriter printWriter = new PrintWriter(databaseFile);
            printWriter.print(updatedBook);
            printWriter.close();

            if (searchStatus) {
                System.out.println("""
                        \u001B[32m>> A Book Removed successfully!\u001B[0m
                        ---------------------------------""");
            } else {
                System.out.println("\u001B[31mBook ID '" + removeBookID + "' is not found!\u001B[0m");
                System.out.println();
            }

        readingToWriteFile.close();
    }
}
