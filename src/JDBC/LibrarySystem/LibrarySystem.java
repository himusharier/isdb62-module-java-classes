package JDBC.LibrarySystem;

import JDBC.LibrarySystem.functions.ClearTerminal;
import JDBC.LibrarySystem.functions.PauseTerminal;
import JDBC.LibrarySystem.service.DBOperations;
import JDBC.LibrarySystem.model.LibraryBooks;

import java.util.List;
import java.util.Scanner;

public class LibrarySystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DBOperations dbOperations = new DBOperations();

        while (true) {
            System.out.println("""
                    
                    \u001B[33m>> Welcome to New Horizon Library <<\u001B[0m
                    ------------------------------------
                    Main Menu:
                        1. List of Books.
                        2. Borrow Book.
                        3. Return Book.
                        0. Exit.
                    ------------------------------------""");
            System.out.print("Choose an Option: ");
            int mainMenuOptions = scanner.nextInt();
            ClearTerminal.clearTerminal();

            switch (mainMenuOptions) {
                case 1:
                    System.out.println("""
                            \u001B[33m>> Our Book Collection <<\u001B[0m
                            =========================""");
                    showBooksList(dbOperations);
                    termainalHandling();
                    break;
                case 2:
                    System.out.println("""
                            \u001B[33m>> Borrow Book <<\u001B[0m
                            =================""");
                    showBooksList(dbOperations);
                    System.out.print("Enter Book ID to Borrow: ");
                    int borrowBookId = scanner.nextInt();
                    dbOperations.borrowABook(borrowBookId);
                    termainalHandling();
                    break;
                case 3:
                    List<LibraryBooks> books = dbOperations.getBorrowedBooks();
                    System.out.println("""
                            \u001B[33m>> Return Book <<\u001B[0m
                            =================""");
                    System.out.printf("%-3s %-25s %-25s %-25s %-15s\n", "id", "title", "author", "genre", "published_year");
                    System.out.printf("------------------------------------------------------------------------------------------------\n");
                    for (LibraryBooks book : books) {
                        System.out.println(book.libraryBooksPrint());
                    }
                    System.out.print("Enter Book ID to Return: ");
                    int returnBookId = scanner.nextInt();
                    dbOperations.returnABook(returnBookId);
                    termainalHandling();
                    break;
                case 0:
                    System.out.println("""
                            \u001B[31m>> Exit <<\u001B[0m
                            ----------
                            Shutting down system...
                            """);
                    System.exit(1000); // exiting programme.
                    break;
            }
        }

    }

    private static void termainalHandling() {
        PauseTerminal.pauseTerminal();
        ClearTerminal.clearTerminal();
    }

    private static void showBooksList(DBOperations dbOperations) {
        List<LibraryBooks> books = dbOperations.getAllBooks();
        System.out.printf("%-3s %-25s %-25s %-25s %-15s\n", "id", "title", "author", "genre", "published_year");
        System.out.printf("------------------------------------------------------------------------------------------------\n");
        for (LibraryBooks book : books) {
            System.out.println(book.libraryBooksPrint());
        }
    }
}
