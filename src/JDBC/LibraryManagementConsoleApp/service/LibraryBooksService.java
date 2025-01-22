package JDBC.LibraryManagementConsoleApp.service;

import JDBC.LibraryManagementConsoleApp.model.LibraryBooks;
import JDBC.LibraryManagementConsoleApp.repository.LibraryBooksRepository;

import java.util.List;

public class LibraryBooksService {
    private LibraryBooksRepository libraryBooksRepository;

    public LibraryBooksService(LibraryBooksRepository libraryBooksRepository) {
        this.libraryBooksRepository = libraryBooksRepository;
    }

    public List<LibraryBooks> getAllBooks() {
        return libraryBooksRepository.fetchAllBooks();
    }

    public void borrowBook(String bookTitle) {
        if (libraryBooksRepository.borrowBookByTitle(bookTitle)) {
            System.out.println("\u001B[32m>> Book title '"+ bookTitle +"' borrowed successfully!\u001B[0m");
        } else {
            System.out.println("\u001B[31m>> Book title '"+ bookTitle +"' not available to borrow!\u001B[0m");
        }
    }

    public void returnBook(String bookTitle) {
        if (libraryBooksRepository.returnBookByTitle(bookTitle)) {
            System.out.println("\u001B[32m>> Book title '"+ bookTitle +"' returned successfully!\u001B[0m");
        } else {
            System.out.println("\u001B[31m>> Book title '"+ bookTitle +"' is not borrowed yet!\u001B[0m");
        }
    }
}
