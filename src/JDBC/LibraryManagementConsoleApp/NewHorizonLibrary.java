package JDBC.LibraryManagementConsoleApp;

import JDBC.LibraryManagementConsoleApp.database.DBConnection;
import JDBC.LibraryManagementConsoleApp.functions.ClearTerminal;
import JDBC.LibraryManagementConsoleApp.functions.PauseTerminal;
import JDBC.LibraryManagementConsoleApp.model.LibraryBooks;
import JDBC.LibraryManagementConsoleApp.repository.LibraryBooksRepository;
import JDBC.LibraryManagementConsoleApp.repository.LibraryBooksRepositoryImpl;
import JDBC.LibraryManagementConsoleApp.service.LibraryBooksService;

import java.sql.SQLException;
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
            ClearTerminal.clearTerminal();
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
            ClearTerminal.clearTerminal();
            mainMenuProcessor(mainMenuOption);
        }
    }

    void mainMenuProcessor(int mainMenuOption) {
        switch (mainMenuOption) {
            case 1 -> {
                System.out.println("""
                        \u001B[33m>> Our Book Collection <<\u001B[0m
                        =========================""");
                List<LibraryBooks> bookList = libraryBooksService.getAllBooks();
                System.out.printf("%-3s %-25s %-25s %20s %8s %8s %n", "id", "title", "author", "publication_year", "pages", "price");
                System.out.printf("------------------------------------------------------------------------------------------------\n");
                for (LibraryBooks book : bookList) {
                    book.libraryBooksPrint();
                }
                PauseTerminal.pauseTerminal();
            }
            case 2 -> {
                System.out.println("""
                            \u001B[33m>> Borrow Book <<\u001B[0m
                            =================""");
                //showing list:
                List<LibraryBooks> bookList = libraryBooksService.getAllBooks();
                System.out.printf("%-25s %-25s %-20s %-8s %-8s %n", "title", "author", "publication year", "pages", "price");
                System.out.printf("------------------------------------------------------------------------------------------------\n");
                for (LibraryBooks book : bookList) {
                    book.libraryBooksPrint();
                }
                //get borrowed book:
                System.out.print("Enter Book Name to Borrow: ");
                String  borrowBookName = scanner.nextLine();
            }
        }
    }



    public static void main(String[] args) throws SQLException {
        DBConnection dbConnection = new DBConnection();
        LibraryBooksRepository libraryBooksRepository = new LibraryBooksRepositoryImpl(dbConnection.getConnection());
        LibraryBooksService libraryBooksService = new LibraryBooksService(libraryBooksRepository);
        NewHorizonLibrary newHorizonLibrary = new NewHorizonLibrary(libraryBooksService);

        newHorizonLibrary.mainMenu();
    }

}
