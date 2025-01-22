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
}
