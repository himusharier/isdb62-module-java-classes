package JDBC.LibraryManagementConsoleApp;

import JDBC.LibraryManagementConsoleApp.database.DBConnection;
import JDBC.LibraryManagementConsoleApp.functions.TerminalHandler;
import JDBC.LibraryManagementConsoleApp.model.LibraryBooks;
import JDBC.LibraryManagementConsoleApp.repository.LibraryBooksRepository;
import JDBC.LibraryManagementConsoleApp.repository.LibraryBooksRepositoryImpl;
import JDBC.LibraryManagementConsoleApp.service.LibraryBooksService;

import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class NewHorizonLibrary {
    Scanner scanner = new Scanner(System.in);
    private LibraryBooksService libraryBooksService;

    public NewHorizonLibrary(LibraryBooksService libraryBooksService) {
        this.libraryBooksService = libraryBooksService;
    }

    void mainMenu() {
        while (true) {
            try {
                TerminalHandler.clearTerminal();
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
                int mainMenuOption = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character
                TerminalHandler.clearTerminal();
                mainMenuProcessor(mainMenuOption);

            } catch (InputMismatchException e) {
                System.out.println("\u001B[31m>> Invalid input! Please enter a number (0-3).\u001B[0m");
                scanner.nextLine(); // Clear the invalid input
                TerminalHandler.pauseTerminal();
            }
        }
    }

    void mainMenuProcessor(int mainMenuOption) {
        switch (mainMenuOption) {
            case 1 -> {
                System.out.println("""
                        \u001B[33m## Our Book Collection ##\u001B[0m
                        =========================""");
                List<LibraryBooks> bookList = libraryBooksService.getAllBooks();
                System.out.printf("%-25s %-25s %20s %8s %8s%n", "title", "author", "publication_year", "pages", "price");
                System.out.printf("-------------------------------------------------------------------------------------------\n");
                for (LibraryBooks book : bookList) {
                    book.libraryBooksPrint();
                }
                TerminalHandler.pauseTerminal();
            }
            case 2 -> {
                System.out.println("""
                        \u001B[33m## Borrow Book ##\u001B[0m
                        =================
                        (Enter 'x' to show Main Menu)""");
                while (true) {
                    System.out.println();
                    System.out.print("Enter Book Name to Borrow: ");
                    String borrowBookName = scanner.nextLine();
                    if (borrowBookName.equals("x")) {
                        break;
                    } else {
                        libraryBooksService.borrowBook(borrowBookName);
                        //TerminalHandler.pauseTerminal();
                    }
                }
            }
            case 3 -> {
                System.out.println("""
                        \u001B[33m## Return Book ##\u001B[0m
                        =================
                        (Enter 'x' to show Main Menu)""");
                while (true) {
                    System.out.println();
                    System.out.print("Enter Book Name to Return: ");
                    String returnBookName = scanner.nextLine();
                    if (returnBookName.equals("x")) {
                        break;
                    } else {
                        libraryBooksService.returnBook(returnBookName);
                        //TerminalHandler.pauseTerminal();
                    }
                }
            }
            case 0 -> {
                System.out.println("""
                        \u001B[33m## Exit ##\u001B[0m
                        ==========
                        \u001B[31m>> Shutting down system...\u001B[0m""");
                System.exit(1000);
            }
            default -> {
                System.out.println("""
                        \u001B[33m## Error ##\u001B[0m
                        ===========
                        \u001B[31m>> Invalid option selected. Please choose a valid menu option.\u001B[0m""");
                TerminalHandler.pauseTerminal();
            }
        }
    }


    // run the programme:
    public static void main(String[] args) throws SQLException {
        DBConnection dbConnection = new DBConnection();
        LibraryBooksRepository libraryBooksRepository = new LibraryBooksRepositoryImpl(dbConnection.getConnection());
        LibraryBooksService libraryBooksService = new LibraryBooksService(libraryBooksRepository);
        NewHorizonLibrary newHorizonLibrary = new NewHorizonLibrary(libraryBooksService);

        newHorizonLibrary.mainMenu();
    }

}
