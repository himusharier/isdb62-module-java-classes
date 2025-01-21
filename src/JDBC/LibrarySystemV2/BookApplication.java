package JDBC.LibrarySystemV2;

import JDBC.LibrarySystem.functions.ClearTerminal;
import JDBC.LibrarySystem.functions.PauseTerminal;
import JDBC.LibrarySystemV2.model.Book;
import JDBC.LibrarySystemV2.repository.BookRepository;
import JDBC.LibrarySystemV2.repository.BookRepositoryImpl;
import JDBC.LibrarySystemV2.service.BookService;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class BookApplication {
    private Scanner scanner = new Scanner(System.in);
    private BookService bookService;

    public BookApplication(BookService bookService) {
        this.bookService = bookService;
    }

    void showMenu() {
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
            processMenu(mainMenuOptions);
        }
    }

    void processMenu(int menuNumber) {
        switch (menuNumber) {
            case 1 -> {
                System.out.println("""
                            \u001B[33m>> Our Book Collection <<\u001B[0m
                            =========================""");
                showBookList();
            }
            case 2 -> {
                System.out.println("""
                            \u001B[33m>> Borrow Book <<\u001B[0m
                            =================""");
                showBookList();
                System.out.print("Enter Book ID to Borrow: ");
                int borrowBookId = scanner.nextInt();
                bookService.borrowBook(borrowBookId);
                PauseTerminal.pauseTerminal();
                ClearTerminal.clearTerminal();
            }
            case 3 -> {
                System.out.println("""
                            \u001B[33m>> Return Book <<\u001B[0m
                            =================""");
                showBookList();
                System.out.print("Enter Book ID to Return: ");
                int returnBookId = scanner.nextInt();
                bookService.returnBook(returnBookId);
                PauseTerminal.pauseTerminal();
                ClearTerminal.clearTerminal();
            }
            case 0 -> {
                System.out.println("""
                        \u001B[31m>> Exit <<\u001B[0m
                        ----------
                        Shutting down system...
                        """);
                System.exit(1000);
            }
        }
    }

    private void showBookList() {
        List<Book> bookList = bookService.getAllBooks();
        showBooks(bookList);
    }

    void showBooks(List<Book> bookList) {
        System.out.printf("%-3s %-25s %-25s %-25s %-15s\n", "id", "title", "author", "genre", "published_year");
        System.out.printf("------------------------------------------------------------------------------------------------\n");
        bookList.forEach(book -> book.libraryBooksPrint());
    }

    public static void main(String[] args) throws SQLException {
        DbConnection connection = new DbConnection();
        BookRepository bookRepository = new BookRepositoryImpl(connection.getConnection());
        BookService bookService = new BookService(bookRepository);
        BookApplication bookApplication = new BookApplication(bookService);

        bookApplication.showMenu();
    }
}
