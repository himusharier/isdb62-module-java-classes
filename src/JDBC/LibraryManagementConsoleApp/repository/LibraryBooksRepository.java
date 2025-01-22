package JDBC.LibraryManagementConsoleApp.repository;

import JDBC.LibraryManagementConsoleApp.model.LibraryBooks;

import java.util.List;

public interface LibraryBooksRepository {
    List<LibraryBooks> fetchAllBooks(); //get all book list
    LibraryBooks fetchBookByTitle(int title); //get a book by title.
    boolean borrowBookByTitle(int title); //borrow book by title, return true if borrow success.
    boolean returnBookByTitle(int title); //return book by title, return true if return success.
}
